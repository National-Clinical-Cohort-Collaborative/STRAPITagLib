package org.cd2h.STRAPITagLib.liaisons;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class LiaisonsBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(LiaisonsBlock.class);

	public int doStartTag() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			if (!theLiaisons.commitNeeded) {
				pageContext.getOut().print(theLiaisons.getBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for block tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for block tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock() throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			return theLiaisons.getBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for block tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for block tag ");
			}
		}
	}

	public void setBlock(String block) throws JspException {
		try {
			Liaisons theLiaisons = (Liaisons)findAncestorWithClass(this, Liaisons.class);
			theLiaisons.setBlock(block);
		} catch (Exception e) {
			log.error("Can't find enclosing Liaisons for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Liaisons for block tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Liaisons for block tag ");
			}
		}
	}

}
