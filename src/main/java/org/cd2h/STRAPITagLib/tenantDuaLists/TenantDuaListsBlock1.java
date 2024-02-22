package org.cd2h.STRAPITagLib.tenantDuaLists;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantDuaListsBlock1 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantDuaListsBlock1.class);

	public int doStartTag() throws JspException {
		try {
			TenantDuaLists theTenantDuaLists = (TenantDuaLists)findAncestorWithClass(this, TenantDuaLists.class);
			if (!theTenantDuaLists.commitNeeded) {
				pageContext.getOut().print(theTenantDuaLists.getBlock1());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantDuaLists for block1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantDuaLists for block1 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantDuaLists for block1 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock1() throws JspException {
		try {
			TenantDuaLists theTenantDuaLists = (TenantDuaLists)findAncestorWithClass(this, TenantDuaLists.class);
			return theTenantDuaLists.getBlock1();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantDuaLists for block1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantDuaLists for block1 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantDuaLists for block1 tag ");
			}
		}
	}

	public void setBlock1(String block1) throws JspException {
		try {
			TenantDuaLists theTenantDuaLists = (TenantDuaLists)findAncestorWithClass(this, TenantDuaLists.class);
			theTenantDuaLists.setBlock1(block1);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantDuaLists for block1 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantDuaLists for block1 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantDuaLists for block1 tag ");
			}
		}
	}

}
