<%@ include file="/init.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="JobListService.model.JobId" %>
<%@ page import="JobListDisplayPortlet.portlet.*" %>
<%@ page import="com.liferay.portal.kernel.json.JSONArray" %>
<h1> Current Jobs</h1>
<% ArrayList<JobId> jobList = (ArrayList<JobId>)renderRequest.getAttribute("jobList"); 
	//JSONArray docs = (JSONArray)renderRequest.getAttribute("doclist");
%>
<style>
	td,th{
		border: 1px solid black;
		text-align:center;
		padding:5px 10px 5px 10px;
	}
	.status{
	color:red;
	}
	table{
	border-collapse: collapse;
	}
	.students{
	padding:20px;
	}
	.modal.in .modal-dialog{
	transform: translate(0,0);
    vertical-align: middle;
    display: contents;
    }
}
</style>
<span id="status" class="status"></span>
 <table>
  <tr>
    <th>Company</th>
    <th>Post</th>
    <th>CGPA</th>
    <th>Pay</th>
    <th>Apply</th>
  </tr>
<% 
for(JobId job : jobList){
	%>
	<tr>
	<td><%=job.getCompany() %></td>
	<td><%=job.getPost() %></td>
	<td><%=job.getCGPA() %></td>
	<td><%=job.getPay() %></td>
	<td>	<!-- Modal trigger -->
			<%
			switch((String)renderRequest.getAttribute("action")) {
			case("Apply"):%>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#apply" onclick="docselector()">
					<%=renderRequest.getAttribute("action") %>
				</button><%
				break;
			case("Show Students"):%>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#apply" onclick="myFunction(<%=job.getJobId()%>,'<%=renderRequest.getAttribute("action") %>')">
			<%=renderRequest.getAttribute("action") %>
			</button><%
				break;
			}
			%>
			<!-- Modal -->
			 <div class="modal fade" id="apply" tabindex="-1" role="dialog" aria-labelledby="applyLabel" aria-hidden="true" style="display:none;">
			  <div class="modal-dialog modal-dialog-centered" role="document">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="applyLabel">Apply for job</h5>
			        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          <span aria-hidden="true">&times;</span>
			        </button>
			      </div>
			      <div class="modal-body">
			        <div id="docSelector"  style="disply:none;">
			         
			         </div> 
			         <div id="students" class="students" style="disply:none;">
			         
			         </div> 
			      </div>
			      <div class="modal-footer">
			      	<%if(renderRequest.getAttribute("action").equals("Apply")) {%>
			      		<button type="submit" class="btn btn-primary" data-dismiss="modal" onclick="myFunction(<%=job.getJobId()%>,'<%=renderRequest.getAttribute("action") %>')">
			      			<%=renderRequest.getAttribute("action") %>
			      		</button>
			      	<%} %>
			        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
			      </div>
			    </div>
			  </div>
			</div>
	</td>
    </tr>
	<%
	
}
%>
 </table>
 <script>
 
 function docselector(){
	$('#students').css("display","none");
	$('#docSelector').css("display","block");
	$('#docSelector').html("");
	$.ajax({
        url : '${resourceUrl}',
        type: 'POST',
        dataType : "text",
        data : {
        	"<portlet:namespace/>cmd" : "getDocs",
        	
        },
        async:false,
        cache:false,
    	success : function(data,textStatus, XMLHttpRequest) {
    			var tbl = document.createElement("table");
    		  	var tblBody = document.createElement("tbody");
    		  	var tempRow = document.createElement("tr");
    		  	var tempCell1 = document.createElement("th");
    		  	var tempCell2 = document.createElement("th");
    		  	tempCell1.innerHTML = "Resume List";
    		  	tempCell2.innerHTML = "";
    		  	tempRow.appendChild(tempCell1);
    		  	tempRow.appendChild(tempCell2);
    		  	tblBody.appendChild(tempRow);
    			var obj = jQuery.parseJSON(data);
    			$.each(obj, function(key,value) {
    				
    				var row = document.createElement("tr");
    				var cell = document.createElement("td");
    				var text = value.fileName;
    				var cell2 = document.createElement("td");
    				var text2 = "<input type='radio' name='docs' value='"+value.docId+"'> ";
    				cell.innerHTML = text;
    				cell2.innerHTML = text2;
    				row.appendChild(cell);
    				row.appendChild(cell2);
    				tblBody.appendChild(row);
    			});
   				tbl.appendChild(tblBody);
   				$('#docSelector').append(tbl);
   				
    	},
    	error: function () {
    		$('#status').text("Error: Contact IT admin. <br> Error: Ajax call unsuccessful");
    	}
	}); 
 }
function myFunction(jobId,cmd) {
	var docId = $("input[name='docs']:checked").val();
	$.ajax({
        url : '${resourceUrl}',
        type: 'POST',
        dataType : "text",
        data : {
        	"<portlet:namespace/>jobId" : jobId,
        	"<portlet:namespace/>cmd" : cmd,
        	"<portlet:namespace/>docId" : docId,
        },
        async:false,
        cache:false,
    	success : function(data,textStatus, XMLHttpRequest) {
    		switch(data){
    		case("1"):
    			$('#status').text("Applied!!!");
    			break;
    		case("2"):
    			$('#status').text("It seems you already had applied for job");
    			break;
    		case("3"):
    			$('#status').text("Application error. Contact support.");
    			break;
    		default:
    			$('#students').html("");
    			var tbl = document.createElement("table");
    		  	var tblBody = document.createElement("tbody");
    		  	var tempRow = document.createElement("tr");
    		  	var tempCell1 = document.createElement("th");
    		  	var tempCell2 = document.createElement("th");
    		  	var tempCell3 = document.createElement("th");
    		  	tempCell1.innerHTML = "Sap Id";
    		  	tempCell2.innerHTML = "Name";
    		  	tempCell3.innerHTML = "Resume";
    		  	tempRow.appendChild(tempCell1);
    		  	tempRow.appendChild(tempCell2);
    		  	tempRow.appendChild(tempCell3);
    		  	tblBody.appendChild(tempRow);
    			var obj = jQuery.parseJSON(data);
    			$.each(obj, function(key,value) {
    				var row = document.createElement("tr");
    				var cell = document.createElement("td");
    				var text = value.sapId;
    				var cell2 = document.createElement("td");
    				var text2 = value.name;
    				var cell3 = document.createElement("td");
    				var text3 = "<a href=" +value.docUrl +" >Resume</a>  ";
    				cell.innerHTML = text;
    				cell2.innerHTML = text2;
    				cell3.innerHTML = text3;
    				row.appendChild(cell);
    				row.appendChild(cell2);
    				row.appendChild(cell3);
    				tblBody.appendChild(row);
    			});
   				tbl.appendChild(tblBody);
   				$('#students').append(tbl);
   				$('#students').css("display","block");
   				$('#docSelector').css("display","none");
    			break;
    		}
    	},
    	error: function () {
    		$('#status').text("Error: Contact IT admin. <br> Error: Ajax call unsuccessful");
    	}
	});
	
}

</script>