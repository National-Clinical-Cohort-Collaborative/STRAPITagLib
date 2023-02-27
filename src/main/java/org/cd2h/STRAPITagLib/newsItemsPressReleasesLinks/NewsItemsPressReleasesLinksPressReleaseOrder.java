package org.cd2h.STRAPITagLib.newsItemsPressReleasesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewsItemsPressReleasesLinksPressReleaseOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewsItemsPressReleasesLinksPressReleaseOrder.class);

	public int doStartTag() throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			if (!theNewsItemsPressReleasesLinks.commitNeeded) {
				pageContext.getOut().print(theNewsItemsPressReleasesLinks.getPressReleaseOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getPressReleaseOrder() throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			return theNewsItemsPressReleasesLinks.getPressReleaseOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
			}
		}
	}

	public void setPressReleaseOrder(double pressReleaseOrder) throws JspException {
		try {
			NewsItemsPressReleasesLinks theNewsItemsPressReleasesLinks = (NewsItemsPressReleasesLinks)findAncestorWithClass(this, NewsItemsPressReleasesLinks.class);
			theNewsItemsPressReleasesLinks.setPressReleaseOrder(pressReleaseOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItemsPressReleasesLinks for pressReleaseOrder tag ");
			}
		}
	}

}
