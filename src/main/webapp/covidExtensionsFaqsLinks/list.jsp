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
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>