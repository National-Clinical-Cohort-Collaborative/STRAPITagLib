package org.cd2h.STRAPITagLib.youTubeVideos;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class YouTubeVideosWidth extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(YouTubeVideosWidth.class);

	public int doStartTag() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			if (!theYouTubeVideos.commitNeeded) {
				pageContext.getOut().print(theYouTubeVideos.getWidth());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for width tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for width tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for width tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWidth() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			return theYouTubeVideos.getWidth();
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for width tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for width tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for width tag ");
			}
		}
	}

	public void setWidth(int width) throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			theYouTubeVideos.setWidth(width);
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for width tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for width tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for width tag ");
			}
		}
	}

}
