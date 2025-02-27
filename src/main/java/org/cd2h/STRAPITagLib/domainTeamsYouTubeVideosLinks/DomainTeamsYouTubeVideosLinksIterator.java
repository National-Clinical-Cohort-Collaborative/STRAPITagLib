package org.cd2h.STRAPITagLib.domainTeamsYouTubeVideosLinks;


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
import org.cd2h.STRAPITagLib.domainTeams.DomainTeams;
import org.cd2h.STRAPITagLib.youTubeVideos.YouTubeVideos;

@SuppressWarnings("serial")
public class DomainTeamsYouTubeVideosLinksIterator extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int domainTeamId = 0;
    int youTubeVideoId = 0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(DomainTeamsYouTubeVideosLinksIterator.class);


    PreparedStatement stat = null;
    ResultSet rs = null;
    String fromList = null;
    String joinCriteria = null;
    String filterCriteria = null;
    String sortCriteria = null;
    int limitCriteria = 0;
    String var = null;
    int rsCount = 0;

   boolean useDomainTeams = false;
   boolean useYouTubeVideos = false;

	public static String domainTeamsYouTubeVideosLinksCountByDomainTeams(String ID) throws JspTagException {
		int count = 0;
		DomainTeamsYouTubeVideosLinksIterator theIterator = new DomainTeamsYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.domain_teams_you_tube_videos_links where 1=1"
						+ " and domain_team_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating DomainTeamsYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean domainTeamsHasDomainTeamsYouTubeVideosLinks(String ID) throws JspTagException {
		return ! domainTeamsYouTubeVideosLinksCountByDomainTeams(ID).equals("0");
	}

	public static String domainTeamsYouTubeVideosLinksCountByYouTubeVideos(String ID) throws JspTagException {
		int count = 0;
		DomainTeamsYouTubeVideosLinksIterator theIterator = new DomainTeamsYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.domain_teams_you_tube_videos_links where 1=1"
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
			log.error("JDBC error generating DomainTeamsYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean youTubeVideosHasDomainTeamsYouTubeVideosLinks(String ID) throws JspTagException {
		return ! domainTeamsYouTubeVideosLinksCountByYouTubeVideos(ID).equals("0");
	}

	public static Boolean domainTeamsYouTubeVideosLinksExists (String ID) throws JspTagException {
		int count = 0;
		DomainTeamsYouTubeVideosLinksIterator theIterator = new DomainTeamsYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.domain_teams_you_tube_videos_links where 1=1"
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
			log.error("JDBC error generating DomainTeamsYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

	public static Boolean domainTeamsYouTubeVideosExists (String ID) throws JspTagException {
		int count = 0;
		DomainTeamsYouTubeVideosLinksIterator theIterator = new DomainTeamsYouTubeVideosLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.domain_teams_you_tube_videos_links where 1=1"
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
			log.error("JDBC error generating DomainTeamsYouTubeVideosLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

    public int doStartTag() throws JspException {
		DomainTeams theDomainTeams = (DomainTeams)findAncestorWithClass(this, DomainTeams.class);
		if (theDomainTeams!= null)
			parentEntities.addElement(theDomainTeams);
		YouTubeVideos theYouTubeVideos = (YouTubeVideos)findAncestorWithClass(this, YouTubeVideos.class);
		if (theYouTubeVideos!= null)
			parentEntities.addElement(theYouTubeVideos);

		if (theDomainTeams == null) {
		} else {
			domainTeamId = theDomainTeams.getID();
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
                                                        + (domainTeamId == 0 ? "" : " and domain_team_id = ?")
                                                        + (youTubeVideoId == 0 ? "" : " and you_tube_video_id = ?")
                                                        + generateLimitCriteria());
            if (domainTeamId != 0) stat.setInt(webapp_keySeq++, domainTeamId);
            if (youTubeVideoId != 0) stat.setInt(webapp_keySeq++, youTubeVideoId);
            rs = stat.executeQuery();

            if (rs.next()) {
                pageContext.setAttribute(var+"Total", rs.getInt(1));
            }


            //run select id query  
            webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT strapi.domain_teams_you_tube_videos_links.id from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (domainTeamId == 0 ? "" : " and domain_team_id = ?")
                                                        + (youTubeVideoId == 0 ? "" : " and you_tube_video_id = ?")
                                                        + " order by " + generateSortCriteria()  +  generateLimitCriteria());
            if (domainTeamId != 0) stat.setInt(webapp_keySeq++, domainTeamId);
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
            log.error("JDBC error generating DomainTeamsYouTubeVideosLinks iterator: " + stat, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator: " + stat);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating DomainTeamsYouTubeVideosLinks iterator: " + stat,e);
			}

        }

        return SKIP_BODY;
    }

    private String generateFromClause() {
       StringBuffer theBuffer = new StringBuffer("strapi.domain_teams_you_tube_videos_links");
       if (useDomainTeams)
          theBuffer.append(", strapi.domain_teams");
       if (useYouTubeVideos)
          theBuffer.append(", strapi.you_tube_videos");

      return theBuffer.toString();
    }

    private String generateJoinCriteria() {
       StringBuffer theBuffer = new StringBuffer();
       if (useDomainTeams)
          theBuffer.append(" and strapi.domain_teams.id = strapi.domain_teams_you_tube_videos_links.domain_team_id");
       if (useYouTubeVideos)
          theBuffer.append(" and strapi.you_tube_videos.id = strapi.domain_teams_you_tube_videos_links.you_tube_video_id");

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
            log.error("JDBC error iterating across DomainTeamsYouTubeVideosLinks", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error iterating across DomainTeamsYouTubeVideosLinks" + stat.toString());
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error iterating across DomainTeamsYouTubeVideosLinks",e);
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
            log.error("JDBC error ending DomainTeamsYouTubeVideosLinks iterator",e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error ending DomainTeamsYouTubeVideosLinks iterator",e);
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


   public boolean getUseDomainTeams() {
        return useDomainTeams;
    }

    public void setUseDomainTeams(boolean useDomainTeams) {
        this.useDomainTeams = useDomainTeams;
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
