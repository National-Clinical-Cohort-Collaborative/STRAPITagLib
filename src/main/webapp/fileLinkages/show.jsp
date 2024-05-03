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
<strapi:fileLinkages ID="${ID}">
	<h2>FileLinkages: <strapi:fileLinkagesID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Label</th>
			<th>Description</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:fileLinkagesID />"><strapi:fileLinkagesID /></a></td>
				<td><strapi:fileLinkagesLabel /></td>
				<td><strapi:fileLinkagesDescription /></td>
				<td><strapi:fileLinkagesCreatedAt /></td>
				<td><strapi:fileLinkagesUpdatedAt /></td>
				<td><strapi:fileLinkagesPublishedAt /></td>
				<td><strapi:fileLinkagesCreatedById /></td>
				<td><strapi:fileLinkagesUpdatedById /></td>
			</tr>
		</table>

						<h2>CovidExtensionsFileLinkagesLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>CovidExtensionId</th>
									<th>FileLinkageId</th>
									<th>FileLinkageOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachCovidExtensionsFileLinkagesLinks var="idIter">
									<strapi:covidExtensionsFileLinkagesLinks>
										<tr>
											<td><a href="../covidExtensionsFileLinkagesLinks/show.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksID />"><strapi:covidExtensionsFileLinkagesLinksID /></a></td>
											<td><strapi:covidExtensionsFileLinkagesLinksCovidExtensionId /></td>
											<td><strapi:covidExtensionsFileLinkagesLinksFileLinkageId /></td>
											<td><strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder /></td>
											<td><a href="../covidExtensionsFileLinkagesLinks/edit.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksID />">edit</a></td>
											<td><a href="../covidExtensionsFileLinkagesLinks/delete.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksID />">delete</a></td>
										</tr>
									</strapi:covidExtensionsFileLinkagesLinks>
								</strapi:foreachCovidExtensionsFileLinkagesLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../covidExtensionsFileLinkagesLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add CovidExtensionsFileLinkagesLinks</a>
						<br/><br/>

		<strapi:foreachCovidExtensionsFileLinkagesLinks var="idIter">
			<strapi:covidExtensionsFileLinkagesLinks>
						<a href="../../strapi/covidExtensionsFileLinkagesLinks/covidExtensionsFileLinkagesLinks.jsp?ID=<strapi:covidExtensionsFileLinkagesLinksID />"><strapi:covidExtensionsFileLinkagesLinksID /></a>
		<strapi:covidExtensionsFileLinkagesLinksCovidExtensionId />
		<strapi:covidExtensionsFileLinkagesLinksFileLinkageId />
		<strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:covidExtensionsFileLinkagesLinks>
			</strapi:foreachCovidExtensionsFileLinkagesLinks>
</strapi:fileLinkages>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>