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

						<h2>TenantFooters List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Label</th>
									<th>GrantCite</th>
									<th>Credits</th>
									<th>Signup</th>
									<th>Social</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantFooters var="idIter">
									<strapi:tenantFooters>
										<tr>
											<td><a href="../tenantFooters/show.jsp?ID=<strapi:tenantFootersID />"><strapi:tenantFootersID /></a></td>
											<td><strapi:tenantFootersLabel /></td>
											<td><strapi:tenantFootersGrantCite /></td>
											<td><strapi:tenantFootersCredits /></td>
											<td><strapi:tenantFootersSignup /></td>
											<td><strapi:tenantFootersSocial /></td>
											<td><strapi:tenantFootersCreatedAt /></td>
											<td><strapi:tenantFootersUpdatedAt /></td>
											<td><strapi:tenantFootersPublishedAt /></td>
											<td><strapi:tenantFootersCreatedById /></td>
											<td><strapi:tenantFootersUpdatedById /></td>
											<td><a href="../tenantFooters/edit.jsp?ID=<strapi:tenantFootersID />">edit</a></td>
											<td><a href="../tenantFooters/delete.jsp?ID=<strapi:tenantFootersID />">delete</a></td>
										</tr>
									</strapi:tenantFooters>
								</strapi:foreachTenantFooters>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantFooters/add.jsp">add TenantFooters</a>
						<br/><br/>

		<strapi:foreachTenantFooters var="idIter">
			<strapi:tenantFooters>
						<a href="../../strapi/tenantFooters/tenantFooters.jsp?ID=<strapi:tenantFootersID />"><strapi:tenantFootersID /></a>
		<strapi:tenantFootersLabel />
		<strapi:tenantFootersGrantCite />
		<strapi:tenantFootersCredits />
		<strapi:tenantFootersSignup />
		<strapi:tenantFootersSocial />
		<strapi:tenantFootersCreatedAt />
		<strapi:tenantFootersUpdatedAt />
		<strapi:tenantFootersPublishedAt />
		<strapi:tenantFootersCreatedById />
		<strapi:tenantFootersUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantFooters>
			</strapi:foreachTenantFooters>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>