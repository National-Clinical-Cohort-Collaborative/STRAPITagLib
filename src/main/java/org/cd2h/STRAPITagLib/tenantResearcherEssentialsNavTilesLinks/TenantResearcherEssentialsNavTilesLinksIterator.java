package org.cd2h.STRAPITagLib.tenantResearcherEssentialsNavTilesLinks;


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
import org.cd2h.STRAPITagLib.navTiles.NavTiles;
import org.cd2h.STRAPITagLib.tenantResearcherEssentials.TenantResearcherEssentials;

@SuppressWarnings("serial")
public class TenantResearcherEssentialsNavTilesLinksIterator extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int tenantResearcherEssentialId = 0;
    int navTileId = 0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(TenantResearcherEssentialsNavTilesLinksIterator.class);


    PreparedStatement stat = null;
    ResultSet rs = null;
    String fromList = null;
    String joinCriteria = null;
    String filterCriteria = null;
    String sortCriteria = null;
    int limitCriteria = 0;
    String var = null;
    int rsCount = 0;

   boolean useNavTiles = false;
   boolean useTenantResearcherEssentials = false;

	public static String tenantResearcherEssentialsNavTilesLinksCountByNavTiles(String ID) throws JspTagException {
		int count = 0;
		TenantResearcherEssentialsNavTilesLinksIterator theIterator = new TenantResearcherEssentialsNavTilesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.tenant_researcher_essentials_nav_tiles_links where 1=1"
						+ " and nav_tile_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean navTilesHasTenantResearcherEssentialsNavTilesLinks(String ID) throws JspTagException {
		return ! tenantResearcherEssentialsNavTilesLinksCountByNavTiles(ID).equals("0");
	}

	public static String tenantResearcherEssentialsNavTilesLinksCountByTenantResearcherEssentials(String ID) throws JspTagException {
		int count = 0;
		TenantResearcherEssentialsNavTilesLinksIterator theIterator = new TenantResearcherEssentialsNavTilesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.tenant_researcher_essentials_nav_tiles_links where 1=1"
						+ " and tenant_researcher_essential_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean tenantResearcherEssentialsHasTenantResearcherEssentialsNavTilesLinks(String ID) throws JspTagException {
		return ! tenantResearcherEssentialsNavTilesLinksCountByTenantResearcherEssentials(ID).equals("0");
	}

	public static Boolean tenantResearcherEssentialsNavTilesLinksExists (String ID) throws JspTagException {
		int count = 0;
		TenantResearcherEssentialsNavTilesLinksIterator theIterator = new TenantResearcherEssentialsNavTilesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.tenant_researcher_essentials_nav_tiles_links where 1=1"
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
			log.error("JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

	public static Boolean navTilesTenantResearcherEssentialsExists (String ID) throws JspTagException {
		int count = 0;
		TenantResearcherEssentialsNavTilesLinksIterator theIterator = new TenantResearcherEssentialsNavTilesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.tenant_researcher_essentials_nav_tiles_links where 1=1"
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
			log.error("JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

    public int doStartTag() throws JspException {
		NavTiles theNavTiles = (NavTiles)findAncestorWithClass(this, NavTiles.class);
		if (theNavTiles!= null)
			parentEntities.addElement(theNavTiles);
		TenantResearcherEssentials theTenantResearcherEssentials = (TenantResearcherEssentials)findAncestorWithClass(this, TenantResearcherEssentials.class);
		if (theTenantResearcherEssentials!= null)
			parentEntities.addElement(theTenantResearcherEssentials);

		if (theNavTiles == null) {
		} else {
			navTileId = theNavTiles.getID();
		}
		if (theTenantResearcherEssentials == null) {
		} else {
			tenantResearcherEssentialId = theTenantResearcherEssentials.getID();
		}


      try {
            //run count query  
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT count(*) from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (navTileId == 0 ? "" : " and nav_tile_id = ?")
                                                        + (tenantResearcherEssentialId == 0 ? "" : " and tenant_researcher_essential_id = ?")
                                                        + generateLimitCriteria());
            if (navTileId != 0) stat.setInt(webapp_keySeq++, navTileId);
            if (tenantResearcherEssentialId != 0) stat.setInt(webapp_keySeq++, tenantResearcherEssentialId);
            rs = stat.executeQuery();

            if (rs.next()) {
                pageContext.setAttribute(var+"Total", rs.getInt(1));
            }


            //run select id query  
            webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT strapi.tenant_researcher_essentials_nav_tiles_links.id from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (navTileId == 0 ? "" : " and nav_tile_id = ?")
                                                        + (tenantResearcherEssentialId == 0 ? "" : " and tenant_researcher_essential_id = ?")
                                                        + " order by " + generateSortCriteria()  +  generateLimitCriteria());
            if (navTileId != 0) stat.setInt(webapp_keySeq++, navTileId);
            if (tenantResearcherEssentialId != 0) stat.setInt(webapp_keySeq++, tenantResearcherEssentialId);
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
            log.error("JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator: " + stat, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator: " + stat);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating TenantResearcherEssentialsNavTilesLinks iterator: " + stat,e);
			}

        }

        return SKIP_BODY;
    }

    private String generateFromClause() {
       StringBuffer theBuffer = new StringBuffer("strapi.tenant_researcher_essentials_nav_tiles_links");
       if (useNavTiles)
          theBuffer.append(", strapi.nav_tiles");
       if (useTenantResearcherEssentials)
          theBuffer.append(", strapi.tenant_researcher_essentials");

      return theBuffer.toString();
    }

    private String generateJoinCriteria() {
       StringBuffer theBuffer = new StringBuffer();
       if (useNavTiles)
          theBuffer.append(" and strapi.nav_tiles.id = strapi.tenant_researcher_essentials_nav_tiles_links.nav_tile_id");
       if (useTenantResearcherEssentials)
          theBuffer.append(" and strapi.tenant_researcher_essentials.id = strapi.tenant_researcher_essentials_nav_tiles_links.tenant_researcher_essential_id");

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
            log.error("JDBC error iterating across TenantResearcherEssentialsNavTilesLinks", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error iterating across TenantResearcherEssentialsNavTilesLinks" + stat.toString());
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error iterating across TenantResearcherEssentialsNavTilesLinks",e);
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
            log.error("JDBC error ending TenantResearcherEssentialsNavTilesLinks iterator",e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error ending TenantResearcherEssentialsNavTilesLinks iterator",e);
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


   public boolean getUseNavTiles() {
        return useNavTiles;
    }

    public void setUseNavTiles(boolean useNavTiles) {
        this.useNavTiles = useNavTiles;
    }

   public boolean getUseTenantResearcherEssentials() {
        return useTenantResearcherEssentials;
    }

    public void setUseTenantResearcherEssentials(boolean useTenantResearcherEssentials) {
        this.useTenantResearcherEssentials = useTenantResearcherEssentials;
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
