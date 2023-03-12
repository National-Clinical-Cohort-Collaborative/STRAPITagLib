package org.cd2h.STRAPITagLib.pprls;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PprlsParticipationBlock5 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PprlsParticipationBlock5.class);

	public int doStartTag() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			if (!thePprls.commitNeeded) {
				pageContext.getOut().print(thePprls.getParticipationBlock5());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationBlock5 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationBlock5 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationBlock5 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getParticipationBlock5() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			return thePprls.getParticipationBlock5();
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationBlock5 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationBlock5 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationBlock5 tag ");
			}
		}
	}

	public void setParticipationBlock5(String participationBlock5) throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			thePprls.setParticipationBlock5(participationBlock5);
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for participationBlock5 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for participationBlock5 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for participationBlock5 tag ");
			}
		}
	}

}
