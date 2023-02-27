package org.cd2h.STRAPITagLib.partnerGroups;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnerGroupsCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnerGroupsCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			if (!thePartnerGroups.commitNeeded) {
				pageContext.getOut().print(thePartnerGroups.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			return thePartnerGroups.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			PartnerGroups thePartnerGroups = (PartnerGroups)findAncestorWithClass(this, PartnerGroups.class);
			thePartnerGroups.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing PartnerGroups for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PartnerGroups for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PartnerGroups for createdById tag ");
			}
		}
	}

}
