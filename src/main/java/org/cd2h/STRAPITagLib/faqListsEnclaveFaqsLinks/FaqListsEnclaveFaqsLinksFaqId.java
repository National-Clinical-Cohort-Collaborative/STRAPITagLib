package org.cd2h.STRAPITagLib.faqListsEnclaveFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsEnclaveFaqsLinksFaqId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsEnclaveFaqsLinksFaqId.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			if (!theFaqListsEnclaveFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsEnclaveFaqsLinks.getFaqId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqId() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			return theFaqListsEnclaveFaqsLinks.getFaqId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
			}
		}
	}

	public void setFaqId(int faqId) throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			theFaqListsEnclaveFaqsLinks.setFaqId(faqId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqId tag ");
			}
		}
	}

}
