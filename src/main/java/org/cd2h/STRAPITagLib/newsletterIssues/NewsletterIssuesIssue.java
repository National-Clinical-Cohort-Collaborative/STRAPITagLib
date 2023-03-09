package org.cd2h.STRAPITagLib.newsletterIssues;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewsletterIssuesIssue extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewsletterIssuesIssue.class);

	public int doStartTag() throws JspException {
		try {
			NewsletterIssues theNewsletterIssues = (NewsletterIssues)findAncestorWithClass(this, NewsletterIssues.class);
			if (!theNewsletterIssues.commitNeeded) {
				pageContext.getOut().print(theNewsletterIssues.getIssue());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsletterIssues for issue tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsletterIssues for issue tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsletterIssues for issue tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getIssue() throws JspException {
		try {
			NewsletterIssues theNewsletterIssues = (NewsletterIssues)findAncestorWithClass(this, NewsletterIssues.class);
			return theNewsletterIssues.getIssue();
		} catch (Exception e) {
			log.error("Can't find enclosing NewsletterIssues for issue tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsletterIssues for issue tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsletterIssues for issue tag ");
			}
		}
	}

	public void setIssue(String issue) throws JspException {
		try {
			NewsletterIssues theNewsletterIssues = (NewsletterIssues)findAncestorWithClass(this, NewsletterIssues.class);
			theNewsletterIssues.setIssue(issue);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsletterIssues for issue tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsletterIssues for issue tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsletterIssues for issue tag ");
			}
		}
	}

}
