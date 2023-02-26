package org.cd2h.STRAPITagLib.domainTeams;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsJoinUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsJoinUrl.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			if (!theDomainTeams.commitNeeded) {
				pageContext.getOut().print(theDomainTeams.getJoinUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for joinUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for joinUrl tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for joinUrl tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getJoinUrl() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			return theDomainTeams.getJoinUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for joinUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for joinUrl tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for joinUrl tag ");
			}
		}
	}

	public void setJoinUrl(String joinUrl) throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			theDomainTeams.setJoinUrl(joinUrl);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for joinUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for joinUrl tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for joinUrl tag ");
			}
		}
	}

}
