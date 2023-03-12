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
								<strapi:institutionalEssentialsNavTileLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>InstitutionalEssentialsNavTileLinks</legend>
											<label for="ContentImageBlockLefts">ContentImageBlockLefts</label>
											<br>
												<strapi:foreachContentImageBlockLefts var="contentImageBlockLeftsIter">
													<strapi:contentImageBlockLefts>
													<input type="radio" name="ID" value="<strapi:contentImageBlockLeftsID />"><label for="ID"><strapi:contentImageBlockLeftsID /></label>
													<br>
													</strapi:contentImageBlockLefts>
												</strapi:foreachContentImageBlockLefts>
											<label for="InstitutionalEssentials">InstitutionalEssentials</label>
											<br>
												<strapi:foreachInstitutionalEssentials var="institutionalEssentialsIter">
													<strapi:institutionalEssentials>
													<input type="radio" name="ID" value="<strapi:institutionalEssentialsID />"><label for="ID"><strapi:institutionalEssentialsID /></label>
													<br>
													</strapi:institutionalEssentials>
												</strapi:foreachInstitutionalEssentials>
											<label for="institutionalEssentialId">InstitutionalEssentialId</label>
											<input type="text" id="institutionalEssentialId" name="institutionalEssentialId" size="40" value="<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId />">
											<br>

											<label for="contentImageBlockLeftId">ContentImageBlockLeftId</label>
											<input type="text" id="contentImageBlockLeftId" name="contentImageBlockLeftId" size="40" value="<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId />">
											<br>

											<label for="contentImageBlockLeftOrder">ContentImageBlockLeftOrder</label>
											<input type="text" id="contentImageBlockLeftOrder" name="contentImageBlockLeftOrder" size="40" value="<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:institutionalEssentialsNavTileLinks>
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
								<strapi:institutionalEssentialsNavTileLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>InstitutionalEssentialsNavTileLinks</legend>
											<label for="ContentImageBlockLefts">ContentImageBlockLefts</label>
											<br>
												<strapi:foreachContentImageBlockLefts var="contentImageBlockLeftsIter">
													<strapi:contentImageBlockLefts>
													<input type="radio" name="ID" value="<strapi:contentImageBlockLeftsID />"><label for="ID"><strapi:contentImageBlockLeftsID /></label>
													<br>
													</strapi:contentImageBlockLefts>
												</strapi:foreachContentImageBlockLefts>
											<label for="InstitutionalEssentials">InstitutionalEssentials</label>
											<br>
												<strapi:foreachInstitutionalEssentials var="institutionalEssentialsIter">
													<strapi:institutionalEssentials>
													<input type="radio" name="ID" value="<strapi:institutionalEssentialsID />"><label for="ID"><strapi:institutionalEssentialsID /></label>
													<br>
													</strapi:institutionalEssentials>
												</strapi:foreachInstitutionalEssentials>
											<label for="institutionalEssentialId">InstitutionalEssentialId</label>
											<input type="text" id="institutionalEssentialId" name="institutionalEssentialId" size="40" value="<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId />">
											<br>

											<label for="contentImageBlockLeftId">ContentImageBlockLeftId</label>
											<input type="text" id="contentImageBlockLeftId" name="contentImageBlockLeftId" size="40" value="<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId />">
											<br>

											<label for="contentImageBlockLeftOrder">ContentImageBlockLeftOrder</label>
											<input type="text" id="contentImageBlockLeftOrder" name="contentImageBlockLeftOrder" size="40" value="<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:institutionalEssentialsNavTileLinks>
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
		<fmt:parseNumber var="institutionalEssentialId" value="${param.institutionalEssentialId}" />
		<fmt:parseNumber var="contentImageBlockLeftId" value="${param.contentImageBlockLeftId}" />
		<strapi:institutionalEssentialsNavTileLinks ID="${ID}">
			<strapi:institutionalEssentialsNavTileLinksInstitutionalEssentialId institutionalEssentialId = "${param.institutionalEssentialId}" />
			<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftId contentImageBlockLeftId = "${param.contentImageBlockLeftId}" />
			<strapi:institutionalEssentialsNavTileLinksContentImageBlockLeftOrder contentImageBlockLeftOrder = "${param.contentImageBlockLeftOrder}" />
		</strapi:institutionalEssentialsNavTileLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>