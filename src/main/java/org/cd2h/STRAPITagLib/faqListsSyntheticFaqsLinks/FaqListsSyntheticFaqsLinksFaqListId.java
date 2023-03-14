package org.cd2h.STRAPITagLib.faqListsSyntheticFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsSyntheticFaqsLinksFaqListId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsSyntheticFaqsLinksFaqListId.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsSyntheticFaqsLinks theFaqListsSyntheticFaqsLinks = (FaqListsSyntheticFaqsLinks)findAncestorWithClass(this, FaqListsSyntheticFaqsLinks.class);
			if (!theFaqListsSyntheticFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsSyntheticFaqsLinks.getFaqListId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqListId() throws JspException {
		try {
			FaqListsSyntheticFaqsLinks theFaqListsSyntheticFaqsLinks = (FaqListsSyntheticFaqsLinks)findAncestorWithClass(this, FaqListsSyntheticFaqsLinks.class);
			return theFaqListsSyntheticFaqsLinks.getFaqListId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
			}
		}
	}

	public void setFaqListId(int faqListId) throws JspException {
		try {
			FaqListsSyntheticFaqsLinks theFaqListsSyntheticFaqsLinks = (FaqListsSyntheticFaqsLinks)findAncestorWithClass(this, FaqListsSyntheticFaqsLinks.class);
			theFaqListsSyntheticFaqsLinks.setFaqListId(faqListId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsSyntheticFaqsLinks for faqListId tag ");
			}
		}
	}

}
