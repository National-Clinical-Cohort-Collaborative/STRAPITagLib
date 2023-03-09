package org.cd2h.STRAPITagLib.forumsForumPresentationsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumsForumPresentationsLinksForumPresentationOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumsForumPresentationsLinksForumPresentationOrder.class);

	public int doStartTag() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			if (!theForumsForumPresentationsLinks.commitNeeded) {
				pageContext.getOut().print(theForumsForumPresentationsLinks.getForumPresentationOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getForumPresentationOrder() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			return theForumsForumPresentationsLinks.getForumPresentationOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
			}
		}
	}

	public void setForumPresentationOrder(double forumPresentationOrder) throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			theForumsForumPresentationsLinks.setForumPresentationOrder(forumPresentationOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationOrder tag ");
			}
		}
	}

}
