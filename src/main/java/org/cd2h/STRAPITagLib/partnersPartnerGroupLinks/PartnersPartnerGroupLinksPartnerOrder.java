package org.cd2h.STRAPITagLib.partnersPartnerGroupLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersPartnerGroupLinksPartnerOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersPartnerGroupLinksPartnerOrder.class);

	public int doStartTag() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			if (!thePartnersPartnerGroupLinks.commitNeeded) {
				pageContext.getOut().print(thePartnersPartnerGroupLinks.getPartnerOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getPartnerOrder() throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			return thePartnersPartnerGroupLinks.getPartnerOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
			}
		}
	}

	public void setPartnerOrder(double partnerOrder) throws JspException {
		try {
			PartnersPartnerGroupLinks thePartnersPartnerGroupLinks = (PartnersPartnerGroupLinks)findAncestorWithClass(this, PartnersPartnerGroupLinks.class);
			thePartnersPartnerGroupLinks.setPartnerOrder(partnerOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnersPartnerGroupLinks for partnerOrder tag ");
			}
		}
	}

}
