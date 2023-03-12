package org.cd2h.STRAPITagLib.externalDatasetsIngestionLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ExternalDatasetsIngestionLinksContentImageBlockRightId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ExternalDatasetsIngestionLinksContentImageBlockRightId.class);

	public int doStartTag() throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			if (!theExternalDatasetsIngestionLinks.commitNeeded) {
				pageContext.getOut().print(theExternalDatasetsIngestionLinks.getContentImageBlockRightId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockRightId() throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			return theExternalDatasetsIngestionLinks.getContentImageBlockRightId();
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
			}
		}
	}

	public void setContentImageBlockRightId(int contentImageBlockRightId) throws JspException {
		try {
			ExternalDatasetsIngestionLinks theExternalDatasetsIngestionLinks = (ExternalDatasetsIngestionLinks)findAncestorWithClass(this, ExternalDatasetsIngestionLinks.class);
			theExternalDatasetsIngestionLinks.setContentImageBlockRightId(contentImageBlockRightId);
		} catch (Exception e) {
			log.error("Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ExternalDatasetsIngestionLinks for contentImageBlockRightId tag ");
			}
		}
	}

}
