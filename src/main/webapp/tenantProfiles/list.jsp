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

						<h2>TenantProfiles List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Blurb</th>
									<th>Description</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th>Label</th>
									<th>Url</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantProfiles var="idIter">
									<strapi:tenantProfiles>
										<tr>
											<td><a href="../tenantProfiles/show.jsp?ID=<strapi:tenantProfilesID />"><strapi:tenantProfilesID /></a></td>
											<td><strapi:tenantProfilesBlurb /></td>
											<td><strapi:tenantProfilesDescription /></td>
											<td><strapi:tenantProfilesCreatedAt /></td>
											<td><strapi:tenantProfilesUpdatedAt /></td>
											<td><strapi:tenantProfilesPublishedAt /></td>
											<td><strapi:tenantProfilesCreatedById /></td>
											<td><strapi:tenantProfilesUpdatedById /></td>
											<td><strapi:tenantProfilesLabel /></td>
											<td><strapi:tenantProfilesUrl /></td>
											<td><a href="../tenantProfiles/edit.jsp?ID=<strapi:tenantProfilesID />">edit</a></td>
											<td><a href="../tenantProfiles/delete.jsp?ID=<strapi:tenantProfilesID />">delete</a></td>
										</tr>
									</strapi:tenantProfiles>
								</strapi:foreachTenantProfiles>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantProfiles/add.jsp">add TenantProfiles</a>
						<br/><br/>

		<strapi:foreachTenantProfiles var="idIter">
			<strapi:tenantProfiles>
						<a href="../../strapi/tenantProfiles/tenantProfiles.jsp?ID=<strapi:tenantProfilesID />"><strapi:tenantProfilesID /></a>
		<strapi:tenantProfilesBlurb />
		<strapi:tenantProfilesDescription />
		<strapi:tenantProfilesCreatedAt />
		<strapi:tenantProfilesUpdatedAt />
		<strapi:tenantProfilesPublishedAt />
		<strapi:tenantProfilesCreatedById />
		<strapi:tenantProfilesUpdatedById />
		<strapi:tenantProfilesLabel />
		<strapi:tenantProfilesUrl />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantProfiles>
			</strapi:foreachTenantProfiles>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>