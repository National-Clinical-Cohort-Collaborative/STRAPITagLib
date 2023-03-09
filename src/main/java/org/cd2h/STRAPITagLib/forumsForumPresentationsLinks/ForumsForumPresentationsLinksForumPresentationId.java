package org.cd2h.STRAPITagLib.forumsForumPresentationsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumsForumPresentationsLinksForumPresentationId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumsForumPresentationsLinksForumPresentationId.class);

	public int doStartTag() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			if (!theForumsForumPresentationsLinks.commitNeeded) {
				pageContext.getOut().print(theForumsForumPresentationsLinks.getForumPresentationId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getForumPresentationId() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			return theForumsForumPresentationsLinks.getForumPresentationId();
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
			}
		}
	}

	public void setForumPresentationId(int forumPresentationId) throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			theForumsForumPresentationsLinks.setForumPresentationId(forumPresentationId);
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumPresentationId tag ");
			}
		}
	}

}
