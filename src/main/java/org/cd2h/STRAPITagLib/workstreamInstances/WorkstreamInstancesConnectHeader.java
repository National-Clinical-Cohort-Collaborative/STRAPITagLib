package org.cd2h.STRAPITagLib.workstreamInstances;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesConnectHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesConnectHeader.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			if (!theWorkstreamInstances.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstances.getConnectHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for connectHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getConnectHeader() throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			return theWorkstreamInstances.getConnectHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for connectHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
			}
		}
	}

	public void setConnectHeader(String connectHeader) throws JspException {
		try {
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			theWorkstreamInstances.setConnectHeader(connectHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstances for connectHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstances for connectHeader tag ");
			}
		}
	}

}
