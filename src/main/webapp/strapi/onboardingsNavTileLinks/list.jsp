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

						<h2>OnboardingsNavTileLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>OnboardingId</th>
									<th>ContentImageBlockLeftId</th>
									<th>ContentImageBlockLeftOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachOnboardingsNavTileLinks var="idIter">
									<strapi:onboardingsNavTileLinks>
										<tr>
											<td><a href="../onboardingsNavTileLinks/show.jsp?ID=<strapi:onboardingsNavTileLinksID />"><strapi:onboardingsNavTileLinksID /></a></td>
											<td><strapi:onboardingsNavTileLinksOnboardingId /></td>
											<td><strapi:onboardingsNavTileLinksContentImageBlockLeftId /></td>
											<td><strapi:onboardingsNavTileLinksContentImageBlockLeftOrder /></td>
											<td><a href="../onboardingsNavTileLinks/edit.jsp?ID=<strapi:onboardingsNavTileLinksID />">edit</a></td>
											<td><a href="../onboardingsNavTileLinks/delete.jsp?ID=<strapi:onboardingsNavTileLinksID />">delete</a></td>
										</tr>
									</strapi:onboardingsNavTileLinks>
								</strapi:foreachOnboardingsNavTileLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../onboardingsNavTileLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add OnboardingsNavTileLinks</a>
						<br/><br/>

		<strapi:foreachOnboardingsNavTileLinks var="idIter">
			<strapi:onboardingsNavTileLinks>
						<a href="../../strapi/onboardingsNavTileLinks/onboardingsNavTileLinks.jsp?ID=<strapi:onboardingsNavTileLinksID />"><strapi:onboardingsNavTileLinksID /></a>
		<strapi:onboardingsNavTileLinksOnboardingId />
		<strapi:onboardingsNavTileLinksContentImageBlockLeftId />
		<strapi:onboardingsNavTileLinksContentImageBlockLeftOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:onboardingsNavTileLinks>
			</strapi:foreachOnboardingsNavTileLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>