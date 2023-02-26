<%@ include file="../../_include.jsp"  %>

        <html>
            <jsp:include page="../../head.jsp" />
            <body>
                <div class="container-fluid">
                    <jsp:include page="../../header.jsp" />
                    <div class="row flex-nowrap">
                        <div class="col-xs-3">
                            <jsp:include page="../../menu.jsp" />
                        </div>
                        <div class="col-xs-8">
<fmt:parseNumber var="ID" value="${param.ID}" />
<strapi:pressReleases ID="${ID}">
	<h2>PressReleases: <strapi:pressReleasesID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Description</th>
			<th>Date</th>
			<th>Url</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:pressReleasesID />"><strapi:pressReleasesID /></a></td>
				<td><strapi:pressReleasesTitle /></td>
				<td><strapi:pressReleasesDescription /></td>
				<td><strapi:pressReleasesDate /></td>
				<td><strapi:pressReleasesUrl /></td>
				<td><strapi:pressReleasesCreatedAt /></td>
				<td><strapi:pressReleasesUpdatedAt /></td>
				<td><strapi:pressReleasesPublishedAt /></td>
				<td><strapi:pressReleasesCreatedById /></td>
				<td><strapi:pressReleasesUpdatedById /></td>
			</tr>
		</table>
</strapi:pressReleases>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>