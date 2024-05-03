package org.cd2h.STRAPITagLib.covidExtensions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CovidExtensionsTitle extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CovidExtensionsTitle.class);

	public int doStartTag() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			if (!theCovidExtensions.commitNeeded) {
				pageContext.getOut().print(theCovidExtensions.getTitle());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for title tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for title tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getTitle() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			return theCovidExtensions.getTitle();
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for title tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for title tag ");
			}
		}
	}

	public void setTitle(String title) throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			theCovidExtensions.setTitle(title);
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for title tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for title tag ");
			}
		}
	}

}
