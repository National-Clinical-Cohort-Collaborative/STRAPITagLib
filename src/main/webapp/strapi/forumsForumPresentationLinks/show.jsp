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
<strapi:forumsForumPresentationLinks ID="${ID}">
	<h2>ForumsForumPresentationLinks: <strapi:forumsForumPresentationLinksID /></h2>
<ul>
	<li><a href="../forumPresentations/show.jsp?ID=<strapi:forumsForumPresentationLinksForumPresentationId />">ForumPresentations</a>
	<li><a href="../forums/show.jsp?ID=<strapi:forumsForumPresentationLinksForumId />">Forums</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>ForumId</th>
			<th>ForumPresentationId</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:forumsForumPresentationLinksID />"><strapi:forumsForumPresentationLinksID /></a></td>
				<td><strapi:forumsForumPresentationLinksForumId /></td>
				<td><strapi:forumsForumPresentationLinksForumPresentationId /></td>
			</tr>
		</table>
</strapi:forumsForumPresentationLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>