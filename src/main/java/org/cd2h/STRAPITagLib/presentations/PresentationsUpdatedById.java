package org.cd2h.STRAPITagLib.presentations;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PresentationsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PresentationsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			if (!thePresentations.commitNeeded) {
				pageContext.getOut().print(thePresentations.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			return thePresentations.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			thePresentations.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedById tag ");
			}
		}
	}

}
