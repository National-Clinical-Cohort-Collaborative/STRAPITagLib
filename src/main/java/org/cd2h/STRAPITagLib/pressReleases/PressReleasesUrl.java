package org.cd2h.STRAPITagLib.pressReleases;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PressReleasesUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PressReleasesUrl.class);

	public int doStartTag() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			if (!thePressReleases.commitNeeded) {
				pageContext.getOut().print(thePressReleases.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			return thePressReleases.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			PressReleases thePressReleases = (PressReleases)findAncestorWithClass(this, PressReleases.class);
			thePressReleases.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing PressReleases for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PressReleases for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PressReleases for url tag ");
			}
		}
	}

}
