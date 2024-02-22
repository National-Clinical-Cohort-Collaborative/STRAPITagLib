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

						<h2>TenantDuaLists List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>Header</th>
									<th>Block1</th>
									<th>CreatedAt</th>
									<th>UpdatedAt</th>
									<th>PublishedAt</th>
									<th>CreatedById</th>
									<th>UpdatedById</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachTenantDuaLists var="idIter">
									<strapi:tenantDuaLists>
										<tr>
											<td><a href="../tenantDuaLists/show.jsp?ID=<strapi:tenantDuaListsID />"><strapi:tenantDuaListsID /></a></td>
											<td><strapi:tenantDuaListsHeader /></td>
											<td><strapi:tenantDuaListsBlock1 /></td>
											<td><strapi:tenantDuaListsCreatedAt /></td>
											<td><strapi:tenantDuaListsUpdatedAt /></td>
											<td><strapi:tenantDuaListsPublishedAt /></td>
											<td><strapi:tenantDuaListsCreatedById /></td>
											<td><strapi:tenantDuaListsUpdatedById /></td>
											<td><a href="../tenantDuaLists/edit.jsp?ID=<strapi:tenantDuaListsID />">edit</a></td>
											<td><a href="../tenantDuaLists/delete.jsp?ID=<strapi:tenantDuaListsID />">delete</a></td>
										</tr>
									</strapi:tenantDuaLists>
								</strapi:foreachTenantDuaLists>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../tenantDuaLists/add.jsp">add TenantDuaLists</a>
						<br/><br/>

		<strapi:foreachTenantDuaLists var="idIter">
			<strapi:tenantDuaLists>
						<a href="../../strapi/tenantDuaLists/tenantDuaLists.jsp?ID=<strapi:tenantDuaListsID />"><strapi:tenantDuaListsID /></a>
		<strapi:tenantDuaListsHeader />
		<strapi:tenantDuaListsBlock1 />
		<strapi:tenantDuaListsCreatedAt />
		<strapi:tenantDuaListsUpdatedAt />
		<strapi:tenantDuaListsPublishedAt />
		<strapi:tenantDuaListsCreatedById />
		<strapi:tenantDuaListsUpdatedById />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:tenantDuaLists>
			</strapi:foreachTenantDuaLists>
                </div>
            </div>
        </div>
        <jsp:include page="../footer.jsp" />
    </body>
</html>