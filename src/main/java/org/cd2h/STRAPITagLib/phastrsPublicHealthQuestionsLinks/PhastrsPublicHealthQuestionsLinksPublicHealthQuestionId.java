package org.cd2h.STRAPITagLib.phastrsPublicHealthQuestionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsPublicHealthQuestionsLinksPublicHealthQuestionId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsPublicHealthQuestionsLinksPublicHealthQuestionId.class);

	public int doStartTag() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			if (!thePhastrsPublicHealthQuestionsLinks.commitNeeded) {
				pageContext.getOut().print(thePhastrsPublicHealthQuestionsLinks.getPublicHealthQuestionId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPublicHealthQuestionId() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			return thePhastrsPublicHealthQuestionsLinks.getPublicHealthQuestionId();
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
			}
		}
	}

	public void setPublicHealthQuestionId(int publicHealthQuestionId) throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			thePhastrsPublicHealthQuestionsLinks.setPublicHealthQuestionId(publicHealthQuestionId);
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionId tag ");
			}
		}
	}

}
