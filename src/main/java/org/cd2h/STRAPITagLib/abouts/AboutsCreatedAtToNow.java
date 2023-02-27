package org.cd2h.STRAPITagLib.abouts;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AboutsCreatedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AboutsCreatedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			theAbouts.setCreatedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing Abouts for createdAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Abouts for createdAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for createdAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getCreatedAt() throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			return theAbouts.getCreatedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing Abouts for createdAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Abouts for createdAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for createdAt tag ");
			}

		}
	}

	public void setCreatedAt() throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			theAbouts.setCreatedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing Abouts for createdAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Abouts for createdAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for createdAt tag ");
			}

		}
	}
}