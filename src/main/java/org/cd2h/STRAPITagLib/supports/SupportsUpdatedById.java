package org.cd2h.STRAPITagLib.supports;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class SupportsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(SupportsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			if (!theSupports.commitNeeded) {
				pageContext.getOut().print(theSupports.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			return theSupports.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			theSupports.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for updatedById tag ");
			}
		}
	}

}
