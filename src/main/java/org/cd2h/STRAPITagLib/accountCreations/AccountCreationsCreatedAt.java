package org.cd2h.STRAPITagLib.accountCreations;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AccountCreationsCreatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AccountCreationsCreatedAt.class);

	public int doStartTag() throws JspException {
		try {
			AccountCreations theAccountCreations = (AccountCreations)findAncestorWithClass(this, AccountCreations.class);
			if (!theAccountCreations.commitNeeded) {
				pageContext.getOut().print(theAccountCreations.getCreatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreations for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreations for createdAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreations for createdAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getCreatedAt() throws JspException {
		try {
			AccountCreations theAccountCreations = (AccountCreations)findAncestorWithClass(this, AccountCreations.class);
			return theAccountCreations.getCreatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreations for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreations for createdAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreations for createdAt tag ");
			}
		}
	}

	public void setCreatedAt(Timestamp createdAt) throws JspException {
		try {
			AccountCreations theAccountCreations = (AccountCreations)findAncestorWithClass(this, AccountCreations.class);
			theAccountCreations.setCreatedAt(createdAt);
		} catch (Exception e) {
			log.error("Can't find enclosing AccountCreations for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AccountCreations for createdAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AccountCreations for createdAt tag ");
			}
		}
	}

}
