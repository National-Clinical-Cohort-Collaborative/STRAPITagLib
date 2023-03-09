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

						<h2>NewslettersNewsletterIssueLinks List</h2>
						<table class="table table-bordered table-striped table-hover table-datatable">
							<thead>
								<tr>
									<th>ID</th>
									<th>NewsletterId</th>
									<th>NewsletterIssueId</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<strapi:foreachNewslettersNewsletterIssueLinks var="idIter">
									<strapi:newslettersNewsletterIssueLinks>
										<tr>
											<td><a href="../newslettersNewsletterIssueLinks/show.jsp?ID=<strapi:newslettersNewsletterIssueLinksID />"><strapi:newslettersNewsletterIssueLinksID /></a></td>
											<td><strapi:newslettersNewsletterIssueLinksNewsletterId /></td>
											<td><strapi:newslettersNewsletterIssueLinksNewsletterIssueId /></td>
											<td><a href="../newslettersNewsletterIssueLinks/edit.jsp?ID=<strapi:newslettersNewsletterIssueLinksID />">edit</a></td>
											<td><a href="../newslettersNewsletterIssueLinks/delete.jsp?ID=<strapi:newslettersNewsletterIssueLinksID />">delete</a></td>
										</tr>
									</strapi:newslettersNewsletterIssueLinks>
								</strapi:foreachNewslettersNewsletterIssueLinks>
							</tbody>
							<tfoot>
							</tfoot>
						</table>

						<br/>

						<a class="btn" href="../newslettersNewsletterIssueLinks/add.jsp?ID=${param.ID}&ID=${param.ID}">add NewslettersNewsletterIssueLinks</a>
						<br/><br/>

		<strapi:foreachNewslettersNewsletterIssueLinks var="idIter">
			<strapi:newslettersNewsletterIssueLinks>
						<a href="../../strapi/newslettersNewsletterIssueLinks/newslettersNewsletterIssueLinks.jsp?ID=<strapi:newslettersNewsletterIssueLinksID />"><strapi:newslettersNewsletterIssueLinksID /></a>
		<strapi:newslettersNewsletterIssueLinksNewsletterId />
		<strapi:newslettersNewsletterIssueLinksNewsletterIssueId />
			<c:if test="${ ! idIter.isLast() }" >, </c:if>					</strapi:newslettersNewsletterIssueLinks>
			</strapi:foreachNewslettersNewsletterIssueLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>