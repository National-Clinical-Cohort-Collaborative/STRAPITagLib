package org.cd2h.STRAPITagLib.workstreamsYouTubeVideoLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamsYouTubeVideoLinksWorkstreamId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamsYouTubeVideoLinksWorkstreamId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamsYouTubeVideoLinks theWorkstreamsYouTubeVideoLinks = (WorkstreamsYouTubeVideoLinks)findAncestorWithClass(this, WorkstreamsYouTubeVideoLinks.class);
			if (!theWorkstreamsYouTubeVideoLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamsYouTubeVideoLinks.getWorkstreamId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamId() throws JspException {
		try {
			WorkstreamsYouTubeVideoLinks theWorkstreamsYouTubeVideoLinks = (WorkstreamsYouTubeVideoLinks)findAncestorWithClass(this, WorkstreamsYouTubeVideoLinks.class);
			return theWorkstreamsYouTubeVideoLinks.getWorkstreamId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
			}
		}
	}

	public void setWorkstreamId(int workstreamId) throws JspException {
		try {
			WorkstreamsYouTubeVideoLinks theWorkstreamsYouTubeVideoLinks = (WorkstreamsYouTubeVideoLinks)findAncestorWithClass(this, WorkstreamsYouTubeVideoLinks.class);
			theWorkstreamsYouTubeVideoLinks.setWorkstreamId(workstreamId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsYouTubeVideoLinks for workstreamId tag ");
			}
		}
	}

}
