package org.cd2h.STRAPITagLib.policies;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesResourceHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesResourceHeader.class);

	public int doStartTag() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			if (!thePolicies.commitNeeded) {
				pageContext.getOut().print(thePolicies.getResourceHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for resourceHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for resourceHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for resourceHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getResourceHeader() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			return thePolicies.getResourceHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for resourceHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for resourceHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for resourceHeader tag ");
			}
		}
	}

	public void setResourceHeader(String resourceHeader) throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			thePolicies.setResourceHeader(resourceHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for resourceHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for resourceHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for resourceHeader tag ");
			}
		}
	}

}
