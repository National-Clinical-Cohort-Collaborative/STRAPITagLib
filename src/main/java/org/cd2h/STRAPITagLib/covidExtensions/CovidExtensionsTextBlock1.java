package org.cd2h.STRAPITagLib.covidExtensions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CovidExtensionsTextBlock1 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CovidExtensionsTextBlock1.class);

	public int doStartTag() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			if (!theCovidExtensions.commitNeeded) {
				pageContext.getOut().print(theCovidExtensions.getTextBlock1());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for textBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getTextBlock1() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			return theCovidExtensions.getTextBlock1();
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for textBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
			}
		}
	}

	public void setTextBlock1(String textBlock1) throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			theCovidExtensions.setTextBlock1(textBlock1);
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for textBlock1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for textBlock1 tag ");
			}
		}
	}

}
