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

						<h2>ResearcherEssentialsNavTileLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>ResearcherEssentialId</th>
									<th>ContentImageBlockLeftId</th>
									<th>ContentImageBlockLeftOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachResearcherEssentialsNavTileLinks var="idIter">
									<strapi:researcherEssentialsNavTileLinks>
										<tr>
											<td><a href="../researcherEssentialsNavTileLinks/show.jsp?ID=<strapi:researcherEssentialsNavTileLinksID />"><strapi:researcherEssentialsNavTileLinksID /></a></td>
											<td><strapi:researcherEssentialsNavTileLinksResearcherEssentialId /></td>
											<td><strapi:researcherEssentialsNavTileLinksContentImageBlockLeftId /></td>
											<td><strapi:researcherEssentialsNavTileLinksContentImageBlockLeftOrder /></td>
											<td><a href="../researcherEssentialsNavTileLinks/edit.jsp?ID=<strapi:researcherEssentialsNavTileLinksID />">edit</a></td>
											<td><a href="../researcherEssentialsNavTileLinks/delete.jsp?ID=<strapi:researcherEssentialsNavTileLinksID />">delete</a></td>
										</tr>
									</strapi:researcherEssentialsNavTileLinks>
								</strapi:foreachResearcherEssentialsNavTileLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../researcherEssentialsNavTileLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add ResearcherEssentialsNavTileLinks</a>
						<br/><br/>

		<strapi:foreachResearcherEssentialsNavTileLinks var="idIter">
			<strapi:researcherEssentialsNavTileLinks>
						<a href="../../strapi/researcherEssentialsNavTileLinks/researcherEssentialsNavTileLinks.jsp?ID=<strapi:researcherEssentialsNavTileLinksID />"><strapi:researcherEssentialsNavTileLinksID /></a>
		<strapi:researcherEssentialsNavTileLinksResearcherEssentialId />
		<strapi:researcherEssentialsNavTileLinksContentImageBlockLeftId />
		<strapi:researcherEssentialsNavTileLinksContentImageBlockLeftOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:researcherEssentialsNavTileLinks>
			</strapi:foreachResearcherEssentialsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>