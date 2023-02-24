package org.cd2h.STRAPITagLib.bios;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosFirstName extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosFirstName.class);

	public int doStartTag() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			if (!theBios.commitNeeded) {
				pageContext.getOut().print(theBios.getFirstName());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for firstName tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for firstName tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for firstName tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getFirstName() throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			return theBios.getFirstName();
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for firstName tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for firstName tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for firstName tag ");
			}
		}
	}

	public void setFirstName(String firstName) throws JspException {
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			theBios.setFirstName(firstName);
		} catch (Exception e) {
			log.error("Can't find enclosing Bios for firstName tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Bios for firstName tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Bios for firstName tag ");
			}
		}
	}

}
