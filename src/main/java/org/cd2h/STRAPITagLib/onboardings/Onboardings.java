package org.cd2h.STRAPITagLib.onboardings;

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
public class Onboardings extends STRAPITagLibTagSupport {

	static Onboardings currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(Onboardings.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	String header = null;
	String subheader = null;
	String registrationHeader = null;
	Timestamp createdAt = null;
	Timestamp updatedAt = null;
	Timestamp publishedAt = null;
	int createdById = 0;
	int updatedById = 0;
	String block = null;
	String block2 = null;

	private String var = null;

	private Onboardings cachedOnboardings = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {


			OnboardingsIterator theOnboardingsIterator = (OnboardingsIterator)findAncestorWithClass(this, OnboardingsIterator.class);

			if (theOnboardingsIterator != null) {
				ID = theOnboardingsIterator.getID();
			}

			if (theOnboardingsIterator == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new Onboardings and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else {
				// an iterator or ID was provided as an attribute - we need to load a Onboardings from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select header,subheader,registration_header,created_at,updated_at,published_at,created_by_id,updated_by_id,block,block_2 from strapi.onboardings where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (header == null)
						header = rs.getString(1);
					if (subheader == null)
						subheader = rs.getString(2);
					if (registrationHeader == null)
						registrationHeader = rs.getString(3);
					if (createdAt == null)
						createdAt = rs.getTimestamp(4);
					if (updatedAt == null)
						updatedAt = rs.getTimestamp(5);
					if (publishedAt == null)
						publishedAt = rs.getTimestamp(6);
					if (createdById == 0)
						createdById = rs.getInt(7);
					if (updatedById == 0)
						updatedById = rs.getInt(8);
					if (block == null)
						block = rs.getString(9);
					if (block2 == null)
						block2 = rs.getString(10);
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
			Onboardings currentOnboardings = (Onboardings) pageContext.getAttribute("tag_onboardings");
			if(currentOnboardings != null){
				cachedOnboardings = currentOnboardings;
			}
			currentOnboardings = this;
			pageContext.setAttribute((var == null ? "tag_onboardings" : var), currentOnboardings);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedOnboardings != null){
				pageContext.setAttribute((var == null ? "tag_onboardings" : var), this.cachedOnboardings);
			}else{
				pageContext.removeAttribute((var == null ? "tag_onboardings" : var));
				this.cachedOnboardings = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.onboardings set header = ?, subheader = ?, registration_header = ?, created_at = ?, updated_at = ?, published_at = ?, created_by_id = ?, updated_by_id = ?, block = ?, block_2 = ? where id = ? ");
				stmt.setString( 1, header );
				stmt.setString( 2, subheader );
				stmt.setString( 3, registrationHeader );
				stmt.setTimestamp( 4, createdAt );
				stmt.setTimestamp( 5, updatedAt );
				stmt.setTimestamp( 6, publishedAt );
				stmt.setInt( 7, createdById );
				stmt.setInt( 8, updatedById );
				stmt.setString( 9, block );
				stmt.setString( 10, block2 );
				stmt.setInt(11,ID);
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
			log.debug("generating new Onboardings " + ID);
		}

		if (header == null){
			header = "";
		}
		if (subheader == null){
			subheader = "";
		}
		if (registrationHeader == null){
			registrationHeader = "";
		}
		if (block == null){
			block = "";
		}
		if (block2 == null){
			block2 = "";
		}
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.onboardings(header,subheader,registration_header,created_at,updated_at,published_at,created_by_id,updated_by_id,block,block_2) values (?,?,?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1,header);
		stmt.setString(2,subheader);
		stmt.setString(3,registrationHeader);
		stmt.setTimestamp(4,createdAt);
		stmt.setTimestamp(5,updatedAt);
		stmt.setTimestamp(6,publishedAt);
		stmt.setInt(7,createdById);
		stmt.setInt(8,updatedById);
		stmt.setString(9,block);
		stmt.setString(10,block2);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new Onboardings " + ID);

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

	public String getHeader () {
		if (commitNeeded)
			return "";
		else
			return header;
	}

	public void setHeader (String header) {
		this.header = header;
		commitNeeded = true;
	}

	public String getActualHeader () {
		return header;
	}

	public String getSubheader () {
		if (commitNeeded)
			return "";
		else
			return subheader;
	}

	public void setSubheader (String subheader) {
		this.subheader = subheader;
		commitNeeded = true;
	}

	public String getActualSubheader () {
		return subheader;
	}

	public String getRegistrationHeader () {
		if (commitNeeded)
			return "";
		else
			return registrationHeader;
	}

	public void setRegistrationHeader (String registrationHeader) {
		this.registrationHeader = registrationHeader;
		commitNeeded = true;
	}

	public String getActualRegistrationHeader () {
		return registrationHeader;
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

	public String getBlock () {
		if (commitNeeded)
			return "";
		else
			return block;
	}

	public void setBlock (String block) {
		this.block = block;
		commitNeeded = true;
	}

	public String getActualBlock () {
		return block;
	}

	public String getBlock2 () {
		if (commitNeeded)
			return "";
		else
			return block2;
	}

	public void setBlock2 (String block2) {
		this.block2 = block2;
		commitNeeded = true;
	}

	public String getActualBlock2 () {
		return block2;
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

	public static String headerValue() throws JspException {
		try {
			return currentInstance.getHeader();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function headerValue()");
		}
	}

	public static String subheaderValue() throws JspException {
		try {
			return currentInstance.getSubheader();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function subheaderValue()");
		}
	}

	public static String registrationHeaderValue() throws JspException {
		try {
			return currentInstance.getRegistrationHeader();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function registrationHeaderValue()");
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

	public static String blockValue() throws JspException {
		try {
			return currentInstance.getBlock();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function blockValue()");
		}
	}

	public static String block2Value() throws JspException {
		try {
			return currentInstance.getBlock2();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function block2Value()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		header = null;
		subheader = null;
		registrationHeader = null;
		createdAt = null;
		updatedAt = null;
		publishedAt = null;
		createdById = 0;
		updatedById = 0;
		block = null;
		block2 = null;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
