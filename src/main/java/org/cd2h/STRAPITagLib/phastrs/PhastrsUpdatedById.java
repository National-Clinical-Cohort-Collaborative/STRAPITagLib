package org.cd2h.STRAPITagLib.phastrs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			if (!thePhastrs.commitNeeded) {
				pageContext.getOut().print(thePhastrs.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			return thePhastrs.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			thePhastrs.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedById tag ");
			}
		}
	}

}
