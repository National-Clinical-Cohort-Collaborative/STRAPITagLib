package org.cd2h.STRAPITagLib.leadershipsBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LeadershipsBioGroupsLinksBioGroupId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LeadershipsBioGroupsLinksBioGroupId.class);

	public int doStartTag() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			if (!theLeadershipsBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theLeadershipsBioGroupsLinks.getBioGroupId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getBioGroupId() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			return theLeadershipsBioGroupsLinks.getBioGroupId();
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
			}
		}
	}

	public void setBioGroupId(int bioGroupId) throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			theLeadershipsBioGroupsLinks.setBioGroupId(bioGroupId);
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupId tag ");
			}
		}
	}

}
