package org.cd2h.STRAPITagLib.partners;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			if (!thePartners.commitNeeded) {
				pageContext.getOut().print(thePartners.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			return thePartners.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			thePartners.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for updatedById tag ");
			}
		}
	}

}
