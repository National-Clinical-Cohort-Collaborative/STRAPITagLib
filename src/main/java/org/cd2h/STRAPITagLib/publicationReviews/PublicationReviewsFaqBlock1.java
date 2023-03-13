package org.cd2h.STRAPITagLib.publicationReviews;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicationReviewsFaqBlock1 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicationReviewsFaqBlock1.class);

	public int doStartTag() throws JspException {
		try {
			PublicationReviews thePublicationReviews = (PublicationReviews)findAncestorWithClass(this, PublicationReviews.class);
			if (!thePublicationReviews.commitNeeded) {
				pageContext.getOut().print(thePublicationReviews.getFaqBlock1());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviews for faqBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getFaqBlock1() throws JspException {
		try {
			PublicationReviews thePublicationReviews = (PublicationReviews)findAncestorWithClass(this, PublicationReviews.class);
			return thePublicationReviews.getFaqBlock1();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviews for faqBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
			}
		}
	}

	public void setFaqBlock1(String faqBlock1) throws JspException {
		try {
			PublicationReviews thePublicationReviews = (PublicationReviews)findAncestorWithClass(this, PublicationReviews.class);
			thePublicationReviews.setFaqBlock1(faqBlock1);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviews for faqBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviews for faqBlock1 tag ");
			}
		}
	}

}
