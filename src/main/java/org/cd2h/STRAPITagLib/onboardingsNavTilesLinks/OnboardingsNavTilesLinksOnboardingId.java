package org.cd2h.STRAPITagLib.onboardingsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class OnboardingsNavTilesLinksOnboardingId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(OnboardingsNavTilesLinksOnboardingId.class);

	public int doStartTag() throws JspException {
		try {
			OnboardingsNavTilesLinks theOnboardingsNavTilesLinks = (OnboardingsNavTilesLinks)findAncestorWithClass(this, OnboardingsNavTilesLinks.class);
			if (!theOnboardingsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theOnboardingsNavTilesLinks.getOnboardingId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getOnboardingId() throws JspException {
		try {
			OnboardingsNavTilesLinks theOnboardingsNavTilesLinks = (OnboardingsNavTilesLinks)findAncestorWithClass(this, OnboardingsNavTilesLinks.class);
			return theOnboardingsNavTilesLinks.getOnboardingId();
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
			}
		}
	}

	public void setOnboardingId(int onboardingId) throws JspException {
		try {
			OnboardingsNavTilesLinks theOnboardingsNavTilesLinks = (OnboardingsNavTilesLinks)findAncestorWithClass(this, OnboardingsNavTilesLinks.class);
			theOnboardingsNavTilesLinks.setOnboardingId(onboardingId);
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTilesLinks for onboardingId tag ");
			}
		}
	}

}
