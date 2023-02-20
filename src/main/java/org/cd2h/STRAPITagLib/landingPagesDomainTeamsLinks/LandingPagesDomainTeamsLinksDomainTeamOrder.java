package org.cd2h.STRAPITagLib.landingPagesDomainTeamsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LandingPagesDomainTeamsLinksDomainTeamOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LandingPagesDomainTeamsLinksDomainTeamOrder.class);

	public int doStartTag() throws JspException {
		try {
			LandingPagesDomainTeamsLinks theLandingPagesDomainTeamsLinks = (LandingPagesDomainTeamsLinks)findAncestorWithClass(this, LandingPagesDomainTeamsLinks.class);
			if (!theLandingPagesDomainTeamsLinks.commitNeeded) {
				pageContext.getOut().print(theLandingPagesDomainTeamsLinks.getDomainTeamOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getDomainTeamOrder() throws JspException {
		try {
			LandingPagesDomainTeamsLinks theLandingPagesDomainTeamsLinks = (LandingPagesDomainTeamsLinks)findAncestorWithClass(this, LandingPagesDomainTeamsLinks.class);
			return theLandingPagesDomainTeamsLinks.getDomainTeamOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
			}
		}
	}

	public void setDomainTeamOrder(double domainTeamOrder) throws JspException {
		try {
			LandingPagesDomainTeamsLinks theLandingPagesDomainTeamsLinks = (LandingPagesDomainTeamsLinks)findAncestorWithClass(this, LandingPagesDomainTeamsLinks.class);
			theLandingPagesDomainTeamsLinks.setDomainTeamOrder(domainTeamOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPagesDomainTeamsLinks for domainTeamOrder tag ");
			}
		}
	}

}
