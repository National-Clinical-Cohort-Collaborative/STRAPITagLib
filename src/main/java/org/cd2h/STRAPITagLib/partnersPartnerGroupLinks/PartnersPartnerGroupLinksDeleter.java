package org.cd2h.STRAPITagLib.partnersPartnerGroupLinks;


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
import org.cd2h.STRAPITagLib.partnerGroups.PartnerGroups;
import org.cd2h.STRAPITagLib.partners.Partners;

@SuppressWarnings("serial")
public class PartnersPartnerGroupLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int partnerId = 0;
    int partnerGroupId = 0;
    double partnerOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(PartnersPartnerGroupLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
		if (thePartnerGroups!= null)
			parentEntities.addElement(thePartnerGroups);
		Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
		if (thePartners!= null)
			parentEntities.addElement(thePartners);

		if (thePartnerGroups == null) {
		} else {
			partnerGroupId = thePartnerGroups.getID();
		}
		if (thePartners == null) {
		} else {
			partnerId = thePartners.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.partners_partner_group_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (partnerGroupId == 0 ? "" : " and partner_group_id = ? ")
                                                        + (partnerId == 0 ? "" : " and partner_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (partnerGroupId != 0) stat.setInt(webapp_keySeq++, partnerGroupId);
			if (partnerId != 0) stat.setInt(webapp_keySeq++, partnerId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating PartnersPartnerGroupLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating PartnersPartnerGroupLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating PartnersPartnerGroupLinks deleter",e);
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
