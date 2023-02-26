package org.cd2h.STRAPITagLib.domainTeamsLeadsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsLeadsLinksDomainTeamId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsLeadsLinksDomainTeamId.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			if (!theDomainTeamsLeadsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainTeamsLeadsLinks.getDomainTeamId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getDomainTeamId() throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			return theDomainTeamsLeadsLinks.getDomainTeamId();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
			}
		}
	}

	public void setDomainTeamId(int domainTeamId) throws JspException {
		try {
			DomainTeamsLeadsLinks theDomainTeamsLeadsLinks = (DomainTeamsLeadsLinks)findAncestorWithClass(this, DomainTeamsLeadsLinks.class);
			theDomainTeamsLeadsLinks.setDomainTeamId(domainTeamId);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeamsLeadsLinks for domainTeamId tag ");
			}
		}
	}

}
