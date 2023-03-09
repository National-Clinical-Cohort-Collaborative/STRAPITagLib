<%@ include file="../../_include.jsp"  %>


<c:choose>
	<c:when test="${empty param.submit and not empty param.ID}">
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
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>ForumsForumPresentationLinks</legend>
											<label for="ForumPresentations">ForumPresentations</label>
											<br>
												<strapi:foreachForumPresentations var="forumPresentationsIter">
													<strapi:forumPresentations>
													<input type="radio" name="ID" value="<strapi:forumPresentationsID />"><label for="ID"><strapi:forumPresentationsID /></label>
													<br>
													</strapi:forumPresentations>
												</strapi:foreachForumPresentations>
											<label for="Forums">Forums</label>
											<br>
												<strapi:foreachForums var="forumsIter">
													<strapi:forums>
													<input type="radio" name="ID" value="<strapi:forumsID />"><label for="ID"><strapi:forumsID /></label>
													<br>
													</strapi:forums>
												</strapi:foreachForums>
											<label for="forumId">ForumId</label>
											<input type="text" id="forumId" name="forumId" size="40" value="<strapi:forumsForumPresentationLinksForumId />">
											<br>

											<label for="forumPresentationId">ForumPresentationId</label>
											<input type="text" id="forumPresentationId" name="forumPresentationId" size="40" value="<strapi:forumsForumPresentationLinksForumPresentationId />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:forumsForumPresentationLinks>
                        </div>
                    </div>
                </div>
                <jsp:include page="../../footer.jsp" />
            </body>
        </html>
	</c:when>
	<c:when test="${empty param.submit and not empty param.ID}">
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
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>ForumsForumPresentationLinks</legend>
											<label for="ForumPresentations">ForumPresentations</label>
											<br>
												<strapi:foreachForumPresentations var="forumPresentationsIter">
													<strapi:forumPresentations>
													<input type="radio" name="ID" value="<strapi:forumPresentationsID />"><label for="ID"><strapi:forumPresentationsID /></label>
													<br>
													</strapi:forumPresentations>
												</strapi:foreachForumPresentations>
											<label for="Forums">Forums</label>
											<br>
												<strapi:foreachForums var="forumsIter">
													<strapi:forums>
													<input type="radio" name="ID" value="<strapi:forumsID />"><label for="ID"><strapi:forumsID /></label>
													<br>
													</strapi:forums>
												</strapi:foreachForums>
											<label for="forumId">ForumId</label>
											<input type="text" id="forumId" name="forumId" size="40" value="<strapi:forumsForumPresentationLinksForumId />">
											<br>

											<label for="forumPresentationId">ForumPresentationId</label>
											<input type="text" id="forumPresentationId" name="forumPresentationId" size="40" value="<strapi:forumsForumPresentationLinksForumPresentationId />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:forumsForumPresentationLinks>
                        </div>
                    </div>
                </div>
                <jsp:include page="../../footer.jsp" />
            </body>
        </html>
	</c:when>
	<c:when test="${param.submit eq 'Cancel'}">
		<c:redirect url="list.jsp" />
	</c:when>
	<c:when test="${param.submit eq 'Save'}">
		<fmt:parseNumber var="ID" value="${param.ID}" />
		<fmt:parseNumber var="forumId" value="${param.forumId}" />
		<fmt:parseNumber var="forumPresentationId" value="${param.forumPresentationId}" />
		<strapi:forumsForumPresentationLinks ID="${ID}">
			<strapi:forumsForumPresentationLinksForumId forumId = "${param.forumId}" />
			<strapi:forumsForumPresentationLinksForumPresentationId forumPresentationId = "${param.forumPresentationId}" />
		</strapi:forumsForumPresentationLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>