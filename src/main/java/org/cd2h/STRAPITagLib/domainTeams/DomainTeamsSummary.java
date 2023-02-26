package org.cd2h.STRAPITagLib.domainTeams;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsSummary extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsSummary.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			if (!theDomainTeams.commitNeeded) {
				pageContext.getOut().print(theDomainTeams.getSummary());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for summary tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for summary tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for summary tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSummary() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			return theDomainTeams.getSummary();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for summary tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for summary tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for summary tag ");
			}
		}
	}

	public void setSummary(String summary) throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			theDomainTeams.setSummary(summary);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for summary tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for summary tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for summary tag ");
			}
		}
	}

}
