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
<strapi:biosWorkstreamInstanceLinks ID="${ID}">
	<h2>BiosWorkstreamInstanceLinks: <strapi:biosWorkstreamInstanceLinksID /></h2>
<ul>
	<li><a href="../bios/show.jsp?ID=<strapi:biosWorkstreamInstanceLinksBioId />">Bios</a>
	<li><a href="../workstreamInstances/show.jsp?ID=<strapi:biosWorkstreamInstanceLinksWorkstreamInstanceId />">WorkstreamInstances</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>BioId</th>
			<th>WorkstreamInstanceId</th>
			<th>BioOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:biosWorkstreamInstanceLinksID />"><strapi:biosWorkstreamInstanceLinksID /></a></td>
				<td><strapi:biosWorkstreamInstanceLinksBioId /></td>
				<td><strapi:biosWorkstreamInstanceLinksWorkstreamInstanceId /></td>
				<td><strapi:biosWorkstreamInstanceLinksBioOrder /></td>
			</tr>
		</table>
</strapi:biosWorkstreamInstanceLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>