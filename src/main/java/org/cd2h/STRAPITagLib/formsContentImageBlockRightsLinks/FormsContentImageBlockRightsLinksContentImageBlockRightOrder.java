package org.cd2h.STRAPITagLib.formsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FormsContentImageBlockRightsLinksContentImageBlockRightOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FormsContentImageBlockRightsLinksContentImageBlockRightOrder.class);

	public int doStartTag() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			if (!theFormsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theFormsContentImageBlockRightsLinks.getContentImageBlockRightOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockRightOrder() throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			return theFormsContentImageBlockRightsLinks.getContentImageBlockRightOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

	public void setContentImageBlockRightOrder(double contentImageBlockRightOrder) throws JspException {
		try {
			FormsContentImageBlockRightsLinks theFormsContentImageBlockRightsLinks = (FormsContentImageBlockRightsLinks)findAncestorWithClass(this, FormsContentImageBlockRightsLinks.class);
			theFormsContentImageBlockRightsLinks.setContentImageBlockRightOrder(contentImageBlockRightOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FormsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

}
