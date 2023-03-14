package org.cd2h.STRAPITagLib.faqListsPhenotypeFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsPhenotypeFaqsLinksFaqOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsPhenotypeFaqsLinksFaqOrder.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsPhenotypeFaqsLinks theFaqListsPhenotypeFaqsLinks = (FaqListsPhenotypeFaqsLinks)findAncestorWithClass(this, FaqListsPhenotypeFaqsLinks.class);
			if (!theFaqListsPhenotypeFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsPhenotypeFaqsLinks.getFaqOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFaqOrder() throws JspException {
		try {
			FaqListsPhenotypeFaqsLinks theFaqListsPhenotypeFaqsLinks = (FaqListsPhenotypeFaqsLinks)findAncestorWithClass(this, FaqListsPhenotypeFaqsLinks.class);
			return theFaqListsPhenotypeFaqsLinks.getFaqOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
			}
		}
	}

	public void setFaqOrder(double faqOrder) throws JspException {
		try {
			FaqListsPhenotypeFaqsLinks theFaqListsPhenotypeFaqsLinks = (FaqListsPhenotypeFaqsLinks)findAncestorWithClass(this, FaqListsPhenotypeFaqsLinks.class);
			theFaqListsPhenotypeFaqsLinks.setFaqOrder(faqOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsPhenotypeFaqsLinks for faqOrder tag ");
			}
		}
	}

}
