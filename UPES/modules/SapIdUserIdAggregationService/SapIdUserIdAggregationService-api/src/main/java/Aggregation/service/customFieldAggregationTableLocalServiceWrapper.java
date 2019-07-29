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

package Aggregation.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link customFieldAggregationTableLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTableLocalService
 * @generated
 */
@ProviderType
public class customFieldAggregationTableLocalServiceWrapper
	implements customFieldAggregationTableLocalService,
		ServiceWrapper<customFieldAggregationTableLocalService> {
	public customFieldAggregationTableLocalServiceWrapper(
		customFieldAggregationTableLocalService customFieldAggregationTableLocalService) {
		_customFieldAggregationTableLocalService = customFieldAggregationTableLocalService;
	}

	/**
	* Adds the custom field aggregation table to the database. Also notifies the appropriate model listeners.
	*
	* @param customFieldAggregationTable the custom field aggregation table
	* @return the custom field aggregation table that was added
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable addcustomFieldAggregationTable(
		Aggregation.model.customFieldAggregationTable customFieldAggregationTable) {
		return _customFieldAggregationTableLocalService.addcustomFieldAggregationTable(customFieldAggregationTable);
	}

	/**
	* Creates a new custom field aggregation table with the primary key. Does not add the custom field aggregation table to the database.
	*
	* @param SapId the primary key for the new custom field aggregation table
	* @return the new custom field aggregation table
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable createcustomFieldAggregationTable(
		int SapId) {
		return _customFieldAggregationTableLocalService.createcustomFieldAggregationTable(SapId);
	}

	/**
	* Deletes the custom field aggregation table from the database. Also notifies the appropriate model listeners.
	*
	* @param customFieldAggregationTable the custom field aggregation table
	* @return the custom field aggregation table that was removed
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable deletecustomFieldAggregationTable(
		Aggregation.model.customFieldAggregationTable customFieldAggregationTable) {
		return _customFieldAggregationTableLocalService.deletecustomFieldAggregationTable(customFieldAggregationTable);
	}

	/**
	* Deletes the custom field aggregation table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table that was removed
	* @throws PortalException if a custom field aggregation table with the primary key could not be found
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable deletecustomFieldAggregationTable(
		int SapId) throws com.liferay.portal.kernel.exception.PortalException {
		return _customFieldAggregationTableLocalService.deletecustomFieldAggregationTable(SapId);
	}

	@Override
	public Aggregation.model.customFieldAggregationTable fetchcustomFieldAggregationTable(
		int SapId) {
		return _customFieldAggregationTableLocalService.fetchcustomFieldAggregationTable(SapId);
	}

	/**
	* Returns the custom field aggregation table with the primary key.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table
	* @throws PortalException if a custom field aggregation table with the primary key could not be found
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable getcustomFieldAggregationTable(
		int SapId) throws com.liferay.portal.kernel.exception.PortalException {
		return _customFieldAggregationTableLocalService.getcustomFieldAggregationTable(SapId);
	}

	/**
	* Updates the custom field aggregation table in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param customFieldAggregationTable the custom field aggregation table
	* @return the custom field aggregation table that was updated
	*/
	@Override
	public Aggregation.model.customFieldAggregationTable updatecustomFieldAggregationTable(
		Aggregation.model.customFieldAggregationTable customFieldAggregationTable) {
		return _customFieldAggregationTableLocalService.updatecustomFieldAggregationTable(customFieldAggregationTable);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _customFieldAggregationTableLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _customFieldAggregationTableLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _customFieldAggregationTableLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _customFieldAggregationTableLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _customFieldAggregationTableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of custom field aggregation tables.
	*
	* @return the number of custom field aggregation tables
	*/
	@Override
	public int getcustomFieldAggregationTablesCount() {
		return _customFieldAggregationTableLocalService.getcustomFieldAggregationTablesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _customFieldAggregationTableLocalService.getOSGiServiceIdentifier();
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
		return _customFieldAggregationTableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Aggregation.model.impl.customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customFieldAggregationTableLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Aggregation.model.impl.customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _customFieldAggregationTableLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the custom field aggregation tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link Aggregation.model.impl.customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @return the range of custom field aggregation tables
	*/
	@Override
	public java.util.List<Aggregation.model.customFieldAggregationTable> getcustomFieldAggregationTables(
		int start, int end) {
		return _customFieldAggregationTableLocalService.getcustomFieldAggregationTables(start,
			end);
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
		return _customFieldAggregationTableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _customFieldAggregationTableLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public customFieldAggregationTableLocalService getWrappedService() {
		return _customFieldAggregationTableLocalService;
	}

	@Override
	public void setWrappedService(
		customFieldAggregationTableLocalService customFieldAggregationTableLocalService) {
		_customFieldAggregationTableLocalService = customFieldAggregationTableLocalService;
	}

	private customFieldAggregationTableLocalService _customFieldAggregationTableLocalService;
}