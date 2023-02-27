package org.cd2h.STRAPITagLib.presentations;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PresentationsCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PresentationsCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			if (!thePresentations.commitNeeded) {
				pageContext.getOut().print(thePresentations.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			return thePresentations.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			thePresentations.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for createdById tag ");
			}
		}
	}

}
