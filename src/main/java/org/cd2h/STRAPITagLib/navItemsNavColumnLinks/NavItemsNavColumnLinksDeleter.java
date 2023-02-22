package org.cd2h.STRAPITagLib.navItemsNavColumnLinks;


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
import org.cd2h.STRAPITagLib.navColumns.NavColumns;
import org.cd2h.STRAPITagLib.navItems.NavItems;

@SuppressWarnings("serial")
public class NavItemsNavColumnLinksDeleter extends STRAPITagLibBodyTagSupport {
    int ID = 0;
    int navItemId = 0;
    int navColumnId = 0;
    double navItemOrder = 0.0;
	Vector<STRAPITagLibTagSupport> parentEntities = new Vector<STRAPITagLibTagSupport>();

	private static final Logger log = LogManager.getLogger(NavItemsNavColumnLinksDeleter.class);


    ResultSet rs = null;
    String var = null;
    int rsCount = 0;

    public int doStartTag() throws JspException {
		NavColumns theNavColumns = (NavColumns)findAncestorWithClass(this, NavColumns.class);
		if (theNavColumns!= null)
			parentEntities.addElement(theNavColumns);
		NavItems theNavItems = (NavItems)findAncestorWithClass(this, NavItems.class);
		if (theNavItems!= null)
			parentEntities.addElement(theNavItems);

		if (theNavColumns == null) {
		} else {
			navColumnId = theNavColumns.getID();
		}
		if (theNavItems == null) {
		} else {
			navItemId = theNavItems.getID();
		}


        PreparedStatement stat;
        try {
            int webapp_keySeq = 1;
            stat = getConnection().prepareStatement("DELETE from strapi.nav_items_nav_column_links where 1=1"
                                                        + (ID == 0 ? "" : " and id = ? ")
                                                        + (navColumnId == 0 ? "" : " and nav_column_id = ? ")
                                                        + (navItemId == 0 ? "" : " and nav_item_id = ? "));
            if (ID != 0) stat.setInt(webapp_keySeq++, ID);
			if (navColumnId != 0) stat.setInt(webapp_keySeq++, navColumnId);
			if (navItemId != 0) stat.setInt(webapp_keySeq++, navItemId);
            stat.execute();

			webapp_keySeq = 1;
        } catch (SQLException e) {
            log.error("JDBC error generating NavItemsNavColumnLinks deleter", e);

			clearServiceState();
			freeConnection();

			Tag parent = getParent();
			if(parent != null){
				pageContext.setAttribute("tagError", true);
				pageContext.setAttribute("tagErrorException", e);
				pageContext.setAttribute("tagErrorMessage", "Error: JDBC error generating NavItemsNavColumnLinks deleter");
				return parent.doEndTag();
			}else{
				throw new JspException("Error: JDBC error generating NavItemsNavColumnLinks deleter",e);
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
