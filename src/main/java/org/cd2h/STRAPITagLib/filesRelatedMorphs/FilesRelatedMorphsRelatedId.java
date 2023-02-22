package org.cd2h.STRAPITagLib.filesRelatedMorphs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesRelatedMorphsRelatedId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesRelatedMorphsRelatedId.class);

	public int doStartTag() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			if (!theFilesRelatedMorphs.commitNeeded) {
				pageContext.getOut().print(theFilesRelatedMorphs.getRelatedId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getRelatedId() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			return theFilesRelatedMorphs.getRelatedId();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
			}
		}
	}

	public void setRelatedId(int relatedId) throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			theFilesRelatedMorphs.setRelatedId(relatedId);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedId tag ");
			}
		}
	}

}
