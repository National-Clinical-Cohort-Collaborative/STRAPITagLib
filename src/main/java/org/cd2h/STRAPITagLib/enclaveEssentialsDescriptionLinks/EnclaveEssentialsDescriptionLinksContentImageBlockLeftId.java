package org.cd2h.STRAPITagLib.enclaveEssentialsDescriptionLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class EnclaveEssentialsDescriptionLinksContentImageBlockLeftId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(EnclaveEssentialsDescriptionLinksContentImageBlockLeftId.class);

	public int doStartTag() throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			if (!theEnclaveEssentialsDescriptionLinks.commitNeeded) {
				pageContext.getOut().print(theEnclaveEssentialsDescriptionLinks.getContentImageBlockLeftId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockLeftId() throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			return theEnclaveEssentialsDescriptionLinks.getContentImageBlockLeftId();
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
			}
		}
	}

	public void setContentImageBlockLeftId(int contentImageBlockLeftId) throws JspException {
		try {
			EnclaveEssentialsDescriptionLinks theEnclaveEssentialsDescriptionLinks = (EnclaveEssentialsDescriptionLinks)findAncestorWithClass(this, EnclaveEssentialsDescriptionLinks.class);
			theEnclaveEssentialsDescriptionLinks.setContentImageBlockLeftId(contentImageBlockLeftId);
		} catch (Exception e) {
			log.error("Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing EnclaveEssentialsDescriptionLinks for contentImageBlockLeftId tag ");
			}
		}
	}

}
