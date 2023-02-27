package org.cd2h.STRAPITagLib.newsItems;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class NewsItemsUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(NewsItemsUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			NewsItems theNewsItems = (NewsItems)findAncestorWithClass(this, NewsItems.class);
			if (!theNewsItems.commitNeeded) {
				pageContext.getOut().print(theNewsItems.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItems for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItems for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItems for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			NewsItems theNewsItems = (NewsItems)findAncestorWithClass(this, NewsItems.class);
			return theNewsItems.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItems for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItems for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItems for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			NewsItems theNewsItems = (NewsItems)findAncestorWithClass(this, NewsItems.class);
			theNewsItems.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing NewsItems for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing NewsItems for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing NewsItems for updatedById tag ");
			}
		}
	}

}
