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
<strapi:youTubeVideos ID="${ID}">
	<h2>YouTubeVideos: <strapi:youTubeVideosID /></h2>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>Header</th>
			<th>Url</th>
			<th>Width</th>
			<th>Height</th>
			<th>Footer</th>
			<th>CreatedAt</th>
			<th>UpdatedAt</th>
			<th>PublishedAt</th>
			<th>CreatedById</th>
			<th>UpdatedById</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:youTubeVideosID />"><strapi:youTubeVideosID /></a></td>
				<td><strapi:youTubeVideosHeader /></td>
				<td><strapi:youTubeVideosUrl /></td>
				<td><strapi:youTubeVideosWidth /></td>
				<td><strapi:youTubeVideosHeight /></td>
				<td><strapi:youTubeVideosFooter /></td>
				<td><strapi:youTubeVideosCreatedAt /></td>
				<td><strapi:youTubeVideosUpdatedAt /></td>
				<td><strapi:youTubeVideosPublishedAt /></td>
				<td><strapi:youTubeVideosCreatedById /></td>
				<td><strapi:youTubeVideosUpdatedById /></td>
			</tr>
		</table>
</strapi:youTubeVideos>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>