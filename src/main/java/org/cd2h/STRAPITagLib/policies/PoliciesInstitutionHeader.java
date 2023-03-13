package org.cd2h.STRAPITagLib.policies;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesInstitutionHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesInstitutionHeader.class);

	public int doStartTag() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			if (!thePolicies.commitNeeded) {
				pageContext.getOut().print(thePolicies.getInstitutionHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for institutionHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for institutionHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for institutionHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getInstitutionHeader() throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			return thePolicies.getInstitutionHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for institutionHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for institutionHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for institutionHeader tag ");
			}
		}
	}

	public void setInstitutionHeader(String institutionHeader) throws JspException {
		try {
			Policies thePolicies = (Policies)findAncestorWithClass(this, Policies.class);
			thePolicies.setInstitutionHeader(institutionHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing Policies for institutionHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Policies for institutionHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Policies for institutionHeader tag ");
			}
		}
	}

}
