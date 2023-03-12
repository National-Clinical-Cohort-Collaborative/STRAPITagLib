package org.cd2h.STRAPITagLib.duaLists;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DuaListsHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DuaListsHeader.class);

	public int doStartTag() throws JspException {
		try {
			DuaLists theDuaLists = (DuaLists)findAncestorWithClass(this, DuaLists.class);
			if (!theDuaLists.commitNeeded) {
				pageContext.getOut().print(theDuaLists.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DuaLists for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DuaLists for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DuaLists for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			DuaLists theDuaLists = (DuaLists)findAncestorWithClass(this, DuaLists.class);
			return theDuaLists.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing DuaLists for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DuaLists for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing DuaLists for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			DuaLists theDuaLists = (DuaLists)findAncestorWithClass(this, DuaLists.class);
			theDuaLists.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing DuaLists for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DuaLists for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DuaLists for header tag ");
			}
		}
	}

}
