package org.cd2h.STRAPITagLib.institutionalEssentialsNavTileLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class InstitutionalEssentialsNavTileLinksContentImageBlockLeftOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(InstitutionalEssentialsNavTileLinksContentImageBlockLeftOrder.class);

	public int doStartTag() throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			if (!theInstitutionalEssentialsNavTileLinks.commitNeeded) {
				pageContext.getOut().print(theInstitutionalEssentialsNavTileLinks.getContentImageBlockLeftOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getContentImageBlockLeftOrder() throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			return theInstitutionalEssentialsNavTileLinks.getContentImageBlockLeftOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
			}
		}
	}

	public void setContentImageBlockLeftOrder(double contentImageBlockLeftOrder) throws JspException {
		try {
			InstitutionalEssentialsNavTileLinks theInstitutionalEssentialsNavTileLinks = (InstitutionalEssentialsNavTileLinks)findAncestorWithClass(this, InstitutionalEssentialsNavTileLinks.class);
			theInstitutionalEssentialsNavTileLinks.setContentImageBlockLeftOrder(contentImageBlockLeftOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing InstitutionalEssentialsNavTileLinks for contentImageBlockLeftOrder tag ");
			}
		}
	}

}
