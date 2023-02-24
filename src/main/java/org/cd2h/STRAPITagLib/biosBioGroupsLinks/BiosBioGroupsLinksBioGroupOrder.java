package org.cd2h.STRAPITagLib.biosBioGroupsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosBioGroupsLinksBioGroupOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosBioGroupsLinksBioGroupOrder.class);

	public int doStartTag() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			if (!theBiosBioGroupsLinks.commitNeeded) {
				pageContext.getOut().print(theBiosBioGroupsLinks.getBioGroupOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioGroupOrder() throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			return theBiosBioGroupsLinks.getBioGroupOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
			}
		}
	}

	public void setBioGroupOrder(double bioGroupOrder) throws JspException {
		try {
			BiosBioGroupsLinks theBiosBioGroupsLinks = (BiosBioGroupsLinks)findAncestorWithClass(this, BiosBioGroupsLinks.class);
			theBiosBioGroupsLinks.setBioGroupOrder(bioGroupOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosBioGroupsLinks for bioGroupOrder tag ");
			}
		}
	}

}
