package org.cd2h.STRAPITagLib.pressReleases;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PressReleasesTitle extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PressReleasesTitle.class);

	public int doStartTag() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			if (!thePressReleases.commitNeeded) {
				pageContext.getOut().print(thePressReleases.getTitle());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for title tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for title tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getTitle() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			return thePressReleases.getTitle();
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for title tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for title tag ");
			}
		}
	}

	public void setTitle(String title) throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			thePressReleases.setTitle(title);
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for title tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for title tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for title tag ");
			}
		}
	}

}
