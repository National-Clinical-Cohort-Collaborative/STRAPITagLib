package org.cd2h.STRAPITagLib.onboardingsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class OnboardingsNavTileLinksOnboardingId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(OnboardingsNavTileLinksOnboardingId.class);

	public int doStartTag() throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			if (!theOnboardingsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theOnboardingsNavTileLinks.getOnboardingId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getOnboardingId() throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			return theOnboardingsNavTileLinks.getOnboardingId();
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
			}
		}
	}

	public void setOnboardingId(int onboardingId) throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			theOnboardingsNavTileLinks.setOnboardingId(onboardingId);
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for onboardingId tag ");
			}
		}
	}

}
