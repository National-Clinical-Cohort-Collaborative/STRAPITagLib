package org.cd2h.STRAPITagLib.externalDatasetsYouTubeVideoLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsYouTubeVideoLinksYouTubeVideoId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsYouTubeVideoLinksYouTubeVideoId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			if (!theExternalDatasetsYouTubeVideoLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsYouTubeVideoLinks.getYouTubeVideoId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getYouTubeVideoId() throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			return theExternalDatasetsYouTubeVideoLinks.getYouTubeVideoId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
			}
		}
	}

	public void setYouTubeVideoId(int youTubeVideoId) throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			theExternalDatasetsYouTubeVideoLinks.setYouTubeVideoId(youTubeVideoId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for youTubeVideoId tag ");
			}
		}
	}

}
