package org.cd2h.STRAPITagLib.workstreamInstancesFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesFaqsLinksFaqOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesFaqsLinksFaqOrder.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			if (!theWorkstreamInstancesFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesFaqsLinks.getFaqOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFaqOrder() throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			return theWorkstreamInstancesFaqsLinks.getFaqOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
			}
		}
	}

	public void setFaqOrder(double faqOrder) throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			theWorkstreamInstancesFaqsLinks.setFaqOrder(faqOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for faqOrder tag ");
			}
		}
	}

}
