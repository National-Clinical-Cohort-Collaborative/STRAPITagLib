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
<fmt:parseNumber var="ID" value="${param.ID}" />
<strapi:tenantAccountCreations ID="${ID}">
	<h2>TenantAccountCreations: <strapi:tenantAccountCreationsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Header</th>
			<th>Header2</th>
			<th>BeforeStartingHeader</th>
			<th>BeforeStartingBlock</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:tenantAccountCreationsID />"><strapi:tenantAccountCreationsID /></a></td>
				<td><strapi:tenantAccountCreationsHeader /></td>
				<td><strapi:tenantAccountCreationsHeader2 /></td>
				<td><strapi:tenantAccountCreationsBeforeStartingHeader /></td>
				<td><strapi:tenantAccountCreationsBeforeStartingBlock /></td>
				<td><strapi:tenantAccountCreationsCreatedAt /></td>
				<td><strapi:tenantAccountCreationsUpdatedAt /></td>
				<td><strapi:tenantAccountCreationsPublishedAt /></td>
				<td><strapi:tenantAccountCreationsCreatedById /></td>
				<td><strapi:tenantAccountCreationsUpdatedById /></td>
			</tr>
		</table>

						<h2>TenantAccountCreationsInstructionsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>TenantAccountCreationId</th>
									<th>ContentImageBlockRightId</th>
									<th>ContentImageBlockRightOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantAccountCreationsInstructionsLinks var="idIter">
									<strapi:tenantAccountCreationsInstructionsLinks>
										<tr>
											<td><a href="../tenantAccountCreationsInstructionsLinks/show.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksID />"><strapi:tenantAccountCreationsInstructionsLinksID /></a></td>
											<td><strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId /></td>
											<td><strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId /></td>
											<td><strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder /></td>
											<td><a href="../tenantAccountCreationsInstructionsLinks/edit.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksID />">edit</a></td>
											<td><a href="../tenantAccountCreationsInstructionsLinks/delete.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksID />">delete</a></td>
										</tr>
									</strapi:tenantAccountCreationsInstructionsLinks>
								</strapi:foreachTenantAccountCreationsInstructionsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantAccountCreationsInstructionsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add TenantAccountCreationsInstructionsLinks</a>
						<br/><br/>

		<strapi:foreachTenantAccountCreationsInstructionsLinks var="idIter">
			<strapi:tenantAccountCreationsInstructionsLinks>
						<a href="../../strapi/tenantAccountCreationsInstructionsLinks/tenantAccountCreationsInstructionsLinks.jsp?ID=<strapi:tenantAccountCreationsInstructionsLinksID />"><strapi:tenantAccountCreationsInstructionsLinksID /></a>
		<strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId />
		<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId />
		<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantAccountCreationsInstructionsLinks>
			</strapi:foreachTenantAccountCreationsInstructionsLinks>

						<h2>TenantAccountCreationsIntroLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>TenantAccountCreationId</th>
									<th>ContentImageBlockRightId</th>
									<th>ContentImageBlockRightOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantAccountCreationsIntroLinks var="idIter">
									<strapi:tenantAccountCreationsIntroLinks>
										<tr>
											<td><a href="../tenantAccountCreationsIntroLinks/show.jsp?ID=<strapi:tenantAccountCreationsIntroLinksID />"><strapi:tenantAccountCreationsIntroLinksID /></a></td>
											<td><strapi:tenantAccountCreationsIntroLinksTenantAccountCreationId /></td>
											<td><strapi:tenantAccountCreationsIntroLinksContentImageBlockRightId /></td>
											<td><strapi:tenantAccountCreationsIntroLinksContentImageBlockRightOrder /></td>
											<td><a href="../tenantAccountCreationsIntroLinks/edit.jsp?ID=<strapi:tenantAccountCreationsIntroLinksID />">edit</a></td>
											<td><a href="../tenantAccountCreationsIntroLinks/delete.jsp?ID=<strapi:tenantAccountCreationsIntroLinksID />">delete</a></td>
										</tr>
									</strapi:tenantAccountCreationsIntroLinks>
								</strapi:foreachTenantAccountCreationsIntroLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantAccountCreationsIntroLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add TenantAccountCreationsIntroLinks</a>
						<br/><br/>

		<strapi:foreachTenantAccountCreationsIntroLinks var="idIter">
			<strapi:tenantAccountCreationsIntroLinks>
						<a href="../../strapi/tenantAccountCreationsIntroLinks/tenantAccountCreationsIntroLinks.jsp?ID=<strapi:tenantAccountCreationsIntroLinksID />"><strapi:tenantAccountCreationsIntroLinksID /></a>
		<strapi:tenantAccountCreationsIntroLinksTenantAccountCreationId />
		<strapi:tenantAccountCreationsIntroLinksContentImageBlockRightId />
		<strapi:tenantAccountCreationsIntroLinksContentImageBlockRightOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantAccountCreationsIntroLinks>
			</strapi:foreachTenantAccountCreationsIntroLinks>
</strapi:tenantAccountCreations>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>