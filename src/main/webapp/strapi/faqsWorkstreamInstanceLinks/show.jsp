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
<strapi:faqsWorkstreamInstanceLinks ID="${ID}">
	<h2>FaqsWorkstreamInstanceLinks: <strapi:faqsWorkstreamInstanceLinksID /></h2>
<ul>
	<li><a href="../faqs/show.jsp?ID=<strapi:faqsWorkstreamInstanceLinksFaqId />">Faqs</a>
	<li><a href="../workstreamInstances/show.jsp?ID=<strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId />">WorkstreamInstances</a>
</ul>
		<table border=1>
			<tr>
			<th>ID</th>
			<th>FaqId</th>
			<th>WorkstreamInstanceId</th>
			<th>FaqOrder</th>
			</tr>
			<tr>
				<td><a href="edit.jsp?ID=<strapi:faqsWorkstreamInstanceLinksID />"><strapi:faqsWorkstreamInstanceLinksID /></a></td>
				<td><strapi:faqsWorkstreamInstanceLinksFaqId /></td>
				<td><strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId /></td>
				<td><strapi:faqsWorkstreamInstanceLinksFaqOrder /></td>
			</tr>
		</table>
</strapi:faqsWorkstreamInstanceLinks>
                </div>
            </div>
        </div>
        <jsp:include page="../../footer.jsp" />
    </body>
</html>