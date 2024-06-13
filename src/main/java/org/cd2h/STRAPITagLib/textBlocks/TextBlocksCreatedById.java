package org.cd2h.STRAPITagLib.textBlocks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TextBlocksCreatedById extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TextBlocksCreatedById.class);

	public int doStartTag() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			if (!theTextBlocks.commitNeeded) {
				pageContext.getOut().print(theTextBlocks.getCreatedById());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for createdById tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for createdById tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCreatedById() throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			return theTextBlocks.getCreatedById();
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for createdById tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for createdById tag ");
			}
		}
	}

	public void setCreatedById(int createdById) throws JspException {
		try {
			TextBlocks theTextBlocks = (TextBlocks)findAncestorWithClass(this, TextBlocks.class);
			theTextBlocks.setCreatedById(createdById);
		} catch (Exception e) {
			log.error("Can't find enclosing TextBlocks for createdById tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TextBlocks for createdById tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TextBlocks for createdById tag ");
			}
		}
	}

}
