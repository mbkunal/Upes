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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Job_Application_Records. This utility wraps
 * {@link JobApplicationRecordService.service.impl.Job_Application_RecordsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsLocalService
 * @see JobApplicationRecordService.service.base.Job_Application_RecordsLocalServiceBaseImpl
 * @see JobApplicationRecordService.service.impl.Job_Application_RecordsLocalServiceImpl
 * @generated
 */
@ProviderType
public class Job_Application_RecordsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link JobApplicationRecordService.service.impl.Job_Application_RecordsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the job_ application_ records to the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was added
	*/
	public static JobApplicationRecordService.model.Job_Application_Records addJob_Application_Records(
		JobApplicationRecordService.model.Job_Application_Records job_Application_Records) {
		return getService().addJob_Application_Records(job_Application_Records);
	}

	/**
	* Creates a new job_ application_ records with the primary key. Does not add the job_ application_ records to the database.
	*
	* @param job_Application_RecordsPK the primary key for the new job_ application_ records
	* @return the new job_ application_ records
	*/
	public static JobApplicationRecordService.model.Job_Application_Records createJob_Application_Records(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK) {
		return getService()
				   .createJob_Application_Records(job_Application_RecordsPK);
	}

	/**
	* Deletes the job_ application_ records from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was removed
	*/
	public static JobApplicationRecordService.model.Job_Application_Records deleteJob_Application_Records(
		JobApplicationRecordService.model.Job_Application_Records job_Application_Records) {
		return getService()
				   .deleteJob_Application_Records(job_Application_Records);
	}

	/**
	* Deletes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records that was removed
	* @throws PortalException if a job_ application_ records with the primary key could not be found
	*/
	public static JobApplicationRecordService.model.Job_Application_Records deleteJob_Application_Records(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .deleteJob_Application_Records(job_Application_RecordsPK);
	}

	public static JobApplicationRecordService.model.Job_Application_Records fetchJob_Application_Records(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK) {
		return getService()
				   .fetchJob_Application_Records(job_Application_RecordsPK);
	}

	/**
	* Returns the job_ application_ records with the primary key.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records
	* @throws PortalException if a job_ application_ records with the primary key could not be found
	*/
	public static JobApplicationRecordService.model.Job_Application_Records getJob_Application_Records(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getJob_Application_Records(job_Application_RecordsPK);
	}

	/**
	* Updates the job_ application_ records in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was updated
	*/
	public static JobApplicationRecordService.model.Job_Application_Records updateJob_Application_Records(
		JobApplicationRecordService.model.Job_Application_Records job_Application_Records) {
		return getService()
				   .updateJob_Application_Records(job_Application_Records);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of job_ application_ recordses.
	*
	* @return the number of job_ application_ recordses
	*/
	public static int getJob_Application_RecordsesCount() {
		return getService().getJob_Application_RecordsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the job_ application_ recordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @return the range of job_ application_ recordses
	*/
	public static java.util.List<JobApplicationRecordService.model.Job_Application_Records> getJob_Application_Recordses(
		int start, int end) {
		return getService().getJob_Application_Recordses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Job_Application_RecordsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<Job_Application_RecordsLocalService, Job_Application_RecordsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(Job_Application_RecordsLocalService.class);
}