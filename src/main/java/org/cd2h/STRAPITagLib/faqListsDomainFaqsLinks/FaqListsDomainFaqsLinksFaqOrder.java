package org.cd2h.STRAPITagLib.faqListsDomainFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsDomainFaqsLinksFaqOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsDomainFaqsLinksFaqOrder.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			if (!theFaqListsDomainFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsDomainFaqsLinks.getFaqOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFaqOrder() throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			return theFaqListsDomainFaqsLinks.getFaqOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
			}
		}
	}

	public void setFaqOrder(double faqOrder) throws JspException {
		try {
			FaqListsDomainFaqsLinks theFaqListsDomainFaqsLinks = (FaqListsDomainFaqsLinks)findAncestorWithClass(this, FaqListsDomainFaqsLinks.class);
			theFaqListsDomainFaqsLinks.setFaqOrder(faqOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsDomainFaqsLinks for faqOrder tag ");
			}
		}
	}

}
