package org.cd2h.STRAPITagLib.externalDatasetsYouTubeVideoLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsYouTubeVideoLinksExternalDatasetId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsYouTubeVideoLinksExternalDatasetId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			if (!theExternalDatasetsYouTubeVideoLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsYouTubeVideoLinks.getExternalDatasetId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getExternalDatasetId() throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			return theExternalDatasetsYouTubeVideoLinks.getExternalDatasetId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
			}
		}
	}

	public void setExternalDatasetId(int externalDatasetId) throws JspException {
		try {
			ExternalDatasetsYouTubeVideoLinks theExternalDatasetsYouTubeVideoLinks = (ExternalDatasetsYouTubeVideoLinks)findAncestorWithClass(this, ExternalDatasetsYouTubeVideoLinks.class);
			theExternalDatasetsYouTubeVideoLinks.setExternalDatasetId(externalDatasetId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsYouTubeVideoLinks for externalDatasetId tag ");
			}
		}
	}

}
