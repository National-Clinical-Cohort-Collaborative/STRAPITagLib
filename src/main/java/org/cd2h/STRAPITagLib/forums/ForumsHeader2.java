package org.cd2h.STRAPITagLib.forums;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumsHeader2 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumsHeader2.class);

	public int doStartTag() throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			if (!theForums.commitNeeded) {
				pageContext.getOut().print(theForums.getHeader2());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Forums for header2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forums for header2 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for header2 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader2() throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			return theForums.getHeader2();
		} catch (Exception e) {
			log.error("Can't find enclosing Forums for header2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forums for header2 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for header2 tag ");
			}
		}
	}

	public void setHeader2(String header2) throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			theForums.setHeader2(header2);
		} catch (Exception e) {
			log.error("Can't find enclosing Forums for header2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Forums for header2 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for header2 tag ");
			}
		}
	}

}
