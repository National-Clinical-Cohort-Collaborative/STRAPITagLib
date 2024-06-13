package org.cd2h.STRAPITagLib.tenantProfiles;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantProfilesCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantProfilesCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			if (!theTenantProfiles.commitNeeded) {
				pageContext.getOut().print(theTenantProfiles.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			return theTenantProfiles.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			theTenantProfiles.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for createdById tag ");
			}
		}
	}

}
