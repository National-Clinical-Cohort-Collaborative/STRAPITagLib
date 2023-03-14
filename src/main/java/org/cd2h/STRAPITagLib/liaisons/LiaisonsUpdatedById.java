package org.cd2h.STRAPITagLib.liaisons;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LiaisonsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LiaisonsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			if (!theLiaisons.commitNeeded) {
				pageContext.getOut().print(theLiaisons.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			return theLiaisons.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			theLiaisons.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedById tag ");
			}
		}
	}

}
