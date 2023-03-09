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
<strapi:newslettersNewsletterIssueLinks ID="${ID}">
	<h2>NewslettersNewsletterIssueLinks: <strapi:newslettersNewsletterIssueLinksID /></h2>
<ul>
	<li><a href="../newsletterIssues/show.jsp?ID=<strapi:newslettersNewsletterIssueLinksNewsletterIssueId />">NewsletterIssues</a>
	<li><a href="../newsletters/show.jsp?ID=<strapi:newslettersNewsletterIssueLinksNewsletterId />">Newsletters</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>NewsletterId</th>
			<th>NewsletterIssueId</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:newslettersNewsletterIssueLinksID />"><strapi:newslettersNewsletterIssueLinksID /></a></td>
				<td><strapi:newslettersNewsletterIssueLinksNewsletterId /></td>
				<td><strapi:newslettersNewsletterIssueLinksNewsletterIssueId /></td>
			</tr>
		</table>
</strapi:newslettersNewsletterIssueLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>