package org.cd2h.STRAPITagLib.workstreamInstancesBiosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesBiosLinksBioId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesBiosLinksBioId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			if (!theWorkstreamInstancesBiosLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesBiosLinks.getBioId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getBioId() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			return theWorkstreamInstancesBiosLinks.getBioId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
			}
		}
	}

	public void setBioId(int bioId) throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			theWorkstreamInstancesBiosLinks.setBioId(bioId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioId tag ");
			}
		}
	}

}
