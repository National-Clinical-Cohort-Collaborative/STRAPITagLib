package org.cd2h.STRAPITagLib.tutorialsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TutorialsYouTubeVideosLinksYouTubeVideoOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TutorialsYouTubeVideosLinksYouTubeVideoOrder.class);

	public int doStartTag() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			if (!theTutorialsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(theTutorialsYouTubeVideosLinks.getYouTubeVideoOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getYouTubeVideoOrder() throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			return theTutorialsYouTubeVideosLinks.getYouTubeVideoOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}
		}
	}

	public void setYouTubeVideoOrder(double youTubeVideoOrder) throws JspException {
		try {
			TutorialsYouTubeVideosLinks theTutorialsYouTubeVideosLinks = (TutorialsYouTubeVideosLinks)findAncestorWithClass(this, TutorialsYouTubeVideosLinks.class);
			theTutorialsYouTubeVideosLinks.setYouTubeVideoOrder(youTubeVideoOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TutorialsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}
		}
	}

}
