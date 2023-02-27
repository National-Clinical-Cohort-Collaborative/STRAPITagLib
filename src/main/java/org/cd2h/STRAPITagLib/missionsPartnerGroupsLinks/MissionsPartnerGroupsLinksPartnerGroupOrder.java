package org.cd2h.STRAPITagLib.missionsPartnerGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class MissionsPartnerGroupsLinksPartnerGroupOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(MissionsPartnerGroupsLinksPartnerGroupOrder.class);

	public int doStartTag() throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			if (!theMissionsPartnerGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theMissionsPartnerGroupsLinks.getPartnerGroupOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getPartnerGroupOrder() throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			return theMissionsPartnerGroupsLinks.getPartnerGroupOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
			}
		}
	}

	public void setPartnerGroupOrder(double partnerGroupOrder) throws JspException {
		try {
			MissionsPartnerGroupsLinks theMissionsPartnerGroupsLinks = (MissionsPartnerGroupsLinks)findAncestorWithClass(this, MissionsPartnerGroupsLinks.class);
			theMissionsPartnerGroupsLinks.setPartnerGroupOrder(partnerGroupOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing MissionsPartnerGroupsLinks for partnerGroupOrder tag ");
			}
		}
	}

}
