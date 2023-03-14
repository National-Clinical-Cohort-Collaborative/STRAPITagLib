package org.cd2h.STRAPITagLib.supports;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class SupportsBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(SupportsBlock.class);

	public int doStartTag() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			if (!theSupports.commitNeeded) {
				pageContext.getOut().print(theSupports.getBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for block tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for block tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock() throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			return theSupports.getBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for block tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for block tag ");
			}
		}
	}

	public void setBlock(String block) throws JspException {
		try {
			Supports theSupports = (Supports)findAncestorWithClass(this, Supports.class);
			theSupports.setBlock(block);
		} catch (Exception e) {
			log.error("Can't find enclosing Supports for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Supports for block tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Supports for block tag ");
			}
		}
	}

}
