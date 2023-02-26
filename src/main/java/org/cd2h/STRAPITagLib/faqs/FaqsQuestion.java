package org.cd2h.STRAPITagLib.faqs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqsQuestion extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqsQuestion.class);

	public int doStartTag() throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			if (!theFaqs.commitNeeded) {
				pageContext.getOut().print(theFaqs.getQuestion());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Faqs for question tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Faqs for question tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for question tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getQuestion() throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			return theFaqs.getQuestion();
		} catch (Exception e) {
			log.error("Can't find enclosing Faqs for question tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Faqs for question tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for question tag ");
			}
		}
	}

	public void setQuestion(String question) throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			theFaqs.setQuestion(question);
		} catch (Exception e) {
			log.error("Can't find enclosing Faqs for question tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Faqs for question tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for question tag ");
			}
		}
	}

}
