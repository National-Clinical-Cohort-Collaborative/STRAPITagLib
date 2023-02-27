package org.cd2h.STRAPITagLib.missions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class MissionsBlock2 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(MissionsBlock2.class);

	public int doStartTag() throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			if (!theMissions.commitNeeded) {
				pageContext.getOut().print(theMissions.getBlock2());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for block2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for block2 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for block2 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock2() throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			return theMissions.getBlock2();
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for block2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for block2 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for block2 tag ");
			}
		}
	}

	public void setBlock2(String block2) throws JspException {
		try {
			Missions theMissions = (Missions)findAncestorWithClass(this, Missions.class);
			theMissions.setBlock2(block2);
		} catch (Exception e) {
			log.error("Can't find enclosing Missions for block2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Missions for block2 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Missions for block2 tag ");
			}
		}
	}

}
