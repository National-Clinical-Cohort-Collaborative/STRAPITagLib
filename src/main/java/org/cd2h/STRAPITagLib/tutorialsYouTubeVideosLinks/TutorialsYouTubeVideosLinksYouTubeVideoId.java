package org.cd2h.STRAPITagLib.tutorialsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TutorialsYouTubeVideosLinksYouTubeVideoId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TutorialsYouTubeVideosLinksYouTubeVideoId.class);

	public int doStartTag() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			if (!theTutorialsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(theTutorialsYouTubeVideosLinks.getYouTubeVideoId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getYouTubeVideoId() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			return theTutorialsYouTubeVideosLinks.getYouTubeVideoId();
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
			}
		}
	}

	public void setYouTubeVideoId(int youTubeVideoId) throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			theTutorialsYouTubeVideosLinks.setYouTubeVideoId(youTubeVideoId);
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoId tag ");
			}
		}
	}

}
