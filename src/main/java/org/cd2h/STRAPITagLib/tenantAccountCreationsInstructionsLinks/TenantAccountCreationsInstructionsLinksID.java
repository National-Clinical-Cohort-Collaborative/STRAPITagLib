package org.cd2h.STRAPITagLib.tenantAccountCreationsInstructionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantAccountCreationsInstructionsLinksID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantAccountCreationsInstructionsLinksID.class);

	public int doStartTag() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			if (!theTenantAccountCreationsInstructionsLinks.commitNeeded) {
				pageContext.getOut().print(theTenantAccountCreationsInstructionsLinks.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			return theTenantAccountCreationsInstructionsLinks.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			theTenantAccountCreationsInstructionsLinks.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for ID tag ");
			}
		}
	}

}
