package org.cd2h.STRAPITagLib.workstreamInstancesBiosLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class WorkstreamInstancesBiosLinksBioOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(WorkstreamInstancesBiosLinksBioOrder.class);

	public int doStartTag() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			if (!theWorkstreamInstancesBiosLinks.commitNeeded) {
				pageContext.getOut().print(theWorkstreamInstancesBiosLinks.getBioOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getBioOrder() throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			return theWorkstreamInstancesBiosLinks.getBioOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
			}
		}
	}

	public void setBioOrder(double bioOrder) throws JspException {
		try {
			WorkstreamInstancesBiosLinks theWorkstreamInstancesBiosLinks = (WorkstreamInstancesBiosLinks)findAncestorWithClass(this, WorkstreamInstancesBiosLinks.class);
			theWorkstreamInstancesBiosLinks.setBioOrder(bioOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing WorkstreamInstancesBiosLinks for bioOrder tag ");
			}
		}
	}

}
