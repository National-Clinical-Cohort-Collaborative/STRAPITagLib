package org.cd2h.STRAPITagLib.faqListsHarmonizationFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsHarmonizationFaqsLinksFaqId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsHarmonizationFaqsLinksFaqId.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			if (!theFaqListsHarmonizationFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsHarmonizationFaqsLinks.getFaqId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqId() throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			return theFaqListsHarmonizationFaqsLinks.getFaqId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
			}
		}
	}

	public void setFaqId(int faqId) throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			theFaqListsHarmonizationFaqsLinks.setFaqId(faqId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for faqId tag ");
			}
		}
	}

}
