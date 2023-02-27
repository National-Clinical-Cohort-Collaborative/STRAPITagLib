package org.cd2h.STRAPITagLib.partnerGroups;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnerGroupsName extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnerGroupsName.class);

	public int doStartTag() throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			if (!thePartnerGroups.commitNeeded) {
				pageContext.getOut().print(thePartnerGroups.getName());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for name tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for name tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getName() throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			return thePartnerGroups.getName();
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for name tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for name tag ");
			}
		}
	}

	public void setName(String name) throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			thePartnerGroups.setName(name);
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for name tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for name tag ");
			}
		}
	}

}
