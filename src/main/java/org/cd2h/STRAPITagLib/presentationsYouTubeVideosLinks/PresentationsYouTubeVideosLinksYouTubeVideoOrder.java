package org.cd2h.STRAPITagLib.presentationsYouTubeVideosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PresentationsYouTubeVideosLinksYouTubeVideoOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PresentationsYouTubeVideosLinksYouTubeVideoOrder.class);

	public int doStartTag() throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			if (!thePresentationsYouTubeVideosLinks.commitNeeded) {
				pageContext.getOut().print(thePresentationsYouTubeVideosLinks.getYouTubeVideoOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getYouTubeVideoOrder() throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			return thePresentationsYouTubeVideosLinks.getYouTubeVideoOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}
		}
	}

	public void setYouTubeVideoOrder(double youTubeVideoOrder) throws JspException {
		try {
			PresentationsYouTubeVideosLinks thePresentationsYouTubeVideosLinks = (PresentationsYouTubeVideosLinks)findAncestorWithClass(this, PresentationsYouTubeVideosLinks.class);
			thePresentationsYouTubeVideosLinks.setYouTubeVideoOrder(youTubeVideoOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PresentationsYouTubeVideosLinks for youTubeVideoOrder tag ");
			}
		}
	}

}
