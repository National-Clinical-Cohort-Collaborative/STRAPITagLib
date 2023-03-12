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
								<strapi:onboardingsNavTileLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>OnboardingsNavTileLinks</legend>
											<label for="ContentImageBlockLefts">ContentImageBlockLefts</label>
											<br>
												<strapi:foreachContentImageBlockLefts var="contentImageBlockLeftsIter">
													<strapi:contentImageBlockLefts>
													<input type="radio" name="ID" value="<strapi:contentImageBlockLeftsID />"><label for="ID"><strapi:contentImageBlockLeftsID /></label>
													<br>
													</strapi:contentImageBlockLefts>
												</strapi:foreachContentImageBlockLefts>
											<label for="Onboardings">Onboardings</label>
											<br>
												<strapi:foreachOnboardings var="onboardingsIter">
													<strapi:onboardings>
													<input type="radio" name="ID" value="<strapi:onboardingsID />"><label for="ID"><strapi:onboardingsID /></label>
													<br>
													</strapi:onboardings>
												</strapi:foreachOnboardings>
											<label for="onboardingId">OnboardingId</label>
											<input type="text" id="onboardingId" name="onboardingId" size="40" value="<strapi:onboardingsNavTileLinksOnboardingId />">
											<br>

											<label for="contentImageBlockLeftId">ContentImageBlockLeftId</label>
											<input type="text" id="contentImageBlockLeftId" name="contentImageBlockLeftId" size="40" value="<strapi:onboardingsNavTileLinksContentImageBlockLeftId />">
											<br>

											<label for="contentImageBlockLeftOrder">ContentImageBlockLeftOrder</label>
											<input type="text" id="contentImageBlockLeftOrder" name="contentImageBlockLeftOrder" size="40" value="<strapi:onboardingsNavTileLinksContentImageBlockLeftOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:onboardingsNavTileLinks>
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
								<strapi:onboardingsNavTileLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>OnboardingsNavTileLinks</legend>
											<label for="ContentImageBlockLefts">ContentImageBlockLefts</label>
											<br>
												<strapi:foreachContentImageBlockLefts var="contentImageBlockLeftsIter">
													<strapi:contentImageBlockLefts>
													<input type="radio" name="ID" value="<strapi:contentImageBlockLeftsID />"><label for="ID"><strapi:contentImageBlockLeftsID /></label>
													<br>
													</strapi:contentImageBlockLefts>
												</strapi:foreachContentImageBlockLefts>
											<label for="Onboardings">Onboardings</label>
											<br>
												<strapi:foreachOnboardings var="onboardingsIter">
													<strapi:onboardings>
													<input type="radio" name="ID" value="<strapi:onboardingsID />"><label for="ID"><strapi:onboardingsID /></label>
													<br>
													</strapi:onboardings>
												</strapi:foreachOnboardings>
											<label for="onboardingId">OnboardingId</label>
											<input type="text" id="onboardingId" name="onboardingId" size="40" value="<strapi:onboardingsNavTileLinksOnboardingId />">
											<br>

											<label for="contentImageBlockLeftId">ContentImageBlockLeftId</label>
											<input type="text" id="contentImageBlockLeftId" name="contentImageBlockLeftId" size="40" value="<strapi:onboardingsNavTileLinksContentImageBlockLeftId />">
											<br>

											<label for="contentImageBlockLeftOrder">ContentImageBlockLeftOrder</label>
											<input type="text" id="contentImageBlockLeftOrder" name="contentImageBlockLeftOrder" size="40" value="<strapi:onboardingsNavTileLinksContentImageBlockLeftOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:onboardingsNavTileLinks>
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
		<fmt:parseNumber var="onboardingId" value="${param.onboardingId}" />
		<fmt:parseNumber var="contentImageBlockLeftId" value="${param.contentImageBlockLeftId}" />
		<strapi:onboardingsNavTileLinks ID="${ID}">
			<strapi:onboardingsNavTileLinksOnboardingId onboardingId = "${param.onboardingId}" />
			<strapi:onboardingsNavTileLinksContentImageBlockLeftId contentImageBlockLeftId = "${param.contentImageBlockLeftId}" />
			<strapi:onboardingsNavTileLinksContentImageBlockLeftOrder contentImageBlockLeftOrder = "${param.contentImageBlockLeftOrder}" />
		</strapi:onboardingsNavTileLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>