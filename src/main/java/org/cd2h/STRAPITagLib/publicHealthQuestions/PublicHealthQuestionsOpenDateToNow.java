package org.cd2h.STRAPITagLib.publicHealthQuestions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.Date;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicHealthQuestionsOpenDateToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PublicHealthQuestionsOpenDateToNow.class);


	public int doStartTag() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			thePublicHealthQuestions.setOpenDateToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing PublicHealthQuestions for openDate tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing PublicHealthQuestions for openDate tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for openDate tag ");
			}

		}
		return SKIP_BODY;
	}

	public Date getOpenDate() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			return thePublicHealthQuestions.getOpenDate();
		} catch (Exception e) {

			log.error("Can't find enclosing PublicHealthQuestions for openDate tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing PublicHealthQuestions for openDate tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for openDate tag ");
			}

		}
	}

	public void setOpenDate() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			thePublicHealthQuestions.setOpenDateToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing PublicHealthQuestions for openDate tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing PublicHealthQuestions for openDate tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for openDate tag ");
			}

		}
	}
}