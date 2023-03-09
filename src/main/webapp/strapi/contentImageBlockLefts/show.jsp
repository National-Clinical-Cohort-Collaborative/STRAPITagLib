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
<strapi:contentImageBlockLefts ID="${ID}">
	<h2>ContentImageBlockLefts: <strapi:contentImageBlockLeftsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Content</th>
			<th>Header</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:contentImageBlockLeftsID />"><strapi:contentImageBlockLeftsID /></a></td>
				<td><strapi:contentImageBlockLeftsContent /></td>
				<td><strapi:contentImageBlockLeftsHeader /></td>
				<td><strapi:contentImageBlockLeftsCreatedAt /></td>
				<td><strapi:contentImageBlockLeftsUpdatedAt /></td>
				<td><strapi:contentImageBlockLeftsPublishedAt /></td>
				<td><strapi:contentImageBlockLeftsCreatedById /></td>
				<td><strapi:contentImageBlockLeftsUpdatedById /></td>
			</tr>
		</table>
</strapi:contentImageBlockLefts>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>