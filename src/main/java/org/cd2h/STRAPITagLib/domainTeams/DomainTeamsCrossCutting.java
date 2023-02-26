package org.cd2h.STRAPITagLib.domainTeams;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainTeamsCrossCutting extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainTeamsCrossCutting.class);

	public int doStartTag() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			if (!theDomainTeams.commitNeeded) {
				pageContext.getOut().print(theDomainTeams.getCrossCutting());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for crossCutting tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for crossCutting tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for crossCutting tag ");
			}

		}
		return SKIP_BODY;
	}

	public boolean getCrossCutting() throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			return theDomainTeams.getCrossCutting();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for crossCutting tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for crossCutting tag ");
				parent.doEndTag();
				return false;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for crossCutting tag ");
			}
		}
	}

	public void setCrossCutting(boolean crossCutting) throws JspException {
		try {
			DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
			theDomainTeams.setCrossCutting(crossCutting);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainTeams for crossCutting tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainTeams for crossCutting tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainTeams for crossCutting tag ");
			}
		}
	}

}
