package org.cd2h.STRAPITagLib.newslettersNewsletterIssuesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewslettersNewsletterIssuesLinksNewsletterIssueOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewslettersNewsletterIssuesLinksNewsletterIssueOrder.class);

	public int doStartTag() throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			if (!theNewslettersNewsletterIssuesLinks.commitNeeded) {
				pageContext.getOut().print(theNewslettersNewsletterIssuesLinks.getNewsletterIssueOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getNewsletterIssueOrder() throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			return theNewslettersNewsletterIssuesLinks.getNewsletterIssueOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
			}
		}
	}

	public void setNewsletterIssueOrder(double newsletterIssueOrder) throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			theNewslettersNewsletterIssuesLinks.setNewsletterIssueOrder(newsletterIssueOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterIssueOrder tag ");
			}
		}
	}

}
