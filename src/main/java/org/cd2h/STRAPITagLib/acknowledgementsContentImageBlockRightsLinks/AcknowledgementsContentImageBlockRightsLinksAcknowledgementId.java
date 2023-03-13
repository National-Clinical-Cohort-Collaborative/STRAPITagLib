package org.cd2h.STRAPITagLib.acknowledgementsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AcknowledgementsContentImageBlockRightsLinksAcknowledgementId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AcknowledgementsContentImageBlockRightsLinksAcknowledgementId.class);

	public int doStartTag() throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			if (!theAcknowledgementsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theAcknowledgementsContentImageBlockRightsLinks.getAcknowledgementId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getAcknowledgementId() throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			return theAcknowledgementsContentImageBlockRightsLinks.getAcknowledgementId();
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
			}
		}
	}

	public void setAcknowledgementId(int acknowledgementId) throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			theAcknowledgementsContentImageBlockRightsLinks.setAcknowledgementId(acknowledgementId);
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for acknowledgementId tag ");
			}
		}
	}

}
