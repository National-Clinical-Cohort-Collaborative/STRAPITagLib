package org.cd2h.STRAPITagLib.leadershipsBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LeadershipsBioGroupsLinksBioGroupOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LeadershipsBioGroupsLinksBioGroupOrder.class);

	public int doStartTag() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			if (!theLeadershipsBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theLeadershipsBioGroupsLinks.getBioGroupOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioGroupOrder() throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			return theLeadershipsBioGroupsLinks.getBioGroupOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
			}
		}
	}

	public void setBioGroupOrder(double bioGroupOrder) throws JspException {
		try {
			LeadershipsBioGroupsLinks theLeadershipsBioGroupsLinks = (LeadershipsBioGroupsLinks)findAncestorWithClass(this, LeadershipsBioGroupsLinks.class);
			theLeadershipsBioGroupsLinks.setBioGroupOrder(bioGroupOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing LeadershipsBioGroupsLinks for bioGroupOrder tag ");
			}
		}
	}

}
