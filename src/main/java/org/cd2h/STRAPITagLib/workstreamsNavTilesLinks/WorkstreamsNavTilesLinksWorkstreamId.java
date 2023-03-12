package org.cd2h.STRAPITagLib.workstreamsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamsNavTilesLinksWorkstreamId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamsNavTilesLinksWorkstreamId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			if (!theWorkstreamsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamsNavTilesLinks.getWorkstreamId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamId() throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			return theWorkstreamsNavTilesLinks.getWorkstreamId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
			}
		}
	}

	public void setWorkstreamId(int workstreamId) throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			theWorkstreamsNavTilesLinks.setWorkstreamId(workstreamId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for workstreamId tag ");
			}
		}
	}

}
