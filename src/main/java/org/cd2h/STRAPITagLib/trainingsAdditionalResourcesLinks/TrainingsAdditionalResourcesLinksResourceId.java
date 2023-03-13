package org.cd2h.STRAPITagLib.trainingsAdditionalResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsAdditionalResourcesLinksResourceId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsAdditionalResourcesLinksResourceId.class);

	public int doStartTag() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			if (!theTrainingsAdditionalResourcesLinks.commitNeeded) {
				pageContext.getOut().print(theTrainingsAdditionalResourcesLinks.getResourceId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getResourceId() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			return theTrainingsAdditionalResourcesLinks.getResourceId();
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
			}
		}
	}

	public void setResourceId(int resourceId) throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			theTrainingsAdditionalResourcesLinks.setResourceId(resourceId);
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for resourceId tag ");
			}
		}
	}

}
