package org.cd2h.STRAPITagLib.workstreamInstances;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesMissionBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesMissionBlock.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			if (!theWorkstreamInstances.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstances.getMissionBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for missionBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getMissionBlock() throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			return theWorkstreamInstances.getMissionBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for missionBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
			}
		}
	}

	public void setMissionBlock(String missionBlock) throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			theWorkstreamInstances.setMissionBlock(missionBlock);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for missionBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for missionBlock tag ");
			}
		}
	}

}
