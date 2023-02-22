package org.cd2h.STRAPITagLib.navColumns;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavColumnsCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavColumnsCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			NavColumns theNavColumns = (NavColumns)findAncestorWithClass(this, NavColumns.class);
			if (!theNavColumns.commitNeeded) {
				pageContext.getOut().print(theNavColumns.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumns for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumns for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumns for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			NavColumns theNavColumns = (NavColumns)findAncestorWithClass(this, NavColumns.class);
			return theNavColumns.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumns for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumns for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumns for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			NavColumns theNavColumns = (NavColumns)findAncestorWithClass(this, NavColumns.class);
			theNavColumns.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing NavColumns for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavColumns for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavColumns for createdById tag ");
			}
		}
	}

}
