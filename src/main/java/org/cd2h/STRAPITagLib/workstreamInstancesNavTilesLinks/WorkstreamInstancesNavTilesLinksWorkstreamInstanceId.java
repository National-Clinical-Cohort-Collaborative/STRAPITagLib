package org.cd2h.STRAPITagLib.workstreamInstancesNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesNavTilesLinksWorkstreamInstanceId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesNavTilesLinksWorkstreamInstanceId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			if (!theWorkstreamInstancesNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesNavTilesLinks.getWorkstreamInstanceId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamInstanceId() throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			return theWorkstreamInstancesNavTilesLinks.getWorkstreamInstanceId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
			}
		}
	}

	public void setWorkstreamInstanceId(int workstreamInstanceId) throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			theWorkstreamInstancesNavTilesLinks.setWorkstreamInstanceId(workstreamInstanceId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for workstreamInstanceId tag ");
			}
		}
	}

}
