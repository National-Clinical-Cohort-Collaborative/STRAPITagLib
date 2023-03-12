package org.cd2h.STRAPITagLib.accountCreationsIntroLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AccountCreationsIntroLinksAccountCreationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AccountCreationsIntroLinksAccountCreationId.class);

	public int doStartTag() throws JspException {
		try {
			AccountCreationsIntroLinks theAccountCreationsIntroLinks = (AccountCreationsIntroLinks)findAncestorWithClass(this, AccountCreationsIntroLinks.class);
			if (!theAccountCreationsIntroLinks.commitNeeded) {
				pageContext.getOut().print(theAccountCreationsIntroLinks.getAccountCreationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getAccountCreationId() throws JspException {
		try {
			AccountCreationsIntroLinks theAccountCreationsIntroLinks = (AccountCreationsIntroLinks)findAncestorWithClass(this, AccountCreationsIntroLinks.class);
			return theAccountCreationsIntroLinks.getAccountCreationId();
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
			}
		}
	}

	public void setAccountCreationId(int accountCreationId) throws JspException {
		try {
			AccountCreationsIntroLinks theAccountCreationsIntroLinks = (AccountCreationsIntroLinks)findAncestorWithClass(this, AccountCreationsIntroLinks.class);
			theAccountCreationsIntroLinks.setAccountCreationId(accountCreationId);
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreationsIntroLinks for accountCreationId tag ");
			}
		}
	}

}
