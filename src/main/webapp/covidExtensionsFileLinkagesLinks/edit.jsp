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
								<strapi:covidExtensionsFileLinkagesLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>CovidExtensionsFileLinkagesLinks</legend>
											<label for="CovidExtensions">CovidExtensions</label>
											<br>
												<strapi:foreachCovidExtensions var="covidExtensionsIter">
													<strapi:covidExtensions>
													<input type="radio" name="ID" value="<strapi:covidExtensionsID />"><label for="ID"><strapi:covidExtensionsID /></label>
													<br>
													</strapi:covidExtensions>
												</strapi:foreachCovidExtensions>
											<label for="FileLinkages">FileLinkages</label>
											<br>
												<strapi:foreachFileLinkages var="fileLinkagesIter">
													<strapi:fileLinkages>
													<input type="radio" name="ID" value="<strapi:fileLinkagesID />"><label for="ID"><strapi:fileLinkagesID /></label>
													<br>
													</strapi:fileLinkages>
												</strapi:foreachFileLinkages>
											<label for="covidExtensionId">CovidExtensionId</label>
											<input type="text" id="covidExtensionId" name="covidExtensionId" size="40" value="<strapi:covidExtensionsFileLinkagesLinksCovidExtensionId />">
											<br>

											<label for="fileLinkageId">FileLinkageId</label>
											<input type="text" id="fileLinkageId" name="fileLinkageId" size="40" value="<strapi:covidExtensionsFileLinkagesLinksFileLinkageId />">
											<br>

											<label for="fileLinkageOrder">FileLinkageOrder</label>
											<input type="text" id="fileLinkageOrder" name="fileLinkageOrder" size="40" value="<strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:covidExtensionsFileLinkagesLinks>
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
								<strapi:covidExtensionsFileLinkagesLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>CovidExtensionsFileLinkagesLinks</legend>
											<label for="CovidExtensions">CovidExtensions</label>
											<br>
												<strapi:foreachCovidExtensions var="covidExtensionsIter">
													<strapi:covidExtensions>
													<input type="radio" name="ID" value="<strapi:covidExtensionsID />"><label for="ID"><strapi:covidExtensionsID /></label>
													<br>
													</strapi:covidExtensions>
												</strapi:foreachCovidExtensions>
											<label for="FileLinkages">FileLinkages</label>
											<br>
												<strapi:foreachFileLinkages var="fileLinkagesIter">
													<strapi:fileLinkages>
													<input type="radio" name="ID" value="<strapi:fileLinkagesID />"><label for="ID"><strapi:fileLinkagesID /></label>
													<br>
													</strapi:fileLinkages>
												</strapi:foreachFileLinkages>
											<label for="covidExtensionId">CovidExtensionId</label>
											<input type="text" id="covidExtensionId" name="covidExtensionId" size="40" value="<strapi:covidExtensionsFileLinkagesLinksCovidExtensionId />">
											<br>

											<label for="fileLinkageId">FileLinkageId</label>
											<input type="text" id="fileLinkageId" name="fileLinkageId" size="40" value="<strapi:covidExtensionsFileLinkagesLinksFileLinkageId />">
											<br>

											<label for="fileLinkageOrder">FileLinkageOrder</label>
											<input type="text" id="fileLinkageOrder" name="fileLinkageOrder" size="40" value="<strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:covidExtensionsFileLinkagesLinks>
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
		<fmt:parseNumber var="covidExtensionId" value="${param.covidExtensionId}" />
		<fmt:parseNumber var="fileLinkageId" value="${param.fileLinkageId}" />
		<strapi:covidExtensionsFileLinkagesLinks ID="${ID}">
			<strapi:covidExtensionsFileLinkagesLinksCovidExtensionId covidExtensionId = "${param.covidExtensionId}" />
			<strapi:covidExtensionsFileLinkagesLinksFileLinkageId fileLinkageId = "${param.fileLinkageId}" />
			<strapi:covidExtensionsFileLinkagesLinksFileLinkageOrder fileLinkageOrder = "${param.fileLinkageOrder}" />
		</strapi:covidExtensionsFileLinkagesLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>