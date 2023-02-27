package org.cd2h.STRAPITagLib.partners;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			if (!thePartners.commitNeeded) {
				pageContext.getOut().print(thePartners.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			return thePartners.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			thePartners.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for createdById tag ");
			}
		}
	}

}
