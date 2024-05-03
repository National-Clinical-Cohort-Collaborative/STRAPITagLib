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
<strapi:covidExtensions ID="${ID}">
	<h2>CovidExtensions: <strapi:covidExtensionsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Title</th>
			<th>TextBlock1</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:covidExtensionsID />"><strapi:covidExtensionsID /></a></td>
				<td><strapi:covidExtensionsTitle /></td>
				<td><strapi:covidExtensionsTextBlock1 /></td>
				<td><strapi:covidExtensionsCreatedAt /></td>
				<td><strapi:covidExtensionsUpdatedAt /></td>
				<td><strapi:covidExtensionsPublishedAt /></td>
				<td><strapi:covidExtensionsCreatedById /></td>
				<td><strapi:covidExtensionsUpdatedById /></td>
			</tr>
		</table>

						<h2>CovidExtensionsFaqsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>CovidExtensionId</th>
									<th>FaqId</th>
									<th>FaqOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachCovidExtensionsFaqsLinks var="idIter">
									<strapi:covidExtensionsFaqsLinks>
										<tr>
											<td><a href="../covidExtensionsFaqsLinks/show.jsp?ID=<strapi:covidExtensionsFaqsLinksID />"><strapi:covidExtensionsFaqsLinksID /></a></td>
											<td><strapi:covidExtensionsFaqsLinksCovidExtensionId /></td>
											<td><strapi:covidExtensionsFaqsLinksFaqId /></td>
											<td><strapi:covidExtensionsFaqsLinksFaqOrder /></td>
											<td><a href="../covidExtensionsFaqsLinks/edit.jsp?ID=<strapi:covidExtensionsFaqsLinksID />">edit</a></td>
											<td><a href="../covidExtensionsFaqsLinks/delete.jsp?ID=<strapi:covidExtensionsFaqsLinksID />">delete</a></td>
										</tr>
									</strapi:covidExtensionsFaqsLinks>
								</strapi:foreachCovidExtensionsFaqsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../covidExtensionsFaqsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add CovidExtensionsFaqsLinks</a>
						<br/><br/>

		<strapi:foreachCovidExtensionsFaqsLinks var="idIter">
			<strapi:covidExtensionsFaqsLinks>
						<a href="../../strapi/covidExtensionsFaqsLinks/covidExtensionsFaqsLinks.jsp?ID=<strapi:covidExtensionsFaqsLinksID />"><strapi:covidExtensionsFaqsLinksID /></a>
		<strapi:covidExtensionsFaqsLinksCovidExtensionId />
		<strapi:covidExtensionsFaqsLinksFaqId />
		<strapi:covidExtensionsFaqsLinksFaqOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:covidExtensionsFaqsLinks>
			</strapi:foreachCovidExtensionsFaqsLinks>

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
</strapi:covidExtensions>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>