package org.cd2h.STRAPITagLib.downloads;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DownloadsTrackHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DownloadsTrackHeader.class);

	public int doStartTag() throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			if (!theDownloads.commitNeeded) {
				pageContext.getOut().print(theDownloads.getTrackHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for trackHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for trackHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for trackHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getTrackHeader() throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			return theDownloads.getTrackHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for trackHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for trackHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for trackHeader tag ");
			}
		}
	}

	public void setTrackHeader(String trackHeader) throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			theDownloads.setTrackHeader(trackHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for trackHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for trackHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for trackHeader tag ");
			}
		}
	}

}
