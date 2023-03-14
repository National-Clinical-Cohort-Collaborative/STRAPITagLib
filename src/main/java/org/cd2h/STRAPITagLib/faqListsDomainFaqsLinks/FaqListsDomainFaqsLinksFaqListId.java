package org.cd2h.STRAPITagLib.faqListsDomainFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsDomainFaqsLinksFaqListId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsDomainFaqsLinksFaqListId.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			if (!theFaqListsDomainFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsDomainFaqsLinks.getFaqListId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqListId() throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			return theFaqListsDomainFaqsLinks.getFaqListId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
			}
		}
	}

	public void setFaqListId(int faqListId) throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			theFaqListsDomainFaqsLinks.setFaqListId(faqListId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqListId tag ");
			}
		}
	}

}
