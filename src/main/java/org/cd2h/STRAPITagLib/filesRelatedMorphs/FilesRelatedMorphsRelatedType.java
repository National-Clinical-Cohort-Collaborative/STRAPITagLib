package org.cd2h.STRAPITagLib.filesRelatedMorphs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesRelatedMorphsRelatedType extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesRelatedMorphsRelatedType.class);

	public int doStartTag() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			if (!theFilesRelatedMorphs.commitNeeded) {
				pageContext.getOut().print(theFilesRelatedMorphs.getRelatedType());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedType tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getRelatedType() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			return theFilesRelatedMorphs.getRelatedType();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedType tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
			}
		}
	}

	public void setRelatedType(String relatedType) throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			theFilesRelatedMorphs.setRelatedType(relatedType);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for relatedType tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for relatedType tag ");
			}
		}
	}

}
