package org.cd2h.STRAPITagLib.domainsCrossCuttingTeamsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainsCrossCuttingTeamsLinksDomainId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainsCrossCuttingTeamsLinksDomainId.class);

	public int doStartTag() throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			if (!theDomainsCrossCuttingTeamsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainsCrossCuttingTeamsLinks.getDomainId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getDomainId() throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			return theDomainsCrossCuttingTeamsLinks.getDomainId();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
			}
		}
	}

	public void setDomainId(int domainId) throws JspException {
		try {
			DomainsCrossCuttingTeamsLinks theDomainsCrossCuttingTeamsLinks = (DomainsCrossCuttingTeamsLinks)findAncestorWithClass(this, DomainsCrossCuttingTeamsLinks.class);
			theDomainsCrossCuttingTeamsLinks.setDomainId(domainId);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsCrossCuttingTeamsLinks for domainId tag ");
			}
		}
	}

}
