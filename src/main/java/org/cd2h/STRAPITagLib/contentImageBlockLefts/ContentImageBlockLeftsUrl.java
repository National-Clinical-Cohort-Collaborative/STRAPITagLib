package org.cd2h.STRAPITagLib.contentImageBlockLefts;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ContentImageBlockLeftsUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ContentImageBlockLeftsUrl.class);

	public int doStartTag() throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			if (!theContentImageBlockLefts.commitNeeded) {
				pageContext.getOut().print(theContentImageBlockLefts.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			return theContentImageBlockLefts.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			theContentImageBlockLefts.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for url tag ");
			}
		}
	}

}
