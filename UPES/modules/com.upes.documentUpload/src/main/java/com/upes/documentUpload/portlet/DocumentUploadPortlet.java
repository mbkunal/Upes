package com.upes.documentUpload.portlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.upes.documentUpload.constants.DocumentUploadPortletKeys;

/**
 * @author K.M.B
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Upload Document",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DocumentUploadPortletKeys.DocumentUpload,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class DocumentUploadPortlet extends MVCPortlet {
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long folderId = getFoldere(themeDisplay, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "MyDocs").getFolderId();
		List<DLFileEntry> files = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(), folderId);
		renderRequest.setAttribute("docList",files);
		super.render(renderRequest, renderResponse);
	}
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String cmd = resourceRequest.getParameter("cmd");
		switch(cmd){
		case("delete"):
			try {
				DLFileEntryLocalServiceUtil.deleteDLFileEntry(Long.parseLong(resourceRequest.getParameter("docId")));
				resourceResponse.getWriter().write("Deleted!");
			} catch (NumberFormatException e) {
				resourceResponse.getWriter().write("error");
				e.printStackTrace();
			} catch (PortalException e) {
				resourceResponse.getWriter().write("error");
				e.printStackTrace();
			}
			
			break;
		}
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	public void uploadDocs(ActionRequest actionRequest, ActionResponse actionResponse){
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String fileName = uploadPortletRequest.getFileName(DocumentUploadPortletKeys.uploadParameterName);
		InputStream inputStream =null;
		String mimeType = null;
		String title = StringPool.BLANK;
		ServiceContext serviceContext = null;
		try {
			inputStream = uploadPortletRequest.getFileAsStream(DocumentUploadPortletKeys.uploadParameterName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(Validator.isNotNull(inputStream) ){
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			Folder bulkUploadFolder = createFolder(actionRequest, themeDisplay,gatParentFolderId(themeDisplay) ,String.valueOf(themeDisplay.getUserId()));
			mimeType = MimeTypesUtil.getContentType(fileName);
			title = fileName;
			try {
				serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
				DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(),
						bulkUploadFolder.getFolderId(), fileName, mimeType, title, StringPool.BLANK, StringPool.BLANK,
						inputStream, uploadPortletRequest.getSize(DocumentUploadPortletKeys.uploadParameterName), serviceContext);
			} catch (PortalException e) {
				e.printStackTrace();
			}
			
			
		}
		try {
			actionResponse.sendRedirect("/group/upes/document");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private long gatParentFolderId(ThemeDisplay themeDisplay) {
		 
		return getFolder(themeDisplay, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, DocumentUploadPortletKeys.docsFolder).getFolderId();
	}

	private Folder createFolder(ActionRequest actionRequest, ThemeDisplay themeDisplay, long parentFolderId,
			String folderName) {
	
		Folder folder = getFolder(themeDisplay, parentFolderId, folderName);
		if(Validator.isNull(folder)){
			try{
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(),	actionRequest);
				folder = DLAppLocalServiceUtil.addFolder(themeDisplay.getUserId(), themeDisplay.getScopeGroupId(), parentFolderId, folderName, "", serviceContext);
			}
			catch (Exception e) {
				e.printStackTrace();
			}			
		}
		return folder;	
	}
	public static Folder getFolder(ThemeDisplay themeDisplay, long parentFolderId, String folderName) {
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentFolderId, folderName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return folder;
	}
	private static Folder getFoldere(ThemeDisplay themeDisplay, long parentFolderId, String folderName) {
		Folder folder = null;
		try {
			folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), parentFolderId, folderName);
			folder = DLAppLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(), folder.getFolderId(),String.valueOf( themeDisplay.getUserId()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return folder;
	}
}