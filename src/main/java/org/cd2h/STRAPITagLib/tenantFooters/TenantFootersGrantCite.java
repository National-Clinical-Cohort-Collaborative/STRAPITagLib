package org.cd2h.STRAPITagLib.tenantFooters;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TenantFootersGrantCite extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TenantFootersGrantCite.class);

	public int doStartTag() throws JspException {
		try {
			TenantFooters theTenantFooters = (TenantFooters)findAncestorWithClass(this, TenantFooters.class);
			if (!theTenantFooters.commitNeeded) {
				pageContext.getOut().print(theTenantFooters.getGrantCite());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TenantFooters for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantFooters for grantCite tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantFooters for grantCite tag ");
			}

		}
		return SKIP_BODY;
	}

	public String getGrantCite() throws JspException {
		try {
			TenantFooters theTenantFooters = (TenantFooters)findAncestorWithClass(this, TenantFooters.class);
			return theTenantFooters.getGrantCite();
		} catch (Exception e) {
			log.error("Can't find enclosing TenantFooters for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantFooters for grantCite tag ");
				parent.doEndTag();
				return null;
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantFooters for grantCite tag ");
			}
		}
	}

	public void setGrantCite(String grantCite) throws JspException {
		try {
			TenantFooters theTenantFooters = (TenantFooters)findAncestorWithClass(this, TenantFooters.class);
			theTenantFooters.setGrantCite(grantCite);
		} catch (Exception e) {
			log.error("Can't find enclosing TenantFooters for grantCite tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TenantFooters for grantCite tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TenantFooters for grantCite tag ");
			}
		}
	}

}
