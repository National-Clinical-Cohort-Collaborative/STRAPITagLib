package org.cd2h.STRAPITagLib.institutionalEssentialsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsNavTileLinksInstitutionalEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsNavTileLinksInstitutionalEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			if (!theInstitutionalEssentialsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentialsNavTileLinks.getInstitutionalEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getInstitutionalEssentialId() throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			return theInstitutionalEssentialsNavTileLinks.getInstitutionalEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
			}
		}
	}

	public void setInstitutionalEssentialId(int institutionalEssentialId) throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			theInstitutionalEssentialsNavTileLinks.setInstitutionalEssentialId(institutionalEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for institutionalEssentialId tag ");
			}
		}
	}

}
