package org.cd2h.STRAPITagLib.phastrs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsUpdatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsUpdatedAt.class);

	public int doStartTag() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			if (!thePhastrs.commitNeeded) {
				pageContext.getOut().print(thePhastrs.getUpdatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			return thePhastrs.getUpdatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedAt tag ");
			}
		}
	}

	public void setUpdatedAt(Timestamp updatedAt) throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			thePhastrs.setUpdatedAt(updatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for updatedAt tag ");
			}
		}
	}

}
