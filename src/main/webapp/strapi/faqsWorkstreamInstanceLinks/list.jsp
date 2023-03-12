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

						<h2>FaqsWorkstreamInstanceLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>FaqId</th>
									<th>WorkstreamInstanceId</th>
									<th>FaqOrder</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachFaqsWorkstreamInstanceLinks var="idIter">
									<strapi:faqsWorkstreamInstanceLinks>
										<tr>
											<td><a href="../faqsWorkstreamInstanceLinks/show.jsp?ID=<strapi:faqsWorkstreamInstanceLinksID />"><strapi:faqsWorkstreamInstanceLinksID /></a></td>
											<td><strapi:faqsWorkstreamInstanceLinksFaqId /></td>
											<td><strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId /></td>
											<td><strapi:faqsWorkstreamInstanceLinksFaqOrder /></td>
											<td><a href="../faqsWorkstreamInstanceLinks/edit.jsp?ID=<strapi:faqsWorkstreamInstanceLinksID />">edit</a></td>
											<td><a href="../faqsWorkstreamInstanceLinks/delete.jsp?ID=<strapi:faqsWorkstreamInstanceLinksID />">delete</a></td>
										</tr>
									</strapi:faqsWorkstreamInstanceLinks>
								</strapi:foreachFaqsWorkstreamInstanceLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../faqsWorkstreamInstanceLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add FaqsWorkstreamInstanceLinks</a>
						<br/><br/>

		<strapi:foreachFaqsWorkstreamInstanceLinks var="idIter">
			<strapi:faqsWorkstreamInstanceLinks>
						<a href="../../strapi/faqsWorkstreamInstanceLinks/faqsWorkstreamInstanceLinks.jsp?ID=<strapi:faqsWorkstreamInstanceLinksID />"><strapi:faqsWorkstreamInstanceLinksID /></a>
		<strapi:faqsWorkstreamInstanceLinksFaqId />
		<strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId />
		<strapi:faqsWorkstreamInstanceLinksFaqOrder />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:faqsWorkstreamInstanceLinks>
			</strapi:foreachFaqsWorkstreamInstanceLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>