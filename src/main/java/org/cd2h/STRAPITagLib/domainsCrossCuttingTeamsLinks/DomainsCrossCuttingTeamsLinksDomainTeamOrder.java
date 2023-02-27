package org.cd2h.STRAPITagLib.domainsCrossCuttingTeamsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainsCrossCuttingTeamsLinksDomainTeamOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainsCrossCuttingTeamsLinksDomainTeamOrder.class);

	public int doStartTag() throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			if (!theDomainsCrossCuttingTeamsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainsCrossCuttingTeamsLinks.getDomainTeamOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getDomainTeamOrder() throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			return theDomainsCrossCuttingTeamsLinks.getDomainTeamOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
			}
		}
	}

	public void setDomainTeamOrder(double domainTeamOrder) throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			theDomainsCrossCuttingTeamsLinks.setDomainTeamOrder(domainTeamOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainTeamOrder tag ");
			}
		}
	}

}
