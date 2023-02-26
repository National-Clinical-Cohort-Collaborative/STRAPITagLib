package org.cd2h.STRAPITagLib.phastrsPublicHealthQuestionsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class PhastrsPublicHealthQuestionsLinksPhastrId extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(PhastrsPublicHealthQuestionsLinksPhastrId.class);

	public int doStartTag() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			if (!thePhastrsPublicHealthQuestionsLinks.commitNeeded) {
				pageContext.getOut().print(thePhastrsPublicHealthQuestionsLinks.getPhastrId());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
			}

		}
		return SKIP_BODY;
	}

	public int getPhastrId() throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			return thePhastrsPublicHealthQuestionsLinks.getPhastrId();
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
				parent.doEndTag();
				return 0;
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
			}
		}
	}

	public void setPhastrId(int phastrId) throws JspException {
		try {
			PhastrsPublicHealthQuestionsLinks thePhastrsPublicHealthQuestionsLinks = (PhastrsPublicHealthQuestionsLinks)findAncestorWithClass(this, PhastrsPublicHealthQuestionsLinks.class);
			thePhastrsPublicHealthQuestionsLinks.setPhastrId(phastrId);
		} catch (Exception e) {
			log.error("Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing PhastrsPublicHealthQuestionsLinks for phastrId tag ");
			}
		}
	}

}
