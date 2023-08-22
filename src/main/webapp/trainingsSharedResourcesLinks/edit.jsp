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
								<strapi:trainingsSharedResourcesLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TrainingsSharedResourcesLinks</legend>
											<label for="Resources">Resources</label>
											<br>
												<strapi:foreachResources var="resourcesIter">
													<strapi:resources>
													<input type="radio" name="ID" value="<strapi:resourcesID />"><label for="ID"><strapi:resourcesID /></label>
													<br>
													</strapi:resources>
												</strapi:foreachResources>
											<label for="Trainings">Trainings</label>
											<br>
												<strapi:foreachTrainings var="trainingsIter">
													<strapi:trainings>
													<input type="radio" name="ID" value="<strapi:trainingsID />"><label for="ID"><strapi:trainingsID /></label>
													<br>
													</strapi:trainings>
												</strapi:foreachTrainings>
											<label for="trainingId">TrainingId</label>
											<input type="text" id="trainingId" name="trainingId" size="40" value="<strapi:trainingsSharedResourcesLinksTrainingId />">
											<br>

											<label for="resourceId">ResourceId</label>
											<input type="text" id="resourceId" name="resourceId" size="40" value="<strapi:trainingsSharedResourcesLinksResourceId />">
											<br>

											<label for="resourceOrder">ResourceOrder</label>
											<input type="text" id="resourceOrder" name="resourceOrder" size="40" value="<strapi:trainingsSharedResourcesLinksResourceOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:trainingsSharedResourcesLinks>
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
								<strapi:trainingsSharedResourcesLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>TrainingsSharedResourcesLinks</legend>
											<label for="Resources">Resources</label>
											<br>
												<strapi:foreachResources var="resourcesIter">
													<strapi:resources>
													<input type="radio" name="ID" value="<strapi:resourcesID />"><label for="ID"><strapi:resourcesID /></label>
													<br>
													</strapi:resources>
												</strapi:foreachResources>
											<label for="Trainings">Trainings</label>
											<br>
												<strapi:foreachTrainings var="trainingsIter">
													<strapi:trainings>
													<input type="radio" name="ID" value="<strapi:trainingsID />"><label for="ID"><strapi:trainingsID /></label>
													<br>
													</strapi:trainings>
												</strapi:foreachTrainings>
											<label for="trainingId">TrainingId</label>
											<input type="text" id="trainingId" name="trainingId" size="40" value="<strapi:trainingsSharedResourcesLinksTrainingId />">
											<br>

											<label for="resourceId">ResourceId</label>
											<input type="text" id="resourceId" name="resourceId" size="40" value="<strapi:trainingsSharedResourcesLinksResourceId />">
											<br>

											<label for="resourceOrder">ResourceOrder</label>
											<input type="text" id="resourceOrder" name="resourceOrder" size="40" value="<strapi:trainingsSharedResourcesLinksResourceOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:trainingsSharedResourcesLinks>
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
		<fmt:parseNumber var="trainingId" value="${param.trainingId}" />
		<fmt:parseNumber var="resourceId" value="${param.resourceId}" />
		<strapi:trainingsSharedResourcesLinks ID="${ID}">
			<strapi:trainingsSharedResourcesLinksTrainingId trainingId = "${param.trainingId}" />
			<strapi:trainingsSharedResourcesLinksResourceId resourceId = "${param.resourceId}" />
			<strapi:trainingsSharedResourcesLinksResourceOrder resourceOrder = "${param.resourceOrder}" />
		</strapi:trainingsSharedResourcesLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>