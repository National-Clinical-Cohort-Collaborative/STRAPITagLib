package org.cd2h.STRAPITagLib.filesRelatedMorphs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesRelatedMorphsOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesRelatedMorphsOrder.class);

	public int doStartTag() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			if (!theFilesRelatedMorphs.commitNeeded) {
				pageContext.getOut().print(theFilesRelatedMorphs.getOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for order tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for order tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for order tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getOrder() throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			return theFilesRelatedMorphs.getOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for order tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for order tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for order tag ");
			}
		}
	}

	public void setOrder(double order) throws JspException {
		try {
			FilesRelatedMorphs theFilesRelatedMorphs = (FilesRelatedMorphs)findAncestorWithClass(this, FilesRelatedMorphs.class);
			theFilesRelatedMorphs.setOrder(order);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesRelatedMorphs for order tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesRelatedMorphs for order tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesRelatedMorphs for order tag ");
			}
		}
	}

}
