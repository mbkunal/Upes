/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package JobApplicationRecordService.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Job_Application_RecordsService}.
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsService
 * @generated
 */
@ProviderType
public class Job_Application_RecordsServiceWrapper
	implements Job_Application_RecordsService,
		ServiceWrapper<Job_Application_RecordsService> {
	public Job_Application_RecordsServiceWrapper(
		Job_Application_RecordsService job_Application_RecordsService) {
		_job_Application_RecordsService = job_Application_RecordsService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _job_Application_RecordsService.getOSGiServiceIdentifier();
	}

	@Override
	public Job_Application_RecordsService getWrappedService() {
		return _job_Application_RecordsService;
	}

	@Override
	public void setWrappedService(
		Job_Application_RecordsService job_Application_RecordsService) {
		_job_Application_RecordsService = job_Application_RecordsService;
	}

	private Job_Application_RecordsService _job_Application_RecordsService;
}