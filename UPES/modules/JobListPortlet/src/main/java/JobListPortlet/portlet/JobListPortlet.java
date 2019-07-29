package JobListPortlet.portlet;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import JobListPortlet.constants.JobListPortletKeys;
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
		"javax.portlet.display-name=JobListPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + JobListPortletKeys.JobList,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class JobListPortlet extends MVCPortlet {
	
	public void addJob(ActionRequest actionRequest,ActionResponse actionResponse){
		String company = ParamUtil.getString(actionRequest,"company");
		String post = ParamUtil.getString(actionRequest,"post");
		int pay = Integer.parseInt(ParamUtil.getString(actionRequest,"pay"));
		String description = ParamUtil.getString(actionRequest,"description");
		double cgpa = Double.parseDouble(ParamUtil.getString(actionRequest,"cgpa"));
		String moreInfo = ParamUtil.getString(actionRequest,"moreInfo");
		Date lastDateToApply = ParamUtil.getDate(actionRequest,"lastDateToApply",new SimpleDateFormat("dd/MM/yyyy"));
		boolean cit = ParamUtil.getBoolean(actionRequest, "cit");
		boolean noncit = ParamUtil.getBoolean(actionRequest, "noncit");
		actionRequest.getParameterNames();

	
		JobId job = JobIdLocalServiceUtil.createJobId(CounterLocalServiceUtil.increment());
		job.setCGPA((int) cgpa);
		job.setCompany(company);
		job.setDescription(description);
		job.setLastDateToApply(lastDateToApply);
		job.setMoreInfo(moreInfo);
		job.setPost(post);
		job.setPay(pay);
			job.setCIT(cit);
			job.setNonCIT(noncit);
		JobIdLocalServiceUtil.updateJobId(job);
		
	}
	
}