package org.cd2h.STRAPITagLib.tenantAccountCreationsIntroLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantAccountCreationsIntroLinksTenantAccountCreationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantAccountCreationsIntroLinksTenantAccountCreationId.class);

	public int doStartTag() throws JspException {
		try {
			TenantAccountCreationsIntroLinks theTenantAccountCreationsIntroLinks = (TenantAccountCreationsIntroLinks)findAncestorWithClass(this, TenantAccountCreationsIntroLinks.class);
			if (!theTenantAccountCreationsIntroLinks.commitNeeded) {
				pageContext.getOut().print(theTenantAccountCreationsIntroLinks.getTenantAccountCreationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getTenantAccountCreationId() throws JspException {
		try {
			TenantAccountCreationsIntroLinks theTenantAccountCreationsIntroLinks = (TenantAccountCreationsIntroLinks)findAncestorWithClass(this, TenantAccountCreationsIntroLinks.class);
			return theTenantAccountCreationsIntroLinks.getTenantAccountCreationId();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
			}
		}
	}

	public void setTenantAccountCreationId(int tenantAccountCreationId) throws JspException {
		try {
			TenantAccountCreationsIntroLinks theTenantAccountCreationsIntroLinks = (TenantAccountCreationsIntroLinks)findAncestorWithClass(this, TenantAccountCreationsIntroLinks.class);
			theTenantAccountCreationsIntroLinks.setTenantAccountCreationId(tenantAccountCreationId);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsIntroLinks for tenantAccountCreationId tag ");
			}
		}
	}

}
