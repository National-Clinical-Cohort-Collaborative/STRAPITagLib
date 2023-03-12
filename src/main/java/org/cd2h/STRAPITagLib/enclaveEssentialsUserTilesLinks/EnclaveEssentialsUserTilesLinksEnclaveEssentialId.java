package org.cd2h.STRAPITagLib.enclaveEssentialsUserTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class EnclaveEssentialsUserTilesLinksEnclaveEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(EnclaveEssentialsUserTilesLinksEnclaveEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			EnclaveEssentialsUserTilesLinks theEnclaveEssentialsUserTilesLinks = (EnclaveEssentialsUserTilesLinks)findAncestorWithClass(this, EnclaveEssentialsUserTilesLinks.class);
			if (!theEnclaveEssentialsUserTilesLinks.commitNeeded) {
				pageContext.getOut().print(theEnclaveEssentialsUserTilesLinks.getEnclaveEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getEnclaveEssentialId() throws JspException {
		try {
			EnclaveEssentialsUserTilesLinks theEnclaveEssentialsUserTilesLinks = (EnclaveEssentialsUserTilesLinks)findAncestorWithClass(this, EnclaveEssentialsUserTilesLinks.class);
			return theEnclaveEssentialsUserTilesLinks.getEnclaveEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
			}
		}
	}

	public void setEnclaveEssentialId(int enclaveEssentialId) throws JspException {
		try {
			EnclaveEssentialsUserTilesLinks theEnclaveEssentialsUserTilesLinks = (EnclaveEssentialsUserTilesLinks)findAncestorWithClass(this, EnclaveEssentialsUserTilesLinks.class);
			theEnclaveEssentialsUserTilesLinks.setEnclaveEssentialId(enclaveEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsUserTilesLinks for enclaveEssentialId tag ");
			}
		}
	}

}
