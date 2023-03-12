package org.cd2h.STRAPITagLib.enclaveEssentialsDescriptionLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class EnclaveEssentialsDescriptionLinksEnclaveEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(EnclaveEssentialsDescriptionLinksEnclaveEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			if (!theEnclaveEssentialsDescriptionLinks.commitNeeded) {
				pageContext.getOut().print(theEnclaveEssentialsDescriptionLinks.getEnclaveEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getEnclaveEssentialId() throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			return theEnclaveEssentialsDescriptionLinks.getEnclaveEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
			}
		}
	}

	public void setEnclaveEssentialId(int enclaveEssentialId) throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			theEnclaveEssentialsDescriptionLinks.setEnclaveEssentialId(enclaveEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for enclaveEssentialId tag ");
			}
		}
	}

}
