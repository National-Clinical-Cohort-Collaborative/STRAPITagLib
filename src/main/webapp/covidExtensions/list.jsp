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

						<h2>CovidExtensions List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Title</th>
									<th>TextBlock1</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachCovidExtensions var="idIter">
									<strapi:covidExtensions>
										<tr>
											<td><a href="../covidExtensions/show.jsp?ID=<strapi:covidExtensionsID />"><strapi:covidExtensionsID /></a></td>
											<td><strapi:covidExtensionsTitle /></td>
											<td><strapi:covidExtensionsTextBlock1 /></td>
											<td><strapi:covidExtensionsCreatedAt /></td>
											<td><strapi:covidExtensionsUpdatedAt /></td>
											<td><strapi:covidExtensionsPublishedAt /></td>
											<td><strapi:covidExtensionsCreatedById /></td>
											<td><strapi:covidExtensionsUpdatedById /></td>
											<td><a href="../covidExtensions/edit.jsp?ID=<strapi:covidExtensionsID />">edit</a></td>
											<td><a href="../covidExtensions/delete.jsp?ID=<strapi:covidExtensionsID />">delete</a></td>
										</tr>
									</strapi:covidExtensions>
								</strapi:foreachCovidExtensions>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../covidExtensions/add.jsp">add CovidExtensions</a>
						<br/><br/>

		<strapi:foreachCovidExtensions var="idIter">
			<strapi:covidExtensions>
						<a href="../../strapi/covidExtensions/covidExtensions.jsp?ID=<strapi:covidExtensionsID />"><strapi:covidExtensionsID /></a>
		<strapi:covidExtensionsTitle />
		<strapi:covidExtensionsTextBlock1 />
		<strapi:covidExtensionsCreatedAt />
		<strapi:covidExtensionsUpdatedAt />
		<strapi:covidExtensionsPublishedAt />
		<strapi:covidExtensionsCreatedById />
		<strapi:covidExtensionsUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:covidExtensions>
			</strapi:foreachCovidExtensions>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>