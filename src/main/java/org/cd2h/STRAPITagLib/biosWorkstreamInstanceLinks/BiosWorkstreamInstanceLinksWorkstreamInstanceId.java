package org.cd2h.STRAPITagLib.biosWorkstreamInstanceLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class BiosWorkstreamInstanceLinksWorkstreamInstanceId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(BiosWorkstreamInstanceLinksWorkstreamInstanceId.class);

	public int doStartTag() throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			if (!theBiosWorkstreamInstanceLinks.commitNeeded) {
				pageContext.getOut().print(theBiosWorkstreamInstanceLinks.getWorkstreamInstanceId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getWorkstreamInstanceId() throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			return theBiosWorkstreamInstanceLinks.getWorkstreamInstanceId();
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}
		}
	}

	public void setWorkstreamInstanceId(int workstreamInstanceId) throws JspException {
		try {
			BiosWorkstreamInstanceLinks theBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks)findAncestorWithClass(this, BiosWorkstreamInstanceLinks.class);
			theBiosWorkstreamInstanceLinks.setWorkstreamInstanceId(workstreamInstanceId);
		} catch (Exception e) {
			log.error("Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing BiosWorkstreamInstanceLinks for workstreamInstanceId tag ");
			}
		}
	}

}
