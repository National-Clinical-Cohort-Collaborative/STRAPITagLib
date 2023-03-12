package org.cd2h.STRAPITagLib.biosWorkstreamInstanceLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosWorkstreamInstanceLinksBioOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosWorkstreamInstanceLinksBioOrder.class);

	public int doStartTag() throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			if (!theBiosWorkstreamInstanceLinks.commitNeeded) {
				pageContext.getOut().print(theBiosWorkstreamInstanceLinks.getBioOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioOrder() throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			return theBiosWorkstreamInstanceLinks.getBioOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
			}
		}
	}

	public void setBioOrder(double bioOrder) throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			theBiosWorkstreamInstanceLinks.setBioOrder(bioOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for bioOrder tag ");
			}
		}
	}

}
