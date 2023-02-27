package org.cd2h.STRAPITagLib.youTubeVideos;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class YouTubeVideosHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(YouTubeVideosHeader.class);

	public int doStartTag() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			if (!theYouTubeVideos.commitNeeded) {
				pageContext.getOut().print(theYouTubeVideos.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			return theYouTubeVideos.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			theYouTubeVideos.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for header tag ");
			}
		}
	}

}
