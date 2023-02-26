package org.cd2h.STRAPITagLib.phastrs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsEligibility extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsEligibility.class);

	public int doStartTag() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			if (!thePhastrs.commitNeeded) {
				pageContext.getOut().print(thePhastrs.getEligibility());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for eligibility tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for eligibility tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for eligibility tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getEligibility() throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			return thePhastrs.getEligibility();
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for eligibility tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for eligibility tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for eligibility tag ");
			}
		}
	}

	public void setEligibility(String eligibility) throws JspException {
		try {
			Phastrs thePhastrs = (Phastrs)findAncestorWithClass(this, Phastrs.class);
			thePhastrs.setEligibility(eligibility);
		} catch (Exception e) {
			log.error("Can't find enclosing Phastrs for eligibility tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Phastrs for eligibility tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Phastrs for eligibility tag ");
			}
		}
	}

}
