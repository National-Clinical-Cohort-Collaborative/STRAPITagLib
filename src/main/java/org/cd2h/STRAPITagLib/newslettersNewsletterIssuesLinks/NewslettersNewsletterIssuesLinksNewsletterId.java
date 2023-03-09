package org.cd2h.STRAPITagLib.newslettersNewsletterIssuesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewslettersNewsletterIssuesLinksNewsletterId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewslettersNewsletterIssuesLinksNewsletterId.class);

	public int doStartTag() throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			if (!theNewslettersNewsletterIssuesLinks.commitNeeded) {
				pageContext.getOut().print(theNewslettersNewsletterIssuesLinks.getNewsletterId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getNewsletterId() throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			return theNewslettersNewsletterIssuesLinks.getNewsletterId();
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
			}
		}
	}

	public void setNewsletterId(int newsletterId) throws JspException {
		try {
			NewslettersNewsletterIssuesLinks theNewslettersNewsletterIssuesLinks = (NewslettersNewsletterIssuesLinks)findAncestorWithClass(this, NewslettersNewsletterIssuesLinks.class);
			theNewslettersNewsletterIssuesLinks.setNewsletterId(newsletterId);
		} catch (Exception e) {
			log.error("Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewslettersNewsletterIssuesLinks for newsletterId tag ");
			}
		}
	}

}
