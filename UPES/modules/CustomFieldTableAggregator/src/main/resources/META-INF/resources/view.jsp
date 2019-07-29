<%@ include file="/init.jsp" %>

<portlet:actionURL name="aggregate" var="aggregateUrl"/>


<aui:form action="<%=aggregateUrl%>">
<aui:button type="submit" value="Sync"></aui:button>

</aui:form>