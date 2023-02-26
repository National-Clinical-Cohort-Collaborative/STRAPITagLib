package org.cd2h.STRAPITagLib.phastrsFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsFaqsLinksPhastrId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsFaqsLinksPhastrId.class);

	public int doStartTag() throws JspException {
		try {
			PhastrsFaqsLinks thePhastrsFaqsLinks = (PhastrsFaqsLinks)findAncestorWithClass(this, PhastrsFaqsLinks.class);
			if (!thePhastrsFaqsLinks.commitNeeded) {
				pageContext.getOut().print(thePhastrsFaqsLinks.getPhastrId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsFaqsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPhastrId() throws JspException {
		try {
			PhastrsFaqsLinks thePhastrsFaqsLinks = (PhastrsFaqsLinks)findAncestorWithClass(this, PhastrsFaqsLinks.class);
			return thePhastrsFaqsLinks.getPhastrId();
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsFaqsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
			}
		}
	}

	public void setPhastrId(int phastrId) throws JspException {
		try {
			PhastrsFaqsLinks thePhastrsFaqsLinks = (PhastrsFaqsLinks)findAncestorWithClass(this, PhastrsFaqsLinks.class);
			thePhastrsFaqsLinks.setPhastrId(phastrId);
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsFaqsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsFaqsLinks for phastrId tag ");
			}
		}
	}

}
