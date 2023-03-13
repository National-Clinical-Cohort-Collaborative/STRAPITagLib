package org.cd2h.STRAPITagLib.policiesUserResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesUserResourcesLinksPolicyId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesUserResourcesLinksPolicyId.class);

	public int doStartTag() throws JspException {
		try {
			PoliciesUserResourcesLinks thePoliciesUserResourcesLinks = (PoliciesUserResourcesLinks)findAncestorWithClass(this, PoliciesUserResourcesLinks.class);
			if (!thePoliciesUserResourcesLinks.commitNeeded) {
				pageContext.getOut().print(thePoliciesUserResourcesLinks.getPolicyId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesUserResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPolicyId() throws JspException {
		try {
			PoliciesUserResourcesLinks thePoliciesUserResourcesLinks = (PoliciesUserResourcesLinks)findAncestorWithClass(this, PoliciesUserResourcesLinks.class);
			return thePoliciesUserResourcesLinks.getPolicyId();
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesUserResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
			}
		}
	}

	public void setPolicyId(int policyId) throws JspException {
		try {
			PoliciesUserResourcesLinks thePoliciesUserResourcesLinks = (PoliciesUserResourcesLinks)findAncestorWithClass(this, PoliciesUserResourcesLinks.class);
			thePoliciesUserResourcesLinks.setPolicyId(policyId);
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesUserResourcesLinks for policyId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesUserResourcesLinks for policyId tag ");
			}
		}
	}

}
