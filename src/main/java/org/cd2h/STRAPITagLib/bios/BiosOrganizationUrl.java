package org.cd2h.STRAPITagLib.bios;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosOrganizationUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosOrganizationUrl.class);

	public int doStartTag() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			if (!theBios.commitNeeded) {
				pageContext.getOut().print(theBios.getOrganizationUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for organizationUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for organizationUrl tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for organizationUrl tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getOrganizationUrl() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			return theBios.getOrganizationUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for organizationUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for organizationUrl tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for organizationUrl tag ");
			}
		}
	}

	public void setOrganizationUrl(String organizationUrl) throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			theBios.setOrganizationUrl(organizationUrl);
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for organizationUrl tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for organizationUrl tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for organizationUrl tag ");
			}
		}
	}

}
