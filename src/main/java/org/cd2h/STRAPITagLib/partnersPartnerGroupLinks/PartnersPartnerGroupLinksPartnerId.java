package org.cd2h.STRAPITagLib.partnersPartnerGroupLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersPartnerGroupLinksPartnerId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersPartnerGroupLinksPartnerId.class);

	public int doStartTag() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			if (!thePartnersPartnerGroupLinks.commitNeeded) {
				pageContext.getOut().print(thePartnersPartnerGroupLinks.getPartnerId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPartnerId() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			return thePartnersPartnerGroupLinks.getPartnerId();
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
			}
		}
	}

	public void setPartnerId(int partnerId) throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			thePartnersPartnerGroupLinks.setPartnerId(partnerId);
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerId tag ");
			}
		}
	}

}
