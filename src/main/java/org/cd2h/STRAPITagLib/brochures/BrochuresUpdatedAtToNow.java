package org.cd2h.STRAPITagLib.brochures;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BrochuresUpdatedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BrochuresUpdatedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			Brochures theBrochures = (Brochures)findAncestorWithClass(this, Brochures.class);
			theBrochures.setUpdatedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing Brochures for updatedAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Brochures for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Brochures for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Brochures theBrochures = (Brochures)findAncestorWithClass(this, Brochures.class);
			return theBrochures.getUpdatedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing Brochures for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Brochures for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Brochures for updatedAt tag ");
			}

		}
	}

	public void setUpdatedAt() throws JspException {
		try {
			Brochures theBrochures = (Brochures)findAncestorWithClass(this, Brochures.class);
			theBrochures.setUpdatedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing Brochures for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Brochures for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Brochures for updatedAt tag ");
			}

		}
	}
}