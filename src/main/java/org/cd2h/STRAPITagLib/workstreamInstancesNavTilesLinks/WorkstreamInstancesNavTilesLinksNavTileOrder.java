package org.cd2h.STRAPITagLib.workstreamInstancesNavTilesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesNavTilesLinksNavTileOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesNavTilesLinksNavTileOrder.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			if (!theWorkstreamInstancesNavTilesLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesNavTilesLinks.getNavTileOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getNavTileOrder() throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			return theWorkstreamInstancesNavTilesLinks.getNavTileOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
			}
		}
	}

	public void setNavTileOrder(double navTileOrder) throws JspException {
		try {
			WorkstreamInstancesNavTilesLinks theWorkstreamInstancesNavTilesLinks = (WorkstreamInstancesNavTilesLinks)findAncestorWithClass(this, WorkstreamInstancesNavTilesLinks.class);
			theWorkstreamInstancesNavTilesLinks.setNavTileOrder(navTileOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesNavTilesLinks for navTileOrder tag ");
			}
		}
	}

}
