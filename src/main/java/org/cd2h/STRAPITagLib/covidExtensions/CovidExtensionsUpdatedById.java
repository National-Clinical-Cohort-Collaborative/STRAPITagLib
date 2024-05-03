package org.cd2h.STRAPITagLib.covidExtensions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CovidExtensionsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CovidExtensionsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			if (!theCovidExtensions.commitNeeded) {
				pageContext.getOut().print(theCovidExtensions.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			return theCovidExtensions.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
			theCovidExtensions.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensions for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensions for updatedById tag ");
			}
		}
	}

}
