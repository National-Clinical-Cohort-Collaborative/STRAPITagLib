package org.cd2h.STRAPITagLib.onboardings;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class OnboardingsID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(OnboardingsID.class);

	public int doStartTag() throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			if (!theOnboardings.commitNeeded) {
				pageContext.getOut().print(theOnboardings.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			return theOnboardings.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			Onboardings theOnboardings = (Onboardings)findAncestorWithClass(this, Onboardings.class);
			theOnboardings.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing Onboardings for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Onboardings for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Onboardings for ID tag ");
			}
		}
	}

}
