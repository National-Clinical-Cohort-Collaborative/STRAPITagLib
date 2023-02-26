package org.cd2h.STRAPITagLib.phastrs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsAbout extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsAbout.class);

	public int doStartTag() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			if (!thePhastrs.commitNeeded) {
				pageContext.getOut().print(thePhastrs.getAbout());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for about tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for about tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for about tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getAbout() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			return thePhastrs.getAbout();
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for about tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for about tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for about tag ");
			}
		}
	}

	public void setAbout(String about) throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			thePhastrs.setAbout(about);
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for about tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for about tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for about tag ");
			}
		}
	}

}
