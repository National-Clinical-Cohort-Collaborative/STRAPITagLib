package org.cd2h.STRAPITagLib.tenantAccountCreations;

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
public class TenantAccountCreations extends STRAPITagLibTagSupport {

	static TenantAccountCreations currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(TenantAccountCreations.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	String header = null;
	String header2 = null;
	String beforeStartingHeader = null;
	String beforeStartingBlock = null;
	Timestamp createdAt = null;
	Timestamp updatedAt = null;
	Timestamp publishedAt = null;
	int createdById = 0;
	int updatedById = 0;

	private String var = null;

	private TenantAccountCreations cachedTenantAccountCreations = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {


			TenantAccountCreationsIterator theTenantAccountCreationsIterator = (TenantAccountCreationsIterator)findAncestorWithClass(this, TenantAccountCreationsIterator.class);

			if (theTenantAccountCreationsIterator != null) {
				ID = theTenantAccountCreationsIterator.getID();
			}

			if (theTenantAccountCreationsIterator == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new TenantAccountCreations and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else {
				// an iterator or ID was provided as an attribute - we need to load a TenantAccountCreations from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select header,header_2,before_starting_header,before_starting_block,created_at,updated_at,published_at,created_by_id,updated_by_id from strapi.tenant_account_creations where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (header == null)
						header = rs.getString(1);
					if (header2 == null)
						header2 = rs.getString(2);
					if (beforeStartingHeader == null)
						beforeStartingHeader = rs.getString(3);
					if (beforeStartingBlock == null)
						beforeStartingBlock = rs.getString(4);
					if (createdAt == null)
						createdAt = rs.getTimestamp(5);
					if (updatedAt == null)
						updatedAt = rs.getTimestamp(6);
					if (publishedAt == null)
						publishedAt = rs.getTimestamp(7);
					if (createdById == 0)
						createdById = rs.getInt(8);
					if (updatedById == 0)
						updatedById = rs.getInt(9);
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
			TenantAccountCreations currentTenantAccountCreations = (TenantAccountCreations) pageContext.getAttribute("tag_tenantAccountCreations");
			if(currentTenantAccountCreations != null){
				cachedTenantAccountCreations = currentTenantAccountCreations;
			}
			currentTenantAccountCreations = this;
			pageContext.setAttribute((var == null ? "tag_tenantAccountCreations" : var), currentTenantAccountCreations);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedTenantAccountCreations != null){
				pageContext.setAttribute((var == null ? "tag_tenantAccountCreations" : var), this.cachedTenantAccountCreations);
			}else{
				pageContext.removeAttribute((var == null ? "tag_tenantAccountCreations" : var));
				this.cachedTenantAccountCreations = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.tenant_account_creations set header = ?, header_2 = ?, before_starting_header = ?, before_starting_block = ?, created_at = ?, updated_at = ?, published_at = ?, created_by_id = ?, updated_by_id = ? where id = ? ");
				stmt.setString( 1, header );
				stmt.setString( 2, header2 );
				stmt.setString( 3, beforeStartingHeader );
				stmt.setString( 4, beforeStartingBlock );
				stmt.setTimestamp( 5, createdAt );
				stmt.setTimestamp( 6, updatedAt );
				stmt.setTimestamp( 7, publishedAt );
				stmt.setInt( 8, createdById );
				stmt.setInt( 9, updatedById );
				stmt.setInt(10,ID);
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
			log.debug("generating new TenantAccountCreations " + ID);
		}

		if (header == null){
			header = "";
		}
		if (header2 == null){
			header2 = "";
		}
		if (beforeStartingHeader == null){
			beforeStartingHeader = "";
		}
		if (beforeStartingBlock == null){
			beforeStartingBlock = "";
		}
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.tenant_account_creations(header,header_2,before_starting_header,before_starting_block,created_at,updated_at,published_at,created_by_id,updated_by_id) values (?,?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1,header);
		stmt.setString(2,header2);
		stmt.setString(3,beforeStartingHeader);
		stmt.setString(4,beforeStartingBlock);
		stmt.setTimestamp(5,createdAt);
		stmt.setTimestamp(6,updatedAt);
		stmt.setTimestamp(7,publishedAt);
		stmt.setInt(8,createdById);
		stmt.setInt(9,updatedById);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new TenantAccountCreations " + ID);

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

	public String getHeader2 () {
		if (commitNeeded)
			return "";
		else
			return header2;
	}

	public void setHeader2 (String header2) {
		this.header2 = header2;
		commitNeeded = true;
	}

	public String getActualHeader2 () {
		return header2;
	}

	public String getBeforeStartingHeader () {
		if (commitNeeded)
			return "";
		else
			return beforeStartingHeader;
	}

	public void setBeforeStartingHeader (String beforeStartingHeader) {
		this.beforeStartingHeader = beforeStartingHeader;
		commitNeeded = true;
	}

	public String getActualBeforeStartingHeader () {
		return beforeStartingHeader;
	}

	public String getBeforeStartingBlock () {
		if (commitNeeded)
			return "";
		else
			return beforeStartingBlock;
	}

	public void setBeforeStartingBlock (String beforeStartingBlock) {
		this.beforeStartingBlock = beforeStartingBlock;
		commitNeeded = true;
	}

	public String getActualBeforeStartingBlock () {
		return beforeStartingBlock;
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

	public static String headerValue() throws JspException {
		try {
			return currentInstance.getHeader();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function headerValue()");
		}
	}

	public static String header2Value() throws JspException {
		try {
			return currentInstance.getHeader2();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function header2Value()");
		}
	}

	public static String beforeStartingHeaderValue() throws JspException {
		try {
			return currentInstance.getBeforeStartingHeader();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function beforeStartingHeaderValue()");
		}
	}

	public static String beforeStartingBlockValue() throws JspException {
		try {
			return currentInstance.getBeforeStartingBlock();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function beforeStartingBlockValue()");
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
		header = null;
		header2 = null;
		beforeStartingHeader = null;
		beforeStartingBlock = null;
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
