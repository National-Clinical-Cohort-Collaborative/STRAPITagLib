package org.cd2h.STRAPITagLib.forumsForumPresentationsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumsForumPresentationsLinksForumId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumsForumPresentationsLinksForumId.class);

	public int doStartTag() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			if (!theForumsForumPresentationsLinks.commitNeeded) {
				pageContext.getOut().print(theForumsForumPresentationsLinks.getForumId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getForumId() throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			return theForumsForumPresentationsLinks.getForumId();
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
			}
		}
	}

	public void setForumId(int forumId) throws JspException {
		try {
			ForumsForumPresentationsLinks theForumsForumPresentationsLinks = (ForumsForumPresentationsLinks)findAncestorWithClass(this, ForumsForumPresentationsLinks.class);
			theForumsForumPresentationsLinks.setForumId(forumId);
		} catch (Exception e) {
			log.error("Can't find enclosing ForumsForumPresentationsLinks for forumId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumsForumPresentationsLinks for forumId tag ");
			}
		}
	}

}
