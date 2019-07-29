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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Job_Application_Records}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_Records
 * @generated
 */
@ProviderType
public class Job_Application_RecordsWrapper implements Job_Application_Records,
	ModelWrapper<Job_Application_Records> {
	public Job_Application_RecordsWrapper(
		Job_Application_Records job_Application_Records) {
		_job_Application_Records = job_Application_Records;
	}

	@Override
	public Class<?> getModelClass() {
		return Job_Application_Records.class;
	}

	@Override
	public String getModelClassName() {
		return Job_Application_Records.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SapId", getSapId());
		attributes.put("JobId", getJobId());
		attributes.put("ApplicationDate", getApplicationDate());
		attributes.put("resume", getResume());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SapId = (Long)attributes.get("SapId");

		if (SapId != null) {
			setSapId(SapId);
		}

		Long JobId = (Long)attributes.get("JobId");

		if (JobId != null) {
			setJobId(JobId);
		}

		Date ApplicationDate = (Date)attributes.get("ApplicationDate");

		if (ApplicationDate != null) {
			setApplicationDate(ApplicationDate);
		}

		String resume = (String)attributes.get("resume");

		if (resume != null) {
			setResume(resume);
		}
	}

	@Override
	public JobApplicationRecordService.model.Job_Application_Records toEscapedModel() {
		return new Job_Application_RecordsWrapper(_job_Application_Records.toEscapedModel());
	}

	@Override
	public JobApplicationRecordService.model.Job_Application_Records toUnescapedModel() {
		return new Job_Application_RecordsWrapper(_job_Application_Records.toUnescapedModel());
	}

	/**
	* Returns the primary key of this job_ application_ records.
	*
	* @return the primary key of this job_ application_ records
	*/
	@Override
	public JobApplicationRecordService.service.persistence.Job_Application_RecordsPK getPrimaryKey() {
		return _job_Application_Records.getPrimaryKey();
	}

	@Override
	public boolean isCachedModel() {
		return _job_Application_Records.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _job_Application_Records.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _job_Application_Records.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _job_Application_Records.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<JobApplicationRecordService.model.Job_Application_Records> toCacheModel() {
		return _job_Application_Records.toCacheModel();
	}

	@Override
	public int compareTo(
		JobApplicationRecordService.model.Job_Application_Records job_Application_Records) {
		return _job_Application_Records.compareTo(job_Application_Records);
	}

	@Override
	public int hashCode() {
		return _job_Application_Records.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _job_Application_Records.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new Job_Application_RecordsWrapper((Job_Application_Records)_job_Application_Records.clone());
	}

	/**
	* Returns the resume of this job_ application_ records.
	*
	* @return the resume of this job_ application_ records
	*/
	@Override
	public java.lang.String getResume() {
		return _job_Application_Records.getResume();
	}

	@Override
	public java.lang.String toString() {
		return _job_Application_Records.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _job_Application_Records.toXmlString();
	}

	/**
	* Returns the application date of this job_ application_ records.
	*
	* @return the application date of this job_ application_ records
	*/
	@Override
	public Date getApplicationDate() {
		return _job_Application_Records.getApplicationDate();
	}

	/**
	* Returns the job ID of this job_ application_ records.
	*
	* @return the job ID of this job_ application_ records
	*/
	@Override
	public long getJobId() {
		return _job_Application_Records.getJobId();
	}

	/**
	* Returns the sap ID of this job_ application_ records.
	*
	* @return the sap ID of this job_ application_ records
	*/
	@Override
	public long getSapId() {
		return _job_Application_Records.getSapId();
	}

	@Override
	public void persist() {
		_job_Application_Records.persist();
	}

	/**
	* Sets the application date of this job_ application_ records.
	*
	* @param ApplicationDate the application date of this job_ application_ records
	*/
	@Override
	public void setApplicationDate(Date ApplicationDate) {
		_job_Application_Records.setApplicationDate(ApplicationDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_job_Application_Records.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_job_Application_Records.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_job_Application_Records.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_job_Application_Records.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the job ID of this job_ application_ records.
	*
	* @param JobId the job ID of this job_ application_ records
	*/
	@Override
	public void setJobId(long JobId) {
		_job_Application_Records.setJobId(JobId);
	}

	@Override
	public void setNew(boolean n) {
		_job_Application_Records.setNew(n);
	}

	/**
	* Sets the primary key of this job_ application_ records.
	*
	* @param primaryKey the primary key of this job_ application_ records
	*/
	@Override
	public void setPrimaryKey(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK primaryKey) {
		_job_Application_Records.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_job_Application_Records.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the resume of this job_ application_ records.
	*
	* @param resume the resume of this job_ application_ records
	*/
	@Override
	public void setResume(java.lang.String resume) {
		_job_Application_Records.setResume(resume);
	}

	/**
	* Sets the sap ID of this job_ application_ records.
	*
	* @param SapId the sap ID of this job_ application_ records
	*/
	@Override
	public void setSapId(long SapId) {
		_job_Application_Records.setSapId(SapId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Job_Application_RecordsWrapper)) {
			return false;
		}

		Job_Application_RecordsWrapper job_Application_RecordsWrapper = (Job_Application_RecordsWrapper)obj;

		if (Objects.equals(_job_Application_Records,
					job_Application_RecordsWrapper._job_Application_Records)) {
			return true;
		}

		return false;
	}

	@Override
	public Job_Application_Records getWrappedModel() {
		return _job_Application_Records;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _job_Application_Records.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _job_Application_Records.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_job_Application_Records.resetOriginalValues();
	}

	private final Job_Application_Records _job_Application_Records;
}