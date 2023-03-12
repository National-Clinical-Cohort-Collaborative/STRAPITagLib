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
<strapi:faqs ID="${ID}">
	<h2>Faqs: <strapi:faqsID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Question</th>
			<th>Answer</th>
			<th>Category</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			<th>Label</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:faqsID />"><strapi:faqsID /></a></td>
				<td><strapi:faqsQuestion /></td>
				<td><strapi:faqsAnswer /></td>
				<td><strapi:faqsCategory /></td>
				<td><strapi:faqsCreatedAt /></td>
				<td><strapi:faqsUpdatedAt /></td>
				<td><strapi:faqsPublishedAt /></td>
				<td><strapi:faqsCreatedById /></td>
				<td><strapi:faqsUpdatedById /></td>
				<td><strapi:faqsLabel /></td>
			</tr>
		</table>

						<h2>PhastrsFaqsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>PhastrId</th>
									<th>FaqId</th>
									<th>FaqOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachPhastrsFaqsLinks var="idIter">
									<strapi:phastrsFaqsLinks>
										<tr>
											<td><a href="../phastrsFaqsLinks/show.jsp?ID=<strapi:phastrsFaqsLinksID />"><strapi:phastrsFaqsLinksID /></a></td>
											<td><strapi:phastrsFaqsLinksPhastrId /></td>
											<td><strapi:phastrsFaqsLinksFaqId /></td>
											<td><strapi:phastrsFaqsLinksFaqOrder /></td>
											<td><a href="../phastrsFaqsLinks/edit.jsp?ID=<strapi:phastrsFaqsLinksID />">edit</a></td>
											<td><a href="../phastrsFaqsLinks/delete.jsp?ID=<strapi:phastrsFaqsLinksID />">delete</a></td>
										</tr>
									</strapi:phastrsFaqsLinks>
								</strapi:foreachPhastrsFaqsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../phastrsFaqsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add PhastrsFaqsLinks</a>
						<br/><br/>

		<strapi:foreachPhastrsFaqsLinks var="idIter">
			<strapi:phastrsFaqsLinks>
						<a href="../../strapi/phastrsFaqsLinks/phastrsFaqsLinks.jsp?ID=<strapi:phastrsFaqsLinksID />"><strapi:phastrsFaqsLinksID /></a>
		<strapi:phastrsFaqsLinksPhastrId />
		<strapi:phastrsFaqsLinksFaqId />
		<strapi:phastrsFaqsLinksFaqOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:phastrsFaqsLinks>
			</strapi:foreachPhastrsFaqsLinks>

						<h2>PprlsFaqsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>PprlId</th>
									<th>FaqId</th>
									<th>FaqOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachPprlsFaqsLinks var="idIter">
									<strapi:pprlsFaqsLinks>
										<tr>
											<td><a href="../pprlsFaqsLinks/show.jsp?ID=<strapi:pprlsFaqsLinksID />"><strapi:pprlsFaqsLinksID /></a></td>
											<td><strapi:pprlsFaqsLinksPprlId /></td>
											<td><strapi:pprlsFaqsLinksFaqId /></td>
											<td><strapi:pprlsFaqsLinksFaqOrder /></td>
											<td><a href="../pprlsFaqsLinks/edit.jsp?ID=<strapi:pprlsFaqsLinksID />">edit</a></td>
											<td><a href="../pprlsFaqsLinks/delete.jsp?ID=<strapi:pprlsFaqsLinksID />">delete</a></td>
										</tr>
									</strapi:pprlsFaqsLinks>
								</strapi:foreachPprlsFaqsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../pprlsFaqsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add PprlsFaqsLinks</a>
						<br/><br/>

		<strapi:foreachPprlsFaqsLinks var="idIter">
			<strapi:pprlsFaqsLinks>
						<a href="../../strapi/pprlsFaqsLinks/pprlsFaqsLinks.jsp?ID=<strapi:pprlsFaqsLinksID />"><strapi:pprlsFaqsLinksID /></a>
		<strapi:pprlsFaqsLinksPprlId />
		<strapi:pprlsFaqsLinksFaqId />
		<strapi:pprlsFaqsLinksFaqOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:pprlsFaqsLinks>
			</strapi:foreachPprlsFaqsLinks>

						<h2>WorkstreamInstancesFaqsLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>WorkstreamInstanceId</th>
									<th>FaqId</th>
									<th>FaqOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachWorkstreamInstancesFaqsLinks var="idIter">
									<strapi:workstreamInstancesFaqsLinks>
										<tr>
											<td><a href="../workstreamInstancesFaqsLinks/show.jsp?ID=<strapi:workstreamInstancesFaqsLinksID />"><strapi:workstreamInstancesFaqsLinksID /></a></td>
											<td><strapi:workstreamInstancesFaqsLinksWorkstreamInstanceId /></td>
											<td><strapi:workstreamInstancesFaqsLinksFaqId /></td>
											<td><strapi:workstreamInstancesFaqsLinksFaqOrder /></td>
											<td><a href="../workstreamInstancesFaqsLinks/edit.jsp?ID=<strapi:workstreamInstancesFaqsLinksID />">edit</a></td>
											<td><a href="../workstreamInstancesFaqsLinks/delete.jsp?ID=<strapi:workstreamInstancesFaqsLinksID />">delete</a></td>
										</tr>
									</strapi:workstreamInstancesFaqsLinks>
								</strapi:foreachWorkstreamInstancesFaqsLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../workstreamInstancesFaqsLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add WorkstreamInstancesFaqsLinks</a>
						<br/><br/>

		<strapi:foreachWorkstreamInstancesFaqsLinks var="idIter">
			<strapi:workstreamInstancesFaqsLinks>
						<a href="../../strapi/workstreamInstancesFaqsLinks/workstreamInstancesFaqsLinks.jsp?ID=<strapi:workstreamInstancesFaqsLinksID />"><strapi:workstreamInstancesFaqsLinksID /></a>
		<strapi:workstreamInstancesFaqsLinksWorkstreamInstanceId />
		<strapi:workstreamInstancesFaqsLinksFaqId />
		<strapi:workstreamInstancesFaqsLinksFaqOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:workstreamInstancesFaqsLinks>
			</strapi:foreachWorkstreamInstancesFaqsLinks>
</strapi:faqs>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>