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
<strapi:covidExtensionsFaqsLinks ID="${ID}">
	<h2>CovidExtensionsFaqsLinks: <strapi:covidExtensionsFaqsLinksID /></h2>
<ul>
	<li><a href="../covidExtensions/show.jsp?ID=<strapi:covidExtensionsFaqsLinksCovidExtensionId />">CovidExtensions</a>
	<li><a href="../faqs/show.jsp?ID=<strapi:covidExtensionsFaqsLinksFaqId />">Faqs</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>CovidExtensionId</th>
			<th>FaqId</th>
			<th>FaqOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:covidExtensionsFaqsLinksID />"><strapi:covidExtensionsFaqsLinksID /></a></td>
				<td><strapi:covidExtensionsFaqsLinksCovidExtensionId /></td>
				<td><strapi:covidExtensionsFaqsLinksFaqId /></td>
				<td><strapi:covidExtensionsFaqsLinksFaqOrder /></td>
			</tr>
		</table>
</strapi:covidExtensionsFaqsLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>