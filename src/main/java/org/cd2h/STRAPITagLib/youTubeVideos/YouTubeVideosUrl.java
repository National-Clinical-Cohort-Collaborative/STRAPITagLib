package org.cd2h.STRAPITagLib.youTubeVideos;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class YouTubeVideosUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(YouTubeVideosUrl.class);

	public int doStartTag() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			if (!theYouTubeVideos.commitNeeded) {
				pageContext.getOut().print(theYouTubeVideos.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			return theYouTubeVideos.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			theYouTubeVideos.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for url tag ");
			}
		}
	}

}
