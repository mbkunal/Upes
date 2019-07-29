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

package JobApplicationRecordService.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Job_Application_Records service. Represents a row in the &quot;KMB_Job_Application_Records&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsModel
 * @see JobApplicationRecordService.model.impl.Job_Application_RecordsImpl
 * @see JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl
 * @generated
 */
@ImplementationClassName("JobApplicationRecordService.model.impl.Job_Application_RecordsImpl")
@ProviderType
public interface Job_Application_Records extends Job_Application_RecordsModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link JobApplicationRecordService.model.impl.Job_Application_RecordsImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Job_Application_Records, Long> SAP_ID_ACCESSOR = new Accessor<Job_Application_Records, Long>() {
			@Override
			public Long get(Job_Application_Records job_Application_Records) {
				return job_Application_Records.getSapId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Job_Application_Records> getTypeClass() {
				return Job_Application_Records.class;
			}
		};

	public static final Accessor<Job_Application_Records, Long> JOB_ID_ACCESSOR = new Accessor<Job_Application_Records, Long>() {
			@Override
			public Long get(Job_Application_Records job_Application_Records) {
				return job_Application_Records.getJobId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Job_Application_Records> getTypeClass() {
				return Job_Application_Records.class;
			}
		};
}