package org.cd2h.STRAPITagLib.files;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesAlternativeText extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesAlternativeText.class);

	public int doStartTag() throws JspException {
		try {
			Files theFiles = (Files)findAncestorWithClass(this, Files.class);
			if (!theFiles.commitNeeded) {
				pageContext.getOut().print(theFiles.getAlternativeText());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Files for alternativeText tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Files for alternativeText tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Files for alternativeText tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getAlternativeText() throws JspException {
		try {
			Files theFiles = (Files)findAncestorWithClass(this, Files.class);
			return theFiles.getAlternativeText();
		} catch (Exception e) {
			log.error("Can't find enclosing Files for alternativeText tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Files for alternativeText tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Files for alternativeText tag ");
			}
		}
	}

	public void setAlternativeText(String alternativeText) throws JspException {
		try {
			Files theFiles = (Files)findAncestorWithClass(this, Files.class);
			theFiles.setAlternativeText(alternativeText);
		} catch (Exception e) {
			log.error("Can't find enclosing Files for alternativeText tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Files for alternativeText tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Files for alternativeText tag ");
			}
		}
	}

}
