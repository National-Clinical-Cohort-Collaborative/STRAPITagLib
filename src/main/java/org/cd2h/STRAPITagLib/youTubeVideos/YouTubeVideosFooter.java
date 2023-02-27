package org.cd2h.STRAPITagLib.youTubeVideos;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class YouTubeVideosFooter extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(YouTubeVideosFooter.class);

	public int doStartTag() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			if (!theYouTubeVideos.commitNeeded) {
				pageContext.getOut().print(theYouTubeVideos.getFooter());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for footer tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for footer tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for footer tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getFooter() throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			return theYouTubeVideos.getFooter();
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for footer tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for footer tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for footer tag ");
			}
		}
	}

	public void setFooter(String footer) throws JspException {
		try {
			YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
			theYouTubeVideos.setFooter(footer);
		} catch (Exception e) {
			log.error("Can't find enclosing YouTubeVideos for footer tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing YouTubeVideos for footer tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing YouTubeVideos for footer tag ");
			}
		}
	}

}
