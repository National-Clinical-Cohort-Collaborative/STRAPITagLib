package org.cd2h.STRAPITagLib.domainTeamsLeadsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsLeadsLinksBioOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsLeadsLinksBioOrder.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			if (!theDomainTeamsLeadsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainTeamsLeadsLinks.getBioOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioOrder() throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			return theDomainTeamsLeadsLinks.getBioOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
			}
		}
	}

	public void setBioOrder(double bioOrder) throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			theDomainTeamsLeadsLinks.setBioOrder(bioOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for bioOrder tag ");
			}
		}
	}

}
