package org.cd2h.STRAPITagLib.publicHealthQuestions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicHealthQuestionsPriority extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicHealthQuestionsPriority.class);

	public int doStartTag() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			if (!thePublicHealthQuestions.commitNeeded) {
				pageContext.getOut().print(thePublicHealthQuestions.getPriority());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for priority tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for priority tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for priority tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getPriority() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			return thePublicHealthQuestions.getPriority();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for priority tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for priority tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for priority tag ");
			}
		}
	}

	public void setPriority(String priority) throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			thePublicHealthQuestions.setPriority(priority);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for priority tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for priority tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for priority tag ");
			}
		}
	}

}
