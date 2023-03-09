package org.cd2h.STRAPITagLib.forumPresentations;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ForumPresentationsID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ForumPresentationsID.class);

	public int doStartTag() throws JspException {
		try {
			ForumPresentations theForumPresentations = (ForumPresentations)findAncestorWithClass(this, ForumPresentations.class);
			if (!theForumPresentations.commitNeeded) {
				pageContext.getOut().print(theForumPresentations.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ForumPresentations for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumPresentations for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumPresentations for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			ForumPresentations theForumPresentations = (ForumPresentations)findAncestorWithClass(this, ForumPresentations.class);
			return theForumPresentations.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing ForumPresentations for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumPresentations for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumPresentations for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			ForumPresentations theForumPresentations = (ForumPresentations)findAncestorWithClass(this, ForumPresentations.class);
			theForumPresentations.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing ForumPresentations for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing ForumPresentations for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing ForumPresentations for ID tag ");
			}
		}
	}

}
