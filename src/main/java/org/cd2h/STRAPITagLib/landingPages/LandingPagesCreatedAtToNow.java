package org.cd2h.STRAPITagLib.landingPages;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LandingPagesCreatedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LandingPagesCreatedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			theLandingPages.setCreatedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing LandingPages for createdAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing LandingPages for createdAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for createdAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getCreatedAt() throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			return theLandingPages.getCreatedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing LandingPages for createdAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing LandingPages for createdAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for createdAt tag ");
			}

		}
	}

	public void setCreatedAt() throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			theLandingPages.setCreatedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing LandingPages for createdAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing LandingPages for createdAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for createdAt tag ");
			}

		}
	}
}