package org.cd2h.STRAPITagLib.formsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FormsContentImageBlockRightsLinksContentImageBlockRightId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FormsContentImageBlockRightsLinksContentImageBlockRightId.class);

	public int doStartTag() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			if (!theFormsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theFormsContentImageBlockRightsLinks.getContentImageBlockRightId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockRightId() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			return theFormsContentImageBlockRightsLinks.getContentImageBlockRightId();
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
			}
		}
	}

	public void setContentImageBlockRightId(int contentImageBlockRightId) throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			theFormsContentImageBlockRightsLinks.setContentImageBlockRightId(contentImageBlockRightId);
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightId tag ");
			}
		}
	}

}
