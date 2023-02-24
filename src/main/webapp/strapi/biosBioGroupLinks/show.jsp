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
<strapi:biosBioGroupLinks ID="${ID}">
	<h2>BiosBioGroupLinks: <strapi:biosBioGroupLinksID /></h2>
<ul>
	<li><a href="../bioGroups/show.jsp?ID=<strapi:biosBioGroupLinksBioGroupId />">BioGroups</a>
	<li><a href="../bios/show.jsp?ID=<strapi:biosBioGroupLinksBioId />">Bios</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>BioId</th>
			<th>BioGroupId</th>
			<th>BioOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:biosBioGroupLinksID />"><strapi:biosBioGroupLinksID /></a></td>
				<td><strapi:biosBioGroupLinksBioId /></td>
				<td><strapi:biosBioGroupLinksBioGroupId /></td>
				<td><strapi:biosBioGroupLinksBioOrder /></td>
			</tr>
		</table>
</strapi:biosBioGroupLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>