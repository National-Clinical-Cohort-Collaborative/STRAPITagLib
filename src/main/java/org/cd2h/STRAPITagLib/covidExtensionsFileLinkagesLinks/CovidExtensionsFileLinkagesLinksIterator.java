package org.cd2h.STRAPITagLib.covidExtensionsFileLinkagesLinks;


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
import org.cd2h.STRAPITagLib.covidExtensions.CovidExtensions;
import org.cd2h.STRAPITagLib.fileLinkages.FileLinkages;

@SuppressWarnings("serial")
public class CovidExtensionsFileLinkagesLinksIterator extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int covidExtensionId = 0;
    int fileLinkageId = 0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(CovidExtensionsFileLinkagesLinksIterator.class);


    PreparedStatement stat = null;
    ResultSet rs = null;
    String fromList = null;
    String joinCriteria = null;
    String filterCriteria = null;
    String sortCriteria = null;
    int limitCriteria = 0;
    String var = null;
    int rsCount = 0;

   boolean useCovidExtensions = false;
   boolean useFileLinkages = false;

	public static String covidExtensionsFileLinkagesLinksCountByCovidExtensions(String ID) throws JspTagException {
		int count = 0;
		CovidExtensionsFileLinkagesLinksIterator theIterator = new CovidExtensionsFileLinkagesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.covid_extensions_file_linkages_links where 1=1"
						+ " and covid_extension_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating CovidExtensionsFileLinkagesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean covidExtensionsHasCovidExtensionsFileLinkagesLinks(String ID) throws JspTagException {
		return ! covidExtensionsFileLinkagesLinksCountByCovidExtensions(ID).equals("0");
	}

	public static String covidExtensionsFileLinkagesLinksCountByFileLinkages(String ID) throws JspTagException {
		int count = 0;
		CovidExtensionsFileLinkagesLinksIterator theIterator = new CovidExtensionsFileLinkagesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.covid_extensions_file_linkages_links where 1=1"
						+ " and file_linkage_id = ?"
						);

			stat.setInt(1,Integer.parseInt(ID));
			ResultSet crs = stat.executeQuery();

			if (crs.next()) {
				count = crs.getInt(1);
			}
			crs.close();
			stat.close();
		} catch (SQLException e) {
			log.error("JDBC error generating CovidExtensionsFileLinkagesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return "" + count;
	}

	public static Boolean fileLinkagesHasCovidExtensionsFileLinkagesLinks(String ID) throws JspTagException {
		return ! covidExtensionsFileLinkagesLinksCountByFileLinkages(ID).equals("0");
	}

	public static Boolean covidExtensionsFileLinkagesLinksExists (String ID) throws JspTagException {
		int count = 0;
		CovidExtensionsFileLinkagesLinksIterator theIterator = new CovidExtensionsFileLinkagesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.covid_extensions_file_linkages_links where 1=1"
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
			log.error("JDBC error generating CovidExtensionsFileLinkagesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

	public static Boolean covidExtensionsFileLinkagesExists (String ID) throws JspTagException {
		int count = 0;
		CovidExtensionsFileLinkagesLinksIterator theIterator = new CovidExtensionsFileLinkagesLinksIterator();
		try {
			PreparedStatement stat = theIterator.getConnection().prepareStatement("SELECT count(*) from strapi.covid_extensions_file_linkages_links where 1=1"
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
			log.error("JDBC error generating CovidExtensionsFileLinkagesLinks iterator", e);
			throw new JspTagException("Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator");
		} finally {
			theIterator.freeConnection();
		}
		return count > 0;
	}

    public int doStartTag() throws JspException {
		CovidExtensions theCovidExtensions = (CovidExtensions)findAncestorWithClass(this, CovidExtensions.class);
		if (theCovidExtensions!= null)
			parentEntities.addElement(theCovidExtensions);
		FileLinkages theFileLinkages = (FileLinkages)findAncestorWithClass(this, FileLinkages.class);
		if (theFileLinkages!= null)
			parentEntities.addElement(theFileLinkages);

		if (theCovidExtensions == null) {
		} else {
			covidExtensionId = theCovidExtensions.getID();
		}
		if (theFileLinkages == null) {
		} else {
			fileLinkageId = theFileLinkages.getID();
		}


      try {
            //run count query  
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT count(*) from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (covidExtensionId == 0 ? "" : " and covid_extension_id = ?")
                                                        + (fileLinkageId == 0 ? "" : " and file_linkage_id = ?")
                                                        + generateLimitCriteria());
            if (covidExtensionId != 0) stat.setInt(webapp_keySeq++, covidExtensionId);
            if (fileLinkageId != 0) stat.setInt(webapp_keySeq++, fileLinkageId);
            rs = stat.executeQuery();

            if (rs.next()) {
                pageContext.setAttribute(var+"Total", rs.getInt(1));
            }


            //run select id query  
            webapp_keySeq = 1;
            stat = getConnection().prepareStatement("SELECT strapi.covid_extensions_file_linkages_links.id from " + generateFromClause() + " where 1=1"
                                                        + generateJoinCriteria()
                                                        + generateFilterCriteria()
                                                        + (covidExtensionId == 0 ? "" : " and covid_extension_id = ?")
                                                        + (fileLinkageId == 0 ? "" : " and file_linkage_id = ?")
                                                        + " order by " + generateSortCriteria()  +  generateLimitCriteria());
            if (covidExtensionId != 0) stat.setInt(webapp_keySeq++, covidExtensionId);
            if (fileLinkageId != 0) stat.setInt(webapp_keySeq++, fileLinkageId);
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
            log.error("JDBC error generating CovidExtensionsFileLinkagesLinks iterator: " + stat, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator: " + stat);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating CovidExtensionsFileLinkagesLinks iterator: " + stat,e);
			}

        }

        return SKIP_BODY;
    }

    private String generateFromClause() {
       StringBuffer theBuffer = new StringBuffer("strapi.covid_extensions_file_linkages_links");
       if (useCovidExtensions)
          theBuffer.append(", strapi.covid_extensions");
       if (useFileLinkages)
          theBuffer.append(", strapi.file_linkages");

      return theBuffer.toString();
    }

    private String generateJoinCriteria() {
       StringBuffer theBuffer = new StringBuffer();
       if (useCovidExtensions)
          theBuffer.append(" and strapi.covid_extensions.id = strapi.covid_extensions_file_linkages_links.covid_extension_id");
       if (useFileLinkages)
          theBuffer.append(" and strapi.file_linkages.id = strapi.covid_extensions_file_linkages_links.file_linkage_id");

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
            log.error("JDBC error iterating across CovidExtensionsFileLinkagesLinks", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error iterating across CovidExtensionsFileLinkagesLinks" + stat.toString());
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error iterating across CovidExtensionsFileLinkagesLinks",e);
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
            log.error("JDBC error ending CovidExtensionsFileLinkagesLinks iterator",e);
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error ending CovidExtensionsFileLinkagesLinks iterator",e);
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


   public boolean getUseCovidExtensions() {
        return useCovidExtensions;
    }

    public void setUseCovidExtensions(boolean useCovidExtensions) {
        this.useCovidExtensions = useCovidExtensions;
    }

   public boolean getUseFileLinkages() {
        return useFileLinkages;
    }

    public void setUseFileLinkages(boolean useFileLinkages) {
        this.useFileLinkages = useFileLinkages;
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
