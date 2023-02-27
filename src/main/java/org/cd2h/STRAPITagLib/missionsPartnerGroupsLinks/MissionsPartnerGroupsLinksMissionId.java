package org.cd2h.STRAPITagLib.missionsPartnerGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class MissionsPartnerGroupsLinksMissionId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(MissionsPartnerGroupsLinksMissionId.class);

	public int doStartTag() throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			if (!theMissionsPartnerGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theMissionsPartnerGroupsLinks.getMissionId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getMissionId() throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			return theMissionsPartnerGroupsLinks.getMissionId();
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
			}
		}
	}

	public void setMissionId(int missionId) throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			theMissionsPartnerGroupsLinks.setMissionId(missionId);
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for missionId tag ");
			}
		}
	}

}
