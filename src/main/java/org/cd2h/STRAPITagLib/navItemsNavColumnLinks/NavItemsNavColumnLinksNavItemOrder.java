package org.cd2h.STRAPITagLib.navItemsNavColumnLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavItemsNavColumnLinksNavItemOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavItemsNavColumnLinksNavItemOrder.class);

	public int doStartTag() throws JspException {
		try {
			NavItemsNavColumnLinks theNavItemsNavColumnLinks = (NavItemsNavColumnLinks)findAncestorWithClass(this, NavItemsNavColumnLinks.class);
			if (!theNavItemsNavColumnLinks.commitNeeded) {
				pageContext.getOut().print(theNavItemsNavColumnLinks.getNavItemOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getNavItemOrder() throws JspException {
		try {
			NavItemsNavColumnLinks theNavItemsNavColumnLinks = (NavItemsNavColumnLinks)findAncestorWithClass(this, NavItemsNavColumnLinks.class);
			return theNavItemsNavColumnLinks.getNavItemOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
			}
		}
	}

	public void setNavItemOrder(double navItemOrder) throws JspException {
		try {
			NavItemsNavColumnLinks theNavItemsNavColumnLinks = (NavItemsNavColumnLinks)findAncestorWithClass(this, NavItemsNavColumnLinks.class);
			theNavItemsNavColumnLinks.setNavItemOrder(navItemOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItemsNavColumnLinks for navItemOrder tag ");
			}
		}
	}

}
