package org.cd2h.STRAPITagLib.publicHealthQuestions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicHealthQuestionsDescription extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicHealthQuestionsDescription.class);

	public int doStartTag() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			if (!thePublicHealthQuestions.commitNeeded) {
				pageContext.getOut().print(thePublicHealthQuestions.getDescription());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for description tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for description tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for description tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getDescription() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			return thePublicHealthQuestions.getDescription();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for description tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for description tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for description tag ");
			}
		}
	}

	public void setDescription(String description) throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			thePublicHealthQuestions.setDescription(description);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for description tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for description tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for description tag ");
			}
		}
	}

}
