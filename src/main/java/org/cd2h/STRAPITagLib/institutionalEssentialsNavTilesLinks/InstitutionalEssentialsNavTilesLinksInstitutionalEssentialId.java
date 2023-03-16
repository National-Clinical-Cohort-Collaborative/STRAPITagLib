package org.cd2h.STRAPITagLib.institutionalEssentialsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsNavTilesLinksInstitutionalEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsNavTilesLinksInstitutionalEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			if (!theInstitutionalEssentialsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentialsNavTilesLinks.getInstitutionalEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getInstitutionalEssentialId() throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			return theInstitutionalEssentialsNavTilesLinks.getInstitutionalEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
			}
		}
	}

	public void setInstitutionalEssentialId(int institutionalEssentialId) throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			theInstitutionalEssentialsNavTilesLinks.setInstitutionalEssentialId(institutionalEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for institutionalEssentialId tag ");
			}
		}
	}

}
