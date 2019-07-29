<%@ include file="/init.jsp" %>
<portlet:actionURL name="addJob" var="addJobUrl"/>
Add Job
<aui:form action="<%=addJobUrl %>" name="form" onSubmit="validateAll()">

	<aui:input type="text" name="company"></aui:input>
	<aui:input type="text" name="post"></aui:input>	
	<aui:input type="text" name="pay"></aui:input>
	<aui:input type="text" name="cgpa"></aui:input>
	<aui:input type="textbox" name="description"></aui:input>
	<aui:input type="test" name="moreInfo"></aui:input>
	<aui:input type="date" name="lastDateToApply"></aui:input>
	<aui:input type="checkbox" name="cit"></aui:input>
	<aui:input type="checkbox" name="noncit"></aui:input>
	<aui:button type="submit"></aui:button>
</aui:form>
<script>




</script>