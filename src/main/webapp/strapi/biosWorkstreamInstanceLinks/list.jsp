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

						<h2>BiosWorkstreamInstanceLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>BioId</th>
									<th>WorkstreamInstanceId</th>
									<th>BioOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachBiosWorkstreamInstanceLinks var="idIter">
									<strapi:biosWorkstreamInstanceLinks>
										<tr>
											<td><a href="../biosWorkstreamInstanceLinks/show.jsp?ID=<strapi:biosWorkstreamInstanceLinksID />"><strapi:biosWorkstreamInstanceLinksID /></a></td>
											<td><strapi:biosWorkstreamInstanceLinksBioId /></td>
											<td><strapi:biosWorkstreamInstanceLinksWorkstreamInstanceId /></td>
											<td><strapi:biosWorkstreamInstanceLinksBioOrder /></td>
											<td><a href="../biosWorkstreamInstanceLinks/edit.jsp?ID=<strapi:biosWorkstreamInstanceLinksID />">edit</a></td>
											<td><a href="../biosWorkstreamInstanceLinks/delete.jsp?ID=<strapi:biosWorkstreamInstanceLinksID />">delete</a></td>
										</tr>
									</strapi:biosWorkstreamInstanceLinks>
								</strapi:foreachBiosWorkstreamInstanceLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../biosWorkstreamInstanceLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add BiosWorkstreamInstanceLinks</a>
						<br/><br/>

		<strapi:foreachBiosWorkstreamInstanceLinks var="idIter">
			<strapi:biosWorkstreamInstanceLinks>
						<a href="../../strapi/biosWorkstreamInstanceLinks/biosWorkstreamInstanceLinks.jsp?ID=<strapi:biosWorkstreamInstanceLinksID />"><strapi:biosWorkstreamInstanceLinksID /></a>
		<strapi:biosWorkstreamInstanceLinksBioId />
		<strapi:biosWorkstreamInstanceLinksWorkstreamInstanceId />
		<strapi:biosWorkstreamInstanceLinksBioOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:biosWorkstreamInstanceLinks>
			</strapi:foreachBiosWorkstreamInstanceLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>