package org.cd2h.STRAPITagLib.biosBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosBioGroupsLinksBioGroupId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosBioGroupsLinksBioGroupId.class);

	public int doStartTag() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			if (!theBiosBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theBiosBioGroupsLinks.getBioGroupId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getBioGroupId() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			return theBiosBioGroupsLinks.getBioGroupId();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
			}
		}
	}

	public void setBioGroupId(int bioGroupId) throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			theBiosBioGroupsLinks.setBioGroupId(bioGroupId);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupId tag ");
			}
		}
	}

}
