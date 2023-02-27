package org.cd2h.STRAPITagLib.presentationsYouTubeVideosLinks;


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
import org.cd2h.STRAPITagLib.presentations.Presentations;
import org.cd2h.STRAPITagLib.youTubeVideos.YouTubeVideos;

@SuppressWarnings("serial")
public class PresentationsYouTubeVideosLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int presentationId = 0;
    int youTubeVideoId = 0;
    double youTubeVideoOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(PresentationsYouTubeVideosLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		Presentations thePresentations = (Presentations)findAncestorWithClass(this, Presentations.class);
		if (thePresentations!= null)
			parentEntities.addElement(thePresentations);
		YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
		if (theYouTubeVideos!= null)
			parentEntities.addElement(theYouTubeVideos);

		if (thePresentations == null) {
		} else {
			presentationId = thePresentations.getID();
		}
		if (theYouTubeVideos == null) {
		} else {
			youTubeVideoId = theYouTubeVideos.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.presentations_you_tube_videos_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (presentationId == 0 ? "" : " and presentation_id = ? ")
                                                        + (youTubeVideoId == 0 ? "" : " and you_tube_video_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (presentationId != 0) stat.setInt(webapp_keySeq++, presentationId);
			if (youTubeVideoId != 0) stat.setInt(webapp_keySeq++, youTubeVideoId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating PresentationsYouTubeVideosLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating PresentationsYouTubeVideosLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating PresentationsYouTubeVideosLinks deleter",e);
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
