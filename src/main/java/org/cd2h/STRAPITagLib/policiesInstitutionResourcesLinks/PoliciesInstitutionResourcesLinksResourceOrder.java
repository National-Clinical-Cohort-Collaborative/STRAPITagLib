package org.cd2h.STRAPITagLib.policiesInstitutionResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PoliciesInstitutionResourcesLinksResourceOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PoliciesInstitutionResourcesLinksResourceOrder.class);

	public int doStartTag() throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			if (!thePoliciesInstitutionResourcesLinks.commitNeeded) {
				pageContext.getOut().print(thePoliciesInstitutionResourcesLinks.getResourceOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getResourceOrder() throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			return thePoliciesInstitutionResourcesLinks.getResourceOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
			}
		}
	}

	public void setResourceOrder(double resourceOrder) throws JspException {
		try {
			PoliciesInstitutionResourcesLinks thePoliciesInstitutionResourcesLinks = (PoliciesInstitutionResourcesLinks)findAncestorWithClass(this, PoliciesInstitutionResourcesLinks.class);
			thePoliciesInstitutionResourcesLinks.setResourceOrder(resourceOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PoliciesInstitutionResourcesLinks for resourceOrder tag ");
			}
		}
	}

}
