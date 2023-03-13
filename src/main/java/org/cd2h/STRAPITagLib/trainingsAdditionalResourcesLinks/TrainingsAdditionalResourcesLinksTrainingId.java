package org.cd2h.STRAPITagLib.trainingsAdditionalResourcesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsAdditionalResourcesLinksTrainingId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsAdditionalResourcesLinksTrainingId.class);

	public int doStartTag() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			if (!theTrainingsAdditionalResourcesLinks.commitNeeded) {
				pageContext.getOut().print(theTrainingsAdditionalResourcesLinks.getTrainingId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getTrainingId() throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			return theTrainingsAdditionalResourcesLinks.getTrainingId();
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
			}
		}
	}

	public void setTrainingId(int trainingId) throws JspException {
		try {
			TrainingsAdditionalResourcesLinks theTrainingsAdditionalResourcesLinks = (TrainingsAdditionalResourcesLinks)findAncestorWithClass(this, TrainingsAdditionalResourcesLinks.class);
			theTrainingsAdditionalResourcesLinks.setTrainingId(trainingId);
		} catch (Exception e) {
			log.error("Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TrainingsAdditionalResourcesLinks for trainingId tag ");
			}
		}
	}

}
