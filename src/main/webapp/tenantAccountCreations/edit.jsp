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
								<strapi:tenantAccountCreations ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TenantAccountCreations</legend>
											<label for="header">Header</label>
											<input type="text" id="header" name="header" size="40" value="<strapi:tenantAccountCreationsHeader />">
											<br>

											<label for="header2">Header2</label>
											<input type="text" id="header2" name="header2" size="40" value="<strapi:tenantAccountCreationsHeader2 />">
											<br>

											<label for="beforeStartingHeader">BeforeStartingHeader</label>
											<input type="text" id="beforeStartingHeader" name="beforeStartingHeader" size="40" value="<strapi:tenantAccountCreationsBeforeStartingHeader />">
											<br>

											<label for="beforeStartingBlock">BeforeStartingBlock</label>
											<input type="text" id="beforeStartingBlock" name="beforeStartingBlock" size="40" value="<strapi:tenantAccountCreationsBeforeStartingBlock />">
											<br>

											<label for="createdAt">CreatedAt</label>
											<input type="text" id="createdAt" name="createdAt" size="40" value="<strapi:tenantAccountCreationsCreatedAt />">
											<br>

											<label for="updatedAt">UpdatedAt</label>
											<input type="text" id="updatedAt" name="updatedAt" size="40" value="<strapi:tenantAccountCreationsUpdatedAt />">
											<br>

											<label for="publishedAt">PublishedAt</label>
											<input type="text" id="publishedAt" name="publishedAt" size="40" value="<strapi:tenantAccountCreationsPublishedAt />">
											<br>

											<label for="createdById">CreatedById</label>
											<input type="text" id="createdById" name="createdById" size="40" value="<strapi:tenantAccountCreationsCreatedById />">
											<br>

											<label for="updatedById">UpdatedById</label>
											<input type="text" id="updatedById" name="updatedById" size="40" value="<strapi:tenantAccountCreationsUpdatedById />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:tenantAccountCreations>
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
		<strapi:tenantAccountCreations ID="${ID}">
			<strapi:tenantAccountCreationsHeader header = "${param.header}" />
			<strapi:tenantAccountCreationsHeader2 header2 = "${param.header2}" />
			<strapi:tenantAccountCreationsBeforeStartingHeader beforeStartingHeader = "${param.beforeStartingHeader}" />
			<strapi:tenantAccountCreationsBeforeStartingBlock beforeStartingBlock = "${param.beforeStartingBlock}" />
			<strapi:tenantAccountCreationsCreatedAt createdAt = "${param.createdAt}" />
			<strapi:tenantAccountCreationsUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:tenantAccountCreationsPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:tenantAccountCreationsCreatedById createdById = "${param.createdById}" />
			<strapi:tenantAccountCreationsUpdatedById updatedById = "${param.updatedById}" />
		</strapi:tenantAccountCreations>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>