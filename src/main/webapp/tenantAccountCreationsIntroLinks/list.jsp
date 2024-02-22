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
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>