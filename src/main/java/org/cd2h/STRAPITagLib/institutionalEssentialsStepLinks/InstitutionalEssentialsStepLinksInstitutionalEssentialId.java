package org.cd2h.STRAPITagLib.institutionalEssentialsStepLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsStepLinksInstitutionalEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsStepLinksInstitutionalEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentialsStepLinks theInstitutionalEssentialsStepLinks = (InstitutionalEssentialsStepLinks)findAncestorWithClass(this, InstitutionalEssentialsStepLinks.class);
			if (!theInstitutionalEssentialsStepLinks.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentialsStepLinks.getInstitutionalEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getInstitutionalEssentialId() throws JspException {
		try {
			InstitutionalEssentialsStepLinks theInstitutionalEssentialsStepLinks = (InstitutionalEssentialsStepLinks)findAncestorWithClass(this, InstitutionalEssentialsStepLinks.class);
			return theInstitutionalEssentialsStepLinks.getInstitutionalEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
			}
		}
	}

	public void setInstitutionalEssentialId(int institutionalEssentialId) throws JspException {
		try {
			InstitutionalEssentialsStepLinks theInstitutionalEssentialsStepLinks = (InstitutionalEssentialsStepLinks)findAncestorWithClass(this, InstitutionalEssentialsStepLinks.class);
			theInstitutionalEssentialsStepLinks.setInstitutionalEssentialId(institutionalEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsStepLinks for institutionalEssentialId tag ");
			}
		}
	}

}
