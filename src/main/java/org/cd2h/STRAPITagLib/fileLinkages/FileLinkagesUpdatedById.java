package org.cd2h.STRAPITagLib.fileLinkages;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FileLinkagesUpdatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FileLinkagesUpdatedById.class);

	public int doStartTag() throws JspException {
		try {
			FileLinkages theFileLinkages = (FileLinkages)findAncestorWithClass(this, FileLinkages.class);
			if (!theFileLinkages.commitNeeded) {
				pageContext.getOut().print(theFileLinkages.getUpdatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FileLinkages for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FileLinkages for updatedById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FileLinkages for updatedById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getUpdatedById() throws JspException {
		try {
			FileLinkages theFileLinkages = (FileLinkages)findAncestorWithClass(this, FileLinkages.class);
			return theFileLinkages.getUpdatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing FileLinkages for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FileLinkages for updatedById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FileLinkages for updatedById tag ");
			}
		}
	}

	public void setUpdatedById(int updatedById) throws JspException {
		try {
			FileLinkages theFileLinkages = (FileLinkages)findAncestorWithClass(this, FileLinkages.class);
			theFileLinkages.setUpdatedById(updatedById);
		} catch (Exception e) {
			log.error("Can't find enclosing FileLinkages for updatedById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FileLinkages for updatedById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FileLinkages for updatedById tag ");
			}
		}
	}

}
