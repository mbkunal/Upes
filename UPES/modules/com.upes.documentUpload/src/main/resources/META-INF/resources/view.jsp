<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="java.util.List" %>
<%@ page import="com.liferay.document.library.kernel.model.DLFileEntry" %>
<portlet:resourceURL var="resourceUrl"></portlet:resourceURL>
<portlet:defineObjects />


<portlet:actionURL name="uploadDocs" var="uploadDocsUrl"/>



<aui:form action="<%=uploadDocsUrl %>" enctype="multipart/form-data">
	<aui:input type="file" name="docUpload" label="Upload Document"/>
	<aui:button type="submit"></aui:button>
</aui:form>

<% List<DLFileEntry> files = (List<DLFileEntry>)renderRequest.getAttribute("docList");
%>
<table>

<tr>
	<th>Document</th>
	<th></th>
	<th></th>
</tr>
<%
for(DLFileEntry file :files){
	%>
	<tr>
		<td><%= file.getFileName()%></td>
		<td><a href="<%= "/documents/"+file.getGroupId()+"/"+file.getFolderId()+"/"+file.getTitle()+"/"+file.getUuid()+"?download=true"%>">
			<aui:button name="download" value="Download"/>
		</a></td>
		<td><button name="delete" value="" onclick="delet(<%= file.getFileEntryId()%>)"  >Delete</button></td>
	</tr>
<%}%>
</table>
<script>
function delet(fileId){
	$.ajax({
        url : '${resourceUrl}',
        type: 'POST',
        dataType : "text",
        data : {
        	"<portlet:namespace/>docId" : fileId,
        	"<portlet:namespace/>cmd" : "delete",
        },
        async:false,
        cache:false,
    	success : function(data,textStatus, XMLHttpRequest) {
    		alert(data);
    		window.location.href = "http://localhost:8080/group/upes/document";
    	},
    	error: function () {
    		$('#status').text("Error: Contact IT admin. <br> Error: Ajax call unsuccessful");
    	}
	});
}

</script>