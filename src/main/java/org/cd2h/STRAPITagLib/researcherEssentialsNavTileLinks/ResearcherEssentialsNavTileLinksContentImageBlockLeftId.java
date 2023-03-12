package org.cd2h.STRAPITagLib.researcherEssentialsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ResearcherEssentialsNavTileLinksContentImageBlockLeftId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ResearcherEssentialsNavTileLinksContentImageBlockLeftId.class);

	public int doStartTag() throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			if (!theResearcherEssentialsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theResearcherEssentialsNavTileLinks.getContentImageBlockLeftId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockLeftId() throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			return theResearcherEssentialsNavTileLinks.getContentImageBlockLeftId();
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
			}
		}
	}

	public void setContentImageBlockLeftId(int contentImageBlockLeftId) throws JspException {
		try {
			ResearcherEssentialsNavTileLinks theResearcherEssentialsNavTileLinks = (ResearcherEssentialsNavTileLinks)findAncestorWithClass(this, ResearcherEssentialsNavTileLinks.class);
			theResearcherEssentialsNavTileLinks.setContentImageBlockLeftId(contentImageBlockLeftId);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsNavTileLinks for contentImageBlockLeftId tag ");
			}
		}
	}

}
