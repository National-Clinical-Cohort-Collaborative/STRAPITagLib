package org.cd2h.STRAPITagLib.faqListsEnclaveFaqsLinks;


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
import org.cd2h.STRAPITagLib.faqLists.FaqLists;
import org.cd2h.STRAPITagLib.faqs.Faqs;

@SuppressWarnings("serial")
public class FaqListsEnclaveFaqsLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int faqListId = 0;
    int faqId = 0;
    double faqOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(FaqListsEnclaveFaqsLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
		if (theFaqLists!= null)
			parentEntities.addElement(theFaqLists);
		Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
		if (theFaqs!= null)
			parentEntities.addElement(theFaqs);

		if (theFaqLists == null) {
		} else {
			faqListId = theFaqLists.getID();
		}
		if (theFaqs == null) {
		} else {
			faqId = theFaqs.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.faq_lists_enclave_faqs_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (faqListId == 0 ? "" : " and faq_list_id = ? ")
                                                        + (faqId == 0 ? "" : " and faq_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (faqListId != 0) stat.setInt(webapp_keySeq++, faqListId);
			if (faqId != 0) stat.setInt(webapp_keySeq++, faqId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating FaqListsEnclaveFaqsLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating FaqListsEnclaveFaqsLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating FaqListsEnclaveFaqsLinks deleter",e);
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
