package org.cd2h.STRAPITagLib.workstreamsIntroLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamsIntroLinksID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamsIntroLinksID.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamsIntroLinks theWorkstreamsIntroLinks = (WorkstreamsIntroLinks)findAncestorWithClass(this, WorkstreamsIntroLinks.class);
			if (!theWorkstreamsIntroLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamsIntroLinks.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsIntroLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			WorkstreamsIntroLinks theWorkstreamsIntroLinks = (WorkstreamsIntroLinks)findAncestorWithClass(this, WorkstreamsIntroLinks.class);
			return theWorkstreamsIntroLinks.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsIntroLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			WorkstreamsIntroLinks theWorkstreamsIntroLinks = (WorkstreamsIntroLinks)findAncestorWithClass(this, WorkstreamsIntroLinks.class);
			theWorkstreamsIntroLinks.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsIntroLinks for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsIntroLinks for ID tag ");
			}
		}
	}

}
