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

						<h2>ForumsForumPresentationLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>ForumId</th>
									<th>ForumPresentationId</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachForumsForumPresentationLinks var="idIter">
									<strapi:forumsForumPresentationLinks>
										<tr>
											<td><a href="../forumsForumPresentationLinks/show.jsp?ID=<strapi:forumsForumPresentationLinksID />"><strapi:forumsForumPresentationLinksID /></a></td>
											<td><strapi:forumsForumPresentationLinksForumId /></td>
											<td><strapi:forumsForumPresentationLinksForumPresentationId /></td>
											<td><a href="../forumsForumPresentationLinks/edit.jsp?ID=<strapi:forumsForumPresentationLinksID />">edit</a></td>
											<td><a href="../forumsForumPresentationLinks/delete.jsp?ID=<strapi:forumsForumPresentationLinksID />">delete</a></td>
										</tr>
									</strapi:forumsForumPresentationLinks>
								</strapi:foreachForumsForumPresentationLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../forumsForumPresentationLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add ForumsForumPresentationLinks</a>
						<br/><br/>

		<strapi:foreachForumsForumPresentationLinks var="idIter">
			<strapi:forumsForumPresentationLinks>
						<a href="../../strapi/forumsForumPresentationLinks/forumsForumPresentationLinks.jsp?ID=<strapi:forumsForumPresentationLinksID />"><strapi:forumsForumPresentationLinksID /></a>
		<strapi:forumsForumPresentationLinksForumId />
		<strapi:forumsForumPresentationLinksForumPresentationId />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:forumsForumPresentationLinks>
			</strapi:foreachForumsForumPresentationLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>