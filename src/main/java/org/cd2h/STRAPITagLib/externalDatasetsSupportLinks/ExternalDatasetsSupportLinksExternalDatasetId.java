package org.cd2h.STRAPITagLib.externalDatasetsSupportLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsSupportLinksExternalDatasetId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsSupportLinksExternalDatasetId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			if (!theExternalDatasetsSupportLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsSupportLinks.getExternalDatasetId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getExternalDatasetId() throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			return theExternalDatasetsSupportLinks.getExternalDatasetId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
			}
		}
	}

	public void setExternalDatasetId(int externalDatasetId) throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			theExternalDatasetsSupportLinks.setExternalDatasetId(externalDatasetId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for externalDatasetId tag ");
			}
		}
	}

}
