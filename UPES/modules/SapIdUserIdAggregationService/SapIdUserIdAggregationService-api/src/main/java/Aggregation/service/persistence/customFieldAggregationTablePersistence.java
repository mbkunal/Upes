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

import Aggregation.exception.NoSuchcustomFieldAggregationTableException;

import Aggregation.model.customFieldAggregationTable;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the custom field aggregation table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Aggregation.service.persistence.impl.customFieldAggregationTablePersistenceImpl
 * @see customFieldAggregationTableUtil
 * @generated
 */
@ProviderType
public interface customFieldAggregationTablePersistence extends BasePersistence<customFieldAggregationTable> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link customFieldAggregationTableUtil} to access the custom field aggregation table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the custom field aggregation tables where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the matching custom field aggregation tables
	*/
	public java.util.List<customFieldAggregationTable> findByfindByJobId(
		int SapId);

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
	public java.util.List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end);

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
	public java.util.List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator);

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
	public java.util.List<customFieldAggregationTable> findByfindByJobId(
		int SapId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	*/
	public customFieldAggregationTable findByfindByJobId_First(int SapId,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws NoSuchcustomFieldAggregationTableException;

	/**
	* Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	*/
	public customFieldAggregationTable fetchByfindByJobId_First(int SapId,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator);

	/**
	* Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	*/
	public customFieldAggregationTable findByfindByJobId_Last(int SapId,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws NoSuchcustomFieldAggregationTableException;

	/**
	* Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	*/
	public customFieldAggregationTable fetchByfindByJobId_Last(int SapId,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator);

	/**
	* Removes all the custom field aggregation tables where SapId = &#63; from the database.
	*
	* @param SapId the sap ID
	*/
	public void removeByfindByJobId(int SapId);

	/**
	* Returns the number of custom field aggregation tables where SapId = &#63;.
	*
	* @param SapId the sap ID
	* @return the number of matching custom field aggregation tables
	*/
	public int countByfindByJobId(int SapId);

	/**
	* Caches the custom field aggregation table in the entity cache if it is enabled.
	*
	* @param customFieldAggregationTable the custom field aggregation table
	*/
	public void cacheResult(
		customFieldAggregationTable customFieldAggregationTable);

	/**
	* Caches the custom field aggregation tables in the entity cache if it is enabled.
	*
	* @param customFieldAggregationTables the custom field aggregation tables
	*/
	public void cacheResult(
		java.util.List<customFieldAggregationTable> customFieldAggregationTables);

	/**
	* Creates a new custom field aggregation table with the primary key. Does not add the custom field aggregation table to the database.
	*
	* @param SapId the primary key for the new custom field aggregation table
	* @return the new custom field aggregation table
	*/
	public customFieldAggregationTable create(int SapId);

	/**
	* Removes the custom field aggregation table with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table that was removed
	* @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	*/
	public customFieldAggregationTable remove(int SapId)
		throws NoSuchcustomFieldAggregationTableException;

	public customFieldAggregationTable updateImpl(
		customFieldAggregationTable customFieldAggregationTable);

	/**
	* Returns the custom field aggregation table with the primary key or throws a {@link NoSuchcustomFieldAggregationTableException} if it could not be found.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table
	* @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	*/
	public customFieldAggregationTable findByPrimaryKey(int SapId)
		throws NoSuchcustomFieldAggregationTableException;

	/**
	* Returns the custom field aggregation table with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SapId the primary key of the custom field aggregation table
	* @return the custom field aggregation table, or <code>null</code> if a custom field aggregation table with the primary key could not be found
	*/
	public customFieldAggregationTable fetchByPrimaryKey(int SapId);

	@Override
	public java.util.Map<java.io.Serializable, customFieldAggregationTable> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the custom field aggregation tables.
	*
	* @return the custom field aggregation tables
	*/
	public java.util.List<customFieldAggregationTable> findAll();

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
	public java.util.List<customFieldAggregationTable> findAll(int start,
		int end);

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
	public java.util.List<customFieldAggregationTable> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator);

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
	public java.util.List<customFieldAggregationTable> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the custom field aggregation tables from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of custom field aggregation tables.
	*
	* @return the number of custom field aggregation tables
	*/
	public int countAll();
}