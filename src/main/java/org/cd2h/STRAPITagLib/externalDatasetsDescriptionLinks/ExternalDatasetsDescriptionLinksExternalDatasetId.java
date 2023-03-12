package org.cd2h.STRAPITagLib.externalDatasetsDescriptionLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsDescriptionLinksExternalDatasetId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsDescriptionLinksExternalDatasetId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsDescriptionLinks theExternalDatasetsDescriptionLinks = (ExternalDatasetsDescriptionLinks)findAncestorWithClass(this, ExternalDatasetsDescriptionLinks.class);
			if (!theExternalDatasetsDescriptionLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsDescriptionLinks.getExternalDatasetId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getExternalDatasetId() throws JspException {
		try {
			ExternalDatasetsDescriptionLinks theExternalDatasetsDescriptionLinks = (ExternalDatasetsDescriptionLinks)findAncestorWithClass(this, ExternalDatasetsDescriptionLinks.class);
			return theExternalDatasetsDescriptionLinks.getExternalDatasetId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
			}
		}
	}

	public void setExternalDatasetId(int externalDatasetId) throws JspException {
		try {
			ExternalDatasetsDescriptionLinks theExternalDatasetsDescriptionLinks = (ExternalDatasetsDescriptionLinks)findAncestorWithClass(this, ExternalDatasetsDescriptionLinks.class);
			theExternalDatasetsDescriptionLinks.setExternalDatasetId(externalDatasetId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsDescriptionLinks for externalDatasetId tag ");
			}
		}
	}

}
