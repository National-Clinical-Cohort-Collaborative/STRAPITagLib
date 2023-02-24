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

						<h2>BiosBioGroupLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>BioId</th>
									<th>BioGroupId</th>
									<th>BioOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachBiosBioGroupLinks var="idIter">
									<strapi:biosBioGroupLinks>
										<tr>
											<td><a href="../biosBioGroupLinks/show.jsp?ID=<strapi:biosBioGroupLinksID />"><strapi:biosBioGroupLinksID /></a></td>
											<td><strapi:biosBioGroupLinksBioId /></td>
											<td><strapi:biosBioGroupLinksBioGroupId /></td>
											<td><strapi:biosBioGroupLinksBioOrder /></td>
											<td><a href="../biosBioGroupLinks/edit.jsp?ID=<strapi:biosBioGroupLinksID />">edit</a></td>
											<td><a href="../biosBioGroupLinks/delete.jsp?ID=<strapi:biosBioGroupLinksID />">delete</a></td>
										</tr>
									</strapi:biosBioGroupLinks>
								</strapi:foreachBiosBioGroupLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../biosBioGroupLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add BiosBioGroupLinks</a>
						<br/><br/>

		<strapi:foreachBiosBioGroupLinks var="idIter">
			<strapi:biosBioGroupLinks>
						<a href="../../strapi/biosBioGroupLinks/biosBioGroupLinks.jsp?ID=<strapi:biosBioGroupLinksID />"><strapi:biosBioGroupLinksID /></a>
		<strapi:biosBioGroupLinksBioId />
		<strapi:biosBioGroupLinksBioGroupId />
		<strapi:biosBioGroupLinksBioOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:biosBioGroupLinks>
			</strapi:foreachBiosBioGroupLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>