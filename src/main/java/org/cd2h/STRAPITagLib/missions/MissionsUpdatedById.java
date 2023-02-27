package org.cd2h.STRAPITagLib.missions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class MissionsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(MissionsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			if (!theMissions.commitNeeded) {
				pageContext.getOut().print(theMissions.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			return theMissions.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			theMissions.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for updatedById tag ");
			}
		}
	}

}
