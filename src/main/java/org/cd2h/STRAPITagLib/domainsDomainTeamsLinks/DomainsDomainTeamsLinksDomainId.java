package org.cd2h.STRAPITagLib.domainsDomainTeamsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DomainsDomainTeamsLinksDomainId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DomainsDomainTeamsLinksDomainId.class);

	public int doStartTag() throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			if (!theDomainsDomainTeamsLinks.commitNeeded) {
				pageContext.getOut().print(theDomainsDomainTeamsLinks.getDomainId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getDomainId() throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			return theDomainsDomainTeamsLinks.getDomainId();
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
			}
		}
	}

	public void setDomainId(int domainId) throws JspException {
		try {
			DomainsDomainTeamsLinks theDomainsDomainTeamsLinks = (DomainsDomainTeamsLinks)findAncestorWithClass(this, DomainsDomainTeamsLinks.class);
			theDomainsDomainTeamsLinks.setDomainId(domainId);
		} catch (Exception e) {
			log.error("Can't find enclosing DomainsDomainTeamsLinks for domainId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DomainsDomainTeamsLinks for domainId tag ");
			}
		}
	}

}
