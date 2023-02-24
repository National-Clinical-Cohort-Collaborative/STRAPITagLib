package org.cd2h.STRAPITagLib.biosBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosBioGroupsLinksBioOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosBioGroupsLinksBioOrder.class);

	public int doStartTag() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			if (!theBiosBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theBiosBioGroupsLinks.getBioOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioOrder() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			return theBiosBioGroupsLinks.getBioOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
			}
		}
	}

	public void setBioOrder(double bioOrder) throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			theBiosBioGroupsLinks.setBioOrder(bioOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioOrder tag ");
			}
		}
	}

}
