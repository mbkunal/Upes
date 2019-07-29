package JobListDisplayPortlet.portlet;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import Aggregation.service.customFieldAggregationTableLocalServiceUtil;
import JobApplicationRecordService.model.Job_Application_Records;
import JobApplicationRecordService.service.Job_Application_RecordsLocalServiceUtil;
import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;
import JobApplicationRecordService.service.persistence.Job_Application_RecordsUtil;
import JobListDisplayPortlet.constants.JobListDisplayPortletKeys;
import JobListService.model.JobId;
import JobListService.service.JobIdLocalServiceUtil;

/**
 * @author K.M.B
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=JobListDisplayPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + JobListDisplayPortletKeys.JobListDisplay,
		"javax.portlet.resource-bundle=content.Language",
		"com.liferay.portlet.header-portlet-js=/main.js",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class JobListDisplayPortlet extends MVCPortlet {
	String action = null;									// to store the action by ajax call
	StringBuffer status = new StringBuffer("Status:");		// TO STORE ERROR OR RESPONSE INFO
	public void render(RenderRequest renderRequest, RenderResponse renderResponse){
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		User user = themeDisplay.getUser();
		List<Role> roles = new ArrayList<Role>();
        roles.addAll(RoleLocalServiceUtil.getUserRoles(user.getUserId()));
        String role = "";
        boolean isActionSet =false;
		renderRequest.setAttribute("doclist",getDocJSONArray(themeDisplay));
		int totalRoles=0; // int to tell if someone if from noncit as well as cit (ROLES LIKE CS AND PIC)
		for(Role r : roles){
			String name = r.getName();
			if("cit".equalsIgnoreCase(name)){
				role="cit";
				totalRoles++;
			}
			else if("noncit".equalsIgnoreCase(name)){
				role="noncit";
				totalRoles++;
			}
			if(!isActionSet){// TO SHOW DIFFERENT ACTIONS FOR DIFFERENT TYPE OF USERS
				if("careerServices".equalsIgnoreCase(name)|| "PIC".equalsIgnoreCase(name)){
					renderRequest.setAttribute("action", "Show Students");
					action="showStudents";
					isActionSet=true;
				}
				else {
					renderRequest.setAttribute("action", "Apply");
					action="apply";
				}
			}
		}
			List<JobId> temp = filterAccordingToRole(JobIdLocalServiceUtil.getJobIds(0, 100 ),role,totalRoles);
			ArrayList<JobId> jobList = new ArrayList<JobId>();
	 		for(JobId j : temp){
				jobList.add(j);
			}
			renderRequest.setAttribute("jobList", jobList );		
		try {
			super.render(renderRequest, renderResponse);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PortletException e) {
			e.printStackTrace();
		}
	}
/*****************************************************************************************************/	
	List<JobId> filterAccordingToRole(List<JobId> b,String role, int roles){
		if(roles == 2||roles==0){
			return b;
		}
		else{
			List<JobId> jobId = new ArrayList<JobId>();
			switch(role){
			case("cit"):
				for(JobId job : b){
					if(job.isCIT()){
						jobId.add(job);
					}
				}
				break;
			case("noncit"):
				for(JobId job : b){
					if(job.isNonCIT()){
						jobId.add(job);
					}
				}
				break;
			}
			return jobId;
		}
		
		
	}
	
/**
 * @throws IOException *********************************************************************************************************/	
	@Override
    public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException {
		String cmd = resourceRequest.getParameter("cmd");
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		switch(cmd){
		case("Show Students"):
			
			List<Job_Application_Records> records = showStudentsAccordingToJob(resourceRequest,resourceResponse);
			JSONArray jsonArrayToSend  =JSONFactoryUtil.createJSONArray();
			for(Job_Application_Records record : records){
				JSONObject temp = JSONFactoryUtil.createJSONObject();
				temp.put("sapId", record.getSapId());
				int userId = (customFieldAggregationTableLocalServiceUtil.fetchcustomFieldAggregationTable((int) record.getSapId())).getUserId();
				User user = UserLocalServiceUtil.fetchUser(userId);
				temp.put("name", user.getFirstName());
				DLFileEntry fe = null;
				try {
					fe = DLFileEntryLocalServiceUtil.getDLFileEntry(Long.parseLong(record.getResume()));
					temp.put("docUrl","/documents/"+fe.getGroupId()+"/"+fe.getFolderId()+"/"+fe.getTitle()+"/"+fe.getUuid()+"?download=true");
				} catch (NumberFormatException e) {
					temp.put("docUrl","");
					e.printStackTrace();
				} catch (PortalException e) {
					temp.put("docUrl","");
					e.printStackTrace();
				}
				temp.put("docUrl","/documents/"+fe.getGroupId()+"/"+fe.getFolderId()+"/"+fe.getTitle()+"/"+fe.getUuid()+"?download=true");
				jsonArrayToSend.put(temp);
			}
			try {
				resourceResponse.getWriter().print(jsonArrayToSend.toString());
			} catch (IOException e2) {
				resourceResponse.getWriter().print("error");
				e2.printStackTrace();
			}
			break;
		case("Apply"):
			resourceRequest = apply(resourceRequest,resourceResponse);
			boolean isError1 = false;
			boolean isError2 = false;	
			isError1 = resourceRequest.getAttribute("error").equals("Could not execute JDBC batch update");
			isError2 = resourceRequest.getAttribute("error").equals("other error");
			if(isError1){
				resourceResponse.getWriter().print("2");
			}else if(isError2){
				resourceResponse.getWriter().print("3");
			}else{
				resourceResponse.getWriter().print("1");
			}
			break;
		case("getDocs"):
			resourceResponse.getWriter().print(getDocJSONArray(themeDisplay));
			break;
		}
    }
/***********************************************************************************************************/
	private JSONArray getDocJSONArray(ThemeDisplay themeDisplay) {
		JSONArray docList = JSONFactoryUtil.createJSONArray();
		long folderId = getFolder(themeDisplay, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "MyDocs").getFolderId();
		List<DLFileEntry> files = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), folderId);
		for(DLFileEntry file : files){
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("docId", file.getFileEntryId());
			jsonObject.put("fileName", file.getFileName());
			docList.put(jsonObject);
		}
		return docList;
	}
	private static Folder getFolder(ThemeDisplay themeDisplay, long parentFolderId, String folderName) {
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentFolderId, folderName);
			folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folder.getFolderId(),String.valueOf( themeDisplay.getUserId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return folder;
	}
/***********************************************************************************************************/
private List<Job_Application_Records> showStudentsAccordingToJob(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
	int jobId = 0;
	List<Job_Application_Records> filteredList = new ArrayList<Job_Application_Records>();
	try{
		jobId =Integer.parseInt(resourceRequest.getParameter("jobId"));
		List<Job_Application_Records> records = Job_Application_RecordsLocalServiceUtil.getJob_Application_Recordses(0,
				Job_Application_RecordsLocalServiceUtil.getJob_Application_RecordsesCount());
		for(Job_Application_Records record : records){
			if(record.getJobId() == jobId){
				filteredList.add(record);
			}
		}
		resourceRequest.setAttribute("Students", filteredList);
	}catch(Exception e){
		e.printStackTrace();		
	}
	return filteredList;
}
/***********************************************************************************************************/	
	private ResourceRequest apply(ResourceRequest resourceRequest, ResourceResponse resourceResponse) {
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long sapId =  Long.valueOf(themeDisplay.getUser().getExpandoBridge().getAttribute("SAP Id").toString());
		String docId = resourceRequest.getParameter("docId");
		int jobId = 0;		
		try{
			jobId =Integer.parseInt(resourceRequest.getParameter("jobId"));
		}catch(Exception e){
		}
		Job_Application_Records record = Job_Application_RecordsUtil.create(new Job_Application_RecordsPK(sapId,jobId)   );
		resourceRequest.setAttribute("temp", jobId);
		Calendar current = Calendar.getInstance();
		Date date = current.getTime();
		record.setApplicationDate(date);
		record.setResume(docId);
		try{
		Job_Application_RecordsLocalServiceUtil.updateJob_Application_Records(record);
		}catch(Exception e){
			if("org.hibernate.exception.ConstraintViolationException: Could not execute JDBC batch update".equals(e.toString())){
				
				resourceRequest.setAttribute("error","Could not execute JDBC batch update");
			}else{
				resourceRequest.setAttribute("error","other error");
			}
		}
		return resourceRequest;
	}
}