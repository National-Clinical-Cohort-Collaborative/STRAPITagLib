package org.cd2h.STRAPITagLib.trainings;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TrainingsSharedResourceBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TrainingsSharedResourceBlock.class);

	public int doStartTag() throws JspException {
		try {
			Trainings theTrainings = (Trainings)findAncestorWithClass(this, Trainings.class);
			if (!theTrainings.commitNeeded) {
				pageContext.getOut().print(theTrainings.getSharedResourceBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Trainings for sharedResourceBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSharedResourceBlock() throws JspException {
		try {
			Trainings theTrainings = (Trainings)findAncestorWithClass(this, Trainings.class);
			return theTrainings.getSharedResourceBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing Trainings for sharedResourceBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
			}
		}
	}

	public void setSharedResourceBlock(String sharedResourceBlock) throws JspException {
		try {
			Trainings theTrainings = (Trainings)findAncestorWithClass(this, Trainings.class);
			theTrainings.setSharedResourceBlock(sharedResourceBlock);
		} catch (Exception e) {
			log.error("Can't find enclosing Trainings for sharedResourceBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Trainings for sharedResourceBlock tag ");
			}
		}
	}

}
