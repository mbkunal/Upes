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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the JobId service. Represents a row in the &quot;KMB_JobId&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link JobListService.model.impl.JobIdModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JobListService.model.impl.JobIdImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobId
 * @see JobListService.model.impl.JobIdImpl
 * @see JobListService.model.impl.JobIdModelImpl
 * @generated
 */
@ProviderType
public interface JobIdModel extends BaseModel<JobId> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a job ID model instance should use the {@link JobId} interface instead.
	 */

	/**
	 * Returns the primary key of this job ID.
	 *
	 * @return the primary key of this job ID
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this job ID.
	 *
	 * @param primaryKey the primary key of this job ID
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the job ID of this job ID.
	 *
	 * @return the job ID of this job ID
	 */
	public long getJobId();

	/**
	 * Sets the job ID of this job ID.
	 *
	 * @param JobId the job ID of this job ID
	 */
	public void setJobId(long JobId);

	/**
	 * Returns the company of this job ID.
	 *
	 * @return the company of this job ID
	 */
	@AutoEscape
	public String getCompany();

	/**
	 * Sets the company of this job ID.
	 *
	 * @param Company the company of this job ID
	 */
	public void setCompany(String Company);

	/**
	 * Returns the post of this job ID.
	 *
	 * @return the post of this job ID
	 */
	@AutoEscape
	public String getPost();

	/**
	 * Sets the post of this job ID.
	 *
	 * @param Post the post of this job ID
	 */
	public void setPost(String Post);

	/**
	 * Returns the pay of this job ID.
	 *
	 * @return the pay of this job ID
	 */
	public int getPay();

	/**
	 * Sets the pay of this job ID.
	 *
	 * @param Pay the pay of this job ID
	 */
	public void setPay(int Pay);

	/**
	 * Returns the cgpa of this job ID.
	 *
	 * @return the cgpa of this job ID
	 */
	public int getCGPA();

	/**
	 * Sets the cgpa of this job ID.
	 *
	 * @param CGPA the cgpa of this job ID
	 */
	public void setCGPA(int CGPA);

	/**
	 * Returns the description of this job ID.
	 *
	 * @return the description of this job ID
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this job ID.
	 *
	 * @param Description the description of this job ID
	 */
	public void setDescription(String Description);

	/**
	 * Returns the more info of this job ID.
	 *
	 * @return the more info of this job ID
	 */
	@AutoEscape
	public String getMoreInfo();

	/**
	 * Sets the more info of this job ID.
	 *
	 * @param MoreInfo the more info of this job ID
	 */
	public void setMoreInfo(String MoreInfo);

	/**
	 * Returns the last date to apply of this job ID.
	 *
	 * @return the last date to apply of this job ID
	 */
	public Date getLastDateToApply();

	/**
	 * Sets the last date to apply of this job ID.
	 *
	 * @param LastDateToApply the last date to apply of this job ID
	 */
	public void setLastDateToApply(Date LastDateToApply);

	/**
	 * Returns the cit of this job ID.
	 *
	 * @return the cit of this job ID
	 */
	public boolean getCIT();

	/**
	 * Returns <code>true</code> if this job ID is cit.
	 *
	 * @return <code>true</code> if this job ID is cit; <code>false</code> otherwise
	 */
	public boolean isCIT();

	/**
	 * Sets whether this job ID is cit.
	 *
	 * @param CIT the cit of this job ID
	 */
	public void setCIT(boolean CIT);

	/**
	 * Returns the non cit of this job ID.
	 *
	 * @return the non cit of this job ID
	 */
	public boolean getNonCIT();

	/**
	 * Returns <code>true</code> if this job ID is non cit.
	 *
	 * @return <code>true</code> if this job ID is non cit; <code>false</code> otherwise
	 */
	public boolean isNonCIT();

	/**
	 * Sets whether this job ID is non cit.
	 *
	 * @param nonCIT the non cit of this job ID
	 */
	public void setNonCIT(boolean nonCIT);

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
	public int compareTo(JobListService.model.JobId jobId);

	@Override
	public int hashCode();

	@Override
	public CacheModel<JobListService.model.JobId> toCacheModel();

	@Override
	public JobListService.model.JobId toEscapedModel();

	@Override
	public JobListService.model.JobId toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}