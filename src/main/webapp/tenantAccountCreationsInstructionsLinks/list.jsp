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
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>