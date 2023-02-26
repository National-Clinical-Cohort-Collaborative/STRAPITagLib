package org.cd2h.STRAPITagLib.publicHealthQuestions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PublicHealthQuestionsCloseDate extends STRAPITagLibTagSupport {

	String type = "DATE";
	String dateStyle = "DEFAULT";
	String timeStyle = "DEFAULT";
	String pattern = null;
	private static final Logger log = LogManager.getLogger(PublicHealthQuestionsCloseDate.class);

	public int doStartTag() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			if (!thePublicHealthQuestions.commitNeeded) {
				String resultString = null;
				if (thePublicHealthQuestions.getCloseDate() == null) {
					resultString = "";
				} else {
					if (pattern != null) {
						resultString = (new SimpleDateFormat(pattern)).format(thePublicHealthQuestions.getCloseDate());
					} else if (type.equals("BOTH")) {
						resultString = DateFormat.getDateTimeInstance(formatConvert(dateStyle),formatConvert(timeStyle)).format(thePublicHealthQuestions.getCloseDate());
					} else if (type.equals("TIME")) {
						resultString = DateFormat.getTimeInstance(formatConvert(timeStyle)).format(thePublicHealthQuestions.getCloseDate());
					} else { // date
						resultString = DateFormat.getDateInstance(formatConvert(dateStyle)).format(thePublicHealthQuestions.getCloseDate());
					}
				}
				pageContext.getOut().print(resultString);
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for closeDate tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
			}

		}
		return SKIP_BODY;
	}

	public Date getCloseDate() throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			return thePublicHealthQuestions.getCloseDate();
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for closeDate tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
			}
		}
	}

	public void setCloseDate(Date closeDate) throws JspException {
		try {
			PublicHealthQuestions thePublicHealthQuestions = (PublicHealthQuestions)findAncestorWithClass(this, PublicHealthQuestions.class);
			thePublicHealthQuestions.setCloseDate(closeDate);
		} catch (Exception e) {
			log.error("Can't find enclosing PublicHealthQuestions for closeDate tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PublicHealthQuestions for closeDate tag ");
			}
		}
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type.toUpperCase();
	}

	public String getDateStyle() {
		return dateStyle;
	}

	public void setDateStyle(String dateStyle) {
		this.dateStyle = dateStyle.toUpperCase();
	}

	public String getTimeStyle() {
		return timeStyle;
	}

	public void setTimeStyle(String timeStyle) {
		this.timeStyle = timeStyle.toUpperCase();
	}

	public static int formatConvert(String stringValue) {
		if (stringValue.equals("SHORT"))
			return DateFormat.SHORT;
		if (stringValue.equals("MEDIUM"))
			return DateFormat.MEDIUM;
		if (stringValue.equals("LONG"))
			return DateFormat.LONG;
		if (stringValue.equals("FULL"))
			return DateFormat.FULL;
		return DateFormat.DEFAULT;
	}

}
