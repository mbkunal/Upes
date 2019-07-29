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

package JobApplicationRecordService.service.persistence;

import JobApplicationRecordService.model.Job_Application_Records;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the job_ application_ records service. This utility wraps {@link JobApplicationRecordService.service.persistence.impl.Job_Application_RecordsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsPersistence
 * @see JobApplicationRecordService.service.persistence.impl.Job_Application_RecordsPersistenceImpl
 * @generated
 */
@ProviderType
public class Job_Application_RecordsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		Job_Application_Records job_Application_Records) {
		getPersistence().clearCache(job_Application_Records);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Job_Application_Records> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Job_Application_Records> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Job_Application_Records> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Job_Application_Records update(
		Job_Application_Records job_Application_Records) {
		return getPersistence().update(job_Application_Records);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Job_Application_Records update(
		Job_Application_Records job_Application_Records,
		ServiceContext serviceContext) {
		return getPersistence().update(job_Application_Records, serviceContext);
	}

	/**
	* Returns all the job_ application_ recordses where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the matching job_ application_ recordses
	*/
	public static List<Job_Application_Records> findByfetchByJobId(long SapId) {
		return getPersistence().findByfetchByJobId(SapId);
	}

	/**
	* Returns a range of all the job_ application_ recordses where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @return the range of matching job_ application_ recordses
	*/
	public static List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end) {
		return getPersistence().findByfetchByJobId(SapId, start, end);
	}

	/**
	* Returns an ordered range of all the job_ application_ recordses where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching job_ application_ recordses
	*/
	public static List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return getPersistence()
				   .findByfetchByJobId(SapId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the job_ application_ recordses where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching job_ application_ recordses
	*/
	public static List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByfetchByJobId(SapId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	*/
	public static Job_Application_Records findByfetchByJobId_First(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator)
		throws JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException {
		return getPersistence()
				   .findByfetchByJobId_First(SapId, orderByComparator);
	}

	/**
	* Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	*/
	public static Job_Application_Records fetchByfetchByJobId_First(
		long SapId, OrderByComparator<Job_Application_Records> orderByComparator) {
		return getPersistence()
				   .fetchByfetchByJobId_First(SapId, orderByComparator);
	}

	/**
	* Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	*/
	public static Job_Application_Records findByfetchByJobId_Last(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator)
		throws JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException {
		return getPersistence().findByfetchByJobId_Last(SapId, orderByComparator);
	}

	/**
	* Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	*/
	public static Job_Application_Records fetchByfetchByJobId_Last(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return getPersistence()
				   .fetchByfetchByJobId_Last(SapId, orderByComparator);
	}

	/**
	* Returns the job_ application_ recordses before and after the current job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param job_Application_RecordsPK the primary key of the current job_ application_ records
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public static Job_Application_Records[] findByfetchByJobId_PrevAndNext(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK,
		long SapId, OrderByComparator<Job_Application_Records> orderByComparator)
		throws JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException {
		return getPersistence()
				   .findByfetchByJobId_PrevAndNext(job_Application_RecordsPK,
			SapId, orderByComparator);
	}

	/**
	* Removes all the job_ application_ recordses where SapId = &#63; from the database.
	*
	* @param SapId the sap ID
	*/
	public static void removeByfetchByJobId(long SapId) {
		getPersistence().removeByfetchByJobId(SapId);
	}

	/**
	* Returns the number of job_ application_ recordses where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the number of matching job_ application_ recordses
	*/
	public static int countByfetchByJobId(long SapId) {
		return getPersistence().countByfetchByJobId(SapId);
	}

	/**
	* Caches the job_ application_ records in the entity cache if it is enabled.
	*
	* @param job_Application_Records the job_ application_ records
	*/
	public static void cacheResult(
		Job_Application_Records job_Application_Records) {
		getPersistence().cacheResult(job_Application_Records);
	}

	/**
	* Caches the job_ application_ recordses in the entity cache if it is enabled.
	*
	* @param job_Application_Recordses the job_ application_ recordses
	*/
	public static void cacheResult(
		List<Job_Application_Records> job_Application_Recordses) {
		getPersistence().cacheResult(job_Application_Recordses);
	}

	/**
	* Creates a new job_ application_ records with the primary key. Does not add the job_ application_ records to the database.
	*
	* @param job_Application_RecordsPK the primary key for the new job_ application_ records
	* @return the new job_ application_ records
	*/
	public static Job_Application_Records create(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK) {
		return getPersistence().create(job_Application_RecordsPK);
	}

	/**
	* Removes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records that was removed
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public static Job_Application_Records remove(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException {
		return getPersistence().remove(job_Application_RecordsPK);
	}

	public static Job_Application_Records updateImpl(
		Job_Application_Records job_Application_Records) {
		return getPersistence().updateImpl(job_Application_Records);
	}

	/**
	* Returns the job_ application_ records with the primary key or throws a {@link NoSuchJob_Application_RecordsException} if it could not be found.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public static Job_Application_Records findByPrimaryKey(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException {
		return getPersistence().findByPrimaryKey(job_Application_RecordsPK);
	}

	/**
	* Returns the job_ application_ records with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records, or <code>null</code> if a job_ application_ records with the primary key could not be found
	*/
	public static Job_Application_Records fetchByPrimaryKey(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK) {
		return getPersistence().fetchByPrimaryKey(job_Application_RecordsPK);
	}

	public static java.util.Map<java.io.Serializable, Job_Application_Records> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the job_ application_ recordses.
	*
	* @return the job_ application_ recordses
	*/
	public static List<Job_Application_Records> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the job_ application_ recordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @return the range of job_ application_ recordses
	*/
	public static List<Job_Application_Records> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the job_ application_ recordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of job_ application_ recordses
	*/
	public static List<Job_Application_Records> findAll(int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the job_ application_ recordses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Job_Application_RecordsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job_ application_ recordses
	* @param end the upper bound of the range of job_ application_ recordses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of job_ application_ recordses
	*/
	public static List<Job_Application_Records> findAll(int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the job_ application_ recordses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of job_ application_ recordses.
	*
	* @return the number of job_ application_ recordses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static Job_Application_RecordsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<Job_Application_RecordsPersistence, Job_Application_RecordsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(Job_Application_RecordsPersistence.class);
}