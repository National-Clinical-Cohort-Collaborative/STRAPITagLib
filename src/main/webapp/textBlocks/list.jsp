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

						<h2>TextBlocks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Label</th>
									<th>Content</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTextBlocks var="idIter">
									<strapi:textBlocks>
										<tr>
											<td><a href="../textBlocks/show.jsp?ID=<strapi:textBlocksID />"><strapi:textBlocksID /></a></td>
											<td><strapi:textBlocksLabel /></td>
											<td><strapi:textBlocksContent /></td>
											<td><strapi:textBlocksCreatedAt /></td>
											<td><strapi:textBlocksUpdatedAt /></td>
											<td><strapi:textBlocksPublishedAt /></td>
											<td><strapi:textBlocksCreatedById /></td>
											<td><strapi:textBlocksUpdatedById /></td>
											<td><a href="../textBlocks/edit.jsp?ID=<strapi:textBlocksID />">edit</a></td>
											<td><a href="../textBlocks/delete.jsp?ID=<strapi:textBlocksID />">delete</a></td>
										</tr>
									</strapi:textBlocks>
								</strapi:foreachTextBlocks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../textBlocks/add.jsp">add TextBlocks</a>
						<br/><br/>

		<strapi:foreachTextBlocks var="idIter">
			<strapi:textBlocks>
						<a href="../../strapi/textBlocks/textBlocks.jsp?ID=<strapi:textBlocksID />"><strapi:textBlocksID /></a>
		<strapi:textBlocksLabel />
		<strapi:textBlocksContent />
		<strapi:textBlocksCreatedAt />
		<strapi:textBlocksUpdatedAt />
		<strapi:textBlocksPublishedAt />
		<strapi:textBlocksCreatedById />
		<strapi:textBlocksUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:textBlocks>
			</strapi:foreachTextBlocks>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>