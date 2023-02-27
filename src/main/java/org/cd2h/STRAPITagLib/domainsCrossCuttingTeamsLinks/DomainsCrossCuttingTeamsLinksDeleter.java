package org.cd2h.STRAPITagLib.domainsCrossCuttingTeamsLinks;


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
import org.cd2h.STRAPITagLib.domains.Domains;

@SuppressWarnings("serial")
public class DomainsCrossCuttingTeamsLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int domainId = 0;
    int domainTeamId = 0;
    double domainTeamOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(DomainsCrossCuttingTeamsLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
		if (theDomainTeams!= null)
			parentEntities.addElement(theDomainTeams);
		Domains theDomains = (Domains)findAncestorWithClass(this, Domains.class);
		if (theDomains!= null)
			parentEntities.addElement(theDomains);

		if (theDomainTeams == null) {
		} else {
			domainTeamId = theDomainTeams.getID();
		}
		if (theDomains == null) {
		} else {
			domainId = theDomains.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.domains_cross_cutting_teams_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (domainTeamId == 0 ? "" : " and domain_team_id = ? ")
                                                        + (domainId == 0 ? "" : " and domain_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (domainTeamId != 0) stat.setInt(webapp_keySeq++, domainTeamId);
			if (domainId != 0) stat.setInt(webapp_keySeq++, domainId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating DomainsCrossCuttingTeamsLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating DomainsCrossCuttingTeamsLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating DomainsCrossCuttingTeamsLinks deleter",e);
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
