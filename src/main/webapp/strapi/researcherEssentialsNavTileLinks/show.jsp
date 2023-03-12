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
<strapi:researcherEssentialsNavTileLinks ID="${ID}">
	<h2>ResearcherEssentialsNavTileLinks: <strapi:researcherEssentialsNavTileLinksID /></h2>
<ul>
	<li><a href="../contentImageBlockLefts/show.jsp?ID=<strapi:researcherEssentialsNavTileLinksContentImageBlockLeftId />">ContentImageBlockLefts</a>
	<li><a href="../researcherEssentials/show.jsp?ID=<strapi:researcherEssentialsNavTileLinksResearcherEssentialId />">ResearcherEssentials</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>ResearcherEssentialId</th>
			<th>ContentImageBlockLeftId</th>
			<th>ContentImageBlockLeftOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:researcherEssentialsNavTileLinksID />"><strapi:researcherEssentialsNavTileLinksID /></a></td>
				<td><strapi:researcherEssentialsNavTileLinksResearcherEssentialId /></td>
				<td><strapi:researcherEssentialsNavTileLinksContentImageBlockLeftId /></td>
				<td><strapi:researcherEssentialsNavTileLinksContentImageBlockLeftOrder /></td>
			</tr>
		</table>
</strapi:researcherEssentialsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>