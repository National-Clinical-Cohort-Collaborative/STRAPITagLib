package org.cd2h.STRAPITagLib.bios;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosOrcid extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosOrcid.class);

	public int doStartTag() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			if (!theBios.commitNeeded) {
				pageContext.getOut().print(theBios.getOrcid());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for orcid tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for orcid tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for orcid tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getOrcid() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			return theBios.getOrcid();
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for orcid tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for orcid tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for orcid tag ");
			}
		}
	}

	public void setOrcid(String orcid) throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			theBios.setOrcid(orcid);
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for orcid tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for orcid tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for orcid tag ");
			}
		}
	}

}
