package org.cd2h.STRAPITagLib.newsItemsPressReleasesLinks;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.STRAPITagLibBodyTagSupport;
import org.cd2h.STRAPITagLib.newsItems.NewsItems;
import org.cd2h.STRAPITagLib.pressReleases.PressReleases;

@SuppressWarnings("serial")
public class NewsItemsPressReleasesLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int newsItemId = 0;
    int pressReleaseId = 0;
    double pressReleaseOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(NewsItemsPressReleasesLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		NewsItems theNewsItems = (NewsItems)findAncestorWithClass(this, NewsItems.class);
		if (theNewsItems!= null)
			parentEntities.addElement(theNewsItems);
		PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
		if (thePressReleases!= null)
			parentEntities.addElement(thePressReleases);

		if (theNewsItems == null) {
		} else {
			newsItemId = theNewsItems.getID();
		}
		if (thePressReleases == null) {
		} else {
			pressReleaseId = thePressReleases.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.news_items_press_releases_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (newsItemId == 0 ? "" : " and news_item_id = ? ")
                                                        + (pressReleaseId == 0 ? "" : " and press_release_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (newsItemId != 0) stat.setInt(webapp_keySeq++, newsItemId);
			if (pressReleaseId != 0) stat.setInt(webapp_keySeq++, pressReleaseId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating NewsItemsPressReleasesLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating NewsItemsPressReleasesLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating NewsItemsPressReleasesLinks deleter",e);
			}

        } finally {
            freeConnection();
        }

        return SKIP_BODY;
    }

	public int doEndTag() throws JspException {

		clearServiceState();
		Boolean error = (Boolean) pageContext.getAttribute("tagError");
		if(error != null && error){

			freeConnection();

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
		return super.doEndTag();
	}

    private void clearServiceState() {
        ID = 0;
        parentEntities = new Vector<STRAPITagLibTagSupport>();

        this.rs = null;
        this.var = null;
        this.rsCount = 0;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
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
}
