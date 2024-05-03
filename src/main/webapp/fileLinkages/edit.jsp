<%@ include file="../_include.jsp"  %>


<c:choose>
	<c:when test="${empty param.submit}">
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
								<fmt:parseNumber var="ID" value="${param.ID}" />
								<strapi:fileLinkages ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>FileLinkages</legend>
											<label for="label">Label</label>
											<input type="text" id="label" name="label" size="40" value="<strapi:fileLinkagesLabel />">
											<br>

											<label for="description">Description</label>
											<input type="text" id="description" name="description" size="40" value="<strapi:fileLinkagesDescription />">
											<br>

											<label for="createdAt">CreatedAt</label>
											<input type="text" id="createdAt" name="createdAt" size="40" value="<strapi:fileLinkagesCreatedAt />">
											<br>

											<label for="updatedAt">UpdatedAt</label>
											<input type="text" id="updatedAt" name="updatedAt" size="40" value="<strapi:fileLinkagesUpdatedAt />">
											<br>

											<label for="publishedAt">PublishedAt</label>
											<input type="text" id="publishedAt" name="publishedAt" size="40" value="<strapi:fileLinkagesPublishedAt />">
											<br>

											<label for="createdById">CreatedById</label>
											<input type="text" id="createdById" name="createdById" size="40" value="<strapi:fileLinkagesCreatedById />">
											<br>

											<label for="updatedById">UpdatedById</label>
											<input type="text" id="updatedById" name="updatedById" size="40" value="<strapi:fileLinkagesUpdatedById />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:fileLinkages>
                        </div>
                    </div>
                </div>
                <jsp:include page="../footer.jsp" />
            </body>
        </html>
	</c:when>
	<c:when test="${param.submit eq 'Cancel'}">
		<c:redirect url="list.jsp" />
	</c:when>
	<c:when test="${param.submit eq 'Save'}">
		<fmt:parseNumber var="ID" value="${param.ID}" />
		<fmt:parseNumber var="createdById" value="${param.createdById}" />
		<fmt:parseNumber var="updatedById" value="${param.updatedById}" />
		<strapi:fileLinkages ID="${ID}">
			<strapi:fileLinkagesLabel label = "${param.label}" />
			<strapi:fileLinkagesDescription description = "${param.description}" />
			<strapi:fileLinkagesCreatedAt createdAt = "${param.createdAt}" />
			<strapi:fileLinkagesUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:fileLinkagesPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:fileLinkagesCreatedById createdById = "${param.createdById}" />
			<strapi:fileLinkagesUpdatedById updatedById = "${param.updatedById}" />
		</strapi:fileLinkages>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>