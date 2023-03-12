package org.cd2h.STRAPITagLib.onboardingsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class OnboardingsNavTileLinksContentImageBlockLeftOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(OnboardingsNavTileLinksContentImageBlockLeftOrder.class);

	public int doStartTag() throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			if (!theOnboardingsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theOnboardingsNavTileLinks.getContentImageBlockLeftOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockLeftOrder() throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			return theOnboardingsNavTileLinks.getContentImageBlockLeftOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
			}
		}
	}

	public void setContentImageBlockLeftOrder(double contentImageBlockLeftOrder) throws JspException {
		try {
			OnboardingsNavTileLinks theOnboardingsNavTileLinks = (OnboardingsNavTileLinks)findAncestorWithClass(this, OnboardingsNavTileLinks.class);
			theOnboardingsNavTileLinks.setContentImageBlockLeftOrder(contentImageBlockLeftOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing OnboardingsNavTileLinks for contentImageBlockLeftOrder tag ");
			}
		}
	}

}
