package org.cd2h.STRAPITagLib.publicationReviewsFaqs1Links;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicationReviewsFaqs1LinksPublicationReviewId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicationReviewsFaqs1LinksPublicationReviewId.class);

	public int doStartTag() throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			if (!thePublicationReviewsFaqs1Links.commitNeeded) {
				pageContext.getOut().print(thePublicationReviewsFaqs1Links.getPublicationReviewId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPublicationReviewId() throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			return thePublicationReviewsFaqs1Links.getPublicationReviewId();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
			}
		}
	}

	public void setPublicationReviewId(int publicationReviewId) throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			thePublicationReviewsFaqs1Links.setPublicationReviewId(publicationReviewId);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for publicationReviewId tag ");
			}
		}
	}

}
