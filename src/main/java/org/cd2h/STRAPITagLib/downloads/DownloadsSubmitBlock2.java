package org.cd2h.STRAPITagLib.downloads;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DownloadsSubmitBlock2 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DownloadsSubmitBlock2.class);

	public int doStartTag() throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			if (!theDownloads.commitNeeded) {
				pageContext.getOut().print(theDownloads.getSubmitBlock2());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for submitBlock2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for submitBlock2 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for submitBlock2 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getSubmitBlock2() throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			return theDownloads.getSubmitBlock2();
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for submitBlock2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for submitBlock2 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for submitBlock2 tag ");
			}
		}
	}

	public void setSubmitBlock2(String submitBlock2) throws JspException {
		try {
			Downloads theDownloads = (Downloads)findAncestorWithClass(this, Downloads.class);
			theDownloads.setSubmitBlock2(submitBlock2);
		} catch (Exception e) {
			log.error("Can't find enclosing Downloads for submitBlock2 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Downloads for submitBlock2 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Downloads for submitBlock2 tag ");
			}
		}
	}

}
