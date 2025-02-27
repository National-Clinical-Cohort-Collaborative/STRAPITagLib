package org.cd2h.STRAPITagLib.trainingsEugYouTubeVideosLinks;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.STRAPITagLibBodyTagSupport;
import org.cd2h.STRAPITagLib.trainings.Trainings;
import org.cd2h.STRAPITagLib.youTubeVideos.YouTubeVideos;

@SuppressWarnings("serial")
public class TrainingsEugYouTubeVideosLinksIterator extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int trainingId = 0;
    int youTubeVideoId = 0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(TrainingsEugYouTubeVideosLinksIterator.class);


    PreparedStatement stat = null;
    ResultSet rs = null;
    String fromList = null;
    String joinCriteria = null;
    String filterCriteria = null;
    String sortCriteria = null;
    int limitCriteria = 0;
    String var = null;
    int rsCount = 0;

   boolean useTrainings = false;
   boolean useYouTubeVideos = false;

	public static String trainingsEugYouTubeVideosLinksCountByTrainings(String ID) throws JspTagException {
		int count = 0;
		TrainingsEugYouTubeVideosLinksIterator theIterator = new TrainingsEugYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.trainings_eug_you_tube_videos_links where 1=1"
						+ " and training_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TrainingsEugYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean trainingsHasTrainingsEugYouTubeVideosLinks(String ID) throws JspTagException {
		return ! trainingsEugYouTubeVideosLinksCountByTrainings(ID).equals("0");
	}

	public static String trainingsEugYouTubeVideosLinksCountByYouTubeVideos(String ID) throws JspTagException {
		int count = 0;
		TrainingsEugYouTubeVideosLinksIterator theIterator = new TrainingsEugYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.trainings_eug_you_tube_videos_links where 1=1"
						+ " and you_tube_video_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TrainingsEugYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean youTubeVideosHasTrainingsEugYouTubeVideosLinks(String ID) throws JspTagException {
		return ! trainingsEugYouTubeVideosLinksCountByYouTubeVideos(ID).equals("0");
	}

	public static Boolean trainingsEugYouTubeVideosLinksExists (String ID) throws JspTagException {
		int count = 0;
		TrainingsEugYouTubeVideosLinksIterator theIterator = new TrainingsEugYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.trainings_eug_you_tube_videos_links where 1=1"
						+ " and id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TrainingsEugYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

	public static Boolean trainingsYouTubeVideosExists (String ID) throws JspTagException {
		int count = 0;
		TrainingsEugYouTubeVideosLinksIterator theIterator = new TrainingsEugYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.trainings_eug_you_tube_videos_links where 1=1"
						+ " and id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TrainingsEugYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

    public int doStartTag() throws JspException {
		Trainings theTrainings = (Trainings)findAncestorWithClass(this, Trainings.class);
		if (theTrainings!= null)
			parentEntities.addElement(theTrainings);
		YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
		if (theYouTubeVideos!= null)
			parentEntities.addElement(theYouTubeVideos);

		if (theTrainings == null) {
		} else {
			trainingId = theTrainings.getID();
		}
		if (theYouTubeVideos == null) {
		} else {
			youTubeVideoId = theYouTubeVideos.getID();
		}


      try {
            //run count query  
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT count(*) from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (trainingId == 0 ? "" : " and training_id = ?")
                                                        + (youTubeVideoId == 0 ? "" : " and you_tube_video_id = ?")
                                                        + generateLimitCriteria());
            if (trainingId != 0) stat.setInt(webapp_keySeq++, trainingId);
            if (youTubeVideoId != 0) stat.setInt(webapp_keySeq++, youTubeVideoId);
            rs = stat.executeQuery();

            if (rs.next()) {
                pageContext.setAttribute(var+"Total", rs.getInt(1));
            }


            //run select id query  
            webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT strapi.trainings_eug_you_tube_videos_links.id from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (trainingId == 0 ? "" : " and training_id = ?")
                                                        + (youTubeVideoId == 0 ? "" : " and you_tube_video_id = ?")
                                                        + " order by " + generateSortCriteria()  +  generateLimitCriteria());
            if (trainingId != 0) stat.setInt(webapp_keySeq++, trainingId);
            if (youTubeVideoId != 0) stat.setInt(webapp_keySeq++, youTubeVideoId);
            rs = stat.executeQuery();

            if ( rs != null && rs.next() ) {
                ID = rs.getInt(1);
                if (var != null) {
                    pageContext.setAttribute(var, this);
                    pageContext.setAttribute(var+"Count", ++rsCount);
                }
                return EVAL_BODY_INCLUDE;
            }
        } catch (SQLException e) {
            log.error("JDBC error generating TrainingsEugYouTubeVideosLinks iterator: " + stat, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator: " + stat);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating TrainingsEugYouTubeVideosLinks iterator: " + stat,e);
			}

        }

        return SKIP_BODY;
    }

    private String generateFromClause() {
       StringBuffer theBuffer = new StringBuffer("strapi.trainings_eug_you_tube_videos_links");
       if (useTrainings)
          theBuffer.append(", strapi.trainings");
       if (useYouTubeVideos)
          theBuffer.append(", strapi.you_tube_videos");

      return theBuffer.toString();
    }

    private String generateJoinCriteria() {
       StringBuffer theBuffer = new StringBuffer();
       if (useTrainings)
          theBuffer.append(" and strapi.trainings.id = strapi.trainings_eug_you_tube_videos_links.training_id");
       if (useYouTubeVideos)
          theBuffer.append(" and strapi.you_tube_videos.id = strapi.trainings_eug_you_tube_videos_links.you_tube_video_id");

      return theBuffer.toString();
    }

    private String generateFilterCriteria() {
        if (filterCriteria != null) {
            return " and " + filterCriteria;
        } else {
            return "";
        }
    }

    private String generateSortCriteria() {
        if (sortCriteria != null) {
            return sortCriteria;
        } else {
            return "id";
        }
    }

    private String generateLimitCriteria() {
        if (limitCriteria > 0) {
            return " limit " + limitCriteria;
        } else {
            return "";
        }
    }

    public int doAfterBody() throws JspException {
        try {
            if ( rs != null && rs.next() ) {
                ID = rs.getInt(1);
                pageContext.setAttribute(var+"Count", ++rsCount);
                return EVAL_BODY_AGAIN;
            }
        } catch (SQLException e) {
            log.error("JDBC error iterating across TrainingsEugYouTubeVideosLinks", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error iterating across TrainingsEugYouTubeVideosLinks" + stat.toString());
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error iterating across TrainingsEugYouTubeVideosLinks",e);
			}

        }
        return SKIP_BODY;
    }

    public int doEndTag() throws JspTagException, JspException {
        try {
			if( var != null )
				pageContext.removeAttribute(var);
			if( pageContext != null ){
				Boolean error = (Boolean) pageContext.getAttribute("tagError");
				if( error != null && error ){

					freeConnection();
					clearServiceState();

					Exception e = null; // (Exception) pageContext.getAttribute("tagErrorException");
					String message = null; // (String) pageContext.getAttribute("tagErrorMessage");

					if(pageContext != null){
						e = (Exception) pageContext.getAttribute("tagErrorException");
						message = (String) pageContext.getAttribute("tagErrorMessage");

					}
					Tag parent = getParent();
					if(parent != null){
						return parent.doEndTag();
					}else if(e != null && message != null){
						throw new JspException(message,e);
					}else if(parent == null && pageContext != null){
						pageContext.removeAttribute("tagError");
						pageContext.removeAttribute("tagErrorException");
						pageContext.removeAttribute("tagErrorMessage");
					}
				}
			}

            if( rs != null ){
                rs.close();
            }

            if( stat != null ){
                stat.close();
            }

        } catch ( SQLException e ) {
            log.error("JDBC error ending TrainingsEugYouTubeVideosLinks iterator",e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error ending TrainingsEugYouTubeVideosLinks iterator",e);
			}

        } finally {
            clearServiceState();
            freeConnection();
        }
        return super.doEndTag();
    }

    private void clearServiceState() {
        ID = 0;
        parentEntities = new Vector<STRAPITagLibTagSupport>();

        this.rs = null;
        this.stat = null;
        this.sortCriteria = null;
        this.var = null;
        this.rsCount = 0;
    }

    public String getFromList() {
        return fromList;
    }

    public void setFromList(String fromList) {
        this.fromList = fromList;
    }

    public String getJoinCriteria() {
        return joinCriteria;
    }

    public void setJoinCriteria(String joinCriteria) {
        this.joinCriteria = joinCriteria;
    }

    public String getFilterCriteria() {
        return filterCriteria;
    }

    public void setFilterCriteria(String filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public String getSortCriteria() {
        return sortCriteria;
    }

    public void setSortCriteria(String sortCriteria) {
        this.sortCriteria = sortCriteria;
    }

    public int getLimitCriteria() {
        return limitCriteria;
    }

    public void setLimitCriteria(int limitCriteria) {
        this.limitCriteria = limitCriteria;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public Boolean isFirst() throws SQLException {
        return rs.isFirst();
    }

    public Boolean isLast() throws SQLException {
        return rs.isLast();
    }


   public boolean getUseTrainings() {
        return useTrainings;
    }

    public void setUseTrainings(boolean useTrainings) {
        this.useTrainings = useTrainings;
    }

   public boolean getUseYouTubeVideos() {
        return useYouTubeVideos;
    }

    public void setUseYouTubeVideos(boolean useYouTubeVideos) {
        this.useYouTubeVideos = useYouTubeVideos;
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
