package org.cd2h.STRAPITagLib.tenantResearcherEssentialsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantResearcherEssentialsNavTilesLinksTenantResearcherEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantResearcherEssentialsNavTilesLinksTenantResearcherEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			TenantResearcherEssentialsNavTilesLinks theTenantResearcherEssentialsNavTilesLinks = (TenantResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, TenantResearcherEssentialsNavTilesLinks.class);
			if (!theTenantResearcherEssentialsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theTenantResearcherEssentialsNavTilesLinks.getTenantResearcherEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getTenantResearcherEssentialId() throws JspException {
		try {
			TenantResearcherEssentialsNavTilesLinks theTenantResearcherEssentialsNavTilesLinks = (TenantResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, TenantResearcherEssentialsNavTilesLinks.class);
			return theTenantResearcherEssentialsNavTilesLinks.getTenantResearcherEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
			}
		}
	}

	public void setTenantResearcherEssentialId(int tenantResearcherEssentialId) throws JspException {
		try {
			TenantResearcherEssentialsNavTilesLinks theTenantResearcherEssentialsNavTilesLinks = (TenantResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, TenantResearcherEssentialsNavTilesLinks.class);
			theTenantResearcherEssentialsNavTilesLinks.setTenantResearcherEssentialId(tenantResearcherEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantResearcherEssentialsNavTilesLinks for tenantResearcherEssentialId tag ");
			}
		}
	}

}
