package org.cd2h.STRAPITagLib.landingPages;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LandingPagesWelcome extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LandingPagesWelcome.class);

	public int doStartTag() throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			if (!theLandingPages.commitNeeded) {
				pageContext.getOut().print(theLandingPages.getWelcome());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPages for welcome tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPages for welcome tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for welcome tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getWelcome() throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			return theLandingPages.getWelcome();
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPages for welcome tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPages for welcome tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for welcome tag ");
			}
		}
	}

	public void setWelcome(String welcome) throws JspException {
		try {
			LandingPages theLandingPages = (LandingPages)findAncestorWithClass(this, LandingPages.class);
			theLandingPages.setWelcome(welcome);
		} catch (Exception e) {
			log.error("Can't find enclosing LandingPages for welcome tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LandingPages for welcome tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LandingPages for welcome tag ");
			}
		}
	}

}
