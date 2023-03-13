package org.cd2h.STRAPITagLib.trainingsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsYouTubeVideosLinksYouTubeVideoId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsYouTubeVideosLinksYouTubeVideoId.class);

	public int doStartTag() throws JspException {
		try {
			TrainingsYouTubeVideosLinks theTrainingsYouTubeVideosLinks = (TrainingsYouTubeVideosLinks)findAncestorWithClass(this, TrainingsYouTubeVideosLinks.class);
			if (!theTrainingsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(theTrainingsYouTubeVideosLinks.getYouTubeVideoId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getYouTubeVideoId() throws JspException {
		try {
			TrainingsYouTubeVideosLinks theTrainingsYouTubeVideosLinks = (TrainingsYouTubeVideosLinks)findAncestorWithClass(this, TrainingsYouTubeVideosLinks.class);
			return theTrainingsYouTubeVideosLinks.getYouTubeVideoId();
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
			}
		}
	}

	public void setYouTubeVideoId(int youTubeVideoId) throws JspException {
		try {
			TrainingsYouTubeVideosLinks theTrainingsYouTubeVideosLinks = (TrainingsYouTubeVideosLinks)findAncestorWithClass(this, TrainingsYouTubeVideosLinks.class);
			theTrainingsYouTubeVideosLinks.setYouTubeVideoId(youTubeVideoId);
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsYouTubeVideosLinks for youTubeVideoId tag ");
			}
		}
	}

}
