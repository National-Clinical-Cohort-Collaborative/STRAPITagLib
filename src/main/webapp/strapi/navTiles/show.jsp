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
<strapi:navTiles ID="${ID}">
	<h2>NavTiles: <strapi:navTilesID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Url</th>
			<th>UrlLabel</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:navTilesID />"><strapi:navTilesID /></a></td>
				<td><strapi:navTilesName /></td>
				<td><strapi:navTilesUrl /></td>
				<td><strapi:navTilesUrlLabel /></td>
				<td><strapi:navTilesCreatedAt /></td>
				<td><strapi:navTilesUpdatedAt /></td>
				<td><strapi:navTilesPublishedAt /></td>
				<td><strapi:navTilesCreatedById /></td>
				<td><strapi:navTilesUpdatedById /></td>
			</tr>
		</table>

						<h2>WorkstreamInstancesNavTilesLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>WorkstreamInstanceId</th>
									<th>NavTileId</th>
									<th>NavTileOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachWorkstreamInstancesNavTilesLinks var="idIter">
									<strapi:workstreamInstancesNavTilesLinks>
										<tr>
											<td><a href="../workstreamInstancesNavTilesLinks/show.jsp?ID=<strapi:workstreamInstancesNavTilesLinksID />"><strapi:workstreamInstancesNavTilesLinksID /></a></td>
											<td><strapi:workstreamInstancesNavTilesLinksWorkstreamInstanceId /></td>
											<td><strapi:workstreamInstancesNavTilesLinksNavTileId /></td>
											<td><strapi:workstreamInstancesNavTilesLinksNavTileOrder /></td>
											<td><a href="../workstreamInstancesNavTilesLinks/edit.jsp?ID=<strapi:workstreamInstancesNavTilesLinksID />">edit</a></td>
											<td><a href="../workstreamInstancesNavTilesLinks/delete.jsp?ID=<strapi:workstreamInstancesNavTilesLinksID />">delete</a></td>
										</tr>
									</strapi:workstreamInstancesNavTilesLinks>
								</strapi:foreachWorkstreamInstancesNavTilesLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../workstreamInstancesNavTilesLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add WorkstreamInstancesNavTilesLinks</a>
						<br/><br/>

		<strapi:foreachWorkstreamInstancesNavTilesLinks var="idIter">
			<strapi:workstreamInstancesNavTilesLinks>
						<a href="../../strapi/workstreamInstancesNavTilesLinks/workstreamInstancesNavTilesLinks.jsp?ID=<strapi:workstreamInstancesNavTilesLinksID />"><strapi:workstreamInstancesNavTilesLinksID /></a>
		<strapi:workstreamInstancesNavTilesLinksWorkstreamInstanceId />
		<strapi:workstreamInstancesNavTilesLinksNavTileId />
		<strapi:workstreamInstancesNavTilesLinksNavTileOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:workstreamInstancesNavTilesLinks>
			</strapi:foreachWorkstreamInstancesNavTilesLinks>

						<h2>WorkstreamsNavTilesLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>WorkstreamId</th>
									<th>NavTileId</th>
									<th>NavTileOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachWorkstreamsNavTilesLinks var="idIter">
									<strapi:workstreamsNavTilesLinks>
										<tr>
											<td><a href="../workstreamsNavTilesLinks/show.jsp?ID=<strapi:workstreamsNavTilesLinksID />"><strapi:workstreamsNavTilesLinksID /></a></td>
											<td><strapi:workstreamsNavTilesLinksWorkstreamId /></td>
											<td><strapi:workstreamsNavTilesLinksNavTileId /></td>
											<td><strapi:workstreamsNavTilesLinksNavTileOrder /></td>
											<td><a href="../workstreamsNavTilesLinks/edit.jsp?ID=<strapi:workstreamsNavTilesLinksID />">edit</a></td>
											<td><a href="../workstreamsNavTilesLinks/delete.jsp?ID=<strapi:workstreamsNavTilesLinksID />">delete</a></td>
										</tr>
									</strapi:workstreamsNavTilesLinks>
								</strapi:foreachWorkstreamsNavTilesLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../workstreamsNavTilesLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add WorkstreamsNavTilesLinks</a>
						<br/><br/>

		<strapi:foreachWorkstreamsNavTilesLinks var="idIter">
			<strapi:workstreamsNavTilesLinks>
						<a href="../../strapi/workstreamsNavTilesLinks/workstreamsNavTilesLinks.jsp?ID=<strapi:workstreamsNavTilesLinksID />"><strapi:workstreamsNavTilesLinksID /></a>
		<strapi:workstreamsNavTilesLinksWorkstreamId />
		<strapi:workstreamsNavTilesLinksNavTileId />
		<strapi:workstreamsNavTilesLinksNavTileOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:workstreamsNavTilesLinks>
			</strapi:foreachWorkstreamsNavTilesLinks>
</strapi:navTiles>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>