package org.cd2h.STRAPITagLib.enclaveEssentialsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class EnclaveEssentialsNavTilesLinksEnclaveEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(EnclaveEssentialsNavTilesLinksEnclaveEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			EnclaveEssentialsNavTilesLinks theEnclaveEssentialsNavTilesLinks = (EnclaveEssentialsNavTilesLinks)findAncestorWithClass(this, EnclaveEssentialsNavTilesLinks.class);
			if (!theEnclaveEssentialsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theEnclaveEssentialsNavTilesLinks.getEnclaveEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getEnclaveEssentialId() throws JspException {
		try {
			EnclaveEssentialsNavTilesLinks theEnclaveEssentialsNavTilesLinks = (EnclaveEssentialsNavTilesLinks)findAncestorWithClass(this, EnclaveEssentialsNavTilesLinks.class);
			return theEnclaveEssentialsNavTilesLinks.getEnclaveEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
			}
		}
	}

	public void setEnclaveEssentialId(int enclaveEssentialId) throws JspException {
		try {
			EnclaveEssentialsNavTilesLinks theEnclaveEssentialsNavTilesLinks = (EnclaveEssentialsNavTilesLinks)findAncestorWithClass(this, EnclaveEssentialsNavTilesLinks.class);
			theEnclaveEssentialsNavTilesLinks.setEnclaveEssentialId(enclaveEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsNavTilesLinks for enclaveEssentialId tag ");
			}
		}
	}

}
