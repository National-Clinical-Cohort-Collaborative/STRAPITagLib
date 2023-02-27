package org.cd2h.STRAPITagLib.partnersPartnerGroupLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersPartnerGroupLinksPartnerGroupId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersPartnerGroupLinksPartnerGroupId.class);

	public int doStartTag() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			if (!thePartnersPartnerGroupLinks.commitNeeded) {
				pageContext.getOut().print(thePartnersPartnerGroupLinks.getPartnerGroupId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPartnerGroupId() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			return thePartnersPartnerGroupLinks.getPartnerGroupId();
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
			}
		}
	}

	public void setPartnerGroupId(int partnerGroupId) throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			thePartnersPartnerGroupLinks.setPartnerGroupId(partnerGroupId);
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerGroupId tag ");
			}
		}
	}

}
