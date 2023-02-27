package org.cd2h.STRAPITagLib.abouts;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class AboutsBlock4 extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(AboutsBlock4.class);

	public int doStartTag() throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			if (!theAbouts.commitNeeded) {
				pageContext.getOut().print(theAbouts.getBlock4());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Abouts for block4 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Abouts for block4 tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for block4 tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getBlock4() throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			return theAbouts.getBlock4();
		} catch (Exception e) {
			log.error("Can't find enclosing Abouts for block4 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Abouts for block4 tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for block4 tag ");
			}
		}
	}

	public void setBlock4(String block4) throws JspException {
		try {
			Abouts theAbouts = (Abouts)findAncestorWithClass(this, Abouts.class);
			theAbouts.setBlock4(block4);
		} catch (Exception e) {
			log.error("Can't find enclosing Abouts for block4 tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Abouts for block4 tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Abouts for block4 tag ");
			}
		}
	}

}
