package org.cd2h.STRAPITagLib.liaisons;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LiaisonsUpdatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LiaisonsUpdatedAt.class);

	public int doStartTag() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			if (!theLiaisons.commitNeeded) {
				pageContext.getOut().print(theLiaisons.getUpdatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			return theLiaisons.getUpdatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedAt tag ");
			}
		}
	}

	public void setUpdatedAt(Timestamp updatedAt) throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			theLiaisons.setUpdatedAt(updatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for updatedAt tag ");
			}
		}
	}

}
