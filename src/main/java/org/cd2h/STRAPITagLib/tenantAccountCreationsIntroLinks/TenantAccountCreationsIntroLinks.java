package org.cd2h.STRAPITagLib.tenantAccountCreationsIntroLinks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.contentImageBlockRights.ContentImageBlockRights;
import org.cd2h.STRAPITagLib.tenantAccountCreations.TenantAccountCreations;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class TenantAccountCreationsIntroLinks extends STRAPITagLibTagSupport {

	static TenantAccountCreationsIntroLinks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(TenantAccountCreationsIntroLinks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	int tenantAccountCreationId = 0;
	int contentImageBlockRightId = 0;
	double contentImageBlockRightOrder = 0.0;

	private String var = null;

	private TenantAccountCreationsIntroLinks cachedTenantAccountCreationsIntroLinks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ContentImageBlockRights theContentImageBlockRights = (ContentImageBlockRights)findAncestorWithClass(this, ContentImageBlockRights.class);
			if (theContentImageBlockRights!= null)
				parentEntities.addElement(theContentImageBlockRights);
			TenantAccountCreations theTenantAccountCreations = (TenantAccountCreations)findAncestorWithClass(this, TenantAccountCreations.class);
			if (theTenantAccountCreations!= null)
				parentEntities.addElement(theTenantAccountCreations);

			if (theContentImageBlockRights == null) {
			} else {
				contentImageBlockRightId = theContentImageBlockRights.getID();
			}
			if (theTenantAccountCreations == null) {
			} else {
				tenantAccountCreationId = theTenantAccountCreations.getID();
			}

			TenantAccountCreationsIntroLinksIterator theTenantAccountCreationsIntroLinksIterator = (TenantAccountCreationsIntroLinksIterator)findAncestorWithClass(this, TenantAccountCreationsIntroLinksIterator.class);

			if (theTenantAccountCreationsIntroLinksIterator != null) {
				ID = theTenantAccountCreationsIntroLinksIterator.getID();
			}

			if (theTenantAccountCreationsIntroLinksIterator == null && theContentImageBlockRights == null && theTenantAccountCreations == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new TenantAccountCreationsIntroLinks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else if (theTenantAccountCreationsIntroLinksIterator == null && theContentImageBlockRights != null && theTenantAccountCreations == null) {
				// an ID was provided as an attribute - we need to load a TenantAccountCreationsIntroLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select tenant_account_creation_id,content_image_block_right_id,content_image_block_right_order from strapi.tenant_account_creations_intro_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (tenantAccountCreationId == 0)
						tenantAccountCreationId = rs.getInt(1);
					if (contentImageBlockRightId == 0)
						contentImageBlockRightId = rs.getInt(2);
					if (contentImageBlockRightOrder == 0.0)
						contentImageBlockRightOrder = rs.getDouble(3);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else if (theTenantAccountCreationsIntroLinksIterator == null && theContentImageBlockRights == null && theTenantAccountCreations != null) {
				// an ID was provided as an attribute - we need to load a TenantAccountCreationsIntroLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select tenant_account_creation_id,content_image_block_right_id,content_image_block_right_order from strapi.tenant_account_creations_intro_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (tenantAccountCreationId == 0)
						tenantAccountCreationId = rs.getInt(1);
					if (contentImageBlockRightId == 0)
						contentImageBlockRightId = rs.getInt(2);
					if (contentImageBlockRightOrder == 0.0)
						contentImageBlockRightOrder = rs.getDouble(3);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else {
				// an iterator or ID was provided as an attribute - we need to load a TenantAccountCreationsIntroLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select tenant_account_creation_id,content_image_block_right_id,content_image_block_right_order from strapi.tenant_account_creations_intro_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (tenantAccountCreationId == 0)
						tenantAccountCreationId = rs.getInt(1);
					if (contentImageBlockRightId == 0)
						contentImageBlockRightId = rs.getInt(2);
					if (contentImageBlockRightOrder == 0.0)
						contentImageBlockRightOrder = rs.getDouble(3);
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
			TenantAccountCreationsIntroLinks currentTenantAccountCreationsIntroLinks = (TenantAccountCreationsIntroLinks) pageContext.getAttribute("tag_tenantAccountCreationsIntroLinks");
			if(currentTenantAccountCreationsIntroLinks != null){
				cachedTenantAccountCreationsIntroLinks = currentTenantAccountCreationsIntroLinks;
			}
			currentTenantAccountCreationsIntroLinks = this;
			pageContext.setAttribute((var == null ? "tag_tenantAccountCreationsIntroLinks" : var), currentTenantAccountCreationsIntroLinks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedTenantAccountCreationsIntroLinks != null){
				pageContext.setAttribute((var == null ? "tag_tenantAccountCreationsIntroLinks" : var), this.cachedTenantAccountCreationsIntroLinks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_tenantAccountCreationsIntroLinks" : var));
				this.cachedTenantAccountCreationsIntroLinks = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.tenant_account_creations_intro_links set tenant_account_creation_id = ?, content_image_block_right_id = ?, content_image_block_right_order = ? where id = ? ");
				if ( tenantAccountCreationId == 0 ) {
					stmt.setNull( 1, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 1, tenantAccountCreationId );
				}
				if ( contentImageBlockRightId == 0 ) {
					stmt.setNull( 2, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 2, contentImageBlockRightId );
				}
				stmt.setDouble( 3, contentImageBlockRightOrder );
				stmt.setInt(4,ID);
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
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.tenant_account_creations_intro_links(tenant_account_creation_id,content_image_block_right_id,content_image_block_right_order) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		if (tenantAccountCreationId == 0) {
			stmt.setNull(1, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(1,tenantAccountCreationId);
		}
		if (contentImageBlockRightId == 0) {
			stmt.setNull(2, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(2,contentImageBlockRightId);
		}
		stmt.setDouble(3,contentImageBlockRightOrder);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new TenantAccountCreationsIntroLinks " + ID);

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

	public int getTenantAccountCreationId () {
		return tenantAccountCreationId;
	}

	public void setTenantAccountCreationId (int tenantAccountCreationId) {
		this.tenantAccountCreationId = tenantAccountCreationId;
		commitNeeded = true;
	}

	public int getActualTenantAccountCreationId () {
		return tenantAccountCreationId;
	}

	public int getContentImageBlockRightId () {
		return contentImageBlockRightId;
	}

	public void setContentImageBlockRightId (int contentImageBlockRightId) {
		this.contentImageBlockRightId = contentImageBlockRightId;
		commitNeeded = true;
	}

	public int getActualContentImageBlockRightId () {
		return contentImageBlockRightId;
	}

	public double getContentImageBlockRightOrder () {
		return contentImageBlockRightOrder;
	}

	public void setContentImageBlockRightOrder (double contentImageBlockRightOrder) {
		this.contentImageBlockRightOrder = contentImageBlockRightOrder;
		commitNeeded = true;
	}

	public double getActualContentImageBlockRightOrder () {
		return contentImageBlockRightOrder;
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

	public static Integer tenantAccountCreationIdValue() throws JspException {
		try {
			return currentInstance.getTenantAccountCreationId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function tenantAccountCreationIdValue()");
		}
	}

	public static Integer contentImageBlockRightIdValue() throws JspException {
		try {
			return currentInstance.getContentImageBlockRightId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function contentImageBlockRightIdValue()");
		}
	}

	public static Double contentImageBlockRightOrderValue() throws JspException {
		try {
			return currentInstance.getContentImageBlockRightOrder();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function contentImageBlockRightOrderValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		tenantAccountCreationId = 0;
		contentImageBlockRightId = 0;
		contentImageBlockRightOrder = 0.0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
