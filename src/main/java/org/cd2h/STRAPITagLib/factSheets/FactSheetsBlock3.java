package org.cd2h.STRAPITagLib.factSheets;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FactSheetsBlock3 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FactSheetsBlock3.class);

	public int doStartTag() throws JspException {
		try {
			FactSheets theFactSheets = (FactSheets)findAncestorWithClass(this, FactSheets.class);
			if (!theFactSheets.commitNeeded) {
				pageContext.getOut().print(theFactSheets.getBlock3());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FactSheets for block3 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FactSheets for block3 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FactSheets for block3 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock3() throws JspException {
		try {
			FactSheets theFactSheets = (FactSheets)findAncestorWithClass(this, FactSheets.class);
			return theFactSheets.getBlock3();
		} catch (Exception e) {
			log.error("Can't find enclosing FactSheets for block3 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FactSheets for block3 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FactSheets for block3 tag ");
			}
		}
	}

	public void setBlock3(String block3) throws JspException {
		try {
			FactSheets theFactSheets = (FactSheets)findAncestorWithClass(this, FactSheets.class);
			theFactSheets.setBlock3(block3);
		} catch (Exception e) {
			log.error("Can't find enclosing FactSheets for block3 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FactSheets for block3 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FactSheets for block3 tag ");
			}
		}
	}

}
