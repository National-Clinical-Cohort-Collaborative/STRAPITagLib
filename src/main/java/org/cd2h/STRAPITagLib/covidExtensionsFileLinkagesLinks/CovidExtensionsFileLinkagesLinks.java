package org.cd2h.STRAPITagLib.covidExtensionsFileLinkagesLinks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.covidExtensions.CovidExtensions;
import org.cd2h.STRAPITagLib.fileLinkages.FileLinkages;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class CovidExtensionsFileLinkagesLinks extends STRAPITagLibTagSupport {

	static CovidExtensionsFileLinkagesLinks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(CovidExtensionsFileLinkagesLinks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	int covidExtensionId = 0;
	int fileLinkageId = 0;
	double fileLinkageOrder = 0.0;

	private String var = null;

	private CovidExtensionsFileLinkagesLinks cachedCovidExtensionsFileLinkagesLinks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
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

			CovidExtensionsFileLinkagesLinksIterator theCovidExtensionsFileLinkagesLinksIterator = (CovidExtensionsFileLinkagesLinksIterator)findAncestorWithClass(this, CovidExtensionsFileLinkagesLinksIterator.class);

			if (theCovidExtensionsFileLinkagesLinksIterator != null) {
				ID = theCovidExtensionsFileLinkagesLinksIterator.getID();
			}

			if (theCovidExtensionsFileLinkagesLinksIterator == null && theCovidExtensions == null && theFileLinkages == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new CovidExtensionsFileLinkagesLinks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else if (theCovidExtensionsFileLinkagesLinksIterator == null && theCovidExtensions != null && theFileLinkages == null) {
				// an ID was provided as an attribute - we need to load a CovidExtensionsFileLinkagesLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select covid_extension_id,file_linkage_id,file_linkage_order from strapi.covid_extensions_file_linkages_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (covidExtensionId == 0)
						covidExtensionId = rs.getInt(1);
					if (fileLinkageId == 0)
						fileLinkageId = rs.getInt(2);
					if (fileLinkageOrder == 0.0)
						fileLinkageOrder = rs.getDouble(3);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else if (theCovidExtensionsFileLinkagesLinksIterator == null && theCovidExtensions == null && theFileLinkages != null) {
				// an ID was provided as an attribute - we need to load a CovidExtensionsFileLinkagesLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select covid_extension_id,file_linkage_id,file_linkage_order from strapi.covid_extensions_file_linkages_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (covidExtensionId == 0)
						covidExtensionId = rs.getInt(1);
					if (fileLinkageId == 0)
						fileLinkageId = rs.getInt(2);
					if (fileLinkageOrder == 0.0)
						fileLinkageOrder = rs.getDouble(3);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else {
				// an iterator or ID was provided as an attribute - we need to load a CovidExtensionsFileLinkagesLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select covid_extension_id,file_linkage_id,file_linkage_order from strapi.covid_extensions_file_linkages_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (covidExtensionId == 0)
						covidExtensionId = rs.getInt(1);
					if (fileLinkageId == 0)
						fileLinkageId = rs.getInt(2);
					if (fileLinkageOrder == 0.0)
						fileLinkageOrder = rs.getDouble(3);
					found = true;
				}
				rs.close();
				stmt.close();

				if (!found) {
					insertEntity();
				}
			}
		} catch (SQLException e) {
			log.error("JDBC error retrieving ID " + ID, e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "JDBC error retrieving ID " + ID);
				return parent.doEndTag();
			}else{
				throw new JspException("JDBC error retrieving ID " + ID,e);
			}

		} finally {
			freeConnection();
		}

		if(pageContext != null){
			CovidExtensionsFileLinkagesLinks currentCovidExtensionsFileLinkagesLinks = (CovidExtensionsFileLinkagesLinks) pageContext.getAttribute("tag_covidExtensionsFileLinkagesLinks");
			if(currentCovidExtensionsFileLinkagesLinks != null){
				cachedCovidExtensionsFileLinkagesLinks = currentCovidExtensionsFileLinkagesLinks;
			}
			currentCovidExtensionsFileLinkagesLinks = this;
			pageContext.setAttribute((var == null ? "tag_covidExtensionsFileLinkagesLinks" : var), currentCovidExtensionsFileLinkagesLinks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedCovidExtensionsFileLinkagesLinks != null){
				pageContext.setAttribute((var == null ? "tag_covidExtensionsFileLinkagesLinks" : var), this.cachedCovidExtensionsFileLinkagesLinks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_covidExtensionsFileLinkagesLinks" : var));
				this.cachedCovidExtensionsFileLinkagesLinks = null;
			}
		}

		try {
			Boolean error = null; // (Boolean) pageContext.getAttribute("tagError");
			if(pageContext != null){
				error = (Boolean) pageContext.getAttribute("tagError");
			}

			if(error != null && error){

				freeConnection();
				clearServiceState();

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
			if (commitNeeded) {
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.covid_extensions_file_linkages_links set covid_extension_id = ?, file_linkage_id = ?, file_linkage_order = ? where id = ? ");
				if ( covidExtensionId == 0 ) {
					stmt.setNull( 1, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 1, covidExtensionId );
				}
				if ( fileLinkageId == 0 ) {
					stmt.setNull( 2, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 2, fileLinkageId );
				}
				stmt.setDouble( 3, fileLinkageOrder );
				stmt.setInt(4,ID);
				stmt.executeUpdate();
				stmt.close();
			}
		} catch (SQLException e) {
			log.error("Error: IOException while writing to the user", e);

			freeConnection();
			clearServiceState();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: IOException while writing to the user");
				return parent.doEndTag();
			}else{
				throw new JspTagException("Error: IOException while writing to the user");
			}

		} finally {
			clearServiceState();
			freeConnection();
		}
		return super.doEndTag();
	}

	public void insertEntity() throws JspException, SQLException {
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.covid_extensions_file_linkages_links(covid_extension_id,file_linkage_id,file_linkage_order) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		if (covidExtensionId == 0) {
			stmt.setNull(1, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(1,covidExtensionId);
		}
		if (fileLinkageId == 0) {
			stmt.setNull(2, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(2,fileLinkageId);
		}
		stmt.setDouble(3,fileLinkageOrder);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		irs.close();
		stmt.close();

		log.debug("generating new CovidExtensionsFileLinkagesLinks " + ID);

		freeConnection();
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

	public int getCovidExtensionId () {
		return covidExtensionId;
	}

	public void setCovidExtensionId (int covidExtensionId) {
		this.covidExtensionId = covidExtensionId;
		commitNeeded = true;
	}

	public int getActualCovidExtensionId () {
		return covidExtensionId;
	}

	public int getFileLinkageId () {
		return fileLinkageId;
	}

	public void setFileLinkageId (int fileLinkageId) {
		this.fileLinkageId = fileLinkageId;
		commitNeeded = true;
	}

	public int getActualFileLinkageId () {
		return fileLinkageId;
	}

	public double getFileLinkageOrder () {
		return fileLinkageOrder;
	}

	public void setFileLinkageOrder (double fileLinkageOrder) {
		this.fileLinkageOrder = fileLinkageOrder;
		commitNeeded = true;
	}

	public double getActualFileLinkageOrder () {
		return fileLinkageOrder;
	}

	public String getVar () {
		return var;
	}

	public void setVar (String var) {
		this.var = var;
	}

	public String getActualVar () {
		return var;
	}

	public static Integer IDValue() throws JspException {
		try {
			return currentInstance.getID();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function IDValue()");
		}
	}

	public static Integer covidExtensionIdValue() throws JspException {
		try {
			return currentInstance.getCovidExtensionId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function covidExtensionIdValue()");
		}
	}

	public static Integer fileLinkageIdValue() throws JspException {
		try {
			return currentInstance.getFileLinkageId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function fileLinkageIdValue()");
		}
	}

	public static Double fileLinkageOrderValue() throws JspException {
		try {
			return currentInstance.getFileLinkageOrder();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function fileLinkageOrderValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		covidExtensionId = 0;
		fileLinkageId = 0;
		fileLinkageOrder = 0.0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
