package org.cd2h.STRAPITagLib.filesRelatedMorphs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesRelatedMorphsField extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesRelatedMorphsField.class);

	public int doStartTag() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			if (!theFilesRelatedMorphs.commitNeeded) {
				pageContext.getOut().print(theFilesRelatedMorphs.getField());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for field tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for field tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for field tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getField() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			return theFilesRelatedMorphs.getField();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for field tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for field tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for field tag ");
			}
		}
	}

	public void setField(String field) throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			theFilesRelatedMorphs.setField(field);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for field tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for field tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for field tag ");
			}
		}
	}

}
