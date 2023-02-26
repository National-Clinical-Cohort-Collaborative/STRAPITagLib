package org.cd2h.STRAPITagLib.pressReleases;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PressReleasesCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PressReleasesCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			if (!thePressReleases.commitNeeded) {
				pageContext.getOut().print(thePressReleases.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			return thePressReleases.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			thePressReleases.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for createdById tag ");
			}
		}
	}

}
