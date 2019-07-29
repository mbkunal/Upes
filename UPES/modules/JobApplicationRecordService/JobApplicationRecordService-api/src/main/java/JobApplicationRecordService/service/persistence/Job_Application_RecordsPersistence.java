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

import JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException;

import JobApplicationRecordService.model.Job_Application_Records;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the job_ application_ records service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobApplicationRecordService.service.persistence.impl.Job_Application_RecordsPersistenceImpl
 * @see Job_Application_RecordsUtil
 * @generated
 */
@ProviderType
public interface Job_Application_RecordsPersistence extends BasePersistence<Job_Application_Records> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Job_Application_RecordsUtil} to access the job_ application_ records persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the job_ application_ recordses where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the matching job_ application_ recordses
	*/
	public java.util.List<Job_Application_Records> findByfetchByJobId(
		long SapId);

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
	public java.util.List<Job_Application_Records> findByfetchByJobId(
		long SapId, int start, int end);

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
	public java.util.List<Job_Application_Records> findByfetchByJobId(
		long SapId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator);

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
	public java.util.List<Job_Application_Records> findByfetchByJobId(
		long SapId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	*/
	public Job_Application_Records findByfetchByJobId_First(long SapId,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException;

	/**
	* Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	*/
	public Job_Application_Records fetchByfetchByJobId_First(long SapId,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator);

	/**
	* Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	*/
	public Job_Application_Records findByfetchByJobId_Last(long SapId,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException;

	/**
	* Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	*/
	public Job_Application_Records fetchByfetchByJobId_Last(long SapId,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator);

	/**
	* Returns the job_ application_ recordses before and after the current job_ application_ records in the ordered set where SapId = &#63;.
	*
	* @param job_Application_RecordsPK the primary key of the current job_ application_ records
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public Job_Application_Records[] findByfetchByJobId_PrevAndNext(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK,
		long SapId,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException;

	/**
	* Removes all the job_ application_ recordses where SapId = &#63; from the database.
	*
	* @param SapId the sap ID
	*/
	public void removeByfetchByJobId(long SapId);

	/**
	* Returns the number of job_ application_ recordses where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the number of matching job_ application_ recordses
	*/
	public int countByfetchByJobId(long SapId);

	/**
	* Caches the job_ application_ records in the entity cache if it is enabled.
	*
	* @param job_Application_Records the job_ application_ records
	*/
	public void cacheResult(Job_Application_Records job_Application_Records);

	/**
	* Caches the job_ application_ recordses in the entity cache if it is enabled.
	*
	* @param job_Application_Recordses the job_ application_ recordses
	*/
	public void cacheResult(
		java.util.List<Job_Application_Records> job_Application_Recordses);

	/**
	* Creates a new job_ application_ records with the primary key. Does not add the job_ application_ records to the database.
	*
	* @param job_Application_RecordsPK the primary key for the new job_ application_ records
	* @return the new job_ application_ records
	*/
	public Job_Application_Records create(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK);

	/**
	* Removes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records that was removed
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public Job_Application_Records remove(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws NoSuchJob_Application_RecordsException;

	public Job_Application_Records updateImpl(
		Job_Application_Records job_Application_Records);

	/**
	* Returns the job_ application_ records with the primary key or throws a {@link NoSuchJob_Application_RecordsException} if it could not be found.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records
	* @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	*/
	public Job_Application_Records findByPrimaryKey(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK)
		throws NoSuchJob_Application_RecordsException;

	/**
	* Returns the job_ application_ records with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records, or <code>null</code> if a job_ application_ records with the primary key could not be found
	*/
	public Job_Application_Records fetchByPrimaryKey(
		JobApplicationRecordService.service.persistence.Job_Application_RecordsPK job_Application_RecordsPK);

	@Override
	public java.util.Map<java.io.Serializable, Job_Application_Records> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the job_ application_ recordses.
	*
	* @return the job_ application_ recordses
	*/
	public java.util.List<Job_Application_Records> findAll();

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
	public java.util.List<Job_Application_Records> findAll(int start, int end);

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
	public java.util.List<Job_Application_Records> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator);

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
	public java.util.List<Job_Application_Records> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Job_Application_Records> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the job_ application_ recordses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of job_ application_ recordses.
	*
	* @return the number of job_ application_ recordses
	*/
	public int countAll();
}