package org.cd2h.STRAPITagLib.acknowledgementsContentImageBlockRightsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AcknowledgementsContentImageBlockRightsLinksContentImageBlockRightOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AcknowledgementsContentImageBlockRightsLinksContentImageBlockRightOrder.class);

	public int doStartTag() throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			if (!theAcknowledgementsContentImageBlockRightsLinks.commitNeeded) {
				pageContext.getOut().print(theAcknowledgementsContentImageBlockRightsLinks.getContentImageBlockRightOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockRightOrder() throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			return theAcknowledgementsContentImageBlockRightsLinks.getContentImageBlockRightOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

	public void setContentImageBlockRightOrder(double contentImageBlockRightOrder) throws JspException {
		try {
			AcknowledgementsContentImageBlockRightsLinks theAcknowledgementsContentImageBlockRightsLinks = (AcknowledgementsContentImageBlockRightsLinks)findAncestorWithClass(this, AcknowledgementsContentImageBlockRightsLinks.class);
			theAcknowledgementsContentImageBlockRightsLinks.setContentImageBlockRightOrder(contentImageBlockRightOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing AcknowledgementsContentImageBlockRightsLinks for contentImageBlockRightOrder tag ");
			}
		}
	}

}
