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
								<strapi:biosBioGroupLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>BiosBioGroupLinks</legend>
											<label for="BioGroups">BioGroups</label>
											<br>
												<strapi:foreachBioGroups var="bioGroupsIter">
													<strapi:bioGroups>
													<input type="radio" name="ID" value="<strapi:bioGroupsID />"><label for="ID"><strapi:bioGroupsID /></label>
													<br>
													</strapi:bioGroups>
												</strapi:foreachBioGroups>
											<label for="Bios">Bios</label>
											<br>
												<strapi:foreachBios var="biosIter">
													<strapi:bios>
													<input type="radio" name="ID" value="<strapi:biosID />"><label for="ID"><strapi:biosID /></label>
													<br>
													</strapi:bios>
												</strapi:foreachBios>
											<label for="bioId">BioId</label>
											<input type="text" id="bioId" name="bioId" size="40" value="<strapi:biosBioGroupLinksBioId />">
											<br>

											<label for="bioGroupId">BioGroupId</label>
											<input type="text" id="bioGroupId" name="bioGroupId" size="40" value="<strapi:biosBioGroupLinksBioGroupId />">
											<br>

											<label for="bioOrder">BioOrder</label>
											<input type="text" id="bioOrder" name="bioOrder" size="40" value="<strapi:biosBioGroupLinksBioOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:biosBioGroupLinks>
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
								<strapi:biosBioGroupLinks ID="${ID}">
									<form action="edit.jsp" method="post" >
										<fieldset>
											<legend>BiosBioGroupLinks</legend>
											<label for="BioGroups">BioGroups</label>
											<br>
												<strapi:foreachBioGroups var="bioGroupsIter">
													<strapi:bioGroups>
													<input type="radio" name="ID" value="<strapi:bioGroupsID />"><label for="ID"><strapi:bioGroupsID /></label>
													<br>
													</strapi:bioGroups>
												</strapi:foreachBioGroups>
											<label for="Bios">Bios</label>
											<br>
												<strapi:foreachBios var="biosIter">
													<strapi:bios>
													<input type="radio" name="ID" value="<strapi:biosID />"><label for="ID"><strapi:biosID /></label>
													<br>
													</strapi:bios>
												</strapi:foreachBios>
											<label for="bioId">BioId</label>
											<input type="text" id="bioId" name="bioId" size="40" value="<strapi:biosBioGroupLinksBioId />">
											<br>

											<label for="bioGroupId">BioGroupId</label>
											<input type="text" id="bioGroupId" name="bioGroupId" size="40" value="<strapi:biosBioGroupLinksBioGroupId />">
											<br>

											<label for="bioOrder">BioOrder</label>
											<input type="text" id="bioOrder" name="bioOrder" size="40" value="<strapi:biosBioGroupLinksBioOrder />">
											<br>

											<input type="submit" name="submit" value="Save">
											<input type="submit" name="submit" value="Cancel">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
											<input type="hidden" name="ID" value="${param.ID}">
										</fieldset>
									</form>
								</strapi:biosBioGroupLinks>
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
		<fmt:parseNumber var="bioId" value="${param.bioId}" />
		<fmt:parseNumber var="bioGroupId" value="${param.bioGroupId}" />
		<strapi:biosBioGroupLinks ID="${ID}">
			<strapi:biosBioGroupLinksBioId bioId = "${param.bioId}" />
			<strapi:biosBioGroupLinksBioGroupId bioGroupId = "${param.bioGroupId}" />
			<strapi:biosBioGroupLinksBioOrder bioOrder = "${param.bioOrder}" />
		</strapi:biosBioGroupLinks>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>