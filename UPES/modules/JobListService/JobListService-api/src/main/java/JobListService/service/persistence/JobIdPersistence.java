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

import JobListService.exception.NoSuchJobIdException;

import JobListService.model.JobId;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the job ID service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobListService.service.persistence.impl.JobIdPersistenceImpl
 * @see JobIdUtil
 * @generated
 */
@ProviderType
public interface JobIdPersistence extends BasePersistence<JobId> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JobIdUtil} to access the job ID persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the job ID in the entity cache if it is enabled.
	*
	* @param jobId the job ID
	*/
	public void cacheResult(JobId jobId);

	/**
	* Caches the job IDs in the entity cache if it is enabled.
	*
	* @param jobIds the job IDs
	*/
	public void cacheResult(java.util.List<JobId> jobIds);

	/**
	* Creates a new job ID with the primary key. Does not add the job ID to the database.
	*
	* @param JobId the primary key for the new job ID
	* @return the new job ID
	*/
	public JobId create(long JobId);

	/**
	* Removes the job ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID that was removed
	* @throws NoSuchJobIdException if a job ID with the primary key could not be found
	*/
	public JobId remove(long JobId) throws NoSuchJobIdException;

	public JobId updateImpl(JobId jobId);

	/**
	* Returns the job ID with the primary key or throws a {@link NoSuchJobIdException} if it could not be found.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID
	* @throws NoSuchJobIdException if a job ID with the primary key could not be found
	*/
	public JobId findByPrimaryKey(long JobId) throws NoSuchJobIdException;

	/**
	* Returns the job ID with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param JobId the primary key of the job ID
	* @return the job ID, or <code>null</code> if a job ID with the primary key could not be found
	*/
	public JobId fetchByPrimaryKey(long JobId);

	@Override
	public java.util.Map<java.io.Serializable, JobId> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the job IDs.
	*
	* @return the job IDs
	*/
	public java.util.List<JobId> findAll();

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
	public java.util.List<JobId> findAll(int start, int end);

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
	public java.util.List<JobId> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JobId> orderByComparator);

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
	public java.util.List<JobId> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JobId> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the job IDs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of job IDs.
	*
	* @return the number of job IDs
	*/
	public int countAll();
}