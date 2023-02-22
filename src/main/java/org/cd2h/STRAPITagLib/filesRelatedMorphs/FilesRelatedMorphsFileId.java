package org.cd2h.STRAPITagLib.filesRelatedMorphs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesRelatedMorphsFileId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesRelatedMorphsFileId.class);

	public int doStartTag() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			if (!theFilesRelatedMorphs.commitNeeded) {
				pageContext.getOut().print(theFilesRelatedMorphs.getFileId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getFileId() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			return theFilesRelatedMorphs.getFileId();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
			}
		}
	}

	public void setFileId(int fileId) throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			theFilesRelatedMorphs.setFileId(fileId);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for fileId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for fileId tag ");
			}
		}
	}

}
