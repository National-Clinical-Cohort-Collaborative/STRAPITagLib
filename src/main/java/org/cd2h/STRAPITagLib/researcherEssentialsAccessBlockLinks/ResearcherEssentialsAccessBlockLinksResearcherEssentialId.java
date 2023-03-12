package org.cd2h.STRAPITagLib.researcherEssentialsAccessBlockLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ResearcherEssentialsAccessBlockLinksResearcherEssentialId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ResearcherEssentialsAccessBlockLinksResearcherEssentialId.class);

	public int doStartTag() throws JspException {
		try {
			ResearcherEssentialsAccessBlockLinks theResearcherEssentialsAccessBlockLinks = (ResearcherEssentialsAccessBlockLinks)findAncestorWithClass(this, ResearcherEssentialsAccessBlockLinks.class);
			if (!theResearcherEssentialsAccessBlockLinks.commitNeeded) {
				pageContext.getOut().print(theResearcherEssentialsAccessBlockLinks.getResearcherEssentialId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getResearcherEssentialId() throws JspException {
		try {
			ResearcherEssentialsAccessBlockLinks theResearcherEssentialsAccessBlockLinks = (ResearcherEssentialsAccessBlockLinks)findAncestorWithClass(this, ResearcherEssentialsAccessBlockLinks.class);
			return theResearcherEssentialsAccessBlockLinks.getResearcherEssentialId();
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
			}
		}
	}

	public void setResearcherEssentialId(int researcherEssentialId) throws JspException {
		try {
			ResearcherEssentialsAccessBlockLinks theResearcherEssentialsAccessBlockLinks = (ResearcherEssentialsAccessBlockLinks)findAncestorWithClass(this, ResearcherEssentialsAccessBlockLinks.class);
			theResearcherEssentialsAccessBlockLinks.setResearcherEssentialId(researcherEssentialId);
		} catch (Exception e) {
			log.error("Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ResearcherEssentialsAccessBlockLinks for researcherEssentialId tag ");
			}
		}
	}

}
