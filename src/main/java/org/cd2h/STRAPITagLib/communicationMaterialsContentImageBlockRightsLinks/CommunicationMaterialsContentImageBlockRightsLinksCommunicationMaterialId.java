package org.cd2h.STRAPITagLib.communicationMaterialsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CommunicationMaterialsContentImageBlockRightsLinksCommunicationMaterialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CommunicationMaterialsContentImageBlockRightsLinksCommunicationMaterialId.class);

	public int doStartTag() throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			if (!theCommunicationMaterialsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theCommunicationMaterialsContentImageBlockRightsLinks.getCommunicationMaterialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCommunicationMaterialId() throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			return theCommunicationMaterialsContentImageBlockRightsLinks.getCommunicationMaterialId();
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
			}
		}
	}

	public void setCommunicationMaterialId(int communicationMaterialId) throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			theCommunicationMaterialsContentImageBlockRightsLinks.setCommunicationMaterialId(communicationMaterialId);
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for communicationMaterialId tag ");
			}
		}
	}

}
