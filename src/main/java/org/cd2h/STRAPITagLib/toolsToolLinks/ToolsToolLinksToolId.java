package org.cd2h.STRAPITagLib.toolsToolLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ToolsToolLinksToolId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ToolsToolLinksToolId.class);

	public int doStartTag() throws JspException {
		try {
			ToolsToolLinks theToolsToolLinks = (ToolsToolLinks)findAncestorWithClass(this, ToolsToolLinks.class);
			if (!theToolsToolLinks.commitNeeded) {
				pageContext.getOut().print(theToolsToolLinks.getToolId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ToolsToolLinks for toolId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ToolsToolLinks for toolId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ToolsToolLinks for toolId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getToolId() throws JspException {
		try {
			ToolsToolLinks theToolsToolLinks = (ToolsToolLinks)findAncestorWithClass(this, ToolsToolLinks.class);
			return theToolsToolLinks.getToolId();
		} catch (Exception e) {
			log.error("Can't find enclosing ToolsToolLinks for toolId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ToolsToolLinks for toolId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ToolsToolLinks for toolId tag ");
			}
		}
	}

	public void setToolId(int toolId) throws JspException {
		try {
			ToolsToolLinks theToolsToolLinks = (ToolsToolLinks)findAncestorWithClass(this, ToolsToolLinks.class);
			theToolsToolLinks.setToolId(toolId);
		} catch (Exception e) {
			log.error("Can't find enclosing ToolsToolLinks for toolId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ToolsToolLinks for toolId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ToolsToolLinks for toolId tag ");
			}
		}
	}

}
