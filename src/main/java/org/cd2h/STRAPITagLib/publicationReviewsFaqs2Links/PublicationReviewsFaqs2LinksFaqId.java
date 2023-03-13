package org.cd2h.STRAPITagLib.publicationReviewsFaqs2Links;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicationReviewsFaqs2LinksFaqId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicationReviewsFaqs2LinksFaqId.class);

	public int doStartTag() throws JspException {
		try {
			PublicationReviewsFaqs2Links thePublicationReviewsFaqs2Links = (PublicationReviewsFaqs2Links)findAncestorWithClass(this, PublicationReviewsFaqs2Links.class);
			if (!thePublicationReviewsFaqs2Links.commitNeeded) {
				pageContext.getOut().print(thePublicationReviewsFaqs2Links.getFaqId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFaqId() throws JspException {
		try {
			PublicationReviewsFaqs2Links thePublicationReviewsFaqs2Links = (PublicationReviewsFaqs2Links)findAncestorWithClass(this, PublicationReviewsFaqs2Links.class);
			return thePublicationReviewsFaqs2Links.getFaqId();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
			}
		}
	}

	public void setFaqId(int faqId) throws JspException {
		try {
			PublicationReviewsFaqs2Links thePublicationReviewsFaqs2Links = (PublicationReviewsFaqs2Links)findAncestorWithClass(this, PublicationReviewsFaqs2Links.class);
			thePublicationReviewsFaqs2Links.setFaqId(faqId);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicationReviewsFaqs2Links for faqId tag ");
			}
		}
	}

}
