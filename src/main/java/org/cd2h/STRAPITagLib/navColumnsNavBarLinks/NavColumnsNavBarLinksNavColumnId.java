package org.cd2h.STRAPITagLib.navColumnsNavBarLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavColumnsNavBarLinksNavColumnId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavColumnsNavBarLinksNavColumnId.class);

	public int doStartTag() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			if (!theNavColumnsNavBarLinks.commitNeeded) {
				pageContext.getOut().print(theNavColumnsNavBarLinks.getNavColumnId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getNavColumnId() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			return theNavColumnsNavBarLinks.getNavColumnId();
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
			}
		}
	}

	public void setNavColumnId(int navColumnId) throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			theNavColumnsNavBarLinks.setNavColumnId(navColumnId);
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnId tag ");
			}
		}
	}

}
