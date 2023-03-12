package org.cd2h.STRAPITagLib.researcherEssentialsGovernanceBlockLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ResearcherEssentialsGovernanceBlockLinksContentImageBlockRightId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ResearcherEssentialsGovernanceBlockLinksContentImageBlockRightId.class);

	public int doStartTag() throws JspException {
		try {
			ResearcherEssentialsGovernanceBlockLinks theResearcherEssentialsGovernanceBlockLinks = (ResearcherEssentialsGovernanceBlockLinks)findAncestorWithClass(this, ResearcherEssentialsGovernanceBlockLinks.class);
			if (!theResearcherEssentialsGovernanceBlockLinks.commitNeeded) {
				pageContext.getOut().print(theResearcherEssentialsGovernanceBlockLinks.getContentImageBlockRightId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getContentImageBlockRightId() throws JspException {
		try {
			ResearcherEssentialsGovernanceBlockLinks theResearcherEssentialsGovernanceBlockLinks = (ResearcherEssentialsGovernanceBlockLinks)findAncestorWithClass(this, ResearcherEssentialsGovernanceBlockLinks.class);
			return theResearcherEssentialsGovernanceBlockLinks.getContentImageBlockRightId();
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
			}
		}
	}

	public void setContentImageBlockRightId(int contentImageBlockRightId) throws JspException {
		try {
			ResearcherEssentialsGovernanceBlockLinks theResearcherEssentialsGovernanceBlockLinks = (ResearcherEssentialsGovernanceBlockLinks)findAncestorWithClass(this, ResearcherEssentialsGovernanceBlockLinks.class);
			theResearcherEssentialsGovernanceBlockLinks.setContentImageBlockRightId(contentImageBlockRightId);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsGovernanceBlockLinks for contentImageBlockRightId tag ");
			}
		}
	}

}
