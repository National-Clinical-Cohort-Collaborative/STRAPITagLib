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
<strapi:tenantAccountCreationsInstructionsLinks ID="${ID}">
	<h2>TenantAccountCreationsInstructionsLinks: <strapi:tenantAccountCreationsInstructionsLinksID /></h2>
<ul>
	<li><a href="../contentImageBlockRights/show.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId />">ContentImageBlockRights</a>
	<li><a href="../tenantAccountCreations/show.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId />">TenantAccountCreations</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>TenantAccountCreationId</th>
			<th>ContentImageBlockRightId</th>
			<th>ContentImageBlockRightOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksID />"><strapi:tenantAccountCreationsInstructionsLinksID /></a></td>
				<td><strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId /></td>
				<td><strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId /></td>
				<td><strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder /></td>
			</tr>
		</table>
</strapi:tenantAccountCreationsInstructionsLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>