package org.cd2h.STRAPITagLib.tenantProfiles;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantProfilesUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantProfilesUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			if (!theTenantProfiles.commitNeeded) {
				pageContext.getOut().print(theTenantProfiles.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			return theTenantProfiles.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			theTenantProfiles.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for updatedById tag ");
			}
		}
	}

}
