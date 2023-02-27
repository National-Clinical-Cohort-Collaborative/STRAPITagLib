package org.cd2h.STRAPITagLib.newsItemsPressReleasesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewsItemsPressReleasesLinksPressReleaseId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewsItemsPressReleasesLinksPressReleaseId.class);

	public int doStartTag() throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			if (!theNewsItemsPressReleasesLinks.commitNeeded) {
				pageContext.getOut().print(theNewsItemsPressReleasesLinks.getPressReleaseId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPressReleaseId() throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			return theNewsItemsPressReleasesLinks.getPressReleaseId();
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
			}
		}
	}

	public void setPressReleaseId(int pressReleaseId) throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			theNewsItemsPressReleasesLinks.setPressReleaseId(pressReleaseId);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseId tag ");
			}
		}
	}

}
