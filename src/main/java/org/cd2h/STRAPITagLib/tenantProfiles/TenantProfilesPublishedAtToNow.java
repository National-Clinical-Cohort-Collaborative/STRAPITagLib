package org.cd2h.STRAPITagLib.tenantProfiles;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantProfilesPublishedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantProfilesPublishedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			theTenantProfiles.setPublishedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing TenantProfiles for publishedAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing TenantProfiles for publishedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for publishedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getPublishedAt() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			return theTenantProfiles.getPublishedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing TenantProfiles for publishedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing TenantProfiles for publishedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for publishedAt tag ");
			}

		}
	}

	public void setPublishedAt() throws JspException {
		try {
			TenantProfiles theTenantProfiles = (TenantProfiles)findAncestorWithClass(this, TenantProfiles.class);
			theTenantProfiles.setPublishedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing TenantProfiles for publishedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing TenantProfiles for publishedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantProfiles for publishedAt tag ");
			}

		}
	}
}