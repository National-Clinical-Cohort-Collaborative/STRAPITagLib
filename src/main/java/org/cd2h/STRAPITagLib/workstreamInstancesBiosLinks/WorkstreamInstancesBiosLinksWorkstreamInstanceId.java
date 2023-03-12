package org.cd2h.STRAPITagLib.workstreamInstancesBiosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesBiosLinksWorkstreamInstanceId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesBiosLinksWorkstreamInstanceId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			if (!theWorkstreamInstancesBiosLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesBiosLinks.getWorkstreamInstanceId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamInstanceId() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			return theWorkstreamInstancesBiosLinks.getWorkstreamInstanceId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
			}
		}
	}

	public void setWorkstreamInstanceId(int workstreamInstanceId) throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			theWorkstreamInstancesBiosLinks.setWorkstreamInstanceId(workstreamInstanceId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for workstreamInstanceId tag ");
			}
		}
	}

}
