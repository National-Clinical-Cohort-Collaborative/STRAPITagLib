package org.cd2h.STRAPITagLib.filesFolderLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesFolderLinksFileId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesFolderLinksFileId.class);

	public int doStartTag() throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			if (!theFilesFolderLinks.commitNeeded) {
				pageContext.getOut().print(theFilesFolderLinks.getFileId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFileId() throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			return theFilesFolderLinks.getFileId();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileId tag ");
			}
		}
	}

	public void setFileId(int fileId) throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			theFilesFolderLinks.setFileId(fileId);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileId tag ");
			}
		}
	}

}
