package org.cd2h.STRAPITagLib.supports;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class SupportsHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(SupportsHeader.class);

	public int doStartTag() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			if (!theSupports.commitNeeded) {
				pageContext.getOut().print(theSupports.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			return theSupports.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			theSupports.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for header tag ");
			}
		}
	}

}
