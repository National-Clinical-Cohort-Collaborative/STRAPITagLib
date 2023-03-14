package org.cd2h.STRAPITagLib.faqListsEnclaveFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsEnclaveFaqsLinksFaqOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsEnclaveFaqsLinksFaqOrder.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			if (!theFaqListsEnclaveFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsEnclaveFaqsLinks.getFaqOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFaqOrder() throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			return theFaqListsEnclaveFaqsLinks.getFaqOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
			}
		}
	}

	public void setFaqOrder(double faqOrder) throws JspException {
		try {
			FaqListsEnclaveFaqsLinks theFaqListsEnclaveFaqsLinks = (FaqListsEnclaveFaqsLinks)findAncestorWithClass(this, FaqListsEnclaveFaqsLinks.class);
			theFaqListsEnclaveFaqsLinks.setFaqOrder(faqOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsEnclaveFaqsLinks for faqOrder tag ");
			}
		}
	}

}
