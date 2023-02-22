package org.cd2h.STRAPITagLib.navColumnsNavBarLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavColumnsNavBarLinksNavColumnOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavColumnsNavBarLinksNavColumnOrder.class);

	public int doStartTag() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			if (!theNavColumnsNavBarLinks.commitNeeded) {
				pageContext.getOut().print(theNavColumnsNavBarLinks.getNavColumnOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getNavColumnOrder() throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			return theNavColumnsNavBarLinks.getNavColumnOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
			}
		}
	}

	public void setNavColumnOrder(double navColumnOrder) throws JspException {
		try {
			NavColumnsNavBarLinks theNavColumnsNavBarLinks = (NavColumnsNavBarLinks)findAncestorWithClass(this, NavColumnsNavBarLinks.class);
			theNavColumnsNavBarLinks.setNavColumnOrder(navColumnOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumnsNavBarLinks for navColumnOrder tag ");
			}
		}
	}

}
