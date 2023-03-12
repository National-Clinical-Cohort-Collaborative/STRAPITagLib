package org.cd2h.STRAPITagLib.pprls;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PprlsParticipationHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PprlsParticipationHeader.class);

	public int doStartTag() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			if (!thePprls.commitNeeded) {
				pageContext.getOut().print(thePprls.getParticipationHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationHeader tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationHeader tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getParticipationHeader() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			return thePprls.getParticipationHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationHeader tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationHeader tag ");
			}
		}
	}

	public void setParticipationHeader(String participationHeader) throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			thePprls.setParticipationHeader(participationHeader);
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationHeader tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationHeader tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationHeader tag ");
			}
		}
	}

}
