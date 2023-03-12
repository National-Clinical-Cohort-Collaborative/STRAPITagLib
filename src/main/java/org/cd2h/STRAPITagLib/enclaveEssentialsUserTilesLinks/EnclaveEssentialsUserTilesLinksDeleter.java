package org.cd2h.STRAPITagLib.enclaveEssentialsUserTilesLinks;


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
import org.cd2h.STRAPITagLib.contentImageBlockLefts.ContentImageBlockLefts;
import org.cd2h.STRAPITagLib.enclaveEssentials.EnclaveEssentials;

@SuppressWarnings("serial")
public class EnclaveEssentialsUserTilesLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int enclaveEssentialId = 0;
    int contentImageBlockLeftId = 0;
    double contentImageBlockLeftOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(EnclaveEssentialsUserTilesLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
		if (theContentImageBlockLefts!= null)
			parentEntities.addElement(theContentImageBlockLefts);
		EnclaveEssentials theEnclaveEssentials = (EnclaveEssentials)findAncestorWithClass(this, EnclaveEssentials.class);
		if (theEnclaveEssentials!= null)
			parentEntities.addElement(theEnclaveEssentials);

		if (theContentImageBlockLefts == null) {
		} else {
			contentImageBlockLeftId = theContentImageBlockLefts.getID();
		}
		if (theEnclaveEssentials == null) {
		} else {
			enclaveEssentialId = theEnclaveEssentials.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.enclave_essentials_user_tiles_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (contentImageBlockLeftId == 0 ? "" : " and content_image_block_left_id = ? ")
                                                        + (enclaveEssentialId == 0 ? "" : " and enclave_essential_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (contentImageBlockLeftId != 0) stat.setInt(webapp_keySeq++, contentImageBlockLeftId);
			if (enclaveEssentialId != 0) stat.setInt(webapp_keySeq++, enclaveEssentialId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating EnclaveEssentialsUserTilesLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating EnclaveEssentialsUserTilesLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating EnclaveEssentialsUserTilesLinks deleter",e);
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
