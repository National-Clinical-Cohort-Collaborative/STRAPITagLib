package org.cd2h.STRAPITagLib.contentImageBlockLefts;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ContentImageBlockLeftsUrlLabel extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ContentImageBlockLeftsUrlLabel.class);

	public int doStartTag() throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			if (!theContentImageBlockLefts.commitNeeded) {
				pageContext.getOut().print(theContentImageBlockLefts.getUrlLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for urlLabel tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrlLabel() throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			return theContentImageBlockLefts.getUrlLabel();
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for urlLabel tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
			}
		}
	}

	public void setUrlLabel(String urlLabel) throws JspException {
		try {
			ContentImageBlockLefts theContentImageBlockLefts = (ContentImageBlockLefts)findAncestorWithClass(this, ContentImageBlockLefts.class);
			theContentImageBlockLefts.setUrlLabel(urlLabel);
		} catch (Exception e) {
			log.error("Can't find enclosing ContentImageBlockLefts for urlLabel tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ContentImageBlockLefts for urlLabel tag ");
			}
		}
	}

}
