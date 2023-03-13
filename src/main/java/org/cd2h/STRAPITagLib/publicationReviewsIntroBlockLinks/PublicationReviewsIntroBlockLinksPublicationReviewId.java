package org.cd2h.STRAPITagLib.publicationReviewsIntroBlockLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicationReviewsIntroBlockLinksPublicationReviewId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicationReviewsIntroBlockLinksPublicationReviewId.class);

	public int doStartTag() throws JspException {
		try {
			PublicationReviewsIntroBlockLinks thePublicationReviewsIntroBlockLinks = (PublicationReviewsIntroBlockLinks)findAncestorWithClass(this, PublicationReviewsIntroBlockLinks.class);
			if (!thePublicationReviewsIntroBlockLinks.commitNeeded) {
				pageContext.getOut().print(thePublicationReviewsIntroBlockLinks.getPublicationReviewId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPublicationReviewId() throws JspException {
		try {
			PublicationReviewsIntroBlockLinks thePublicationReviewsIntroBlockLinks = (PublicationReviewsIntroBlockLinks)findAncestorWithClass(this, PublicationReviewsIntroBlockLinks.class);
			return thePublicationReviewsIntroBlockLinks.getPublicationReviewId();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
			}
		}
	}

	public void setPublicationReviewId(int publicationReviewId) throws JspException {
		try {
			PublicationReviewsIntroBlockLinks thePublicationReviewsIntroBlockLinks = (PublicationReviewsIntroBlockLinks)findAncestorWithClass(this, PublicationReviewsIntroBlockLinks.class);
			thePublicationReviewsIntroBlockLinks.setPublicationReviewId(publicationReviewId);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsIntroBlockLinks for publicationReviewId tag ");
			}
		}
	}

}
