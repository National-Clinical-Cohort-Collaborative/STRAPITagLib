package org.cd2h.STRAPITagLib.calendars;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CalendarsHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CalendarsHeader.class);

	public int doStartTag() throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			if (!theCalendars.commitNeeded) {
				pageContext.getOut().print(theCalendars.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			return theCalendars.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			theCalendars.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for header tag ");
			}
		}
	}

}
