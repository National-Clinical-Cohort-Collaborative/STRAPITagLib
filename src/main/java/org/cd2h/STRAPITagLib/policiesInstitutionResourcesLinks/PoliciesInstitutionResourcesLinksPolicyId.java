package org.cd2h.STRAPITagLib.policiesInstitutionResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesInstitutionResourcesLinksPolicyId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesInstitutionResourcesLinksPolicyId.class);

	public int doStartTag() throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			if (!thePoliciesInstitutionResourcesLinks.commitNeeded) {
				pageContext.getOut().print(thePoliciesInstitutionResourcesLinks.getPolicyId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPolicyId() throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			return thePoliciesInstitutionResourcesLinks.getPolicyId();
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
			}
		}
	}

	public void setPolicyId(int policyId) throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			thePoliciesInstitutionResourcesLinks.setPolicyId(policyId);
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for policyId tag ");
			}
		}
	}

}
