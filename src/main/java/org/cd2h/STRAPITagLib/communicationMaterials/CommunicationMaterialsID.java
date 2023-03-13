package org.cd2h.STRAPITagLib.communicationMaterials;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CommunicationMaterialsID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CommunicationMaterialsID.class);

	public int doStartTag() throws JspException {
		try {
			CommunicationMaterials theCommunicationMaterials = (CommunicationMaterials)findAncestorWithClass(this, CommunicationMaterials.class);
			if (!theCommunicationMaterials.commitNeeded) {
				pageContext.getOut().print(theCommunicationMaterials.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterials for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterials for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterials for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			CommunicationMaterials theCommunicationMaterials = (CommunicationMaterials)findAncestorWithClass(this, CommunicationMaterials.class);
			return theCommunicationMaterials.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterials for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterials for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterials for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			CommunicationMaterials theCommunicationMaterials = (CommunicationMaterials)findAncestorWithClass(this, CommunicationMaterials.class);
			theCommunicationMaterials.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing CommunicationMaterials for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CommunicationMaterials for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CommunicationMaterials for ID tag ");
			}
		}
	}

}
