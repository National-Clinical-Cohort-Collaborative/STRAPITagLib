package org.cd2h.STRAPITagLib.tenantProfiles;

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
public class TenantProfiles extends STRAPITagLibTagSupport {

	static TenantProfiles currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(TenantProfiles.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	String blurb = null;
	String description = null;
	Timestamp createdAt = null;
	Timestamp updatedAt = null;
	Timestamp publishedAt = null;
	int createdById = 0;
	int updatedById = 0;
	String label = null;
	String url = null;
	String footerCite = null;
	String footerCredit = null;
	String footerSignup = null;
	String footerSocial = null;

	private String var = null;

	private TenantProfiles cachedTenantProfiles = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {


			TenantProfilesIterator theTenantProfilesIterator = (TenantProfilesIterator)findAncestorWithClass(this, TenantProfilesIterator.class);

			if (theTenantProfilesIterator != null) {
				ID = theTenantProfilesIterator.getID();
			}

			if (theTenantProfilesIterator == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new TenantProfiles and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else {
				// an iterator or ID was provided as an attribute - we need to load a TenantProfiles from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select blurb,description,created_at,updated_at,published_at,created_by_id,updated_by_id,label,url,footer_cite,footer_credit,footer_signup,footer_social from strapi.tenant_profiles where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (blurb == null)
						blurb = rs.getString(1);
					if (description == null)
						description = rs.getString(2);
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
					if (label == null)
						label = rs.getString(8);
					if (url == null)
						url = rs.getString(9);
					if (footerCite == null)
						footerCite = rs.getString(10);
					if (footerCredit == null)
						footerCredit = rs.getString(11);
					if (footerSignup == null)
						footerSignup = rs.getString(12);
					if (footerSocial == null)
						footerSocial = rs.getString(13);
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
			TenantProfiles currentTenantProfiles = (TenantProfiles) pageContext.getAttribute("tag_tenantProfiles");
			if(currentTenantProfiles != null){
				cachedTenantProfiles = currentTenantProfiles;
			}
			currentTenantProfiles = this;
			pageContext.setAttribute((var == null ? "tag_tenantProfiles" : var), currentTenantProfiles);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedTenantProfiles != null){
				pageContext.setAttribute((var == null ? "tag_tenantProfiles" : var), this.cachedTenantProfiles);
			}else{
				pageContext.removeAttribute((var == null ? "tag_tenantProfiles" : var));
				this.cachedTenantProfiles = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.tenant_profiles set blurb = ?, description = ?, created_at = ?, updated_at = ?, published_at = ?, created_by_id = ?, updated_by_id = ?, label = ?, url = ?, footer_cite = ?, footer_credit = ?, footer_signup = ?, footer_social = ? where id = ? ");
				stmt.setString( 1, blurb );
				stmt.setString( 2, description );
				stmt.setTimestamp( 3, createdAt );
				stmt.setTimestamp( 4, updatedAt );
				stmt.setTimestamp( 5, publishedAt );
				stmt.setInt( 6, createdById );
				stmt.setInt( 7, updatedById );
				stmt.setString( 8, label );
				stmt.setString( 9, url );
				stmt.setString( 10, footerCite );
				stmt.setString( 11, footerCredit );
				stmt.setString( 12, footerSignup );
				stmt.setString( 13, footerSocial );
				stmt.setInt(14,ID);
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
			log.debug("generating new TenantProfiles " + ID);
		}

		if (blurb == null){
			blurb = "";
		}
		if (description == null){
			description = "";
		}
		if (label == null){
			label = "";
		}
		if (url == null){
			url = "";
		}
		if (footerCite == null){
			footerCite = "";
		}
		if (footerCredit == null){
			footerCredit = "";
		}
		if (footerSignup == null){
			footerSignup = "";
		}
		if (footerSocial == null){
			footerSocial = "";
		}
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.tenant_profiles(blurb,description,created_at,updated_at,published_at,created_by_id,updated_by_id,label,url,footer_cite,footer_credit,footer_signup,footer_social) values (?,?,?,?,?,?,?,?,?,?,?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1,blurb);
		stmt.setString(2,description);
		stmt.setTimestamp(3,createdAt);
		stmt.setTimestamp(4,updatedAt);
		stmt.setTimestamp(5,publishedAt);
		stmt.setInt(6,createdById);
		stmt.setInt(7,updatedById);
		stmt.setString(8,label);
		stmt.setString(9,url);
		stmt.setString(10,footerCite);
		stmt.setString(11,footerCredit);
		stmt.setString(12,footerSignup);
		stmt.setString(13,footerSocial);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new TenantProfiles " + ID);

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

	public String getBlurb () {
		if (commitNeeded)
			return "";
		else
			return blurb;
	}

	public void setBlurb (String blurb) {
		this.blurb = blurb;
		commitNeeded = true;
	}

	public String getActualBlurb () {
		return blurb;
	}

	public String getDescription () {
		if (commitNeeded)
			return "";
		else
			return description;
	}

	public void setDescription (String description) {
		this.description = description;
		commitNeeded = true;
	}

	public String getActualDescription () {
		return description;
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

	public String getUrl () {
		if (commitNeeded)
			return "";
		else
			return url;
	}

	public void setUrl (String url) {
		this.url = url;
		commitNeeded = true;
	}

	public String getActualUrl () {
		return url;
	}

	public String getFooterCite () {
		if (commitNeeded)
			return "";
		else
			return footerCite;
	}

	public void setFooterCite (String footerCite) {
		this.footerCite = footerCite;
		commitNeeded = true;
	}

	public String getActualFooterCite () {
		return footerCite;
	}

	public String getFooterCredit () {
		if (commitNeeded)
			return "";
		else
			return footerCredit;
	}

	public void setFooterCredit (String footerCredit) {
		this.footerCredit = footerCredit;
		commitNeeded = true;
	}

	public String getActualFooterCredit () {
		return footerCredit;
	}

	public String getFooterSignup () {
		if (commitNeeded)
			return "";
		else
			return footerSignup;
	}

	public void setFooterSignup (String footerSignup) {
		this.footerSignup = footerSignup;
		commitNeeded = true;
	}

	public String getActualFooterSignup () {
		return footerSignup;
	}

	public String getFooterSocial () {
		if (commitNeeded)
			return "";
		else
			return footerSocial;
	}

	public void setFooterSocial (String footerSocial) {
		this.footerSocial = footerSocial;
		commitNeeded = true;
	}

	public String getActualFooterSocial () {
		return footerSocial;
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

	public static String blurbValue() throws JspException {
		try {
			return currentInstance.getBlurb();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function blurbValue()");
		}
	}

	public static String descriptionValue() throws JspException {
		try {
			return currentInstance.getDescription();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function descriptionValue()");
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

	public static String labelValue() throws JspException {
		try {
			return currentInstance.getLabel();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function labelValue()");
		}
	}

	public static String urlValue() throws JspException {
		try {
			return currentInstance.getUrl();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function urlValue()");
		}
	}

	public static String footerCiteValue() throws JspException {
		try {
			return currentInstance.getFooterCite();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function footerCiteValue()");
		}
	}

	public static String footerCreditValue() throws JspException {
		try {
			return currentInstance.getFooterCredit();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function footerCreditValue()");
		}
	}

	public static String footerSignupValue() throws JspException {
		try {
			return currentInstance.getFooterSignup();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function footerSignupValue()");
		}
	}

	public static String footerSocialValue() throws JspException {
		try {
			return currentInstance.getFooterSocial();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function footerSocialValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		blurb = null;
		description = null;
		createdAt = null;
		updatedAt = null;
		publishedAt = null;
		createdById = 0;
		updatedById = 0;
		label = null;
		url = null;
		footerCite = null;
		footerCredit = null;
		footerSignup = null;
		footerSocial = null;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
