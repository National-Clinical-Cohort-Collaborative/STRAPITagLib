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
<strapi:tenantFooters ID="${ID}">
	<h2>TenantFooters: <strapi:tenantFootersID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Label</th>
			<th>GrantCite</th>
			<th>Credits</th>
			<th>Signup</th>
			<th>Social</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantFootersID />"><strapi:tenantFootersID /></a></td>
				<td><strapi:tenantFootersLabel /></td>
				<td><strapi:tenantFootersGrantCite /></td>
				<td><strapi:tenantFootersCredits /></td>
				<td><strapi:tenantFootersSignup /></td>
				<td><strapi:tenantFootersSocial /></td>
				<td><strapi:tenantFootersCreatedAt /></td>
				<td><strapi:tenantFootersUpdatedAt /></td>
				<td><strapi:tenantFootersPublishedAt /></td>
				<td><strapi:tenantFootersCreatedById /></td>
				<td><strapi:tenantFootersUpdatedById /></td>
			</tr>
		</table>
</strapi:tenantFooters>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>