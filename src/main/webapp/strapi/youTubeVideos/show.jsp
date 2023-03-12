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
<strapi:youTubeVideos ID="${ID}">
	<h2>YouTubeVideos: <strapi:youTubeVideosID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Header</th>
			<th>Url</th>
			<th>Width</th>
			<th>Height</th>
			<th>Footer</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:youTubeVideosID />"><strapi:youTubeVideosID /></a></td>
				<td><strapi:youTubeVideosHeader /></td>
				<td><strapi:youTubeVideosUrl /></td>
				<td><strapi:youTubeVideosWidth /></td>
				<td><strapi:youTubeVideosHeight /></td>
				<td><strapi:youTubeVideosFooter /></td>
				<td><strapi:youTubeVideosCreatedAt /></td>
				<td><strapi:youTubeVideosUpdatedAt /></td>
				<td><strapi:youTubeVideosPublishedAt /></td>
				<td><strapi:youTubeVideosCreatedById /></td>
				<td><strapi:youTubeVideosUpdatedById /></td>
			</tr>
		</table>

						<h2>ExternalDatasetsYouTubeVideoLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>ExternalDatasetId</th>
									<th>YouTubeVideoId</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachExternalDatasetsYouTubeVideoLinks var="idIter">
									<strapi:externalDatasetsYouTubeVideoLinks>
										<tr>
											<td><a href="../externalDatasetsYouTubeVideoLinks/show.jsp?ID=<strapi:externalDatasetsYouTubeVideoLinksID />"><strapi:externalDatasetsYouTubeVideoLinksID /></a></td>
											<td><strapi:externalDatasetsYouTubeVideoLinksExternalDatasetId /></td>
											<td><strapi:externalDatasetsYouTubeVideoLinksYouTubeVideoId /></td>
											<td><a href="../externalDatasetsYouTubeVideoLinks/edit.jsp?ID=<strapi:externalDatasetsYouTubeVideoLinksID />">edit</a></td>
											<td><a href="../externalDatasetsYouTubeVideoLinks/delete.jsp?ID=<strapi:externalDatasetsYouTubeVideoLinksID />">delete</a></td>
										</tr>
									</strapi:externalDatasetsYouTubeVideoLinks>
								</strapi:foreachExternalDatasetsYouTubeVideoLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../externalDatasetsYouTubeVideoLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add ExternalDatasetsYouTubeVideoLinks</a>
						<br/><br/>

		<strapi:foreachExternalDatasetsYouTubeVideoLinks var="idIter">
			<strapi:externalDatasetsYouTubeVideoLinks>
						<a href="../../strapi/externalDatasetsYouTubeVideoLinks/externalDatasetsYouTubeVideoLinks.jsp?ID=<strapi:externalDatasetsYouTubeVideoLinksID />"><strapi:externalDatasetsYouTubeVideoLinksID /></a>
		<strapi:externalDatasetsYouTubeVideoLinksExternalDatasetId />
		<strapi:externalDatasetsYouTubeVideoLinksYouTubeVideoId />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:externalDatasetsYouTubeVideoLinks>
			</strapi:foreachExternalDatasetsYouTubeVideoLinks>

						<h2>PresentationsYouTubeVideosLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>PresentationId</th>
									<th>YouTubeVideoId</th>
									<th>YouTubeVideoOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachPresentationsYouTubeVideosLinks var="idIter">
									<strapi:presentationsYouTubeVideosLinks>
										<tr>
											<td><a href="../presentationsYouTubeVideosLinks/show.jsp?ID=<strapi:presentationsYouTubeVideosLinksID />"><strapi:presentationsYouTubeVideosLinksID /></a></td>
											<td><strapi:presentationsYouTubeVideosLinksPresentationId /></td>
											<td><strapi:presentationsYouTubeVideosLinksYouTubeVideoId /></td>
											<td><strapi:presentationsYouTubeVideosLinksYouTubeVideoOrder /></td>
											<td><a href="../presentationsYouTubeVideosLinks/edit.jsp?ID=<strapi:presentationsYouTubeVideosLinksID />">edit</a></td>
											<td><a href="../presentationsYouTubeVideosLinks/delete.jsp?ID=<strapi:presentationsYouTubeVideosLinksID />">delete</a></td>
										</tr>
									</strapi:presentationsYouTubeVideosLinks>
								</strapi:foreachPresentationsYouTubeVideosLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../presentationsYouTubeVideosLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add PresentationsYouTubeVideosLinks</a>
						<br/><br/>

		<strapi:foreachPresentationsYouTubeVideosLinks var="idIter">
			<strapi:presentationsYouTubeVideosLinks>
						<a href="../../strapi/presentationsYouTubeVideosLinks/presentationsYouTubeVideosLinks.jsp?ID=<strapi:presentationsYouTubeVideosLinksID />"><strapi:presentationsYouTubeVideosLinksID /></a>
		<strapi:presentationsYouTubeVideosLinksPresentationId />
		<strapi:presentationsYouTubeVideosLinksYouTubeVideoId />
		<strapi:presentationsYouTubeVideosLinksYouTubeVideoOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:presentationsYouTubeVideosLinks>
			</strapi:foreachPresentationsYouTubeVideosLinks>

						<h2>WorkstreamsYouTubeVideoLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>WorkstreamId</th>
									<th>YouTubeVideoId</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachWorkstreamsYouTubeVideoLinks var="idIter">
									<strapi:workstreamsYouTubeVideoLinks>
										<tr>
											<td><a href="../workstreamsYouTubeVideoLinks/show.jsp?ID=<strapi:workstreamsYouTubeVideoLinksID />"><strapi:workstreamsYouTubeVideoLinksID /></a></td>
											<td><strapi:workstreamsYouTubeVideoLinksWorkstreamId /></td>
											<td><strapi:workstreamsYouTubeVideoLinksYouTubeVideoId /></td>
											<td><a href="../workstreamsYouTubeVideoLinks/edit.jsp?ID=<strapi:workstreamsYouTubeVideoLinksID />">edit</a></td>
											<td><a href="../workstreamsYouTubeVideoLinks/delete.jsp?ID=<strapi:workstreamsYouTubeVideoLinksID />">delete</a></td>
										</tr>
									</strapi:workstreamsYouTubeVideoLinks>
								</strapi:foreachWorkstreamsYouTubeVideoLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../workstreamsYouTubeVideoLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add WorkstreamsYouTubeVideoLinks</a>
						<br/><br/>

		<strapi:foreachWorkstreamsYouTubeVideoLinks var="idIter">
			<strapi:workstreamsYouTubeVideoLinks>
						<a href="../../strapi/workstreamsYouTubeVideoLinks/workstreamsYouTubeVideoLinks.jsp?ID=<strapi:workstreamsYouTubeVideoLinksID />"><strapi:workstreamsYouTubeVideoLinksID /></a>
		<strapi:workstreamsYouTubeVideoLinksWorkstreamId />
		<strapi:workstreamsYouTubeVideoLinksYouTubeVideoId />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:workstreamsYouTubeVideoLinks>
			</strapi:foreachWorkstreamsYouTubeVideoLinks>
</strapi:youTubeVideos>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>