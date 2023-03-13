package org.cd2h.STRAPITagLib.acknowledgements;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AcknowledgementsBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AcknowledgementsBlock.class);

	public int doStartTag() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			if (!theAcknowledgements.commitNeeded) {
				pageContext.getOut().print(theAcknowledgements.getBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for block tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for block tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			return theAcknowledgements.getBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for block tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for block tag ");
			}
		}
	}

	public void setBlock(String block) throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			theAcknowledgements.setBlock(block);
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for block tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for block tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for block tag ");
			}
		}
	}

}
