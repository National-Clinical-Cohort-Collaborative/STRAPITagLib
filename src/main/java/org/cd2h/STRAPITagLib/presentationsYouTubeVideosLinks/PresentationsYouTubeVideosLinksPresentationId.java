package org.cd2h.STRAPITagLib.presentationsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PresentationsYouTubeVideosLinksPresentationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PresentationsYouTubeVideosLinksPresentationId.class);

	public int doStartTag() throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			if (!thePresentationsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(thePresentationsYouTubeVideosLinks.getPresentationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPresentationId() throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			return thePresentationsYouTubeVideosLinks.getPresentationId();
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
			}
		}
	}

	public void setPresentationId(int presentationId) throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			thePresentationsYouTubeVideosLinks.setPresentationId(presentationId);
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for presentationId tag ");
			}
		}
	}

}
