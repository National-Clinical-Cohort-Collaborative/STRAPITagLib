package org.cd2h.STRAPITagLib.faqListsHarmonizationFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqListsHarmonizationFaqsLinksID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqListsHarmonizationFaqsLinksID.class);

	public int doStartTag() throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			if (!theFaqListsHarmonizationFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theFaqListsHarmonizationFaqsLinks.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			return theFaqListsHarmonizationFaqsLinks.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			FaqListsHarmonizationFaqsLinks theFaqListsHarmonizationFaqsLinks = (FaqListsHarmonizationFaqsLinks)findAncestorWithClass(this, FaqListsHarmonizationFaqsLinks.class);
			theFaqListsHarmonizationFaqsLinks.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqListsHarmonizationFaqsLinks for ID tag ");
			}
		}
	}

}
