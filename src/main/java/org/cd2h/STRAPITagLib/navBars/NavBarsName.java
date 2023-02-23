package org.cd2h.STRAPITagLib.navBars;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavBarsName extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavBarsName.class);

	public int doStartTag() throws JspException {
		try {
			NavBars theNavBars = (NavBars)findAncestorWithClass(this, NavBars.class);
			if (!theNavBars.commitNeeded) {
				pageContext.getOut().print(theNavBars.getName());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavBars for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavBars for name tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavBars for name tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getName() throws JspException {
		try {
			NavBars theNavBars = (NavBars)findAncestorWithClass(this, NavBars.class);
			return theNavBars.getName();
		} catch (Exception e) {
			log.error("Can't find enclosing NavBars for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavBars for name tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavBars for name tag ");
			}
		}
	}

	public void setName(String name) throws JspException {
		try {
			NavBars theNavBars = (NavBars)findAncestorWithClass(this, NavBars.class);
			theNavBars.setName(name);
		} catch (Exception e) {
			log.error("Can't find enclosing NavBars for name tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavBars for name tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavBars for name tag ");
			}
		}
	}

}
