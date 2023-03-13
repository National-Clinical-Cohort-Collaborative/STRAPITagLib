package org.cd2h.STRAPITagLib.durRequests;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class DurRequestsOverviewHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(DurRequestsOverviewHeader.class);

	public int doStartTag() throws JspException {
		try {
			DurRequests theDurRequests = (DurRequests)findAncestorWithClass(this, DurRequests.class);
			if (!theDurRequests.commitNeeded) {
				pageContext.getOut().print(theDurRequests.getOverviewHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DurRequests for overviewHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DurRequests for overviewHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DurRequests for overviewHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getOverviewHeader() throws JspException {
		try {
			DurRequests theDurRequests = (DurRequests)findAncestorWithClass(this, DurRequests.class);
			return theDurRequests.getOverviewHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing DurRequests for overviewHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DurRequests for overviewHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing DurRequests for overviewHeader tag ");
			}
		}
	}

	public void setOverviewHeader(String overviewHeader) throws JspException {
		try {
			DurRequests theDurRequests = (DurRequests)findAncestorWithClass(this, DurRequests.class);
			theDurRequests.setOverviewHeader(overviewHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing DurRequests for overviewHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing DurRequests for overviewHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing DurRequests for overviewHeader tag ");
			}
		}
	}

}
