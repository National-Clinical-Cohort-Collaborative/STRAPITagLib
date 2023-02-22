package org.cd2h.STRAPITagLib.footers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FootersSocial extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FootersSocial.class);

	public int doStartTag() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			if (!theFooters.commitNeeded) {
				pageContext.getOut().print(theFooters.getSocial());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for social tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for social tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for social tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSocial() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			return theFooters.getSocial();
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for social tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for social tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for social tag ");
			}
		}
	}

	public void setSocial(String social) throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			theFooters.setSocial(social);
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for social tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for social tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for social tag ");
			}
		}
	}

}
