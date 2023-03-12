package org.cd2h.STRAPITagLib.pprlsFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PprlsFaqsLinksPprlId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PprlsFaqsLinksPprlId.class);

	public int doStartTag() throws JspException {
		try {
			PprlsFaqsLinks thePprlsFaqsLinks = (PprlsFaqsLinks)findAncestorWithClass(this, PprlsFaqsLinks.class);
			if (!thePprlsFaqsLinks.commitNeeded) {
				pageContext.getOut().print(thePprlsFaqsLinks.getPprlId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PprlsFaqsLinks for pprlId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPprlId() throws JspException {
		try {
			PprlsFaqsLinks thePprlsFaqsLinks = (PprlsFaqsLinks)findAncestorWithClass(this, PprlsFaqsLinks.class);
			return thePprlsFaqsLinks.getPprlId();
		} catch (Exception e) {
			log.error("Can't find enclosing PprlsFaqsLinks for pprlId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
			}
		}
	}

	public void setPprlId(int pprlId) throws JspException {
		try {
			PprlsFaqsLinks thePprlsFaqsLinks = (PprlsFaqsLinks)findAncestorWithClass(this, PprlsFaqsLinks.class);
			thePprlsFaqsLinks.setPprlId(pprlId);
		} catch (Exception e) {
			log.error("Can't find enclosing PprlsFaqsLinks for pprlId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PprlsFaqsLinks for pprlId tag ");
			}
		}
	}

}
