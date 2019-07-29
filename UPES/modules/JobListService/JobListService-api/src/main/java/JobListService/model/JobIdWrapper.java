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

package JobListService.model;

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
 * This class is a wrapper for {@link JobId}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobId
 * @generated
 */
@ProviderType
public class JobIdWrapper implements JobId, ModelWrapper<JobId> {
	public JobIdWrapper(JobId jobId) {
		_jobId = jobId;
	}

	@Override
	public Class<?> getModelClass() {
		return JobId.class;
	}

	@Override
	public String getModelClassName() {
		return JobId.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("JobId", getJobId());
		attributes.put("Company", getCompany());
		attributes.put("Post", getPost());
		attributes.put("Pay", getPay());
		attributes.put("CGPA", getCGPA());
		attributes.put("Description", getDescription());
		attributes.put("MoreInfo", getMoreInfo());
		attributes.put("LastDateToApply", getLastDateToApply());
		attributes.put("CIT", getCIT());
		attributes.put("nonCIT", getNonCIT());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long JobId = (Long)attributes.get("JobId");

		if (JobId != null) {
			setJobId(JobId);
		}

		String Company = (String)attributes.get("Company");

		if (Company != null) {
			setCompany(Company);
		}

		String Post = (String)attributes.get("Post");

		if (Post != null) {
			setPost(Post);
		}

		Integer Pay = (Integer)attributes.get("Pay");

		if (Pay != null) {
			setPay(Pay);
		}

		Integer CGPA = (Integer)attributes.get("CGPA");

		if (CGPA != null) {
			setCGPA(CGPA);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		String MoreInfo = (String)attributes.get("MoreInfo");

		if (MoreInfo != null) {
			setMoreInfo(MoreInfo);
		}

		Date LastDateToApply = (Date)attributes.get("LastDateToApply");

		if (LastDateToApply != null) {
			setLastDateToApply(LastDateToApply);
		}

		Boolean CIT = (Boolean)attributes.get("CIT");

		if (CIT != null) {
			setCIT(CIT);
		}

		Boolean nonCIT = (Boolean)attributes.get("nonCIT");

		if (nonCIT != null) {
			setNonCIT(nonCIT);
		}
	}

	@Override
	public JobListService.model.JobId toEscapedModel() {
		return new JobIdWrapper(_jobId.toEscapedModel());
	}

	@Override
	public JobListService.model.JobId toUnescapedModel() {
		return new JobIdWrapper(_jobId.toUnescapedModel());
	}

	/**
	* Returns the cit of this job ID.
	*
	* @return the cit of this job ID
	*/
	@Override
	public boolean getCIT() {
		return _jobId.getCIT();
	}

	/**
	* Returns the non cit of this job ID.
	*
	* @return the non cit of this job ID
	*/
	@Override
	public boolean getNonCIT() {
		return _jobId.getNonCIT();
	}

	/**
	* Returns <code>true</code> if this job ID is cit.
	*
	* @return <code>true</code> if this job ID is cit; <code>false</code> otherwise
	*/
	@Override
	public boolean isCIT() {
		return _jobId.isCIT();
	}

	@Override
	public boolean isCachedModel() {
		return _jobId.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jobId.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jobId.isNew();
	}

	/**
	* Returns <code>true</code> if this job ID is non cit.
	*
	* @return <code>true</code> if this job ID is non cit; <code>false</code> otherwise
	*/
	@Override
	public boolean isNonCIT() {
		return _jobId.isNonCIT();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jobId.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<JobListService.model.JobId> toCacheModel() {
		return _jobId.toCacheModel();
	}

	@Override
	public int compareTo(JobListService.model.JobId jobId) {
		return _jobId.compareTo(jobId);
	}

	/**
	* Returns the cgpa of this job ID.
	*
	* @return the cgpa of this job ID
	*/
	@Override
	public int getCGPA() {
		return _jobId.getCGPA();
	}

	/**
	* Returns the pay of this job ID.
	*
	* @return the pay of this job ID
	*/
	@Override
	public int getPay() {
		return _jobId.getPay();
	}

	@Override
	public int hashCode() {
		return _jobId.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jobId.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new JobIdWrapper((JobId)_jobId.clone());
	}

	/**
	* Returns the company of this job ID.
	*
	* @return the company of this job ID
	*/
	@Override
	public java.lang.String getCompany() {
		return _jobId.getCompany();
	}

	/**
	* Returns the description of this job ID.
	*
	* @return the description of this job ID
	*/
	@Override
	public java.lang.String getDescription() {
		return _jobId.getDescription();
	}

	/**
	* Returns the more info of this job ID.
	*
	* @return the more info of this job ID
	*/
	@Override
	public java.lang.String getMoreInfo() {
		return _jobId.getMoreInfo();
	}

	/**
	* Returns the post of this job ID.
	*
	* @return the post of this job ID
	*/
	@Override
	public java.lang.String getPost() {
		return _jobId.getPost();
	}

	@Override
	public java.lang.String toString() {
		return _jobId.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jobId.toXmlString();
	}

	/**
	* Returns the last date to apply of this job ID.
	*
	* @return the last date to apply of this job ID
	*/
	@Override
	public Date getLastDateToApply() {
		return _jobId.getLastDateToApply();
	}

	/**
	* Returns the job ID of this job ID.
	*
	* @return the job ID of this job ID
	*/
	@Override
	public long getJobId() {
		return _jobId.getJobId();
	}

	/**
	* Returns the primary key of this job ID.
	*
	* @return the primary key of this job ID
	*/
	@Override
	public long getPrimaryKey() {
		return _jobId.getPrimaryKey();
	}

	@Override
	public void persist() {
		_jobId.persist();
	}

	/**
	* Sets the cgpa of this job ID.
	*
	* @param CGPA the cgpa of this job ID
	*/
	@Override
	public void setCGPA(int CGPA) {
		_jobId.setCGPA(CGPA);
	}

	/**
	* Sets whether this job ID is cit.
	*
	* @param CIT the cit of this job ID
	*/
	@Override
	public void setCIT(boolean CIT) {
		_jobId.setCIT(CIT);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jobId.setCachedModel(cachedModel);
	}

	/**
	* Sets the company of this job ID.
	*
	* @param Company the company of this job ID
	*/
	@Override
	public void setCompany(java.lang.String Company) {
		_jobId.setCompany(Company);
	}

	/**
	* Sets the description of this job ID.
	*
	* @param Description the description of this job ID
	*/
	@Override
	public void setDescription(java.lang.String Description) {
		_jobId.setDescription(Description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jobId.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jobId.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jobId.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the job ID of this job ID.
	*
	* @param JobId the job ID of this job ID
	*/
	@Override
	public void setJobId(long JobId) {
		_jobId.setJobId(JobId);
	}

	/**
	* Sets the last date to apply of this job ID.
	*
	* @param LastDateToApply the last date to apply of this job ID
	*/
	@Override
	public void setLastDateToApply(Date LastDateToApply) {
		_jobId.setLastDateToApply(LastDateToApply);
	}

	/**
	* Sets the more info of this job ID.
	*
	* @param MoreInfo the more info of this job ID
	*/
	@Override
	public void setMoreInfo(java.lang.String MoreInfo) {
		_jobId.setMoreInfo(MoreInfo);
	}

	@Override
	public void setNew(boolean n) {
		_jobId.setNew(n);
	}

	/**
	* Sets whether this job ID is non cit.
	*
	* @param nonCIT the non cit of this job ID
	*/
	@Override
	public void setNonCIT(boolean nonCIT) {
		_jobId.setNonCIT(nonCIT);
	}

	/**
	* Sets the pay of this job ID.
	*
	* @param Pay the pay of this job ID
	*/
	@Override
	public void setPay(int Pay) {
		_jobId.setPay(Pay);
	}

	/**
	* Sets the post of this job ID.
	*
	* @param Post the post of this job ID
	*/
	@Override
	public void setPost(java.lang.String Post) {
		_jobId.setPost(Post);
	}

	/**
	* Sets the primary key of this job ID.
	*
	* @param primaryKey the primary key of this job ID
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_jobId.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jobId.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobIdWrapper)) {
			return false;
		}

		JobIdWrapper jobIdWrapper = (JobIdWrapper)obj;

		if (Objects.equals(_jobId, jobIdWrapper._jobId)) {
			return true;
		}

		return false;
	}

	@Override
	public JobId getWrappedModel() {
		return _jobId;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jobId.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jobId.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jobId.resetOriginalValues();
	}

	private final JobId _jobId;
}