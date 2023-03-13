package org.cd2h.STRAPITagLib.acknowledgements;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AcknowledgementsHeader extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AcknowledgementsHeader.class);

	public int doStartTag() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			if (!theAcknowledgements.commitNeeded) {
				pageContext.getOut().print(theAcknowledgements.getHeader());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for header tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for header tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getHeader() throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			return theAcknowledgements.getHeader();
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for header tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for header tag ");
			}
		}
	}

	public void setHeader(String header) throws JspException {
		try {
			Acknowledgements theAcknowledgements = (Acknowledgements)findAncestorWithClass(this, Acknowledgements.class);
			theAcknowledgements.setHeader(header);
		} catch (Exception e) {
			log.error("Can't find enclosing Acknowledgements for header tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Acknowledgements for header tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Acknowledgements for header tag ");
			}
		}
	}

}
