package org.cd2h.STRAPITagLib.faqLists;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsDomainHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsDomainHeader.class);

	public int doStartTag() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			if (!theFaqLists.commitNeeded) {
				pageContext.getOut().print(theFaqLists.getDomainHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for domainHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for domainHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for domainHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getDomainHeader() throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			return theFaqLists.getDomainHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for domainHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for domainHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for domainHeader tag ");
			}
		}
	}

	public void setDomainHeader(String domainHeader) throws JspException {
		try {
			FaqLists theFaqLists = (FaqLists)findAncestorWithClass(this, FaqLists.class);
			theFaqLists.setDomainHeader(domainHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqLists for domainHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqLists for domainHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqLists for domainHeader tag ");
			}
		}
	}

}
