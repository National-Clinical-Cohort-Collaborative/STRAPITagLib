package org.cd2h.STRAPITagLib.onboardings;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class OnboardingsSubheader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(OnboardingsSubheader.class);

	public int doStartTag() throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			if (!theOnboardings.commitNeeded) {
				pageContext.getOut().print(theOnboardings.getSubheader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for subheader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for subheader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for subheader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSubheader() throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			return theOnboardings.getSubheader();
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for subheader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for subheader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for subheader tag ");
			}
		}
	}

	public void setSubheader(String subheader) throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			theOnboardings.setSubheader(subheader);
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for subheader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for subheader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for subheader tag ");
			}
		}
	}

}
