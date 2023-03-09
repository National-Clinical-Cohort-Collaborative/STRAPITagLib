package org.cd2h.STRAPITagLib.contributors;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.sql.Timestamp;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class ContributorsUpdatedAtToNow extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(ContributorsUpdatedAtToNow.class);


	public int doStartTag() throws JspException {
		try {
			Contributors theContributors = (Contributors)findAncestorWithClass(this, Contributors.class);
			theContributors.setUpdatedAtToNow( );
		} catch (Exception e) {
			log.error(" Can't find enclosing Contributors for updatedAt tag ", e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Contributors for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Contributors for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Contributors theContributors = (Contributors)findAncestorWithClass(this, Contributors.class);
			return theContributors.getUpdatedAt();
		} catch (Exception e) {

			log.error("Can't find enclosing Contributors for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Contributors for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Contributors for updatedAt tag ");
			}

		}
	}

	public void setUpdatedAt() throws JspException {
		try {
			Contributors theContributors = (Contributors)findAncestorWithClass(this, Contributors.class);
			theContributors.setUpdatedAtToNow( );
		} catch (Exception e) {

			log.error("Can't find enclosing Contributors for updatedAt tag ", e);

			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Can't find enclosing Contributors for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Contributors for updatedAt tag ");
			}

		}
	}
}