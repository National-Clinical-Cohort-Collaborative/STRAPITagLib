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
<strapi:covidExtensionsFileLinkagesLinks ID="${ID}">
	<h2>CovidExtensionsFileLinkagesLinks: <strapi:covidExtensionsFileLinkagesLinksID /></h2>
<ul>
	<li><a href="../covidExtensions/show.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksCovidExtensionId />">CovidExtensions</a>
	<li><a href="../fileLinkages/show.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksFileLinkageId />">FileLinkages</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>CovidExtensionId</th>
			<th>FileLinkageId</th>
			<th>FileLinkageOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksID />"><strapi:covidExtensionsFileLinkagesLinksID /></a></td>
				<td><strapi:covidExtensionsFileLinkagesLinksCovidExtensionId /></td>
				<td><strapi:covidExtensionsFileLinkagesLinksFileLinkageId /></td>
				<td><strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder /></td>
			</tr>
		</table>
</strapi:covidExtensionsFileLinkagesLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>