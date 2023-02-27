package org.cd2h.STRAPITagLib.domainsDomainTeamsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainsDomainTeamsLinksDomainTeamId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainsDomainTeamsLinksDomainTeamId.class);

	public int doStartTag() throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			if (!theDomainsDomainTeamsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainsDomainTeamsLinks.getDomainTeamId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getDomainTeamId() throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			return theDomainsDomainTeamsLinks.getDomainTeamId();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
			}
		}
	}

	public void setDomainTeamId(int domainTeamId) throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			theDomainsDomainTeamsLinks.setDomainTeamId(domainTeamId);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainTeamId tag ");
			}
		}
	}

}
