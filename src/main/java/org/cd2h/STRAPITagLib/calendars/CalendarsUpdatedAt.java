package org.cd2h.STRAPITagLib.calendars;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CalendarsUpdatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CalendarsUpdatedAt.class);

	public int doStartTag() throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			if (!theCalendars.commitNeeded) {
				pageContext.getOut().print(theCalendars.getUpdatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			return theCalendars.getUpdatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for updatedAt tag ");
			}
		}
	}

	public void setUpdatedAt(Timestamp updatedAt) throws JspException {
		try {
			Calendars theCalendars = (Calendars)findAncestorWithClass(this, Calendars.class);
			theCalendars.setUpdatedAt(updatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing Calendars for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Calendars for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Calendars for updatedAt tag ");
			}
		}
	}

}
