<%@ include file="../_include.jsp"  %>

        <html>
            <jsp:include page="../head.jsp" />
            <body>
                <div class="container-fluid">
                    <jsp:include page="../header.jsp" />
                    <div class="row flex-nowrap">
                        <div class="col-xs-3">
                            <jsp:include page="../menu.jsp" />
                        </div>
                        <div class="col-xs-8">
<fmt:parseNumber var="ID" value="${param.ID}" />
<strapi:tenantDuaLists ID="${ID}">
	<h2>TenantDuaLists: <strapi:tenantDuaListsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Header</th>
			<th>Block1</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantDuaListsID />"><strapi:tenantDuaListsID /></a></td>
				<td><strapi:tenantDuaListsHeader /></td>
				<td><strapi:tenantDuaListsBlock1 /></td>
				<td><strapi:tenantDuaListsCreatedAt /></td>
				<td><strapi:tenantDuaListsUpdatedAt /></td>
				<td><strapi:tenantDuaListsPublishedAt /></td>
				<td><strapi:tenantDuaListsCreatedById /></td>
				<td><strapi:tenantDuaListsUpdatedById /></td>
			</tr>
		</table>
</strapi:tenantDuaLists>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>