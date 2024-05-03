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
								<form action="add.jsp" method="post" >
									<fieldset>
										<legend>CovidExtensionsFaqsLinks</legend>
										<label for="Faqs">Faqs</label>
										<br>
											<strapi:foreachFaqs var="faqsIter">
												<strapi:faqs>
												<input type="radio" name="ID" value="<strapi:faqsID />"><label for="ID"><strapi:faqsID /></label>
												<br>
												</strapi:faqs>
											</strapi:foreachFaqs>
										<label for="covidExtensionId">CovidExtensionId</label>
										<input type="text" id="covidExtensionId" name="covidExtensionId" size="40" value="">
										<br>

										<label for="faqId">FaqId</label>
										<input type="text" id="faqId" name="faqId" size="40" value="">
										<br>

										<label for="faqOrder">FaqOrder</label>
										<input type="text" id="faqOrder" name="faqOrder" size="40" value="">
										<br>

										<input type="submit" name="submit" value="Save">
										<input type="submit" name="submit" value="Cancel">
										<input type="hidden" name="ID" value="${param.ID}">
									</fieldset>
								</form>
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
								<form action="add.jsp" method="post" >
									<fieldset>
										<legend>CovidExtensionsFaqsLinks</legend>
										<label for="CovidExtensions">CovidExtensions</label>
										<br>
											<strapi:foreachCovidExtensions var="covidExtensionsIter">
												<strapi:covidExtensions>
												<input type="radio" name="ID" value="<strapi:covidExtensionsID />"><label for="ID"><strapi:covidExtensionsID /></label>
												<br>
												</strapi:covidExtensions>
											</strapi:foreachCovidExtensions>
										<label for="covidExtensionId">CovidExtensionId</label>
										<input type="text" id="covidExtensionId" name="covidExtensionId" size="40" value="">
										<br>

										<label for="faqId">FaqId</label>
										<input type="text" id="faqId" name="faqId" size="40" value="">
										<br>

										<label for="faqOrder">FaqOrder</label>
										<input type="text" id="faqOrder" name="faqOrder" size="40" value="">
										<br>

										<input type="submit" name="submit" value="Save">
										<input type="submit" name="submit" value="Cancel">
										<input type="hidden" name="ID" value="${param.ID}">
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
		<strapi:covidExtensions ID = "${param.ID}">
		<strapi:faqs ID = "${param.ID}">
			<strapi:covidExtensionsFaqsLinks>
				<strapi:covidExtensionsFaqsLinksCovidExtensionId covidExtensionId = "${param.covidExtensionId}" />
				<strapi:covidExtensionsFaqsLinksFaqId faqId = "${param.faqId}" />
				<strapi:covidExtensionsFaqsLinksFaqOrder faqOrder = "${param.faqOrder}" />
			</strapi:covidExtensionsFaqsLinks>
		</strapi:faqs>
		</strapi:covidExtensions>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>