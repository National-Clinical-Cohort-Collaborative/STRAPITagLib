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
								<strapi:tenantFooters ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TenantFooters</legend>
											<label for="label">Label</label>
											<input type="text" id="label" name="label" size="40" value="<strapi:tenantFootersLabel />">
											<br>

											<label for="grantCite">GrantCite</label>
											<input type="text" id="grantCite" name="grantCite" size="40" value="<strapi:tenantFootersGrantCite />">
											<br>

											<label for="credits">Credits</label>
											<input type="text" id="credits" name="credits" size="40" value="<strapi:tenantFootersCredits />">
											<br>

											<label for="signup">Signup</label>
											<input type="text" id="signup" name="signup" size="40" value="<strapi:tenantFootersSignup />">
											<br>

											<label for="social">Social</label>
											<input type="text" id="social" name="social" size="40" value="<strapi:tenantFootersSocial />">
											<br>

											<label for="createdAt">CreatedAt</label>
											<input type="text" id="createdAt" name="createdAt" size="40" value="<strapi:tenantFootersCreatedAt />">
											<br>

											<label for="updatedAt">UpdatedAt</label>
											<input type="text" id="updatedAt" name="updatedAt" size="40" value="<strapi:tenantFootersUpdatedAt />">
											<br>

											<label for="publishedAt">PublishedAt</label>
											<input type="text" id="publishedAt" name="publishedAt" size="40" value="<strapi:tenantFootersPublishedAt />">
											<br>

											<label for="createdById">CreatedById</label>
											<input type="text" id="createdById" name="createdById" size="40" value="<strapi:tenantFootersCreatedById />">
											<br>

											<label for="updatedById">UpdatedById</label>
											<input type="text" id="updatedById" name="updatedById" size="40" value="<strapi:tenantFootersUpdatedById />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:tenantFooters>
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
		<strapi:tenantFooters ID="${ID}">
			<strapi:tenantFootersLabel label = "${param.label}" />
			<strapi:tenantFootersGrantCite grantCite = "${param.grantCite}" />
			<strapi:tenantFootersCredits credits = "${param.credits}" />
			<strapi:tenantFootersSignup signup = "${param.signup}" />
			<strapi:tenantFootersSocial social = "${param.social}" />
			<strapi:tenantFootersCreatedAt createdAt = "${param.createdAt}" />
			<strapi:tenantFootersUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:tenantFootersPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:tenantFootersCreatedById createdById = "${param.createdById}" />
			<strapi:tenantFootersUpdatedById updatedById = "${param.updatedById}" />
		</strapi:tenantFooters>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>