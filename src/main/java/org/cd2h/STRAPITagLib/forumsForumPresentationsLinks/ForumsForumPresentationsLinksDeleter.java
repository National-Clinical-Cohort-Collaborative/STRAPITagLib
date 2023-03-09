package org.cd2h.STRAPITagLib.forumsForumPresentationsLinks;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.STRAPITagLibBodyTagSupport;
import org.cd2h.STRAPITagLib.forumPresentations.ForumPresentations;
import org.cd2h.STRAPITagLib.forums.Forums;

@SuppressWarnings("serial")
public class ForumsForumPresentationsLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int forumId = 0;
    int forumPresentationId = 0;
    double forumPresentationOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(ForumsForumPresentationsLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		ForumPresentations theForumPresentations = (ForumPresentations)findAncestorWithClass(this, ForumPresentations.class);
		if (theForumPresentations!= null)
			parentEntities.addElement(theForumPresentations);
		Forums theForums = (Forums)findAncestorWithClass(this, Forums.class);
		if (theForums!= null)
			parentEntities.addElement(theForums);

		if (theForumPresentations == null) {
		} else {
			forumPresentationId = theForumPresentations.getID();
		}
		if (theForums == null) {
		} else {
			forumId = theForums.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.forums_forum_presentations_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (forumPresentationId == 0 ? "" : " and forum_presentation_id = ? ")
                                                        + (forumId == 0 ? "" : " and forum_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (forumPresentationId != 0) stat.setInt(webapp_keySeq++, forumPresentationId);
			if (forumId != 0) stat.setInt(webapp_keySeq++, forumId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating ForumsForumPresentationsLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating ForumsForumPresentationsLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating ForumsForumPresentationsLinks deleter",e);
			}

        } finally {
            freeConnection();
        }

        return SKIP_BODY;
    }

	public int doEndTag() throws JspException {

		clearServiceState();
		Boolean error = (Boolean) pageContext.getAttribute("tagError");
		if(error != null && error){

			freeConnection();

			Exception e = (Exception) pageContext.getAttribute("tagErrorException");
			String message = (String) pageContext.getAttribute("tagErrorMessage");

			Tag parent = getParent();
			if(parent != null){
				return parent.doEndTag();
			}else if(e != null && message != null){
				throw new JspException(message,e);
			}else if(parent == null){
				pageContext.removeAttribute("tagError");
				pageContext.removeAttribute("tagErrorException");
				pageContext.removeAttribute("tagErrorMessage");
			}
		}
		return super.doEndTag();
	}

    private void clearServiceState() {
        ID = 0;
        parentEntities = new Vector<STRAPITagLibTagSupport>();

        this.rs = null;
        this.var = null;
        this.rsCount = 0;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }



	public int getID () {
		return ID;
	}

	public void setID (int ID) {
		this.ID = ID;
	}

	public int getActualID () {
		return ID;
	}
}
