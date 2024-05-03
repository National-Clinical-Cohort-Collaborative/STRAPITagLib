package org.cd2h.STRAPITagLib.covidExtensionsFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CovidExtensionsFaqsLinksFaqId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CovidExtensionsFaqsLinksFaqId.class);

	public int doStartTag() throws JspException {
		try {
			CovidExtensionsFaqsLinks theCovidExtensionsFaqsLinks = (CovidExtensionsFaqsLinks)findAncestorWithClass(this, CovidExtensionsFaqsLinks.class);
			if (!theCovidExtensionsFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theCovidExtensionsFaqsLinks.getFaqId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqId() throws JspException {
		try {
			CovidExtensionsFaqsLinks theCovidExtensionsFaqsLinks = (CovidExtensionsFaqsLinks)findAncestorWithClass(this, CovidExtensionsFaqsLinks.class);
			return theCovidExtensionsFaqsLinks.getFaqId();
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
			}
		}
	}

	public void setFaqId(int faqId) throws JspException {
		try {
			CovidExtensionsFaqsLinks theCovidExtensionsFaqsLinks = (CovidExtensionsFaqsLinks)findAncestorWithClass(this, CovidExtensionsFaqsLinks.class);
			theCovidExtensionsFaqsLinks.setFaqId(faqId);
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFaqsLinks for faqId tag ");
			}
		}
	}

}
