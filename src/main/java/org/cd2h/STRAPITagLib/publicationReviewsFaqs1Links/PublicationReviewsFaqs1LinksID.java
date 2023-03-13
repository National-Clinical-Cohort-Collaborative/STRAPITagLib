package org.cd2h.STRAPITagLib.publicationReviewsFaqs1Links;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicationReviewsFaqs1LinksID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicationReviewsFaqs1LinksID.class);

	public int doStartTag() throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			if (!thePublicationReviewsFaqs1Links.commitNeeded) {
				pageContext.getOut().print(thePublicationReviewsFaqs1Links.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			return thePublicationReviewsFaqs1Links.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			PublicationReviewsFaqs1Links thePublicationReviewsFaqs1Links = (PublicationReviewsFaqs1Links)findAncestorWithClass(this, PublicationReviewsFaqs1Links.class);
			thePublicationReviewsFaqs1Links.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs1Links for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs1Links for ID tag ");
			}
		}
	}

}
