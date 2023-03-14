package org.cd2h.STRAPITagLib.faqListsEnclaveFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsEnclaveFaqsLinksFaqListId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsEnclaveFaqsLinksFaqListId.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			if (!theFaqListsEnclaveFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsEnclaveFaqsLinks.getFaqListId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqListId() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			return theFaqListsEnclaveFaqsLinks.getFaqListId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
			}
		}
	}

	public void setFaqListId(int faqListId) throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			theFaqListsEnclaveFaqsLinks.setFaqListId(faqListId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqListId tag ");
			}
		}
	}

}
