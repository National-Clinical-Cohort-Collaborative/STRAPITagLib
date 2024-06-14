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
								<strapi:tenantProfiles ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TenantProfiles</legend>
											<label for="blurb">Blurb</label>
											<input type="text" id="blurb" name="blurb" size="40" value="<strapi:tenantProfilesBlurb />">
											<br>

											<label for="description">Description</label>
											<input type="text" id="description" name="description" size="40" value="<strapi:tenantProfilesDescription />">
											<br>

											<label for="createdAt">CreatedAt</label>
											<input type="text" id="createdAt" name="createdAt" size="40" value="<strapi:tenantProfilesCreatedAt />">
											<br>

											<label for="updatedAt">UpdatedAt</label>
											<input type="text" id="updatedAt" name="updatedAt" size="40" value="<strapi:tenantProfilesUpdatedAt />">
											<br>

											<label for="publishedAt">PublishedAt</label>
											<input type="text" id="publishedAt" name="publishedAt" size="40" value="<strapi:tenantProfilesPublishedAt />">
											<br>

											<label for="createdById">CreatedById</label>
											<input type="text" id="createdById" name="createdById" size="40" value="<strapi:tenantProfilesCreatedById />">
											<br>

											<label for="updatedById">UpdatedById</label>
											<input type="text" id="updatedById" name="updatedById" size="40" value="<strapi:tenantProfilesUpdatedById />">
											<br>

											<label for="label">Label</label>
											<input type="text" id="label" name="label" size="40" value="<strapi:tenantProfilesLabel />">
											<br>

											<label for="url">Url</label>
											<input type="text" id="url" name="url" size="40" value="<strapi:tenantProfilesUrl />">
											<br>

											<label for="footerCite">FooterCite</label>
											<input type="text" id="footerCite" name="footerCite" size="40" value="<strapi:tenantProfilesFooterCite />">
											<br>

											<label for="footerCredit">FooterCredit</label>
											<input type="text" id="footerCredit" name="footerCredit" size="40" value="<strapi:tenantProfilesFooterCredit />">
											<br>

											<label for="footerSignup">FooterSignup</label>
											<input type="text" id="footerSignup" name="footerSignup" size="40" value="<strapi:tenantProfilesFooterSignup />">
											<br>

											<label for="footerSocial">FooterSocial</label>
											<input type="text" id="footerSocial" name="footerSocial" size="40" value="<strapi:tenantProfilesFooterSocial />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:tenantProfiles>
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
		<strapi:tenantProfiles ID="${ID}">
			<strapi:tenantProfilesBlurb blurb = "${param.blurb}" />
			<strapi:tenantProfilesDescription description = "${param.description}" />
			<strapi:tenantProfilesCreatedAt createdAt = "${param.createdAt}" />
			<strapi:tenantProfilesUpdatedAt updatedAt = "${param.updatedAt}" />
			<strapi:tenantProfilesPublishedAt publishedAt = "${param.publishedAt}" />
			<strapi:tenantProfilesCreatedById createdById = "${param.createdById}" />
			<strapi:tenantProfilesUpdatedById updatedById = "${param.updatedById}" />
			<strapi:tenantProfilesLabel label = "${param.label}" />
			<strapi:tenantProfilesUrl url = "${param.url}" />
			<strapi:tenantProfilesFooterCite footerCite = "${param.footerCite}" />
			<strapi:tenantProfilesFooterCredit footerCredit = "${param.footerCredit}" />
			<strapi:tenantProfilesFooterSignup footerSignup = "${param.footerSignup}" />
			<strapi:tenantProfilesFooterSocial footerSocial = "${param.footerSocial}" />
		</strapi:tenantProfiles>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>