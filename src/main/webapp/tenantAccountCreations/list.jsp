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

						<h2>TenantAccountCreations List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
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
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantAccountCreations var="idIter">
									<strapi:tenantAccountCreations>
										<tr>
											<td><a href="../tenantAccountCreations/show.jsp?ID=<strapi:tenantAccountCreationsID />"><strapi:tenantAccountCreationsID /></a></td>
											<td><strapi:tenantAccountCreationsHeader /></td>
											<td><strapi:tenantAccountCreationsHeader2 /></td>
											<td><strapi:tenantAccountCreationsBeforeStartingHeader /></td>
											<td><strapi:tenantAccountCreationsBeforeStartingBlock /></td>
											<td><strapi:tenantAccountCreationsCreatedAt /></td>
											<td><strapi:tenantAccountCreationsUpdatedAt /></td>
											<td><strapi:tenantAccountCreationsPublishedAt /></td>
											<td><strapi:tenantAccountCreationsCreatedById /></td>
											<td><strapi:tenantAccountCreationsUpdatedById /></td>
											<td><a href="../tenantAccountCreations/edit.jsp?ID=<strapi:tenantAccountCreationsID />">edit</a></td>
											<td><a href="../tenantAccountCreations/delete.jsp?ID=<strapi:tenantAccountCreationsID />">delete</a></td>
										</tr>
									</strapi:tenantAccountCreations>
								</strapi:foreachTenantAccountCreations>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantAccountCreations/add.jsp">add TenantAccountCreations</a>
						<br/><br/>

		<strapi:foreachTenantAccountCreations var="idIter">
			<strapi:tenantAccountCreations>
						<a href="../../strapi/tenantAccountCreations/tenantAccountCreations.jsp?ID=<strapi:tenantAccountCreationsID />"><strapi:tenantAccountCreationsID /></a>
		<strapi:tenantAccountCreationsHeader />
		<strapi:tenantAccountCreationsHeader2 />
		<strapi:tenantAccountCreationsBeforeStartingHeader />
		<strapi:tenantAccountCreationsBeforeStartingBlock />
		<strapi:tenantAccountCreationsCreatedAt />
		<strapi:tenantAccountCreationsUpdatedAt />
		<strapi:tenantAccountCreationsPublishedAt />
		<strapi:tenantAccountCreationsCreatedById />
		<strapi:tenantAccountCreationsUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantAccountCreations>
			</strapi:foreachTenantAccountCreations>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>