package org.cd2h.STRAPITagLib.phastrsPublicHealthQuestionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsPublicHealthQuestionsLinksPublicHealthQuestionOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsPublicHealthQuestionsLinksPublicHealthQuestionOrder.class);

	public int doStartTag() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			if (!thePhastrsPublicHealthQuestionsLinks.commitNeeded) {
				pageContext.getOut().print(thePhastrsPublicHealthQuestionsLinks.getPublicHealthQuestionOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getPublicHealthQuestionOrder() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			return thePhastrsPublicHealthQuestionsLinks.getPublicHealthQuestionOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
			}
		}
	}

	public void setPublicHealthQuestionOrder(double publicHealthQuestionOrder) throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			thePhastrsPublicHealthQuestionsLinks.setPublicHealthQuestionOrder(publicHealthQuestionOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for publicHealthQuestionOrder tag ");
			}
		}
	}

}
