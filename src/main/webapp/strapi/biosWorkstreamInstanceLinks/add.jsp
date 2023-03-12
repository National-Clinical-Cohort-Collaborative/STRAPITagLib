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
								<form action="add.jsp" method="post" >
									<fieldset>
										<legend>BiosWorkstreamInstanceLinks</legend>
										<label for="WorkstreamInstances">WorkstreamInstances</label>
										<br>
											<strapi:foreachWorkstreamInstances var="workstreamInstancesIter">
												<strapi:workstreamInstances>
												<input type="radio" name="ID" value="<strapi:workstreamInstancesID />"><label for="ID"><strapi:workstreamInstancesID /></label>
												<br>
												</strapi:workstreamInstances>
											</strapi:foreachWorkstreamInstances>
										<label for="bioId">BioId</label>
										<input type="text" id="bioId" name="bioId" size="40" value="">
										<br>

										<label for="workstreamInstanceId">WorkstreamInstanceId</label>
										<input type="text" id="workstreamInstanceId" name="workstreamInstanceId" size="40" value="">
										<br>

										<label for="bioOrder">BioOrder</label>
										<input type="text" id="bioOrder" name="bioOrder" size="40" value="">
										<br>

										<input type="submit" name="submit" value="Save">
										<input type="submit" name="submit" value="Cancel">
										<input type="hidden" name="ID" value="${param.ID}">
									</fieldset>
								</form>
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
								<form action="add.jsp" method="post" >
									<fieldset>
										<legend>BiosWorkstreamInstanceLinks</legend>
										<label for="Bios">Bios</label>
										<br>
											<strapi:foreachBios var="biosIter">
												<strapi:bios>
												<input type="radio" name="ID" value="<strapi:biosID />"><label for="ID"><strapi:biosID /></label>
												<br>
												</strapi:bios>
											</strapi:foreachBios>
										<label for="bioId">BioId</label>
										<input type="text" id="bioId" name="bioId" size="40" value="">
										<br>

										<label for="workstreamInstanceId">WorkstreamInstanceId</label>
										<input type="text" id="workstreamInstanceId" name="workstreamInstanceId" size="40" value="">
										<br>

										<label for="bioOrder">BioOrder</label>
										<input type="text" id="bioOrder" name="bioOrder" size="40" value="">
										<br>

										<input type="submit" name="submit" value="Save">
										<input type="submit" name="submit" value="Cancel">
										<input type="hidden" name="ID" value="${param.ID}">
									</fieldset>
								</form>
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
		<strapi:bios ID = "${param.ID}">
		<strapi:workstreamInstances ID = "${param.ID}">
			<strapi:biosWorkstreamInstanceLinks>
				<strapi:biosWorkstreamInstanceLinksBioId bioId = "${param.bioId}" />
				<strapi:biosWorkstreamInstanceLinksWorkstreamInstanceId workstreamInstanceId = "${param.workstreamInstanceId}" />
				<strapi:biosWorkstreamInstanceLinksBioOrder bioOrder = "${param.bioOrder}" />
			</strapi:biosWorkstreamInstanceLinks>
		</strapi:workstreamInstances>
		</strapi:bios>
		<c:redirect url="list.jsp" />
	</c:when>
	<c:otherwise>
		A task is required for this function.
	</c:otherwise>
</c:choose>