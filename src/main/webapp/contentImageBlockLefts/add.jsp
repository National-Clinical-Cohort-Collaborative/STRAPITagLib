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
								<form action="add.jsp" method="post" >
									<fieldset>
										<legend>ContentImageBlockLefts</legend>
										<label for="content">Content</label>
										<input type="text" id="content" name="content" size="40" value="">
										<br>

										<label for="header">Header</label>
										<input type="text" id="header" name="header" size="40" value="">
										<br>

										<label for="createdAt">CreatedAt</label>
										<input type="text" id="createdAt" name="createdAt" size="40" value="">
										<br>

										<label for="updatedAt">UpdatedAt</label>
										<input type="text" id="updatedAt" name="updatedAt" size="40" value="">
										<br>

										<label for="publishedAt">PublishedAt</label>
										<input type="text" id="publishedAt" name="publishedAt" size="40" value="">
										<br>

										<label for="createdById">CreatedById</label>
										<input type="text" id="createdById" name="createdById" size="40" value="">
										<br>

										<label for="updatedById">UpdatedById</label>
										<input type="text" id="updatedById" name="updatedById" size="40" value="">
										<br>

										<label for="url">Url</label>
										<input type="text" id="url" name="url" size="40" value="">
										<br>

										<label for="urlLabel">UrlLabel</label>
										<input type="text" id="urlLabel" name="urlLabel" size="40" value="">
										<br>

										<input type="submit" name="submit" value="Save">
										<input type="submit" name="submit" value="Cancel">
									</fieldset>
								</form>
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
		<strapi:contentImageBlockLefts>
			<strapi:contentImageBlockLeftsContent content = "${param.content}" />
			<strapi:contentImageBlockLeftsHeader header = "${param.header}" />
			<strapi:contentImageBlockLeftsCreatedAt createdAt = "${param.createdAt}" />
			<strapi:contentImageBlockLeftsUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:contentImageBlockLeftsPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:contentImageBlockLeftsCreatedById createdById = "${param.createdById}" />
			<strapi:contentImageBlockLeftsUpdatedById updatedById = "${param.updatedById}" />
			<strapi:contentImageBlockLeftsUrl url = "${param.url}" />
			<strapi:contentImageBlockLeftsUrlLabel urlLabel = "${param.urlLabel}" />
		</strapi:contentImageBlockLefts>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>