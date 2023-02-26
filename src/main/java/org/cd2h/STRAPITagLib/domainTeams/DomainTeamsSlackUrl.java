package org.cd2h.STRAPITagLib.domainTeams;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsSlackUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsSlackUrl.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			if (!theDomainTeams.commitNeeded) {
				pageContext.getOut().print(theDomainTeams.getSlackUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for slackUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for slackUrl tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for slackUrl tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSlackUrl() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			return theDomainTeams.getSlackUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for slackUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for slackUrl tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for slackUrl tag ");
			}
		}
	}

	public void setSlackUrl(String slackUrl) throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			theDomainTeams.setSlackUrl(slackUrl);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for slackUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for slackUrl tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for slackUrl tag ");
			}
		}
	}

}
