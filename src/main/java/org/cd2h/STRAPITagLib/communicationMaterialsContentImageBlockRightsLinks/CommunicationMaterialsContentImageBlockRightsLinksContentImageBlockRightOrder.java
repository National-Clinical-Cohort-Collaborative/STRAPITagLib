package org.cd2h.STRAPITagLib.communicationMaterialsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CommunicationMaterialsContentImageBlockRightsLinksContentImageBlockRightOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CommunicationMaterialsContentImageBlockRightsLinksContentImageBlockRightOrder.class);

	public int doStartTag() throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			if (!theCommunicationMaterialsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theCommunicationMaterialsContentImageBlockRightsLinks.getContentImageBlockRightOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockRightOrder() throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			return theCommunicationMaterialsContentImageBlockRightsLinks.getContentImageBlockRightOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

	public void setContentImageBlockRightOrder(double contentImageBlockRightOrder) throws JspException {
		try {
			CommunicationMaterialsContentImageBlockRightsLinks theCommunicationMaterialsContentImageBlockRightsLinks = (CommunicationMaterialsContentImageBlockRightsLinks)findAncestorWithClass(this, CommunicationMaterialsContentImageBlockRightsLinks.class);
			theCommunicationMaterialsContentImageBlockRightsLinks.setContentImageBlockRightOrder(contentImageBlockRightOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterialsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

}
