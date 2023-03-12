package org.cd2h.STRAPITagLib.workstreamsNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamsNavTilesLinksNavTileId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamsNavTilesLinksNavTileId.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			if (!theWorkstreamsNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamsNavTilesLinks.getNavTileId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getNavTileId() throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			return theWorkstreamsNavTilesLinks.getNavTileId();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
			}
		}
	}

	public void setNavTileId(int navTileId) throws JspException {
		try {
			WorkstreamsNavTilesLinks theWorkstreamsNavTilesLinks = (WorkstreamsNavTilesLinks)findAncestorWithClass(this, WorkstreamsNavTilesLinks.class);
			theWorkstreamsNavTilesLinks.setNavTileId(navTileId);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamsNavTilesLinks for navTileId tag ");
			}
		}
	}

}
