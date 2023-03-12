package org.cd2h.STRAPITagLib.accountCreationsInstructionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AccountCreationsInstructionsLinksAccountCreationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AccountCreationsInstructionsLinksAccountCreationId.class);

	public int doStartTag() throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			if (!theAccountCreationsInstructionsLinks.commitNeeded) {
				pageContext.getOut().print(theAccountCreationsInstructionsLinks.getAccountCreationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getAccountCreationId() throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			return theAccountCreationsInstructionsLinks.getAccountCreationId();
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
			}
		}
	}

	public void setAccountCreationId(int accountCreationId) throws JspException {
		try {
			AccountCreationsInstructionsLinks theAccountCreationsInstructionsLinks = (AccountCreationsInstructionsLinks)findAncestorWithClass(this, AccountCreationsInstructionsLinks.class);
			theAccountCreationsInstructionsLinks.setAccountCreationId(accountCreationId);
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsInstructionsLinks for accountCreationId tag ");
			}
		}
	}

}
