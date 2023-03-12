package org.cd2h.STRAPITagLib.navTiles;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NavTilesUrl extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NavTilesUrl.class);

	public int doStartTag() throws JspException {
		try {
			NavTiles theNavTiles = (NavTiles)findAncestorWithClass(this, NavTiles.class);
			if (!theNavTiles.commitNeeded) {
				pageContext.getOut().print(theNavTiles.getUrl());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NavTiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavTiles for url tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavTiles for url tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getUrl() throws JspException {
		try {
			NavTiles theNavTiles = (NavTiles)findAncestorWithClass(this, NavTiles.class);
			return theNavTiles.getUrl();
		} catch (Exception e) {
			log.error("Can't find enclosing NavTiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavTiles for url tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing NavTiles for url tag ");
			}
		}
	}

	public void setUrl(String url) throws JspException {
		try {
			NavTiles theNavTiles = (NavTiles)findAncestorWithClass(this, NavTiles.class);
			theNavTiles.setUrl(url);
		} catch (Exception e) {
			log.error("Can't find enclosing NavTiles for url tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NavTiles for url tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NavTiles for url tag ");
			}
		}
	}

}
