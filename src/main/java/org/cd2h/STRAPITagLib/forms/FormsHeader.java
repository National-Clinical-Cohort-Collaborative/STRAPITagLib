package org.cd2h.STRAPITagLib.forms;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FormsHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FormsHeader.class);

	public int doStartTag() throws JspException {
		try {
			Forms theForms = (Forms)findAncestorWithClass(this, Forms.class);
			if (!theForms.commitNeeded) {
				pageContext.getOut().print(theForms.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Forms for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forms for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forms for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			Forms theForms = (Forms)findAncestorWithClass(this, Forms.class);
			return theForms.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Forms for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forms for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Forms for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			Forms theForms = (Forms)findAncestorWithClass(this, Forms.class);
			theForms.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing Forms for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forms for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forms for header tag ");
			}
		}
	}

}
