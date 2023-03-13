package org.cd2h.STRAPITagLib.trainingsSharedResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsSharedResourcesLinksResourceOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsSharedResourcesLinksResourceOrder.class);

	public int doStartTag() throws JspException {
		try {
			TrainingsSharedResourcesLinks theTrainingsSharedResourcesLinks = (TrainingsSharedResourcesLinks)findAncestorWithClass(this, TrainingsSharedResourcesLinks.class);
			if (!theTrainingsSharedResourcesLinks.commitNeeded) {
				pageContext.getOut().print(theTrainingsSharedResourcesLinks.getResourceOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getResourceOrder() throws JspException {
		try {
			TrainingsSharedResourcesLinks theTrainingsSharedResourcesLinks = (TrainingsSharedResourcesLinks)findAncestorWithClass(this, TrainingsSharedResourcesLinks.class);
			return theTrainingsSharedResourcesLinks.getResourceOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
			}
		}
	}

	public void setResourceOrder(double resourceOrder) throws JspException {
		try {
			TrainingsSharedResourcesLinks theTrainingsSharedResourcesLinks = (TrainingsSharedResourcesLinks)findAncestorWithClass(this, TrainingsSharedResourcesLinks.class);
			theTrainingsSharedResourcesLinks.setResourceOrder(resourceOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsSharedResourcesLinks for resourceOrder tag ");
			}
		}
	}

}
