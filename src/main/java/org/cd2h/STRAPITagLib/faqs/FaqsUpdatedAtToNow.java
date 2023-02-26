package org.cd2h.STRAPITagLib.faqs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqsUpdatedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqsUpdatedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			theFaqs.setUpdatedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing Faqs for updatedAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Faqs for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			return theFaqs.getUpdatedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing Faqs for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Faqs for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for updatedAt tag ");
			}

		}
	}

	public void setUpdatedAt() throws JspException {
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			theFaqs.setUpdatedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing Faqs for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Faqs for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Faqs for updatedAt tag ");
			}

		}
	}
}