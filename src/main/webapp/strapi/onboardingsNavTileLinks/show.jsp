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
<strapi:onboardingsNavTileLinks ID="${ID}">
	<h2>OnboardingsNavTileLinks: <strapi:onboardingsNavTileLinksID /></h2>
<ul>
	<li><a href="../contentImageBlockLefts/show.jsp?ID=<strapi:onboardingsNavTileLinksContentImageBlockLeftId />">ContentImageBlockLefts</a>
	<li><a href="../onboardings/show.jsp?ID=<strapi:onboardingsNavTileLinksOnboardingId />">Onboardings</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>OnboardingId</th>
			<th>ContentImageBlockLeftId</th>
			<th>ContentImageBlockLeftOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:onboardingsNavTileLinksID />"><strapi:onboardingsNavTileLinksID /></a></td>
				<td><strapi:onboardingsNavTileLinksOnboardingId /></td>
				<td><strapi:onboardingsNavTileLinksContentImageBlockLeftId /></td>
				<td><strapi:onboardingsNavTileLinksContentImageBlockLeftOrder /></td>
			</tr>
		</table>
</strapi:onboardingsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>