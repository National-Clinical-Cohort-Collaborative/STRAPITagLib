package org.cd2h.STRAPITagLib.covidExtensionsFileLinkagesLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class CovidExtensionsFileLinkagesLinksCovidExtensionId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(CovidExtensionsFileLinkagesLinksCovidExtensionId.class);

	public int doStartTag() throws JspException {
		try {
			CovidExtensionsFileLinkagesLinks theCovidExtensionsFileLinkagesLinks = (CovidExtensionsFileLinkagesLinks)findAncestorWithClass(this, CovidExtensionsFileLinkagesLinks.class);
			if (!theCovidExtensionsFileLinkagesLinks.commitNeeded) {
				pageContext.getOut().print(theCovidExtensionsFileLinkagesLinks.getCovidExtensionId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getCovidExtensionId() throws JspException {
		try {
			CovidExtensionsFileLinkagesLinks theCovidExtensionsFileLinkagesLinks = (CovidExtensionsFileLinkagesLinks)findAncestorWithClass(this, CovidExtensionsFileLinkagesLinks.class);
			return theCovidExtensionsFileLinkagesLinks.getCovidExtensionId();
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
			}
		}
	}

	public void setCovidExtensionId(int covidExtensionId) throws JspException {
		try {
			CovidExtensionsFileLinkagesLinks theCovidExtensionsFileLinkagesLinks = (CovidExtensionsFileLinkagesLinks)findAncestorWithClass(this, CovidExtensionsFileLinkagesLinks.class);
			theCovidExtensionsFileLinkagesLinks.setCovidExtensionId(covidExtensionId);
		} catch (Exception e) {
			log.error("Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing CovidExtensionsFileLinkagesLinks for covidExtensionId tag ");
			}
		}
	}

}
