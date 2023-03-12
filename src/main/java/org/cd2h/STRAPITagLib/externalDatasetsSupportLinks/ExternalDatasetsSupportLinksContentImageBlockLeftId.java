package org.cd2h.STRAPITagLib.externalDatasetsSupportLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsSupportLinksContentImageBlockLeftId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsSupportLinksContentImageBlockLeftId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			if (!theExternalDatasetsSupportLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsSupportLinks.getContentImageBlockLeftId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockLeftId() throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			return theExternalDatasetsSupportLinks.getContentImageBlockLeftId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
			}
		}
	}

	public void setContentImageBlockLeftId(int contentImageBlockLeftId) throws JspException {
		try {
			ExternalDatasetsSupportLinks theExternalDatasetsSupportLinks = (ExternalDatasetsSupportLinks)findAncestorWithClass(this, ExternalDatasetsSupportLinks.class);
			theExternalDatasetsSupportLinks.setContentImageBlockLeftId(contentImageBlockLeftId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsSupportLinks for contentImageBlockLeftId tag ");
			}
		}
	}

}
