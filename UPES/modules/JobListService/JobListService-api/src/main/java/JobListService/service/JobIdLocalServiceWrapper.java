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

package JobListService.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JobIdLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JobIdLocalService
 * @generated
 */
@ProviderType
public class JobIdLocalServiceWrapper implements JobIdLocalService,
	ServiceWrapper<JobIdLocalService> {
	public JobIdLocalServiceWrapper(JobIdLocalService jobIdLocalService) {
		_jobIdLocalService = jobIdLocalService;
	}

	/**
	* Adds the job ID to the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the job ID
	* @return the job ID that was added
	*/
	@Override
	public JobListService.model.JobId addJobId(JobListService.model.JobId jobId) {
		return _jobIdLocalService.addJobId(jobId);
	}

	/**
	* Creates a new job ID with the primary key. Does not add the job ID to the database.
	*
	* @param JobId the primary key for the new job ID
	* @return the new job ID
	*/
	@Override
	public JobListService.model.JobId createJobId(long JobId) {
		return _jobIdLocalService.createJobId(JobId);
	}

	/**
	* Deletes the job ID from the database. Also notifies the appropriate model listeners.
	*
	* @param jobId the job ID
	* @return the job ID that was removed
	*/
	@Override
	public JobListService.model.JobId deleteJobId(
		JobListService.model.JobId jobId) {
		return _jobIdLocalService.deleteJobId(jobId);
	}

	/**
	* Deletes the job ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID that was removed
	* @throws PortalException if a job ID with the primary key could not be found
	*/
	@Override
	public JobListService.model.JobId deleteJobId(long JobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobIdLocalService.deleteJobId(JobId);
	}

	@Override
	public JobListService.model.JobId fetchJobId(long JobId) {
		return _jobIdLocalService.fetchJobId(JobId);
	}

	/**
	* Returns the job ID with the primary key.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID
	* @throws PortalException if a job ID with the primary key could not be found
	*/
	@Override
	public JobListService.model.JobId getJobId(long JobId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobIdLocalService.getJobId(JobId);
	}

	/**
	* Updates the job ID in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jobId the job ID
	* @return the job ID that was updated
	*/
	@Override
	public JobListService.model.JobId updateJobId(
		JobListService.model.JobId jobId) {
		return _jobIdLocalService.updateJobId(jobId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jobIdLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jobIdLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jobIdLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobIdLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jobIdLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of job IDs.
	*
	* @return the number of job IDs
	*/
	@Override
	public int getJobIdsCount() {
		return _jobIdLocalService.getJobIdsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jobIdLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _jobIdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobListService.model.impl.JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _jobIdLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobListService.model.impl.JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _jobIdLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the job IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobListService.model.impl.JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job IDs
	* @param end the upper bound of the range of job IDs (not inclusive)
	* @return the range of job IDs
	*/
	@Override
	public java.util.List<JobListService.model.JobId> getJobIds(int start,
		int end) {
		return _jobIdLocalService.getJobIds(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _jobIdLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _jobIdLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public JobIdLocalService getWrappedService() {
		return _jobIdLocalService;
	}

	@Override
	public void setWrappedService(JobIdLocalService jobIdLocalService) {
		_jobIdLocalService = jobIdLocalService;
	}

	private JobIdLocalService _jobIdLocalService;
}