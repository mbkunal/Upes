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

package JobListService.service.persistence;

import JobListService.model.JobId;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the job ID service. This utility wraps {@link JobListService.service.persistence.impl.JobIdPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobIdPersistence
 * @see JobListService.service.persistence.impl.JobIdPersistenceImpl
 * @generated
 */
@ProviderType
public class JobIdUtil {
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
	public static void clearCache(JobId jobId) {
		getPersistence().clearCache(jobId);
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
	public static List<JobId> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JobId> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JobId> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<JobId> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JobId update(JobId jobId) {
		return getPersistence().update(jobId);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JobId update(JobId jobId, ServiceContext serviceContext) {
		return getPersistence().update(jobId, serviceContext);
	}

	/**
	* Caches the job ID in the entity cache if it is enabled.
	*
	* @param jobId the job ID
	*/
	public static void cacheResult(JobId jobId) {
		getPersistence().cacheResult(jobId);
	}

	/**
	* Caches the job IDs in the entity cache if it is enabled.
	*
	* @param jobIds the job IDs
	*/
	public static void cacheResult(List<JobId> jobIds) {
		getPersistence().cacheResult(jobIds);
	}

	/**
	* Creates a new job ID with the primary key. Does not add the job ID to the database.
	*
	* @param JobId the primary key for the new job ID
	* @return the new job ID
	*/
	public static JobId create(long JobId) {
		return getPersistence().create(JobId);
	}

	/**
	* Removes the job ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID that was removed
	* @throws NoSuchJobIdException if a job ID with the primary key could not be found
	*/
	public static JobId remove(long JobId)
		throws JobListService.exception.NoSuchJobIdException {
		return getPersistence().remove(JobId);
	}

	public static JobId updateImpl(JobId jobId) {
		return getPersistence().updateImpl(jobId);
	}

	/**
	* Returns the job ID with the primary key or throws a {@link NoSuchJobIdException} if it could not be found.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID
	* @throws NoSuchJobIdException if a job ID with the primary key could not be found
	*/
	public static JobId findByPrimaryKey(long JobId)
		throws JobListService.exception.NoSuchJobIdException {
		return getPersistence().findByPrimaryKey(JobId);
	}

	/**
	* Returns the job ID with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID, or <code>null</code> if a job ID with the primary key could not be found
	*/
	public static JobId fetchByPrimaryKey(long JobId) {
		return getPersistence().fetchByPrimaryKey(JobId);
	}

	public static java.util.Map<java.io.Serializable, JobId> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the job IDs.
	*
	* @return the job IDs
	*/
	public static List<JobId> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the job IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job IDs
	* @param end the upper bound of the range of job IDs (not inclusive)
	* @return the range of job IDs
	*/
	public static List<JobId> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the job IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job IDs
	* @param end the upper bound of the range of job IDs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of job IDs
	*/
	public static List<JobId> findAll(int start, int end,
		OrderByComparator<JobId> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the job IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JobIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of job IDs
	* @param end the upper bound of the range of job IDs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of job IDs
	*/
	public static List<JobId> findAll(int start, int end,
		OrderByComparator<JobId> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the job IDs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of job IDs.
	*
	* @return the number of job IDs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JobIdPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JobIdPersistence, JobIdPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JobIdPersistence.class);
}