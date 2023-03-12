package org.cd2h.STRAPITagLib.accountCreationsInstructionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AccountCreationsInstructionsLinksContentImageBlockRightOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AccountCreationsInstructionsLinksContentImageBlockRightOrder.class);

	public int doStartTag() throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			if (!theAccountCreationsInstructionsLinks.commitNeeded) {
				pageContext.getOut().print(theAccountCreationsInstructionsLinks.getContentImageBlockRightOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockRightOrder() throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			return theAccountCreationsInstructionsLinks.getContentImageBlockRightOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

	public void setContentImageBlockRightOrder(double contentImageBlockRightOrder) throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			theAccountCreationsInstructionsLinks.setContentImageBlockRightOrder(contentImageBlockRightOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

}
