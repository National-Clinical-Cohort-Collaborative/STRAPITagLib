package org.cd2h.STRAPITagLib.navItems;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavItemsCreatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavItemsCreatedAt.class);

	public int doStartTag() throws JspException {
		try {
			NavItems theNavItems = (NavItems)findAncestorWithClass(this, NavItems.class);
			if (!theNavItems.commitNeeded) {
				pageContext.getOut().print(theNavItems.getCreatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavItems for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItems for createdAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItems for createdAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getCreatedAt() throws JspException {
		try {
			NavItems theNavItems = (NavItems)findAncestorWithClass(this, NavItems.class);
			return theNavItems.getCreatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing NavItems for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItems for createdAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItems for createdAt tag ");
			}
		}
	}

	public void setCreatedAt(Timestamp createdAt) throws JspException {
		try {
			NavItems theNavItems = (NavItems)findAncestorWithClass(this, NavItems.class);
			theNavItems.setCreatedAt(createdAt);
		} catch (Exception e) {
			log.error("Can't find enclosing NavItems for createdAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavItems for createdAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavItems for createdAt tag ");
			}
		}
	}

}
