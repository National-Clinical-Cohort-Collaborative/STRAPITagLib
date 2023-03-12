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
<strapi:institutionalEssentialsNavTileLinks ID="${ID}">
	<h2>InstitutionalEssentialsNavTileLinks: <strapi:institutionalEssentialsNavTileLinksID /></h2>
<ul>
	<li><a href="../contentImageBlockLefts/show.jsp?ID=<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId />">ContentImageBlockLefts</a>
	<li><a href="../institutionalEssentials/show.jsp?ID=<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId />">InstitutionalEssentials</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>InstitutionalEssentialId</th>
			<th>ContentImageBlockLeftId</th>
			<th>ContentImageBlockLeftOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />"><strapi:institutionalEssentialsNavTileLinksID /></a></td>
				<td><strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId /></td>
				<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId /></td>
				<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder /></td>
			</tr>
		</table>
</strapi:institutionalEssentialsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>