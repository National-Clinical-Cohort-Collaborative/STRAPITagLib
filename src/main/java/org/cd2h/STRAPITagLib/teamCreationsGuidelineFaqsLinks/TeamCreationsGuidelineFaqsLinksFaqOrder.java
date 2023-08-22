package org.cd2h.STRAPITagLib.teamCreationsGuidelineFaqsLinks;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;

@SuppressWarnings("serial")
public class TeamCreationsGuidelineFaqsLinksFaqOrder extends STRAPITagLibTagSupport {

	private static final Logger log = LogManager.getLogger(TeamCreationsGuidelineFaqsLinksFaqOrder.class);

	public int doStartTag() throws JspException {
		try {
			TeamCreationsGuidelineFaqsLinks theTeamCreationsGuidelineFaqsLinks = (TeamCreationsGuidelineFaqsLinks)findAncestorWithClass(this, TeamCreationsGuidelineFaqsLinks.class);
			if (!theTeamCreationsGuidelineFaqsLinks.commitNeeded) {
				pageContext.getOut().print(theTeamCreationsGuidelineFaqsLinks.getFaqOrder());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
			}

		}
		return SKIP_BODY;
	}

	public double getFaqOrder() throws JspException {
		try {
			TeamCreationsGuidelineFaqsLinks theTeamCreationsGuidelineFaqsLinks = (TeamCreationsGuidelineFaqsLinks)findAncestorWithClass(this, TeamCreationsGuidelineFaqsLinks.class);
			return theTeamCreationsGuidelineFaqsLinks.getFaqOrder();
		} catch (Exception e) {
			log.error("Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
				parent.doEndTag();
				return 0.0;
			}else{
				throw new JspTagException("Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
			}
		}
	}

	public void setFaqOrder(double faqOrder) throws JspException {
		try {
			TeamCreationsGuidelineFaqsLinks theTeamCreationsGuidelineFaqsLinks = (TeamCreationsGuidelineFaqsLinks)findAncestorWithClass(this, TeamCreationsGuidelineFaqsLinks.class);
			theTeamCreationsGuidelineFaqsLinks.setFaqOrder(faqOrder);
		} catch (Exception e) {
			log.error("Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ", e);
			freeConnection();
			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
				parent.doEndTag();
			}else{
				throw new JspTagException("Error: Can't find enclosing TeamCreationsGuidelineFaqsLinks for faqOrder tag ");
			}
		}
	}

}
