package org.cd2h.STRAPITagLib.landingPagesDomainTeamsLinks;


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
import org.cd2h.STRAPITagLib.domainTeams.DomainTeams;
import org.cd2h.STRAPITagLib.landingPages.LandingPages;

@SuppressWarnings("serial")
public class LandingPagesDomainTeamsLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int landingPageId = 0;
    int domainTeamId = 0;
    double domainTeamOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(LandingPagesDomainTeamsLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
		if (theDomainTeams!= null)
			parentEntities.addElement(theDomainTeams);
		LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
		if (theLandingPages!= null)
			parentEntities.addElement(theLandingPages);

		if (theDomainTeams == null) {
		} else {
			domainTeamId = theDomainTeams.getID();
		}
		if (theLandingPages == null) {
		} else {
			landingPageId = theLandingPages.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.landing_pages_domain_teams_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (domainTeamId == 0 ? "" : " and domain_team_id = ? ")
                                                        + (landingPageId == 0 ? "" : " and landing_page_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (domainTeamId != 0) stat.setInt(webapp_keySeq++, domainTeamId);
			if (landingPageId != 0) stat.setInt(webapp_keySeq++, landingPageId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating LandingPagesDomainTeamsLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating LandingPagesDomainTeamsLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating LandingPagesDomainTeamsLinks deleter",e);
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
