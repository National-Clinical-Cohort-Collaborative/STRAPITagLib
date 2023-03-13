package org.cd2h.STRAPITagLib.trainingsAdditionalResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsAdditionalResourcesLinksResourceOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsAdditionalResourcesLinksResourceOrder.class);

	public int doStartTag() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			if (!theTrainingsAdditionalResourcesLinks.commitNeeded) {
				pageContext.getOut().print(theTrainingsAdditionalResourcesLinks.getResourceOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getResourceOrder() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			return theTrainingsAdditionalResourcesLinks.getResourceOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
			}
		}
	}

	public void setResourceOrder(double resourceOrder) throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			theTrainingsAdditionalResourcesLinks.setResourceOrder(resourceOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceOrder tag ");
			}
		}
	}

}
