package org.cd2h.STRAPITagLib.footers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FootersCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FootersCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			if (!theFooters.commitNeeded) {
				pageContext.getOut().print(theFooters.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			return theFooters.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			theFooters.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for createdById tag ");
			}
		}
	}

}
