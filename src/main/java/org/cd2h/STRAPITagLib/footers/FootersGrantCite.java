package org.cd2h.STRAPITagLib.footers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FootersGrantCite extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FootersGrantCite.class);

	public int doStartTag() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			if (!theFooters.commitNeeded) {
				pageContext.getOut().print(theFooters.getGrantCite());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for grantCite tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for grantCite tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getGrantCite() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			return theFooters.getGrantCite();
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for grantCite tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for grantCite tag ");
			}
		}
	}

	public void setGrantCite(String grantCite) throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			theFooters.setGrantCite(grantCite);
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for grantCite tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for grantCite tag ");
			}
		}
	}

}
