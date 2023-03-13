package org.cd2h.STRAPITagLib.acknowledgements;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AcknowledgementsID extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AcknowledgementsID.class);

	public int doStartTag() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			if (!theAcknowledgements.commitNeeded) {
				pageContext.getOut().print(theAcknowledgements.getID());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for ID tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for ID tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getID() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			return theAcknowledgements.getID();
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for ID tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for ID tag ");
			}
		}
	}

	public void setID(int ID) throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			theAcknowledgements.setID(ID);
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for ID tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for ID tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for ID tag ");
			}
		}
	}

}
