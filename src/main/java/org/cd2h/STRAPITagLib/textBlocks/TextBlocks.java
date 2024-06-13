package org.cd2h.STRAPITagLib.textBlocks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.Timestamp;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;


import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class TextBlocks extends STRAPITagLibTagSupport {

	static TextBlocks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(TextBlocks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	String label = null;
	String content = null;
	Timestamp createdAt = null;
	Timestamp updatedAt = null;
	Timestamp publishedAt = null;
	int createdById = 0;
	int updatedById = 0;

	private String var = null;

	private TextBlocks cachedTextBlocks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {


			TextBlocksIterator theTextBlocksIterator = (TextBlocksIterator)findAncestorWithClass(this, TextBlocksIterator.class);

			if (theTextBlocksIterator != null) {
				ID = theTextBlocksIterator.getID();
			}

			if (theTextBlocksIterator == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new TextBlocks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else {
				// an iterator or ID was provided as an attribute - we need to load a TextBlocks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select label,content,created_at,updated_at,published_at,created_by_id,updated_by_id from strapi.text_blocks where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (label == null)
						label = rs.getString(1);
					if (content == null)
						content = rs.getString(2);
					if (createdAt == null)
						createdAt = rs.getTimestamp(3);
					if (updatedAt == null)
						updatedAt = rs.getTimestamp(4);
					if (publishedAt == null)
						publishedAt = rs.getTimestamp(5);
					if (createdById == 0)
						createdById = rs.getInt(6);
					if (updatedById == 0)
						updatedById = rs.getInt(7);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			}
		} catch (SQLException e) {
			log.error("JDBC error retrieving ID " + ID, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error retrieving ID " + ID,e);
			}

		} finally {
			freeConnection();
		}

		if(pageContext != null){
			TextBlocks currentTextBlocks = (TextBlocks) pageContext.getAttribute("tag_textBlocks");
			if(currentTextBlocks != null){
				cachedTextBlocks = currentTextBlocks;
			}
			currentTextBlocks = this;
			pageContext.setAttribute((var == null ? "tag_textBlocks" : var), currentTextBlocks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedTextBlocks != null){
				pageContext.setAttribute((var == null ? "tag_textBlocks" : var), this.cachedTextBlocks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_textBlocks" : var));
				this.cachedTextBlocks = null;
			}
		}

		try {
			Boolean error = null; // (Boolean) pageContext.getAttribute("tagError");
			if(pageContext != null){
				error = (Boolean) pageContext.getAttribute("tagError");
			}

			if(error != null && error){

				freeConnection();
				clearServiceState();

				Exception e = (Exception) pageContext.getAttribute("tagErrorException");
				String message = (String) pageContext.getAttribute("tagErrorMessage");

				Tag parent = getParent();
				if(parent != null){
					return parent.doEndTag();
				}else if(e != null && message != null){
					throw new JspException(message,e);
				}else if(parent == null){
					pageContext.removeAttribute("tagError");
					pageContext.removeAttribute("tagErrorException");
					pageContext.removeAttribute("tagErrorMessage");
				}
			}
			if (commitNeeded) {
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.text_blocks set label = ?, content = ?, created_at = ?, updated_at = ?, published_at = ?, created_by_id = ?, updated_by_id = ? where id = ? ");
				stmt.setString( 1, label );
				stmt.setString( 2, content );
				stmt.setTimestamp( 3, createdAt );
				stmt.setTimestamp( 4, updatedAt );
				stmt.setTimestamp( 5, publishedAt );
				stmt.setInt( 6, createdById );
				stmt.setInt( 7, updatedById );
				stmt.setInt(8,ID);
				stmt.executeUpdate();
				stmt.close();
			}
		} catch (SQLException e) {
			log.error("Error: IOException while writing to the user", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: IOException while writing to the user");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: IOException while writing to the user");
			}

		} finally {
			clearServiceState();
			freeConnection();
		}
		return super.doEndTag();
	}

	public void insertEntity() throws JspException, SQLException {
		if (ID == 0) {
			ID = Sequence.generateID();
			log.debug("generating new TextBlocks " + ID);
		}

		if (label == null){
			label = "";
		}
		if (content == null){
			content = "";
		}
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.text_blocks(label,content,created_at,updated_at,published_at,created_by_id,updated_by_id) values (?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1,label);
		stmt.setString(2,content);
		stmt.setTimestamp(3,createdAt);
		stmt.setTimestamp(4,updatedAt);
		stmt.setTimestamp(5,publishedAt);
		stmt.setInt(6,createdById);
		stmt.setInt(7,updatedById);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new TextBlocks " + ID);

		freeConnection();
	}

	public int getID () {
		return ID;
	}

	public void setID (int ID) {
		this.ID = ID;
	}

	public int getActualID () {
		return ID;
	}

	public String getLabel () {
		if (commitNeeded)
			return "";
		else
			return label;
	}

	public void setLabel (String label) {
		this.label = label;
		commitNeeded = true;
	}

	public String getActualLabel () {
		return label;
	}

	public String getContent () {
		if (commitNeeded)
			return "";
		else
			return content;
	}

	public void setContent (String content) {
		this.content = content;
		commitNeeded = true;
	}

	public String getActualContent () {
		return content;
	}

	public Timestamp getCreatedAt () {
		return createdAt;
	}

	public void setCreatedAt (Timestamp createdAt) {
		this.createdAt = createdAt;
		commitNeeded = true;
	}

	public Timestamp getActualCreatedAt () {
		return createdAt;
	}

	public void setCreatedAtToNow ( ) {
		this.createdAt = new java.sql.Timestamp(new java.util.Date().getTime());
		commitNeeded = true;
	}

	public Timestamp getUpdatedAt () {
		return updatedAt;
	}

	public void setUpdatedAt (Timestamp updatedAt) {
		this.updatedAt = updatedAt;
		commitNeeded = true;
	}

	public Timestamp getActualUpdatedAt () {
		return updatedAt;
	}

	public void setUpdatedAtToNow ( ) {
		this.updatedAt = new java.sql.Timestamp(new java.util.Date().getTime());
		commitNeeded = true;
	}

	public Timestamp getPublishedAt () {
		return publishedAt;
	}

	public void setPublishedAt (Timestamp publishedAt) {
		this.publishedAt = publishedAt;
		commitNeeded = true;
	}

	public Timestamp getActualPublishedAt () {
		return publishedAt;
	}

	public void setPublishedAtToNow ( ) {
		this.publishedAt = new java.sql.Timestamp(new java.util.Date().getTime());
		commitNeeded = true;
	}

	public int getCreatedById () {
		return createdById;
	}

	public void setCreatedById (int createdById) {
		this.createdById = createdById;
		commitNeeded = true;
	}

	public int getActualCreatedById () {
		return createdById;
	}

	public int getUpdatedById () {
		return updatedById;
	}

	public void setUpdatedById (int updatedById) {
		this.updatedById = updatedById;
		commitNeeded = true;
	}

	public int getActualUpdatedById () {
		return updatedById;
	}

	public String getVar () {
		return var;
	}

	public void setVar (String var) {
		this.var = var;
	}

	public String getActualVar () {
		return var;
	}

	public static Integer IDValue() throws JspException {
		try {
			return currentInstance.getID();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function IDValue()");
		}
	}

	public static String labelValue() throws JspException {
		try {
			return currentInstance.getLabel();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function labelValue()");
		}
	}

	public static String contentValue() throws JspException {
		try {
			return currentInstance.getContent();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function contentValue()");
		}
	}

	public static Timestamp createdAtValue() throws JspException {
		try {
			return currentInstance.getCreatedAt();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function createdAtValue()");
		}
	}

	public static Timestamp updatedAtValue() throws JspException {
		try {
			return currentInstance.getUpdatedAt();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function updatedAtValue()");
		}
	}

	public static Timestamp publishedAtValue() throws JspException {
		try {
			return currentInstance.getPublishedAt();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function publishedAtValue()");
		}
	}

	public static Integer createdByIdValue() throws JspException {
		try {
			return currentInstance.getCreatedById();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function createdByIdValue()");
		}
	}

	public static Integer updatedByIdValue() throws JspException {
		try {
			return currentInstance.getUpdatedById();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function updatedByIdValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		label = null;
		content = null;
		createdAt = null;
		updatedAt = null;
		publishedAt = null;
		createdById = 0;
		updatedById = 0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
