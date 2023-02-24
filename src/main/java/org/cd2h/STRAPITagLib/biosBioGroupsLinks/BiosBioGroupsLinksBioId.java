package org.cd2h.STRAPITagLib.biosBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosBioGroupsLinksBioId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosBioGroupsLinksBioId.class);

	public int doStartTag() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			if (!theBiosBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theBiosBioGroupsLinks.getBioId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getBioId() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			return theBiosBioGroupsLinks.getBioId();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
			}
		}
	}

	public void setBioId(int bioId) throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			theBiosBioGroupsLinks.setBioId(bioId);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioId tag ");
			}
		}
	}

}
