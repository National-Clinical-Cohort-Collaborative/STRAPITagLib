package org.cd2h.STRAPITagLib.faqLists;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsEnclaveHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsEnclaveHeader.class);

	public int doStartTag() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			if (!theFaqLists.commitNeeded) {
				pageContext.getOut().print(theFaqLists.getEnclaveHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for enclaveHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for enclaveHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for enclaveHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getEnclaveHeader() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			return theFaqLists.getEnclaveHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for enclaveHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for enclaveHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for enclaveHeader tag ");
			}
		}
	}

	public void setEnclaveHeader(String enclaveHeader) throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			theFaqLists.setEnclaveHeader(enclaveHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for enclaveHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for enclaveHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for enclaveHeader tag ");
			}
		}
	}

}
