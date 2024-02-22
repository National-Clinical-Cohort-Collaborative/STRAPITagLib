package org.cd2h.STRAPITagLib.tenantAccountCreationsInstructionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantAccountCreationsInstructionsLinksContentImageBlockRightOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantAccountCreationsInstructionsLinksContentImageBlockRightOrder.class);

	public int doStartTag() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			if (!theTenantAccountCreationsInstructionsLinks.commitNeeded) {
				pageContext.getOut().print(theTenantAccountCreationsInstructionsLinks.getContentImageBlockRightOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockRightOrder() throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			return theTenantAccountCreationsInstructionsLinks.getContentImageBlockRightOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

	public void setContentImageBlockRightOrder(double contentImageBlockRightOrder) throws JspException {
		try {
			TenantAccountCreationsInstructionsLinks theTenantAccountCreationsInstructionsLinks = (TenantAccountCreationsInstructionsLinks)findAncestorWithClass(this, TenantAccountCreationsInstructionsLinks.class);
			theTenantAccountCreationsInstructionsLinks.setContentImageBlockRightOrder(contentImageBlockRightOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantAccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

}
