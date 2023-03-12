package org.cd2h.STRAPITagLib.contentImageBlockRights;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ContentImageBlockRightsUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ContentImageBlockRightsUrl.class);

	public int doStartTag() throws JspException {
		try {
			ContentImageBlockRights theContentImageBlockRights = (ContentImageBlockRights)findAncestorWithClass(this, ContentImageBlockRights.class);
			if (!theContentImageBlockRights.commitNeeded) {
				pageContext.getOut().print(theContentImageBlockRights.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockRights for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockRights for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockRights for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			ContentImageBlockRights theContentImageBlockRights = (ContentImageBlockRights)findAncestorWithClass(this, ContentImageBlockRights.class);
			return theContentImageBlockRights.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockRights for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockRights for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockRights for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			ContentImageBlockRights theContentImageBlockRights = (ContentImageBlockRights)findAncestorWithClass(this, ContentImageBlockRights.class);
			theContentImageBlockRights.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockRights for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockRights for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockRights for url tag ");
			}
		}
	}

}
