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

						<h2>InstitutionalEssentialsNavTileLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>InstitutionalEssentialId</th>
									<th>ContentImageBlockLeftId</th>
									<th>ContentImageBlockLeftOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachInstitutionalEssentialsNavTileLinks var="idIter">
									<strapi:institutionalEssentialsNavTileLinks>
										<tr>
											<td><a href="../institutionalEssentialsNavTileLinks/show.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />"><strapi:institutionalEssentialsNavTileLinksID /></a></td>
											<td><strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId /></td>
											<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId /></td>
											<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder /></td>
											<td><a href="../institutionalEssentialsNavTileLinks/edit.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />">edit</a></td>
											<td><a href="../institutionalEssentialsNavTileLinks/delete.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />">delete</a></td>
										</tr>
									</strapi:institutionalEssentialsNavTileLinks>
								</strapi:foreachInstitutionalEssentialsNavTileLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../institutionalEssentialsNavTileLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add InstitutionalEssentialsNavTileLinks</a>
						<br/><br/>

		<strapi:foreachInstitutionalEssentialsNavTileLinks var="idIter">
			<strapi:institutionalEssentialsNavTileLinks>
						<a href="../../strapi/institutionalEssentialsNavTileLinks/institutionalEssentialsNavTileLinks.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />"><strapi:institutionalEssentialsNavTileLinksID /></a>
		<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId />
		<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId />
		<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:institutionalEssentialsNavTileLinks>
			</strapi:foreachInstitutionalEssentialsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>