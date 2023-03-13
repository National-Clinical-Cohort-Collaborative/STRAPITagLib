package org.cd2h.STRAPITagLib.tutorialsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TutorialsYouTubeVideosLinksTutorialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TutorialsYouTubeVideosLinksTutorialId.class);

	public int doStartTag() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			if (!theTutorialsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(theTutorialsYouTubeVideosLinks.getTutorialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getTutorialId() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			return theTutorialsYouTubeVideosLinks.getTutorialId();
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
			}
		}
	}

	public void setTutorialId(int tutorialId) throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			theTutorialsYouTubeVideosLinks.setTutorialId(tutorialId);
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for tutorialId tag ");
			}
		}
	}

}
