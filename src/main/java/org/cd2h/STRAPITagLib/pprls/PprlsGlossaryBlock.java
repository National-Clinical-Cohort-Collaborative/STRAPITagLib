package org.cd2h.STRAPITagLib.pprls;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PprlsGlossaryBlock extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PprlsGlossaryBlock.class);

	public int doStartTag() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			if (!thePprls.commitNeeded) {
				pageContext.getOut().print(thePprls.getGlossaryBlock());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for glossaryBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for glossaryBlock tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for glossaryBlock tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getGlossaryBlock() throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			return thePprls.getGlossaryBlock();
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for glossaryBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for glossaryBlock tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for glossaryBlock tag ");
			}
		}
	}

	public void setGlossaryBlock(String glossaryBlock) throws JspException {
		try {
			Pprls thePprls = (Pprls)findAncestorWithClass(this, Pprls.class);
			thePprls.setGlossaryBlock(glossaryBlock);
		} catch (Exception e) {
			log.error("Can't find enclosing Pprls for glossaryBlock tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing Pprls for glossaryBlock tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing Pprls for glossaryBlock tag ");
			}
		}
	}

}
