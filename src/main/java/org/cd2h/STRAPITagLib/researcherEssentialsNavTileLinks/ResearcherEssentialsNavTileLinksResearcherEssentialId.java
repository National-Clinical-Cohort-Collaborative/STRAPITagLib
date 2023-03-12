package org.cd2h.STRAPITagLib.researcherEssentialsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ResearcherEssentialsNavTileLinksResearcherEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ResearcherEssentialsNavTileLinksResearcherEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			if (!theResearcherEssentialsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theResearcherEssentialsNavTileLinks.getResearcherEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getResearcherEssentialId() throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			return theResearcherEssentialsNavTileLinks.getResearcherEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
			}
		}
	}

	public void setResearcherEssentialId(int researcherEssentialId) throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			theResearcherEssentialsNavTileLinks.setResearcherEssentialId(researcherEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for researcherEssentialId tag ");
			}
		}
	}

}
