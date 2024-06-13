package org.cd2h.STRAPITagLib.textBlocks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import java.sql.Timestamp;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TextBlocksUpdatedAt extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TextBlocksUpdatedAt.class);

	public int doStartTag() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			if (!theTextBlocks.commitNeeded) {
				pageContext.getOut().print(theTextBlocks.getUpdatedAt());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for updatedAt tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for updatedAt tag ");
			}

		}
		return SKIP_BODY;
	}

	public Timestamp getUpdatedAt() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			return theTextBlocks.getUpdatedAt();
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for updatedAt tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for updatedAt tag ");
			}
		}
	}

	public void setUpdatedAt(Timestamp updatedAt) throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			theTextBlocks.setUpdatedAt(updatedAt);
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for updatedAt tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for updatedAt tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for updatedAt tag ");
			}
		}
	}

}
