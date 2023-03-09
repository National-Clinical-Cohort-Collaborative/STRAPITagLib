package org.cd2h.STRAPITagLib.forums;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumsPublishedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumsPublishedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			theForums.setPublishedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing Forums for publishedAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Forums for publishedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for publishedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getPublishedAt() throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			return theForums.getPublishedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing Forums for publishedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Forums for publishedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for publishedAt tag ");
			}

		}
	}

	public void setPublishedAt() throws JspException {
		try {
			Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
			theForums.setPublishedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing Forums for publishedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Forums for publishedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Forums for publishedAt tag ");
			}

		}
	}
}