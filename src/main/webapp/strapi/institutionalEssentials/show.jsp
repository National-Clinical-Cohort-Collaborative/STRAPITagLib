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
<fmt:parseNumber var="ID" value="${param.ID}" />
<strapi:institutionalEssentials ID="${ID}">
	<h2>InstitutionalEssentials: <strapi:institutionalEssentialsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Header</th>
			<th>Header2</th>
			<th>Block</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:institutionalEssentialsID />"><strapi:institutionalEssentialsID /></a></td>
				<td><strapi:institutionalEssentialsHeader /></td>
				<td><strapi:institutionalEssentialsHeader2 /></td>
				<td><strapi:institutionalEssentialsBlock /></td>
				<td><strapi:institutionalEssentialsCreatedAt /></td>
				<td><strapi:institutionalEssentialsUpdatedAt /></td>
				<td><strapi:institutionalEssentialsPublishedAt /></td>
				<td><strapi:institutionalEssentialsCreatedById /></td>
				<td><strapi:institutionalEssentialsUpdatedById /></td>
			</tr>
		</table>

						<h2>InstitutionalEssentialsJoinBlockLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>InstitutionalEssentialId</th>
									<th>ContentImageBlockLeftId</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachInstitutionalEssentialsJoinBlockLinks var="idIter">
									<strapi:institutionalEssentialsJoinBlockLinks>
										<tr>
											<td><a href="../institutionalEssentialsJoinBlockLinks/show.jsp?ID=<strapi:institutionalEssentialsJoinBlockLinksID />"><strapi:institutionalEssentialsJoinBlockLinksID /></a></td>
											<td><strapi:institutionalEssentialsJoinBlockLinksInstitutionalEssentialId /></td>
											<td><strapi:institutionalEssentialsJoinBlockLinksContentImageBlockLeftId /></td>
											<td><a href="../institutionalEssentialsJoinBlockLinks/edit.jsp?ID=<strapi:institutionalEssentialsJoinBlockLinksID />">edit</a></td>
											<td><a href="../institutionalEssentialsJoinBlockLinks/delete.jsp?ID=<strapi:institutionalEssentialsJoinBlockLinksID />">delete</a></td>
										</tr>
									</strapi:institutionalEssentialsJoinBlockLinks>
								</strapi:foreachInstitutionalEssentialsJoinBlockLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../institutionalEssentialsJoinBlockLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add InstitutionalEssentialsJoinBlockLinks</a>
						<br/><br/>

		<strapi:foreachInstitutionalEssentialsJoinBlockLinks var="idIter">
			<strapi:institutionalEssentialsJoinBlockLinks>
						<a href="../../strapi/institutionalEssentialsJoinBlockLinks/institutionalEssentialsJoinBlockLinks.jsp?ID=<strapi:institutionalEssentialsJoinBlockLinksID />"><strapi:institutionalEssentialsJoinBlockLinksID /></a>
		<strapi:institutionalEssentialsJoinBlockLinksInstitutionalEssentialId />
		<strapi:institutionalEssentialsJoinBlockLinksContentImageBlockLeftId />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:institutionalEssentialsJoinBlockLinks>
			</strapi:foreachInstitutionalEssentialsJoinBlockLinks>

						<h2>InstitutionalEssentialsNavTileLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>InstitutionalEssentialId</th>
									<th>ContentImageBlockLeftId</th>
									<th>ContentImageBlockLeftOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachInstitutionalEssentialsNavTileLinks var="idIter">
									<strapi:institutionalEssentialsNavTileLinks>
										<tr>
											<td><a href="../institutionalEssentialsNavTileLinks/show.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />"><strapi:institutionalEssentialsNavTileLinksID /></a></td>
											<td><strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId /></td>
											<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId /></td>
											<td><strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder /></td>
											<td><a href="../institutionalEssentialsNavTileLinks/edit.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />">edit</a></td>
											<td><a href="../institutionalEssentialsNavTileLinks/delete.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />">delete</a></td>
										</tr>
									</strapi:institutionalEssentialsNavTileLinks>
								</strapi:foreachInstitutionalEssentialsNavTileLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../institutionalEssentialsNavTileLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add InstitutionalEssentialsNavTileLinks</a>
						<br/><br/>

		<strapi:foreachInstitutionalEssentialsNavTileLinks var="idIter">
			<strapi:institutionalEssentialsNavTileLinks>
						<a href="../../strapi/institutionalEssentialsNavTileLinks/institutionalEssentialsNavTileLinks.jsp?ID=<strapi:institutionalEssentialsNavTileLinksID />"><strapi:institutionalEssentialsNavTileLinksID /></a>
		<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId />
		<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId />
		<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:institutionalEssentialsNavTileLinks>
			</strapi:foreachInstitutionalEssentialsNavTileLinks>

						<h2>InstitutionalEssentialsStepLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>InstitutionalEssentialId</th>
									<th>ContentImageBlockRightId</th>
									<th>ContentImageBlockRightOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachInstitutionalEssentialsStepLinks var="idIter">
									<strapi:institutionalEssentialsStepLinks>
										<tr>
											<td><a href="../institutionalEssentialsStepLinks/show.jsp?ID=<strapi:institutionalEssentialsStepLinksID />"><strapi:institutionalEssentialsStepLinksID /></a></td>
											<td><strapi:institutionalEssentialsStepLinksInstitutionalEssentialId /></td>
											<td><strapi:institutionalEssentialsStepLinksContentImageBlockRightId /></td>
											<td><strapi:institutionalEssentialsStepLinksContentImageBlockRightOrder /></td>
											<td><a href="../institutionalEssentialsStepLinks/edit.jsp?ID=<strapi:institutionalEssentialsStepLinksID />">edit</a></td>
											<td><a href="../institutionalEssentialsStepLinks/delete.jsp?ID=<strapi:institutionalEssentialsStepLinksID />">delete</a></td>
										</tr>
									</strapi:institutionalEssentialsStepLinks>
								</strapi:foreachInstitutionalEssentialsStepLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../institutionalEssentialsStepLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add InstitutionalEssentialsStepLinks</a>
						<br/><br/>

		<strapi:foreachInstitutionalEssentialsStepLinks var="idIter">
			<strapi:institutionalEssentialsStepLinks>
						<a href="../../strapi/institutionalEssentialsStepLinks/institutionalEssentialsStepLinks.jsp?ID=<strapi:institutionalEssentialsStepLinksID />"><strapi:institutionalEssentialsStepLinksID /></a>
		<strapi:institutionalEssentialsStepLinksInstitutionalEssentialId />
		<strapi:institutionalEssentialsStepLinksContentImageBlockRightId />
		<strapi:institutionalEssentialsStepLinksContentImageBlockRightOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:institutionalEssentialsStepLinks>
			</strapi:foreachInstitutionalEssentialsStepLinks>
</strapi:institutionalEssentials>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>