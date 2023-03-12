package org.cd2h.STRAPITagLib.workstreamInstancesFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesFaqsLinksID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesFaqsLinksID.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			if (!theWorkstreamInstancesFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesFaqsLinks.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			return theWorkstreamInstancesFaqsLinks.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			WorkstreamInstancesFaqsLinks theWorkstreamInstancesFaqsLinks = (WorkstreamInstancesFaqsLinks)findAncestorWithClass(this, WorkstreamInstancesFaqsLinks.class);
			theWorkstreamInstancesFaqsLinks.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesFaqsLinks for ID tag ");
			}
		}
	}

}
