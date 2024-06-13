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
<strapi:textBlocks ID="${ID}">
	<h2>TextBlocks: <strapi:textBlocksID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Label</th>
			<th>Content</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:textBlocksID />"><strapi:textBlocksID /></a></td>
				<td><strapi:textBlocksLabel /></td>
				<td><strapi:textBlocksContent /></td>
				<td><strapi:textBlocksCreatedAt /></td>
				<td><strapi:textBlocksUpdatedAt /></td>
				<td><strapi:textBlocksPublishedAt /></td>
				<td><strapi:textBlocksCreatedById /></td>
				<td><strapi:textBlocksUpdatedById /></td>
			</tr>
		</table>
</strapi:textBlocks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>