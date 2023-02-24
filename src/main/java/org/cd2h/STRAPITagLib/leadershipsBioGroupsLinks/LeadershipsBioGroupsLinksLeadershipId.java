package org.cd2h.STRAPITagLib.leadershipsBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LeadershipsBioGroupsLinksLeadershipId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LeadershipsBioGroupsLinksLeadershipId.class);

	public int doStartTag() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			if (!theLeadershipsBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theLeadershipsBioGroupsLinks.getLeadershipId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getLeadershipId() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			return theLeadershipsBioGroupsLinks.getLeadershipId();
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
			}
		}
	}

	public void setLeadershipId(int leadershipId) throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			theLeadershipsBioGroupsLinks.setLeadershipId(leadershipId);
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for leadershipId tag ");
			}
		}
	}

}
