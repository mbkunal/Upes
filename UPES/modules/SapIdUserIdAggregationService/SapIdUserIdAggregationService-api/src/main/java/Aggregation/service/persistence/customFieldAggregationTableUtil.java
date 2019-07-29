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

package Aggregation.service.persistence;

import Aggregation.model.customFieldAggregationTable;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the custom field aggregation table service. This utility wraps {@link Aggregation.service.persistence.impl.customFieldAggregationTablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTablePersistence
 * @see Aggregation.service.persistence.impl.customFieldAggregationTablePersistenceImpl
 * @generated
 */
@ProviderType
public class customFieldAggregationTableUtil {
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
		customFieldAggregationTable customFieldAggregationTable) {
		getPersistence().clearCache(customFieldAggregationTable);
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
	public static List<customFieldAggregationTable> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<customFieldAggregationTable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<customFieldAggregationTable> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static customFieldAggregationTable update(
		customFieldAggregationTable customFieldAggregationTable) {
		return getPersistence().update(customFieldAggregationTable);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static customFieldAggregationTable update(
		customFieldAggregationTable customFieldAggregationTable,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(customFieldAggregationTable, serviceContext);
	}

	/**
	* Returns all the custom field aggregation tables where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the matching custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findByfindByJobId(int SapId) {
		return getPersistence().findByfindByJobId(SapId);
	}

	/**
	* Returns a range of all the custom field aggregation tables where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @return the range of matching custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end) {
		return getPersistence().findByfindByJobId(SapId, start, end);
	}

	/**
	* Returns an ordered range of all the custom field aggregation tables where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return getPersistence()
				   .findByfindByJobId(SapId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the custom field aggregation tables where SapId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param SapId the sap ID
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByfindByJobId(SapId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	*/
	public static customFieldAggregationTable findByfindByJobId_First(
		int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws Aggregation.exception.NoSuchcustomFieldAggregationTableException {
		return getPersistence().findByfindByJobId_First(SapId, orderByComparator);
	}

	/**
	* Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	*/
	public static customFieldAggregationTable fetchByfindByJobId_First(
		int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return getPersistence()
				   .fetchByfindByJobId_First(SapId, orderByComparator);
	}

	/**
	* Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	*/
	public static customFieldAggregationTable findByfindByJobId_Last(
		int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws Aggregation.exception.NoSuchcustomFieldAggregationTableException {
		return getPersistence().findByfindByJobId_Last(SapId, orderByComparator);
	}

	/**
	* Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	*/
	public static customFieldAggregationTable fetchByfindByJobId_Last(
		int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return getPersistence().fetchByfindByJobId_Last(SapId, orderByComparator);
	}

	/**
	* Removes all the custom field aggregation tables where SapId = &#63; from the database.
	*
	* @param SapId the sap ID
	*/
	public static void removeByfindByJobId(int SapId) {
		getPersistence().removeByfindByJobId(SapId);
	}

	/**
	* Returns the number of custom field aggregation tables where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the number of matching custom field aggregation tables
	*/
	public static int countByfindByJobId(int SapId) {
		return getPersistence().countByfindByJobId(SapId);
	}

	/**
	* Caches the custom field aggregation table in the entity cache if it is enabled.
	*
	* @param customFieldAggregationTable the custom field aggregation table
	*/
	public static void cacheResult(
		customFieldAggregationTable customFieldAggregationTable) {
		getPersistence().cacheResult(customFieldAggregationTable);
	}

	/**
	* Caches the custom field aggregation tables in the entity cache if it is enabled.
	*
	* @param customFieldAggregationTables the custom field aggregation tables
	*/
	public static void cacheResult(
		List<customFieldAggregationTable> customFieldAggregationTables) {
		getPersistence().cacheResult(customFieldAggregationTables);
	}

	/**
	* Creates a new custom field aggregation table with the primary key. Does not add the custom field aggregation table to the database.
	*
	* @param SapId the primary key for the new custom field aggregation table
	* @return the new custom field aggregation table
	*/
	public static customFieldAggregationTable create(int SapId) {
		return getPersistence().create(SapId);
	}

	/**
	* Removes the custom field aggregation table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table that was removed
	* @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	*/
	public static customFieldAggregationTable remove(int SapId)
		throws Aggregation.exception.NoSuchcustomFieldAggregationTableException {
		return getPersistence().remove(SapId);
	}

	public static customFieldAggregationTable updateImpl(
		customFieldAggregationTable customFieldAggregationTable) {
		return getPersistence().updateImpl(customFieldAggregationTable);
	}

	/**
	* Returns the custom field aggregation table with the primary key or throws a {@link NoSuchcustomFieldAggregationTableException} if it could not be found.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	*/
	public static customFieldAggregationTable findByPrimaryKey(int SapId)
		throws Aggregation.exception.NoSuchcustomFieldAggregationTableException {
		return getPersistence().findByPrimaryKey(SapId);
	}

	/**
	* Returns the custom field aggregation table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table, or <code>null</code> if a custom field aggregation table with the primary key could not be found
	*/
	public static customFieldAggregationTable fetchByPrimaryKey(int SapId) {
		return getPersistence().fetchByPrimaryKey(SapId);
	}

	public static java.util.Map<java.io.Serializable, customFieldAggregationTable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the custom field aggregation tables.
	*
	* @return the custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the custom field aggregation tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @return the range of custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the custom field aggregation tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findAll(int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the custom field aggregation tables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link customFieldAggregationTableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of custom field aggregation tables
	* @param end the upper bound of the range of custom field aggregation tables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of custom field aggregation tables
	*/
	public static List<customFieldAggregationTable> findAll(int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the custom field aggregation tables from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of custom field aggregation tables.
	*
	* @return the number of custom field aggregation tables
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static customFieldAggregationTablePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<customFieldAggregationTablePersistence, customFieldAggregationTablePersistence> _serviceTracker =
		ServiceTrackerFactory.open(customFieldAggregationTablePersistence.class);
}