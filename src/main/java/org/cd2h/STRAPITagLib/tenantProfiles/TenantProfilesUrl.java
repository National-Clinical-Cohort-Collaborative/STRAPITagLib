package org.cd2h.STRAPITagLib.tenantProfiles;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantProfilesUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantProfilesUrl.class);

	public int doStartTag() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			if (!theTenantProfiles.commitNeeded) {
				pageContext.getOut().print(theTenantProfiles.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			return theTenantProfiles.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			theTenantProfiles.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantProfiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantProfiles for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for url tag ");
			}
		}
	}

}
