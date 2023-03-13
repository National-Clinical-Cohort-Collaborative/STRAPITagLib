package org.cd2h.STRAPITagLib.formsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FormsContentImageBlockRightsLinksFormId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FormsContentImageBlockRightsLinksFormId.class);

	public int doStartTag() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			if (!theFormsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theFormsContentImageBlockRightsLinks.getFormId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFormId() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			return theFormsContentImageBlockRightsLinks.getFormId();
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
			}
		}
	}

	public void setFormId(int formId) throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			theFormsContentImageBlockRightsLinks.setFormId(formId);
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for formId tag ");
			}
		}
	}

}
