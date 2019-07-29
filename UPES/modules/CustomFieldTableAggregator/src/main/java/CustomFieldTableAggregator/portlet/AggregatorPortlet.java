package CustomFieldTableAggregator.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import Aggregation.model.customFieldAggregationTable;
import Aggregation.service.customFieldAggregationTableLocalServiceUtil;
import CustomFieldTableAggregator.constants.AggregatorPortletKeys;

/**
 * @author K.M.B
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=CustomFieldTableAggregator Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AggregatorPortletKeys.Aggregator,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AggregatorPortlet extends MVCPortlet {
	
	public void aggregate(ActionRequest actionRequest,ActionResponse actionResonse){
		
		List<User> users = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
		for(User user:users){
			long sapId = Long.valueOf(user.getExpandoBridge().getAttribute("Sap Id").toString());
			long userId = user.getUserId();
			customFieldAggregationTable temp =null;
			try {
				temp = customFieldAggregationTableLocalServiceUtil.getcustomFieldAggregationTable((int) sapId);
			} catch (PortalException e) {
				e.printStackTrace();
			}
			if(temp==null){
				temp = customFieldAggregationTableLocalServiceUtil.createcustomFieldAggregationTable((int) sapId);
			}
			temp.setCgpa(Double.parseDouble( user.getExpandoBridge().getAttribute("cgpa").toString()));
			temp.setUserId((int) userId);
			customFieldAggregationTableLocalServiceUtil.updatecustomFieldAggregationTable(temp);
			
			
		}
	}
	public void render(RenderRequest renderRequest, RenderResponse renderResponse){
		
		try {
			super.render(renderRequest, renderResponse);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (PortletException e) {
			e.printStackTrace();
		}
	}
}