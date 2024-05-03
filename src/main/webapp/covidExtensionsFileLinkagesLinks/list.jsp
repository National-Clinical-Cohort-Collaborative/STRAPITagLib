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
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>