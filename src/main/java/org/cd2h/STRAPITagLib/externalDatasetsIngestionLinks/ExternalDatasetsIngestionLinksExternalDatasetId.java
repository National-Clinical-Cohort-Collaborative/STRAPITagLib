package org.cd2h.STRAPITagLib.externalDatasetsIngestionLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsIngestionLinksExternalDatasetId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsIngestionLinksExternalDatasetId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			if (!theExternalDatasetsIngestionLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsIngestionLinks.getExternalDatasetId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getExternalDatasetId() throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			return theExternalDatasetsIngestionLinks.getExternalDatasetId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
			}
		}
	}

	public void setExternalDatasetId(int externalDatasetId) throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			theExternalDatasetsIngestionLinks.setExternalDatasetId(externalDatasetId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for externalDatasetId tag ");
			}
		}
	}

}
