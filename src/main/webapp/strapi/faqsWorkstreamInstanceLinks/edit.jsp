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
								<strapi:faqsWorkstreamInstanceLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>FaqsWorkstreamInstanceLinks</legend>
											<label for="Faqs">Faqs</label>
											<br>
												<strapi:foreachFaqs var="faqsIter">
													<strapi:faqs>
													<input type="radio" name="ID" value="<strapi:faqsID />"><label for="ID"><strapi:faqsID /></label>
													<br>
													</strapi:faqs>
												</strapi:foreachFaqs>
											<label for="WorkstreamInstances">WorkstreamInstances</label>
											<br>
												<strapi:foreachWorkstreamInstances var="workstreamInstancesIter">
													<strapi:workstreamInstances>
													<input type="radio" name="ID" value="<strapi:workstreamInstancesID />"><label for="ID"><strapi:workstreamInstancesID /></label>
													<br>
													</strapi:workstreamInstances>
												</strapi:foreachWorkstreamInstances>
											<label for="faqId">FaqId</label>
											<input type="text" id="faqId" name="faqId" size="40" value="<strapi:faqsWorkstreamInstanceLinksFaqId />">
											<br>

											<label for="workstreamInstanceId">WorkstreamInstanceId</label>
											<input type="text" id="workstreamInstanceId" name="workstreamInstanceId" size="40" value="<strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId />">
											<br>

											<label for="faqOrder">FaqOrder</label>
											<input type="text" id="faqOrder" name="faqOrder" size="40" value="<strapi:faqsWorkstreamInstanceLinksFaqOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:faqsWorkstreamInstanceLinks>
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
								<strapi:faqsWorkstreamInstanceLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>FaqsWorkstreamInstanceLinks</legend>
											<label for="Faqs">Faqs</label>
											<br>
												<strapi:foreachFaqs var="faqsIter">
													<strapi:faqs>
													<input type="radio" name="ID" value="<strapi:faqsID />"><label for="ID"><strapi:faqsID /></label>
													<br>
													</strapi:faqs>
												</strapi:foreachFaqs>
											<label for="WorkstreamInstances">WorkstreamInstances</label>
											<br>
												<strapi:foreachWorkstreamInstances var="workstreamInstancesIter">
													<strapi:workstreamInstances>
													<input type="radio" name="ID" value="<strapi:workstreamInstancesID />"><label for="ID"><strapi:workstreamInstancesID /></label>
													<br>
													</strapi:workstreamInstances>
												</strapi:foreachWorkstreamInstances>
											<label for="faqId">FaqId</label>
											<input type="text" id="faqId" name="faqId" size="40" value="<strapi:faqsWorkstreamInstanceLinksFaqId />">
											<br>

											<label for="workstreamInstanceId">WorkstreamInstanceId</label>
											<input type="text" id="workstreamInstanceId" name="workstreamInstanceId" size="40" value="<strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId />">
											<br>

											<label for="faqOrder">FaqOrder</label>
											<input type="text" id="faqOrder" name="faqOrder" size="40" value="<strapi:faqsWorkstreamInstanceLinksFaqOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:faqsWorkstreamInstanceLinks>
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
		<fmt:parseNumber var="faqId" value="${param.faqId}" />
		<fmt:parseNumber var="workstreamInstanceId" value="${param.workstreamInstanceId}" />
		<strapi:faqsWorkstreamInstanceLinks ID="${ID}">
			<strapi:faqsWorkstreamInstanceLinksFaqId faqId = "${param.faqId}" />
			<strapi:faqsWorkstreamInstanceLinksWorkstreamInstanceId workstreamInstanceId = "${param.workstreamInstanceId}" />
			<strapi:faqsWorkstreamInstanceLinksFaqOrder faqOrder = "${param.faqOrder}" />
		</strapi:faqsWorkstreamInstanceLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>