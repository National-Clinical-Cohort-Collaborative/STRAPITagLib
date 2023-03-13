package org.cd2h.STRAPITagLib.policies;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesUserHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesUserHeader.class);

	public int doStartTag() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			if (!thePolicies.commitNeeded) {
				pageContext.getOut().print(thePolicies.getUserHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for userHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for userHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for userHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUserHeader() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			return thePolicies.getUserHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for userHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for userHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for userHeader tag ");
			}
		}
	}

	public void setUserHeader(String userHeader) throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			thePolicies.setUserHeader(userHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for userHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for userHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for userHeader tag ");
			}
		}
	}

}
