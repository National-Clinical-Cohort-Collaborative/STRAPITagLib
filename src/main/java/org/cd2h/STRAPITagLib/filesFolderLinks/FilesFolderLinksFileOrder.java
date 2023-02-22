package org.cd2h.STRAPITagLib.filesFolderLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FilesFolderLinksFileOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FilesFolderLinksFileOrder.class);

	public int doStartTag() throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			if (!theFilesFolderLinks.commitNeeded) {
				pageContext.getOut().print(theFilesFolderLinks.getFileOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFileOrder() throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			return theFilesFolderLinks.getFileOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
			}
		}
	}

	public void setFileOrder(double fileOrder) throws JspException {
		try {
			FilesFolderLinks theFilesFolderLinks = (FilesFolderLinks)findAncestorWithClass(this, FilesFolderLinks.class);
			theFilesFolderLinks.setFileOrder(fileOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing FilesFolderLinks for fileOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FilesFolderLinks for fileOrder tag ");
			}
		}
	}

}
