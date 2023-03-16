package org.cd2h.STRAPITagLib.institutionalEssentialsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsNavTilesLinksNavTileOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsNavTilesLinksNavTileOrder.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			if (!theInstitutionalEssentialsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentialsNavTilesLinks.getNavTileOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getNavTileOrder() throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			return theInstitutionalEssentialsNavTilesLinks.getNavTileOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
			}
		}
	}

	public void setNavTileOrder(double navTileOrder) throws JspException {
		try {
			InstitutionalEssentialsNavTilesLinks theInstitutionalEssentialsNavTilesLinks = (InstitutionalEssentialsNavTilesLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTilesLinks.class);
			theInstitutionalEssentialsNavTilesLinks.setNavTileOrder(navTileOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTilesLinks for navTileOrder tag ");
			}
		}
	}

}
