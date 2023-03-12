package org.cd2h.STRAPITagLib.onboardingsNavTileLinks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.contentImageBlockLefts.ContentImageBlockLefts;
import org.cd2h.STRAPITagLib.onboardings.Onboardings;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class OnboardingsNavTileLinks extends STRAPITagLibTagSupport {

	static OnboardingsNavTileLinks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(OnboardingsNavTileLinks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	int onboardingId = 0;
	int contentImageBlockLeftId = 0;
	double contentImageBlockLeftOrder = 0.0;

	private String var = null;

	private OnboardingsNavTileLinks cachedOnboardingsNavTileLinks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			if (theContentImageBlockLefts!= null)
				parentEntities.addElement(theContentImageBlockLefts);
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			if (theOnboardings!= null)
				parentEntities.addElement(theOnboardings);

			if (theContentImageBlockLefts == null) {
			} else {
				contentImageBlockLeftId = theContentImageBlockLefts.getID();
			}
			if (theOnboardings == null) {
			} else {
				onboardingId = theOnboardings.getID();
			}

			OnboardingsNavTileLinksIterator theOnboardingsNavTileLinksIterator = (OnboardingsNavTileLinksIterator)findAncestorWithClass(this, OnboardingsNavTileLinksIterator.class);

			if (theOnboardingsNavTileLinksIterator != null) {
				ID = theOnboardingsNavTileLinksIterator.getID();
			}

			if (theOnboardingsNavTileLinksIterator == null && theContentImageBlockLefts == null && theOnboardings == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new OnboardingsNavTileLinks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else if (theOnboardingsNavTileLinksIterator == null && theContentImageBlockLefts != null && theOnboardings == null) {
				// an ID was provided as an attribute - we need to load a OnboardingsNavTileLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select onboarding_id,content_image_block_left_id,content_image_block_left_order from strapi.onboardings_nav_tile_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (onboardingId == 0)
						onboardingId = rs.getInt(1);
					if (contentImageBlockLeftId == 0)
						contentImageBlockLeftId = rs.getInt(2);
					if (contentImageBlockLeftOrder == 0.0)
						contentImageBlockLeftOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else if (theOnboardingsNavTileLinksIterator == null && theContentImageBlockLefts == null && theOnboardings != null) {
				// an ID was provided as an attribute - we need to load a OnboardingsNavTileLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select onboarding_id,content_image_block_left_id,content_image_block_left_order from strapi.onboardings_nav_tile_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (onboardingId == 0)
						onboardingId = rs.getInt(1);
					if (contentImageBlockLeftId == 0)
						contentImageBlockLeftId = rs.getInt(2);
					if (contentImageBlockLeftOrder == 0.0)
						contentImageBlockLeftOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else {
				// an iterator or ID was provided as an attribute - we need to load a OnboardingsNavTileLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select onboarding_id,content_image_block_left_id,content_image_block_left_order from strapi.onboardings_nav_tile_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (onboardingId == 0)
						onboardingId = rs.getInt(1);
					if (contentImageBlockLeftId == 0)
						contentImageBlockLeftId = rs.getInt(2);
					if (contentImageBlockLeftOrder == 0.0)
						contentImageBlockLeftOrder = rs.getDouble(3);
					found = true;
				}
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
			OnboardingsNavTileLinks currentOnboardingsNavTileLinks = (OnboardingsNavTileLinks) pageContext.getAttribute("tag_onboardingsNavTileLinks");
			if(currentOnboardingsNavTileLinks != null){
				cachedOnboardingsNavTileLinks = currentOnboardingsNavTileLinks;
			}
			currentOnboardingsNavTileLinks = this;
			pageContext.setAttribute((var == null ? "tag_onboardingsNavTileLinks" : var), currentOnboardingsNavTileLinks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedOnboardingsNavTileLinks != null){
				pageContext.setAttribute((var == null ? "tag_onboardingsNavTileLinks" : var), this.cachedOnboardingsNavTileLinks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_onboardingsNavTileLinks" : var));
				this.cachedOnboardingsNavTileLinks = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.onboardings_nav_tile_links set onboarding_id = ?, content_image_block_left_id = ?, content_image_block_left_order = ? where id = ? ");
				if ( onboardingId == 0 ) {
					stmt.setNull( 1, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 1, onboardingId );
				}
				if ( contentImageBlockLeftId == 0 ) {
					stmt.setNull( 2, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 2, contentImageBlockLeftId );
				}
				stmt.setDouble( 3, contentImageBlockLeftOrder );
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
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.onboardings_nav_tile_links(onboarding_id,content_image_block_left_id,content_image_block_left_order) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		if (onboardingId == 0) {
			stmt.setNull(1, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(1,onboardingId);
		}
		if (contentImageBlockLeftId == 0) {
			stmt.setNull(2, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(2,contentImageBlockLeftId);
		}
		stmt.setDouble(3,contentImageBlockLeftOrder);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		stmt.close();

		log.debug("generating new OnboardingsNavTileLinks " + ID);

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

	public int getOnboardingId () {
		return onboardingId;
	}

	public void setOnboardingId (int onboardingId) {
		this.onboardingId = onboardingId;
		commitNeeded = true;
	}

	public int getActualOnboardingId () {
		return onboardingId;
	}

	public int getContentImageBlockLeftId () {
		return contentImageBlockLeftId;
	}

	public void setContentImageBlockLeftId (int contentImageBlockLeftId) {
		this.contentImageBlockLeftId = contentImageBlockLeftId;
		commitNeeded = true;
	}

	public int getActualContentImageBlockLeftId () {
		return contentImageBlockLeftId;
	}

	public double getContentImageBlockLeftOrder () {
		return contentImageBlockLeftOrder;
	}

	public void setContentImageBlockLeftOrder (double contentImageBlockLeftOrder) {
		this.contentImageBlockLeftOrder = contentImageBlockLeftOrder;
		commitNeeded = true;
	}

	public double getActualContentImageBlockLeftOrder () {
		return contentImageBlockLeftOrder;
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

	public static Integer onboardingIdValue() throws JspException {
		try {
			return currentInstance.getOnboardingId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function onboardingIdValue()");
		}
	}

	public static Integer contentImageBlockLeftIdValue() throws JspException {
		try {
			return currentInstance.getContentImageBlockLeftId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function contentImageBlockLeftIdValue()");
		}
	}

	public static Double contentImageBlockLeftOrderValue() throws JspException {
		try {
			return currentInstance.getContentImageBlockLeftOrder();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function contentImageBlockLeftOrderValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		onboardingId = 0;
		contentImageBlockLeftId = 0;
		contentImageBlockLeftOrder = 0.0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
