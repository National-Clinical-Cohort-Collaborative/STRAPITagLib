<%@ include file="../_include.jsp" %>
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
<fmt:parseNumber var="ID" value="${param.ID}" />
<strapi:landingPages ID="${ID}">
	<h2>LandingPages: <strapi:landingPagesID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Welcome</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:landingPagesID />"><strapi:landingPagesID /></a></td>
				<td><strapi:landingPagesWelcome /></td>
				<td><strapi:landingPagesCreatedAt /></td>
				<td><strapi:landingPagesUpdatedAt /></td>
				<td><strapi:landingPagesPublishedAt /></td>
				<td><strapi:landingPagesCreatedById /></td>
				<td><strapi:landingPagesUpdatedById /></td>
			</tr>
		</table>

						<h2>LandingPagesDomainTeamsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>LandingPageId</th>
									<th>DomainTeamId</th>
									<th>DomainTeamOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachLandingPagesDomainTeamsLinks var="idIter">
									<strapi:landingPagesDomainTeamsLinks>
										<tr>
											<td><a href="../landingPagesDomainTeamsLinks/show.jsp?ID=<strapi:landingPagesDomainTeamsLinksID />"><strapi:landingPagesDomainTeamsLinksID /></a></td>
											<td><strapi:landingPagesDomainTeamsLinksLandingPageId /></td>
											<td><strapi:landingPagesDomainTeamsLinksDomainTeamId /></td>
											<td><strapi:landingPagesDomainTeamsLinksDomainTeamOrder /></td>
											<td><a href="../landingPagesDomainTeamsLinks/edit.jsp?ID=<strapi:landingPagesDomainTeamsLinksID />">edit</a></td>
											<td><a href="../landingPagesDomainTeamsLinks/delete.jsp?ID=<strapi:landingPagesDomainTeamsLinksID />">delete</a></td>
										</tr>
									</strapi:landingPagesDomainTeamsLinks>
								</strapi:foreachLandingPagesDomainTeamsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../landingPagesDomainTeamsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add LandingPagesDomainTeamsLinks</a>
						<br/><br/>

		<strapi:foreachLandingPagesDomainTeamsLinks var="idIter">
			<strapi:landingPagesDomainTeamsLinks>
						<a href="../../strapi/landingPagesDomainTeamsLinks/landingPagesDomainTeamsLinks.jsp?ID=<strapi:landingPagesDomainTeamsLinksID />"><strapi:landingPagesDomainTeamsLinksID /></a>
		<strapi:landingPagesDomainTeamsLinksLandingPageId />
		<strapi:landingPagesDomainTeamsLinksDomainTeamId />
		<strapi:landingPagesDomainTeamsLinksDomainTeamOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:landingPagesDomainTeamsLinks>
			</strapi:foreachLandingPagesDomainTeamsLinks>
</strapi:landingPages>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>