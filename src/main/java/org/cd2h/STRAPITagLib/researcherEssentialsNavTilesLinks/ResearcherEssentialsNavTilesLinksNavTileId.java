package org.cd2h.STRAPITagLib.researcherEssentialsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ResearcherEssentialsNavTilesLinksNavTileId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ResearcherEssentialsNavTilesLinksNavTileId.class);

	public int doStartTag() throws JspException {
		try {
			ResearcherEssentialsNavTilesLinks theResearcherEssentialsNavTilesLinks = (ResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, ResearcherEssentialsNavTilesLinks.class);
			if (!theResearcherEssentialsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theResearcherEssentialsNavTilesLinks.getNavTileId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getNavTileId() throws JspException {
		try {
			ResearcherEssentialsNavTilesLinks theResearcherEssentialsNavTilesLinks = (ResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, ResearcherEssentialsNavTilesLinks.class);
			return theResearcherEssentialsNavTilesLinks.getNavTileId();
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
			}
		}
	}

	public void setNavTileId(int navTileId) throws JspException {
		try {
			ResearcherEssentialsNavTilesLinks theResearcherEssentialsNavTilesLinks = (ResearcherEssentialsNavTilesLinks)findAncestorWithClass(this, ResearcherEssentialsNavTilesLinks.class);
			theResearcherEssentialsNavTilesLinks.setNavTileId(navTileId);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTilesLinks for navTileId tag ");
			}
		}
	}

}
