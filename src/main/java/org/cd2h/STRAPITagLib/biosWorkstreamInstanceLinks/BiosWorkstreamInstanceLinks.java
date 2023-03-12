package org.cd2h.STRAPITagLib.biosWorkstreamInstanceLinks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.bios.Bios;
import org.cd2h.STRAPITagLib.workstreamInstances.WorkstreamInstances;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class BiosWorkstreamInstanceLinks extends STRAPITagLibTagSupport {

	static BiosWorkstreamInstanceLinks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(BiosWorkstreamInstanceLinks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	int bioId = 0;
	int workstreamInstanceId = 0;
	double bioOrder = 0.0;

	private String var = null;

	private BiosWorkstreamInstanceLinks cachedBiosWorkstreamInstanceLinks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Bios theBios = (Bios)findAncestorWithClass(this, Bios.class);
			if (theBios!= null)
				parentEntities.addElement(theBios);
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			if (theWorkstreamInstances!= null)
				parentEntities.addElement(theWorkstreamInstances);

			if (theBios == null) {
			} else {
				bioId = theBios.getID();
			}
			if (theWorkstreamInstances == null) {
			} else {
				workstreamInstanceId = theWorkstreamInstances.getID();
			}

			BiosWorkstreamInstanceLinksIterator theBiosWorkstreamInstanceLinksIterator = (BiosWorkstreamInstanceLinksIterator)findAncestorWithClass(this, BiosWorkstreamInstanceLinksIterator.class);

			if (theBiosWorkstreamInstanceLinksIterator != null) {
				ID = theBiosWorkstreamInstanceLinksIterator.getID();
			}

			if (theBiosWorkstreamInstanceLinksIterator == null && theBios == null && theWorkstreamInstances == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new BiosWorkstreamInstanceLinks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else if (theBiosWorkstreamInstanceLinksIterator == null && theBios != null && theWorkstreamInstances == null) {
				// an ID was provided as an attribute - we need to load a BiosWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select bio_id,workstream_instance_id,bio_order from strapi.bios_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (bioId == 0)
						bioId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (bioOrder == 0.0)
						bioOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else if (theBiosWorkstreamInstanceLinksIterator == null && theBios == null && theWorkstreamInstances != null) {
				// an ID was provided as an attribute - we need to load a BiosWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select bio_id,workstream_instance_id,bio_order from strapi.bios_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (bioId == 0)
						bioId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (bioOrder == 0.0)
						bioOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else {
				// an iterator or ID was provided as an attribute - we need to load a BiosWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select bio_id,workstream_instance_id,bio_order from strapi.bios_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (bioId == 0)
						bioId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (bioOrder == 0.0)
						bioOrder = rs.getDouble(3);
					found = true;
				}
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
			BiosWorkstreamInstanceLinks currentBiosWorkstreamInstanceLinks = (BiosWorkstreamInstanceLinks) pageContext.getAttribute("tag_biosWorkstreamInstanceLinks");
			if(currentBiosWorkstreamInstanceLinks != null){
				cachedBiosWorkstreamInstanceLinks = currentBiosWorkstreamInstanceLinks;
			}
			currentBiosWorkstreamInstanceLinks = this;
			pageContext.setAttribute((var == null ? "tag_biosWorkstreamInstanceLinks" : var), currentBiosWorkstreamInstanceLinks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedBiosWorkstreamInstanceLinks != null){
				pageContext.setAttribute((var == null ? "tag_biosWorkstreamInstanceLinks" : var), this.cachedBiosWorkstreamInstanceLinks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_biosWorkstreamInstanceLinks" : var));
				this.cachedBiosWorkstreamInstanceLinks = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.bios_workstream_instance_links set bio_id = ?, workstream_instance_id = ?, bio_order = ? where id = ? ");
				if ( bioId == 0 ) {
					stmt.setNull( 1, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 1, bioId );
				}
				if ( workstreamInstanceId == 0 ) {
					stmt.setNull( 2, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 2, workstreamInstanceId );
				}
				stmt.setDouble( 3, bioOrder );
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
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.bios_workstream_instance_links(bio_id,workstream_instance_id,bio_order) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		if (bioId == 0) {
			stmt.setNull(1, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(1,bioId);
		}
		if (workstreamInstanceId == 0) {
			stmt.setNull(2, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(2,workstreamInstanceId);
		}
		stmt.setDouble(3,bioOrder);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		stmt.close();

		log.debug("generating new BiosWorkstreamInstanceLinks " + ID);

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

	public int getBioId () {
		return bioId;
	}

	public void setBioId (int bioId) {
		this.bioId = bioId;
		commitNeeded = true;
	}

	public int getActualBioId () {
		return bioId;
	}

	public int getWorkstreamInstanceId () {
		return workstreamInstanceId;
	}

	public void setWorkstreamInstanceId (int workstreamInstanceId) {
		this.workstreamInstanceId = workstreamInstanceId;
		commitNeeded = true;
	}

	public int getActualWorkstreamInstanceId () {
		return workstreamInstanceId;
	}

	public double getBioOrder () {
		return bioOrder;
	}

	public void setBioOrder (double bioOrder) {
		this.bioOrder = bioOrder;
		commitNeeded = true;
	}

	public double getActualBioOrder () {
		return bioOrder;
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

	public static Integer bioIdValue() throws JspException {
		try {
			return currentInstance.getBioId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function bioIdValue()");
		}
	}

	public static Integer workstreamInstanceIdValue() throws JspException {
		try {
			return currentInstance.getWorkstreamInstanceId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function workstreamInstanceIdValue()");
		}
	}

	public static Double bioOrderValue() throws JspException {
		try {
			return currentInstance.getBioOrder();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function bioOrderValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		bioId = 0;
		workstreamInstanceId = 0;
		bioOrder = 0.0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
