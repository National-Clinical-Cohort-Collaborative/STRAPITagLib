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
<strapi:tenantProfiles ID="${ID}">
	<h2>TenantProfiles: <strapi:tenantProfilesID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Blurb</th>
			<th>Description</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			<th>Label</th>
			<th>Url</th>
			<th>FooterCite</th>
			<th>FooterCredit</th>
			<th>FooterSignup</th>
			<th>FooterSocial</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantProfilesID />"><strapi:tenantProfilesID /></a></td>
				<td><strapi:tenantProfilesBlurb /></td>
				<td><strapi:tenantProfilesDescription /></td>
				<td><strapi:tenantProfilesCreatedAt /></td>
				<td><strapi:tenantProfilesUpdatedAt /></td>
				<td><strapi:tenantProfilesPublishedAt /></td>
				<td><strapi:tenantProfilesCreatedById /></td>
				<td><strapi:tenantProfilesUpdatedById /></td>
				<td><strapi:tenantProfilesLabel /></td>
				<td><strapi:tenantProfilesUrl /></td>
				<td><strapi:tenantProfilesFooterCite /></td>
				<td><strapi:tenantProfilesFooterCredit /></td>
				<td><strapi:tenantProfilesFooterSignup /></td>
				<td><strapi:tenantProfilesFooterSocial /></td>
			</tr>
		</table>
</strapi:tenantProfiles>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>