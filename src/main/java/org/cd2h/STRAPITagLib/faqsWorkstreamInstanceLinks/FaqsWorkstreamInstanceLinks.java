package org.cd2h.STRAPITagLib.faqsWorkstreamInstanceLinks;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.Tag;

import org.cd2h.STRAPITagLib.faqs.Faqs;
import org.cd2h.STRAPITagLib.workstreamInstances.WorkstreamInstances;

import org.cd2h.STRAPITagLib.STRAPITagLibTagSupport;
import org.cd2h.STRAPITagLib.Sequence;

@SuppressWarnings("serial")
public class FaqsWorkstreamInstanceLinks extends STRAPITagLibTagSupport {

	static FaqsWorkstreamInstanceLinks currentInstance = null;
	boolean commitNeeded = false;
	boolean newRecord = false;

	private static final Logger log = LogManager.getLogger(FaqsWorkstreamInstanceLinks.class);

	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	int ID = 0;
	int faqId = 0;
	int workstreamInstanceId = 0;
	double faqOrder = 0.0;

	private String var = null;

	private FaqsWorkstreamInstanceLinks cachedFaqsWorkstreamInstanceLinks = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			Faqs theFaqs = (Faqs)findAncestorWithClass(this, Faqs.class);
			if (theFaqs!= null)
				parentEntities.addElement(theFaqs);
			WorkstreamInstances theWorkstreamInstances = (WorkstreamInstances)findAncestorWithClass(this, WorkstreamInstances.class);
			if (theWorkstreamInstances!= null)
				parentEntities.addElement(theWorkstreamInstances);

			if (theFaqs == null) {
			} else {
				faqId = theFaqs.getID();
			}
			if (theWorkstreamInstances == null) {
			} else {
				workstreamInstanceId = theWorkstreamInstances.getID();
			}

			FaqsWorkstreamInstanceLinksIterator theFaqsWorkstreamInstanceLinksIterator = (FaqsWorkstreamInstanceLinksIterator)findAncestorWithClass(this, FaqsWorkstreamInstanceLinksIterator.class);

			if (theFaqsWorkstreamInstanceLinksIterator != null) {
				ID = theFaqsWorkstreamInstanceLinksIterator.getID();
			}

			if (theFaqsWorkstreamInstanceLinksIterator == null && theFaqs == null && theWorkstreamInstances == null && ID == 0) {
				// no ID was provided - the default is to assume that it is a new FaqsWorkstreamInstanceLinks and to generate a new ID
				ID = Sequence.generateID();
				insertEntity();
			} else if (theFaqsWorkstreamInstanceLinksIterator == null && theFaqs != null && theWorkstreamInstances == null) {
				// an ID was provided as an attribute - we need to load a FaqsWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select faq_id,workstream_instance_id,faq_order from strapi.faqs_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (faqId == 0)
						faqId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (faqOrder == 0.0)
						faqOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else if (theFaqsWorkstreamInstanceLinksIterator == null && theFaqs == null && theWorkstreamInstances != null) {
				// an ID was provided as an attribute - we need to load a FaqsWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select faq_id,workstream_instance_id,faq_order from strapi.faqs_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (faqId == 0)
						faqId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (faqOrder == 0.0)
						faqOrder = rs.getDouble(3);
					found = true;
				}
				stmt.close();

				if (!found) {
					insertEntity();
				}
			} else {
				// an iterator or ID was provided as an attribute - we need to load a FaqsWorkstreamInstanceLinks from the database
				boolean found = false;
				PreparedStatement stmt = getConnection().prepareStatement("select faq_id,workstream_instance_id,faq_order from strapi.faqs_workstream_instance_links where id = ?");
				stmt.setInt(1,ID);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					if (faqId == 0)
						faqId = rs.getInt(1);
					if (workstreamInstanceId == 0)
						workstreamInstanceId = rs.getInt(2);
					if (faqOrder == 0.0)
						faqOrder = rs.getDouble(3);
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
			FaqsWorkstreamInstanceLinks currentFaqsWorkstreamInstanceLinks = (FaqsWorkstreamInstanceLinks) pageContext.getAttribute("tag_faqsWorkstreamInstanceLinks");
			if(currentFaqsWorkstreamInstanceLinks != null){
				cachedFaqsWorkstreamInstanceLinks = currentFaqsWorkstreamInstanceLinks;
			}
			currentFaqsWorkstreamInstanceLinks = this;
			pageContext.setAttribute((var == null ? "tag_faqsWorkstreamInstanceLinks" : var), currentFaqsWorkstreamInstanceLinks);
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;

		if(pageContext != null){
			if(this.cachedFaqsWorkstreamInstanceLinks != null){
				pageContext.setAttribute((var == null ? "tag_faqsWorkstreamInstanceLinks" : var), this.cachedFaqsWorkstreamInstanceLinks);
			}else{
				pageContext.removeAttribute((var == null ? "tag_faqsWorkstreamInstanceLinks" : var));
				this.cachedFaqsWorkstreamInstanceLinks = null;
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
				PreparedStatement stmt = getConnection().prepareStatement("update strapi.faqs_workstream_instance_links set faq_id = ?, workstream_instance_id = ?, faq_order = ? where id = ? ");
				if ( faqId == 0 ) {
					stmt.setNull( 1, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 1, faqId );
				}
				if ( workstreamInstanceId == 0 ) {
					stmt.setNull( 2, java.sql.Types.INTEGER );
				} else {
					stmt.setInt( 2, workstreamInstanceId );
				}
				stmt.setDouble( 3, faqOrder );
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
		PreparedStatement stmt = getConnection().prepareStatement("insert into strapi.faqs_workstream_instance_links(faq_id,workstream_instance_id,faq_order) values (?,?,?)", java.sql.Statement.RETURN_GENERATED_KEYS);
		if (faqId == 0) {
			stmt.setNull(1, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(1,faqId);
		}
		if (workstreamInstanceId == 0) {
			stmt.setNull(2, java.sql.Types.INTEGER);
		} else {
			stmt.setInt(2,workstreamInstanceId);
		}
		stmt.setDouble(3,faqOrder);
		stmt.executeUpdate();

		// snag the new auto-increment value
		ResultSet irs = stmt.getGeneratedKeys();
		while (irs.next()) {
			ID = irs.getInt(1);
		}

		stmt.close();

		log.debug("generating new FaqsWorkstreamInstanceLinks " + ID);

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

	public int getFaqId () {
		return faqId;
	}

	public void setFaqId (int faqId) {
		this.faqId = faqId;
		commitNeeded = true;
	}

	public int getActualFaqId () {
		return faqId;
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

	public double getFaqOrder () {
		return faqOrder;
	}

	public void setFaqOrder (double faqOrder) {
		this.faqOrder = faqOrder;
		commitNeeded = true;
	}

	public double getActualFaqOrder () {
		return faqOrder;
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

	public static Integer faqIdValue() throws JspException {
		try {
			return currentInstance.getFaqId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function faqIdValue()");
		}
	}

	public static Integer workstreamInstanceIdValue() throws JspException {
		try {
			return currentInstance.getWorkstreamInstanceId();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function workstreamInstanceIdValue()");
		}
	}

	public static Double faqOrderValue() throws JspException {
		try {
			return currentInstance.getFaqOrder();
		} catch (Exception e) {
			 throw new JspTagException("Error in tag function faqOrderValue()");
		}
	}

	private void clearServiceState () {
		ID = 0;
		faqId = 0;
		workstreamInstanceId = 0;
		faqOrder = 0.0;
		newRecord = false;
		commitNeeded = false;
		parentEntities = new Vector<STRAPITagLibTagSupport>();
		this.var = null;

	}

}
