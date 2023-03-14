package org.cd2h.STRAPITagLib.faqLists;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsCreatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsCreatedAt.class);

	public int doStartTag() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			if (!theFaqLists.commitNeeded) {
				pageContext.getOut().print(theFaqLists.getCreatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for createdAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for createdAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getCreatedAt() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			return theFaqLists.getCreatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for createdAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for createdAt tag ");
			}
		}
	}

	public void setCreatedAt(Timestamp createdAt) throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			theFaqLists.setCreatedAt(createdAt);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for createdAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for createdAt tag ");
			}
		}
	}

}
