package org.cd2h.STRAPITagLib.tenantAccountCreationsInstructionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantAccountCreationsInstructionsLinksTenantAccountCreationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantAccountCreationsInstructionsLinksTenantAccountCreationId.class);

	public int doStartTag() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			if (!theTenantAccountCreationsInstructionsLinks.commitNeeded) {
				pageContext.getOut().print(theTenantAccountCreationsInstructionsLinks.getTenantAccountCreationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getTenantAccountCreationId() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			return theTenantAccountCreationsInstructionsLinks.getTenantAccountCreationId();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
			}
		}
	}

	public void setTenantAccountCreationId(int tenantAccountCreationId) throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			theTenantAccountCreationsInstructionsLinks.setTenantAccountCreationId(tenantAccountCreationId);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for tenantAccountCreationId tag ");
			}
		}
	}

}
