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

import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Job_Application_Records service. Represents a row in the &quot;KMB_Job_Application_Records&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobApplicationRecordService.model.impl.Job_Application_RecordsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_Records
 * @see JobApplicationRecordService.model.impl.Job_Application_RecordsImpl
 * @see JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl
 * @generated
 */
@ProviderType
public interface Job_Application_RecordsModel extends BaseModel<Job_Application_Records> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a job_ application_ records model instance should use the {@link Job_Application_Records} interface instead.
	 */

	/**
	 * Returns the primary key of this job_ application_ records.
	 *
	 * @return the primary key of this job_ application_ records
	 */
	public Job_Application_RecordsPK getPrimaryKey();

	/**
	 * Sets the primary key of this job_ application_ records.
	 *
	 * @param primaryKey the primary key of this job_ application_ records
	 */
	public void setPrimaryKey(Job_Application_RecordsPK primaryKey);

	/**
	 * Returns the sap ID of this job_ application_ records.
	 *
	 * @return the sap ID of this job_ application_ records
	 */
	public long getSapId();

	/**
	 * Sets the sap ID of this job_ application_ records.
	 *
	 * @param SapId the sap ID of this job_ application_ records
	 */
	public void setSapId(long SapId);

	/**
	 * Returns the job ID of this job_ application_ records.
	 *
	 * @return the job ID of this job_ application_ records
	 */
	public long getJobId();

	/**
	 * Sets the job ID of this job_ application_ records.
	 *
	 * @param JobId the job ID of this job_ application_ records
	 */
	public void setJobId(long JobId);

	/**
	 * Returns the application date of this job_ application_ records.
	 *
	 * @return the application date of this job_ application_ records
	 */
	public Date getApplicationDate();

	/**
	 * Sets the application date of this job_ application_ records.
	 *
	 * @param ApplicationDate the application date of this job_ application_ records
	 */
	public void setApplicationDate(Date ApplicationDate);

	/**
	 * Returns the resume of this job_ application_ records.
	 *
	 * @return the resume of this job_ application_ records
	 */
	@AutoEscape
	public String getResume();

	/**
	 * Sets the resume of this job_ application_ records.
	 *
	 * @param resume the resume of this job_ application_ records
	 */
	public void setResume(String resume);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		JobApplicationRecordService.model.Job_Application_Records job_Application_Records);

	@Override
	public int hashCode();

	@Override
	public CacheModel<JobApplicationRecordService.model.Job_Application_Records> toCacheModel();

	@Override
	public JobApplicationRecordService.model.Job_Application_Records toEscapedModel();

	@Override
	public JobApplicationRecordService.model.Job_Application_Records toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}