package org.cd2h.STRAPITagLib.presentations;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PresentationsUpdatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PresentationsUpdatedAt.class);

	public int doStartTag() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			if (!thePresentations.commitNeeded) {
				pageContext.getOut().print(thePresentations.getUpdatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			return thePresentations.getUpdatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedAt tag ");
			}
		}
	}

	public void setUpdatedAt(Timestamp updatedAt) throws JspException {
		try {
			Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
			thePresentations.setUpdatedAt(updatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Presentations for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Presentations for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Presentations for updatedAt tag ");
			}
		}
	}

}
