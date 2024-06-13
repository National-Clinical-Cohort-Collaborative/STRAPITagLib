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
										<legend>TenantProfiles</legend>
										<label for="blurb">Blurb</label>
										<input type="text" id="blurb" name="blurb" size="40" value="">
										<br>

										<label for="description">Description</label>
										<input type="text" id="description" name="description" size="40" value="">
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

										<label for="label">Label</label>
										<input type="text" id="label" name="label" size="40" value="">
										<br>

										<label for="url">Url</label>
										<input type="text" id="url" name="url" size="40" value="">
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
		<strapi:tenantProfiles>
			<strapi:tenantProfilesBlurb blurb = "${param.blurb}" />
			<strapi:tenantProfilesDescription description = "${param.description}" />
			<strapi:tenantProfilesCreatedAt createdAt = "${param.createdAt}" />
			<strapi:tenantProfilesUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:tenantProfilesPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:tenantProfilesCreatedById createdById = "${param.createdById}" />
			<strapi:tenantProfilesUpdatedById updatedById = "${param.updatedById}" />
			<strapi:tenantProfilesLabel label = "${param.label}" />
			<strapi:tenantProfilesUrl url = "${param.url}" />
		</strapi:tenantProfiles>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>