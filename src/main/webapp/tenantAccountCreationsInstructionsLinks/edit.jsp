<%@ include file="../_include.jsp"  %>


<c:choose>
	<c:when test="${empty param.submit and not empty param.ID}">
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
								<strapi:tenantAccountCreationsInstructionsLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TenantAccountCreationsInstructionsLinks</legend>
											<label for="ContentImageBlockRights">ContentImageBlockRights</label>
											<br>
												<strapi:foreachContentImageBlockRights var="contentImageBlockRightsIter">
													<strapi:contentImageBlockRights>
													<input type="radio" name="ID" value="<strapi:contentImageBlockRightsID />"><label for="ID"><strapi:contentImageBlockRightsID /></label>
													<br>
													</strapi:contentImageBlockRights>
												</strapi:foreachContentImageBlockRights>
											<label for="TenantAccountCreations">TenantAccountCreations</label>
											<br>
												<strapi:foreachTenantAccountCreations var="tenantAccountCreationsIter">
													<strapi:tenantAccountCreations>
													<input type="radio" name="ID" value="<strapi:tenantAccountCreationsID />"><label for="ID"><strapi:tenantAccountCreationsID /></label>
													<br>
													</strapi:tenantAccountCreations>
												</strapi:foreachTenantAccountCreations>
											<label for="tenantAccountCreationId">TenantAccountCreationId</label>
											<input type="text" id="tenantAccountCreationId" name="tenantAccountCreationId" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId />">
											<br>

											<label for="contentImageBlockRightId">ContentImageBlockRightId</label>
											<input type="text" id="contentImageBlockRightId" name="contentImageBlockRightId" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId />">
											<br>

											<label for="contentImageBlockRightOrder">ContentImageBlockRightOrder</label>
											<input type="text" id="contentImageBlockRightOrder" name="contentImageBlockRightOrder" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:tenantAccountCreationsInstructionsLinks>
                        </div>
                    </div>
                </div>
                <jsp:include page="../footer.jsp" />
            </body>
        </html>
	</c:when>
	<c:when test="${empty param.submit and not empty param.ID}">
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
								<strapi:tenantAccountCreationsInstructionsLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TenantAccountCreationsInstructionsLinks</legend>
											<label for="ContentImageBlockRights">ContentImageBlockRights</label>
											<br>
												<strapi:foreachContentImageBlockRights var="contentImageBlockRightsIter">
													<strapi:contentImageBlockRights>
													<input type="radio" name="ID" value="<strapi:contentImageBlockRightsID />"><label for="ID"><strapi:contentImageBlockRightsID /></label>
													<br>
													</strapi:contentImageBlockRights>
												</strapi:foreachContentImageBlockRights>
											<label for="TenantAccountCreations">TenantAccountCreations</label>
											<br>
												<strapi:foreachTenantAccountCreations var="tenantAccountCreationsIter">
													<strapi:tenantAccountCreations>
													<input type="radio" name="ID" value="<strapi:tenantAccountCreationsID />"><label for="ID"><strapi:tenantAccountCreationsID /></label>
													<br>
													</strapi:tenantAccountCreations>
												</strapi:foreachTenantAccountCreations>
											<label for="tenantAccountCreationId">TenantAccountCreationId</label>
											<input type="text" id="tenantAccountCreationId" name="tenantAccountCreationId" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId />">
											<br>

											<label for="contentImageBlockRightId">ContentImageBlockRightId</label>
											<input type="text" id="contentImageBlockRightId" name="contentImageBlockRightId" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId />">
											<br>

											<label for="contentImageBlockRightOrder">ContentImageBlockRightOrder</label>
											<input type="text" id="contentImageBlockRightOrder" name="contentImageBlockRightOrder" size="40" value="<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:tenantAccountCreationsInstructionsLinks>
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
		<fmt:parseNumber var="tenantAccountCreationId" value="${param.tenantAccountCreationId}" />
		<fmt:parseNumber var="contentImageBlockRightId" value="${param.contentImageBlockRightId}" />
		<strapi:tenantAccountCreationsInstructionsLinks ID="${ID}">
			<strapi:tenantAccountCreationsInstructionsLinksTenantAccountCreationId tenantAccountCreationId = "${param.tenantAccountCreationId}" />
			<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightId contentImageBlockRightId = "${param.contentImageBlockRightId}" />
			<strapi:tenantAccountCreationsInstructionsLinksContentImageBlockRightOrder contentImageBlockRightOrder = "${param.contentImageBlockRightOrder}" />
		</strapi:tenantAccountCreationsInstructionsLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>