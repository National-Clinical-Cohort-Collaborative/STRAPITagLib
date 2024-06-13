package org.cd2h.STRAPITagLib.textBlocks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TextBlocksContent extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TextBlocksContent.class);

	public int doStartTag() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			if (!theTextBlocks.commitNeeded) {
				pageContext.getOut().print(theTextBlocks.getContent());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for content tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for content tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for content tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getContent() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			return theTextBlocks.getContent();
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for content tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for content tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for content tag ");
			}
		}
	}

	public void setContent(String content) throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			theTextBlocks.setContent(content);
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for content tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for content tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for content tag ");
			}
		}
	}

}
