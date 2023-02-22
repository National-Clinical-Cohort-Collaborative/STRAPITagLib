package org.cd2h.STRAPITagLib.navColumnsNavBarLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavColumnsNavBarLinksNavBarId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavColumnsNavBarLinksNavBarId.class);

	public int doStartTag() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			if (!theNavColumnsNavBarLinks.commitNeeded) {
				pageContext.getOut().print(theNavColumnsNavBarLinks.getNavBarId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navBarId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getNavBarId() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			return theNavColumnsNavBarLinks.getNavBarId();
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navBarId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
			}
		}
	}

	public void setNavBarId(int navBarId) throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			theNavColumnsNavBarLinks.setNavBarId(navBarId);
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navBarId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navBarId tag ");
			}
		}
	}

}
