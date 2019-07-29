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

import JobApplicationRecordService.model.Job_Application_Records;

import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for Job_Application_Records. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsLocalServiceUtil
 * @see JobApplicationRecordService.service.base.Job_Application_RecordsLocalServiceBaseImpl
 * @see JobApplicationRecordService.service.impl.Job_Application_RecordsLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface Job_Application_RecordsLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link Job_Application_RecordsLocalServiceUtil} to access the job_ application_ records local service. Add custom service methods to {@link JobApplicationRecordService.service.impl.Job_Application_RecordsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the job_ application_ records to the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Job_Application_Records addJob_Application_Records(
		Job_Application_Records job_Application_Records);

	/**
	* Creates a new job_ application_ records with the primary key. Does not add the job_ application_ records to the database.
	*
	* @param job_Application_RecordsPK the primary key for the new job_ application_ records
	* @return the new job_ application_ records
	*/
	public Job_Application_Records createJob_Application_Records(
		Job_Application_RecordsPK job_Application_RecordsPK);

	/**
	* Deletes the job_ application_ records from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Job_Application_Records deleteJob_Application_Records(
		Job_Application_Records job_Application_Records);

	/**
	* Deletes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records that was removed
	* @throws PortalException if a job_ application_ records with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Job_Application_Records deleteJob_Application_Records(
		Job_Application_RecordsPK job_Application_RecordsPK)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Job_Application_Records fetchJob_Application_Records(
		Job_Application_RecordsPK job_Application_RecordsPK);

	/**
	* Returns the job_ application_ records with the primary key.
	*
	* @param job_Application_RecordsPK the primary key of the job_ application_ records
	* @return the job_ application_ records
	* @throws PortalException if a job_ application_ records with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Job_Application_Records getJob_Application_Records(
		Job_Application_RecordsPK job_Application_RecordsPK)
		throws PortalException;

	/**
	* Updates the job_ application_ records in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param job_Application_Records the job_ application_ records
	* @return the job_ application_ records that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Job_Application_Records updateJob_Application_Records(
		Job_Application_Records job_Application_Records);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of job_ application_ recordses.
	*
	* @return the number of job_ application_ recordses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getJob_Application_RecordsesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Job_Application_Records> getJob_Application_Recordses(
		int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}