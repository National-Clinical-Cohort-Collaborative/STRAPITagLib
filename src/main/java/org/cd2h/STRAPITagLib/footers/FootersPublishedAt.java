package org.cd2h.STRAPITagLib.footers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FootersPublishedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FootersPublishedAt.class);

	public int doStartTag() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			if (!theFooters.commitNeeded) {
				pageContext.getOut().print(theFooters.getPublishedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for publishedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for publishedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getPublishedAt() throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			return theFooters.getPublishedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for publishedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for publishedAt tag ");
			}
		}
	}

	public void setPublishedAt(Timestamp publishedAt) throws JspException {
		try {
			Footers theFooters = (Footers)findAncestorWithClass(this, Footers.class);
			theFooters.setPublishedAt(publishedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Footers for publishedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Footers for publishedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Footers for publishedAt tag ");
			}
		}
	}

}
