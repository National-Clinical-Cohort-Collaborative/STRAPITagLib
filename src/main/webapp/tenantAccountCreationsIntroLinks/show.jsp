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
<strapi:tenantAccountCreationsIntroLinks ID="${ID}">
	<h2>TenantAccountCreationsIntroLinks: <strapi:tenantAccountCreationsIntroLinksID /></h2>
<ul>
	<li><a href="../contentImageBlockRights/show.jsp?ID=<strapi:tenantAccountCreationsIntroLinksContentImageBlockRightId />">ContentImageBlockRights</a>
	<li><a href="../tenantAccountCreations/show.jsp?ID=<strapi:tenantAccountCreationsIntroLinksTenantAccountCreationId />">TenantAccountCreations</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>TenantAccountCreationId</th>
			<th>ContentImageBlockRightId</th>
			<th>ContentImageBlockRightOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantAccountCreationsIntroLinksID />"><strapi:tenantAccountCreationsIntroLinksID /></a></td>
				<td><strapi:tenantAccountCreationsIntroLinksTenantAccountCreationId /></td>
				<td><strapi:tenantAccountCreationsIntroLinksContentImageBlockRightId /></td>
				<td><strapi:tenantAccountCreationsIntroLinksContentImageBlockRightOrder /></td>
			</tr>
		</table>
</strapi:tenantAccountCreationsIntroLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>