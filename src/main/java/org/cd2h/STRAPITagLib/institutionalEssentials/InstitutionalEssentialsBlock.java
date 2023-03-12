package org.cd2h.STRAPITagLib.institutionalEssentials;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsBlock.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentials theInstitutionalEssentials = (InstitutionalEssentials)findAncestorWithClass(this, InstitutionalEssentials.class);
			if (!theInstitutionalEssentials.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentials.getBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentials for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentials for block tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentials for block tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock() throws JspException {
		try {
			InstitutionalEssentials theInstitutionalEssentials = (InstitutionalEssentials)findAncestorWithClass(this, InstitutionalEssentials.class);
			return theInstitutionalEssentials.getBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentials for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentials for block tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentials for block tag ");
			}
		}
	}

	public void setBlock(String block) throws JspException {
		try {
			InstitutionalEssentials theInstitutionalEssentials = (InstitutionalEssentials)findAncestorWithClass(this, InstitutionalEssentials.class);
			theInstitutionalEssentials.setBlock(block);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentials for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentials for block tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentials for block tag ");
			}
		}
	}

}
