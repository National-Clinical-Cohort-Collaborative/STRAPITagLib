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

						<h2>FileLinkages List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Label</th>
									<th>Description</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachFileLinkages var="idIter">
									<strapi:fileLinkages>
										<tr>
											<td><a href="../fileLinkages/show.jsp?ID=<strapi:fileLinkagesID />"><strapi:fileLinkagesID /></a></td>
											<td><strapi:fileLinkagesLabel /></td>
											<td><strapi:fileLinkagesDescription /></td>
											<td><strapi:fileLinkagesCreatedAt /></td>
											<td><strapi:fileLinkagesUpdatedAt /></td>
											<td><strapi:fileLinkagesPublishedAt /></td>
											<td><strapi:fileLinkagesCreatedById /></td>
											<td><strapi:fileLinkagesUpdatedById /></td>
											<td><a href="../fileLinkages/edit.jsp?ID=<strapi:fileLinkagesID />">edit</a></td>
											<td><a href="../fileLinkages/delete.jsp?ID=<strapi:fileLinkagesID />">delete</a></td>
										</tr>
									</strapi:fileLinkages>
								</strapi:foreachFileLinkages>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../fileLinkages/add.jsp">add FileLinkages</a>
						<br/><br/>

		<strapi:foreachFileLinkages var="idIter">
			<strapi:fileLinkages>
						<a href="../../strapi/fileLinkages/fileLinkages.jsp?ID=<strapi:fileLinkagesID />"><strapi:fileLinkagesID /></a>
		<strapi:fileLinkagesLabel />
		<strapi:fileLinkagesDescription />
		<strapi:fileLinkagesCreatedAt />
		<strapi:fileLinkagesUpdatedAt />
		<strapi:fileLinkagesPublishedAt />
		<strapi:fileLinkagesCreatedById />
		<strapi:fileLinkagesUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:fileLinkages>
			</strapi:foreachFileLinkages>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>