package org.cd2h.STRAPITagLib.partners;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PartnersPublishedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PartnersPublishedAt.class);

	public int doStartTag() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			if (!thePartners.commitNeeded) {
				pageContext.getOut().print(thePartners.getPublishedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for publishedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for publishedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getPublishedAt() throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			return thePartners.getPublishedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for publishedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for publishedAt tag ");
			}
		}
	}

	public void setPublishedAt(Timestamp publishedAt) throws JspException {
		try {
			Partners thePartners = (Partners)findAncestorWithClass(this, Partners.class);
			thePartners.setPublishedAt(publishedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Partners for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Partners for publishedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Partners for publishedAt tag ");
			}
		}
	}

}
