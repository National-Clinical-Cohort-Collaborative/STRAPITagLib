package org.cd2h.STRAPITagLib.faqsWorkstreamInstanceLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class FaqsWorkstreamInstanceLinksWorkstreamInstanceId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(FaqsWorkstreamInstanceLinksWorkstreamInstanceId.class);

	public int doStartTag() throws JspException {
		try {
			FaqsWorkstreamInstanceLinks theFaqsWorkstreamInstanceLinks = (FaqsWorkstreamInstanceLinks)findAncestorWithClass(this, FaqsWorkstreamInstanceLinks.class);
			if (!theFaqsWorkstreamInstanceLinks.commitNeeded) {
				pageContext.getOut().print(theFaqsWorkstreamInstanceLinks.getWorkstreamInstanceId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamInstanceId() throws JspException {
		try {
			FaqsWorkstreamInstanceLinks theFaqsWorkstreamInstanceLinks = (FaqsWorkstreamInstanceLinks)findAncestorWithClass(this, FaqsWorkstreamInstanceLinks.class);
			return theFaqsWorkstreamInstanceLinks.getWorkstreamInstanceId();
		} catch (Exception e) {
			log.error("Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}
		}
	}

	public void setWorkstreamInstanceId(int workstreamInstanceId) throws JspException {
		try {
			FaqsWorkstreamInstanceLinks theFaqsWorkstreamInstanceLinks = (FaqsWorkstreamInstanceLinks)findAncestorWithClass(this, FaqsWorkstreamInstanceLinks.class);
			theFaqsWorkstreamInstanceLinks.setWorkstreamInstanceId(workstreamInstanceId);
		} catch (Exception e) {
			log.error("Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing FaqsWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}
		}
	}

}
