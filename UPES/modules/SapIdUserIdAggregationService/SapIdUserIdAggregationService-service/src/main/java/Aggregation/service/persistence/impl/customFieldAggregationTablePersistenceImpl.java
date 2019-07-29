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

package Aggregation.service.persistence.impl;

import Aggregation.exception.NoSuchcustomFieldAggregationTableException;

import Aggregation.model.customFieldAggregationTable;

import Aggregation.model.impl.customFieldAggregationTableImpl;
import Aggregation.model.impl.customFieldAggregationTableModelImpl;

import Aggregation.service.persistence.customFieldAggregationTablePersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the custom field aggregation table service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTablePersistence
 * @see Aggregation.service.persistence.customFieldAggregationTableUtil
 * @generated
 */
@ProviderType
public class customFieldAggregationTablePersistenceImpl
	extends BasePersistenceImpl<customFieldAggregationTable>
	implements customFieldAggregationTablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link customFieldAggregationTableUtil} to access the custom field aggregation table persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = customFieldAggregationTableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYJOBID =
		new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfindByJobId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID =
		new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfindByJobId",
			new String[] { Integer.class.getName() },
			customFieldAggregationTableModelImpl.SAPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINDBYJOBID = new FinderPath(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfindByJobId", new String[] { Integer.class.getName() });

	/**
	 * Returns all the custom field aggregation tables where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @return the matching custom field aggregation tables
	 */
	@Override
	public List<customFieldAggregationTable> findByfindByJobId(int SapId) {
		return findByfindByJobId(SapId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<customFieldAggregationTable> findByfindByJobId(int SapId,
		int start, int end) {
		return findByfindByJobId(SapId, start, end, null);
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
	@Override
	public List<customFieldAggregationTable> findByfindByJobId(int SapId,
		int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return findByfindByJobId(SapId, start, end, orderByComparator, true);
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
	@Override
	public List<customFieldAggregationTable> findByfindByJobId(int SapId,
		int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID;
			finderArgs = new Object[] { SapId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINDBYJOBID;
			finderArgs = new Object[] { SapId, start, end, orderByComparator };
		}

		List<customFieldAggregationTable> list = null;

		if (retrieveFromCache) {
			list = (List<customFieldAggregationTable>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (customFieldAggregationTable customFieldAggregationTable : list) {
					if ((SapId != customFieldAggregationTable.getSapId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE_WHERE);

			query.append(_FINDER_COLUMN_FINDBYJOBID_SAPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(customFieldAggregationTableModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(SapId);

				if (!pagination) {
					list = (List<customFieldAggregationTable>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<customFieldAggregationTable>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching custom field aggregation table
	 * @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	 */
	@Override
	public customFieldAggregationTable findByfindByJobId_First(int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws NoSuchcustomFieldAggregationTableException {
		customFieldAggregationTable customFieldAggregationTable = fetchByfindByJobId_First(SapId,
				orderByComparator);

		if (customFieldAggregationTable != null) {
			return customFieldAggregationTable;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SapId=");
		msg.append(SapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcustomFieldAggregationTableException(msg.toString());
	}

	/**
	 * Returns the first custom field aggregation table in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	 */
	@Override
	public customFieldAggregationTable fetchByfindByJobId_First(int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		List<customFieldAggregationTable> list = findByfindByJobId(SapId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching custom field aggregation table
	 * @throws NoSuchcustomFieldAggregationTableException if a matching custom field aggregation table could not be found
	 */
	@Override
	public customFieldAggregationTable findByfindByJobId_Last(int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator)
		throws NoSuchcustomFieldAggregationTableException {
		customFieldAggregationTable customFieldAggregationTable = fetchByfindByJobId_Last(SapId,
				orderByComparator);

		if (customFieldAggregationTable != null) {
			return customFieldAggregationTable;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SapId=");
		msg.append(SapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchcustomFieldAggregationTableException(msg.toString());
	}

	/**
	 * Returns the last custom field aggregation table in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching custom field aggregation table, or <code>null</code> if a matching custom field aggregation table could not be found
	 */
	@Override
	public customFieldAggregationTable fetchByfindByJobId_Last(int SapId,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		int count = countByfindByJobId(SapId);

		if (count == 0) {
			return null;
		}

		List<customFieldAggregationTable> list = findByfindByJobId(SapId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the custom field aggregation tables where SapId = &#63; from the database.
	 *
	 * @param SapId the sap ID
	 */
	@Override
	public void removeByfindByJobId(int SapId) {
		for (customFieldAggregationTable customFieldAggregationTable : findByfindByJobId(
				SapId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(customFieldAggregationTable);
		}
	}

	/**
	 * Returns the number of custom field aggregation tables where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @return the number of matching custom field aggregation tables
	 */
	@Override
	public int countByfindByJobId(int SapId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINDBYJOBID;

		Object[] finderArgs = new Object[] { SapId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CUSTOMFIELDAGGREGATIONTABLE_WHERE);

			query.append(_FINDER_COLUMN_FINDBYJOBID_SAPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(SapId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FINDBYJOBID_SAPID_2 = "customFieldAggregationTable.SapId = ?";

	public customFieldAggregationTablePersistenceImpl() {
		setModelClass(customFieldAggregationTable.class);
	}

	/**
	 * Caches the custom field aggregation table in the entity cache if it is enabled.
	 *
	 * @param customFieldAggregationTable the custom field aggregation table
	 */
	@Override
	public void cacheResult(
		customFieldAggregationTable customFieldAggregationTable) {
		entityCache.putResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			customFieldAggregationTable.getPrimaryKey(),
			customFieldAggregationTable);

		customFieldAggregationTable.resetOriginalValues();
	}

	/**
	 * Caches the custom field aggregation tables in the entity cache if it is enabled.
	 *
	 * @param customFieldAggregationTables the custom field aggregation tables
	 */
	@Override
	public void cacheResult(
		List<customFieldAggregationTable> customFieldAggregationTables) {
		for (customFieldAggregationTable customFieldAggregationTable : customFieldAggregationTables) {
			if (entityCache.getResult(
						customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
						customFieldAggregationTableImpl.class,
						customFieldAggregationTable.getPrimaryKey()) == null) {
				cacheResult(customFieldAggregationTable);
			}
			else {
				customFieldAggregationTable.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all custom field aggregation tables.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(customFieldAggregationTableImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the custom field aggregation table.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		customFieldAggregationTable customFieldAggregationTable) {
		entityCache.removeResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			customFieldAggregationTable.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<customFieldAggregationTable> customFieldAggregationTables) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (customFieldAggregationTable customFieldAggregationTable : customFieldAggregationTables) {
			entityCache.removeResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
				customFieldAggregationTableImpl.class,
				customFieldAggregationTable.getPrimaryKey());
		}
	}

	/**
	 * Creates a new custom field aggregation table with the primary key. Does not add the custom field aggregation table to the database.
	 *
	 * @param SapId the primary key for the new custom field aggregation table
	 * @return the new custom field aggregation table
	 */
	@Override
	public customFieldAggregationTable create(int SapId) {
		customFieldAggregationTable customFieldAggregationTable = new customFieldAggregationTableImpl();

		customFieldAggregationTable.setNew(true);
		customFieldAggregationTable.setPrimaryKey(SapId);

		return customFieldAggregationTable;
	}

	/**
	 * Removes the custom field aggregation table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SapId the primary key of the custom field aggregation table
	 * @return the custom field aggregation table that was removed
	 * @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable remove(int SapId)
		throws NoSuchcustomFieldAggregationTableException {
		return remove((Serializable)SapId);
	}

	/**
	 * Removes the custom field aggregation table with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the custom field aggregation table
	 * @return the custom field aggregation table that was removed
	 * @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable remove(Serializable primaryKey)
		throws NoSuchcustomFieldAggregationTableException {
		Session session = null;

		try {
			session = openSession();

			customFieldAggregationTable customFieldAggregationTable = (customFieldAggregationTable)session.get(customFieldAggregationTableImpl.class,
					primaryKey);

			if (customFieldAggregationTable == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchcustomFieldAggregationTableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(customFieldAggregationTable);
		}
		catch (NoSuchcustomFieldAggregationTableException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected customFieldAggregationTable removeImpl(
		customFieldAggregationTable customFieldAggregationTable) {
		customFieldAggregationTable = toUnwrappedModel(customFieldAggregationTable);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(customFieldAggregationTable)) {
				customFieldAggregationTable = (customFieldAggregationTable)session.get(customFieldAggregationTableImpl.class,
						customFieldAggregationTable.getPrimaryKeyObj());
			}

			if (customFieldAggregationTable != null) {
				session.delete(customFieldAggregationTable);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (customFieldAggregationTable != null) {
			clearCache(customFieldAggregationTable);
		}

		return customFieldAggregationTable;
	}

	@Override
	public customFieldAggregationTable updateImpl(
		customFieldAggregationTable customFieldAggregationTable) {
		customFieldAggregationTable = toUnwrappedModel(customFieldAggregationTable);

		boolean isNew = customFieldAggregationTable.isNew();

		customFieldAggregationTableModelImpl customFieldAggregationTableModelImpl =
			(customFieldAggregationTableModelImpl)customFieldAggregationTable;

		Session session = null;

		try {
			session = openSession();

			if (customFieldAggregationTable.isNew()) {
				session.save(customFieldAggregationTable);

				customFieldAggregationTable.setNew(false);
			}
			else {
				customFieldAggregationTable = (customFieldAggregationTable)session.merge(customFieldAggregationTable);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!customFieldAggregationTableModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					customFieldAggregationTableModelImpl.getSapId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FINDBYJOBID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((customFieldAggregationTableModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						customFieldAggregationTableModelImpl.getOriginalSapId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINDBYJOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID,
					args);

				args = new Object[] {
						customFieldAggregationTableModelImpl.getSapId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINDBYJOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINDBYJOBID,
					args);
			}
		}

		entityCache.putResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
			customFieldAggregationTableImpl.class,
			customFieldAggregationTable.getPrimaryKey(),
			customFieldAggregationTable, false);

		customFieldAggregationTable.resetOriginalValues();

		return customFieldAggregationTable;
	}

	protected customFieldAggregationTable toUnwrappedModel(
		customFieldAggregationTable customFieldAggregationTable) {
		if (customFieldAggregationTable instanceof customFieldAggregationTableImpl) {
			return customFieldAggregationTable;
		}

		customFieldAggregationTableImpl customFieldAggregationTableImpl = new customFieldAggregationTableImpl();

		customFieldAggregationTableImpl.setNew(customFieldAggregationTable.isNew());
		customFieldAggregationTableImpl.setPrimaryKey(customFieldAggregationTable.getPrimaryKey());

		customFieldAggregationTableImpl.setUserId(customFieldAggregationTable.getUserId());
		customFieldAggregationTableImpl.setSapId(customFieldAggregationTable.getSapId());
		customFieldAggregationTableImpl.setCgpa(customFieldAggregationTable.getCgpa());

		return customFieldAggregationTableImpl;
	}

	/**
	 * Returns the custom field aggregation table with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the custom field aggregation table
	 * @return the custom field aggregation table
	 * @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable findByPrimaryKey(Serializable primaryKey)
		throws NoSuchcustomFieldAggregationTableException {
		customFieldAggregationTable customFieldAggregationTable = fetchByPrimaryKey(primaryKey);

		if (customFieldAggregationTable == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchcustomFieldAggregationTableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return customFieldAggregationTable;
	}

	/**
	 * Returns the custom field aggregation table with the primary key or throws a {@link NoSuchcustomFieldAggregationTableException} if it could not be found.
	 *
	 * @param SapId the primary key of the custom field aggregation table
	 * @return the custom field aggregation table
	 * @throws NoSuchcustomFieldAggregationTableException if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable findByPrimaryKey(int SapId)
		throws NoSuchcustomFieldAggregationTableException {
		return findByPrimaryKey((Serializable)SapId);
	}

	/**
	 * Returns the custom field aggregation table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the custom field aggregation table
	 * @return the custom field aggregation table, or <code>null</code> if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
				customFieldAggregationTableImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		customFieldAggregationTable customFieldAggregationTable = (customFieldAggregationTable)serializable;

		if (customFieldAggregationTable == null) {
			Session session = null;

			try {
				session = openSession();

				customFieldAggregationTable = (customFieldAggregationTable)session.get(customFieldAggregationTableImpl.class,
						primaryKey);

				if (customFieldAggregationTable != null) {
					cacheResult(customFieldAggregationTable);
				}
				else {
					entityCache.putResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
						customFieldAggregationTableImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
					customFieldAggregationTableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return customFieldAggregationTable;
	}

	/**
	 * Returns the custom field aggregation table with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SapId the primary key of the custom field aggregation table
	 * @return the custom field aggregation table, or <code>null</code> if a custom field aggregation table with the primary key could not be found
	 */
	@Override
	public customFieldAggregationTable fetchByPrimaryKey(int SapId) {
		return fetchByPrimaryKey((Serializable)SapId);
	}

	@Override
	public Map<Serializable, customFieldAggregationTable> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, customFieldAggregationTable> map = new HashMap<Serializable, customFieldAggregationTable>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			customFieldAggregationTable customFieldAggregationTable = fetchByPrimaryKey(primaryKey);

			if (customFieldAggregationTable != null) {
				map.put(primaryKey, customFieldAggregationTable);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
					customFieldAggregationTableImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(customFieldAggregationTable)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((int)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (customFieldAggregationTable customFieldAggregationTable : (List<customFieldAggregationTable>)q.list()) {
				map.put(customFieldAggregationTable.getPrimaryKeyObj(),
					customFieldAggregationTable);

				cacheResult(customFieldAggregationTable);

				uncachedPrimaryKeys.remove(customFieldAggregationTable.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(customFieldAggregationTableModelImpl.ENTITY_CACHE_ENABLED,
					customFieldAggregationTableImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the custom field aggregation tables.
	 *
	 * @return the custom field aggregation tables
	 */
	@Override
	public List<customFieldAggregationTable> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<customFieldAggregationTable> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<customFieldAggregationTable> findAll(int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<customFieldAggregationTable> findAll(int start, int end,
		OrderByComparator<customFieldAggregationTable> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<customFieldAggregationTable> list = null;

		if (retrieveFromCache) {
			list = (List<customFieldAggregationTable>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE;

				if (pagination) {
					sql = sql.concat(customFieldAggregationTableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<customFieldAggregationTable>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<customFieldAggregationTable>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the custom field aggregation tables from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (customFieldAggregationTable customFieldAggregationTable : findAll()) {
			remove(customFieldAggregationTable);
		}
	}

	/**
	 * Returns the number of custom field aggregation tables.
	 *
	 * @return the number of custom field aggregation tables
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CUSTOMFIELDAGGREGATIONTABLE);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return customFieldAggregationTableModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the custom field aggregation table persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(customFieldAggregationTableImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE = "SELECT customFieldAggregationTable FROM customFieldAggregationTable customFieldAggregationTable";
	private static final String _SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE_WHERE_PKS_IN =
		"SELECT customFieldAggregationTable FROM customFieldAggregationTable customFieldAggregationTable WHERE SapId IN (";
	private static final String _SQL_SELECT_CUSTOMFIELDAGGREGATIONTABLE_WHERE = "SELECT customFieldAggregationTable FROM customFieldAggregationTable customFieldAggregationTable WHERE ";
	private static final String _SQL_COUNT_CUSTOMFIELDAGGREGATIONTABLE = "SELECT COUNT(customFieldAggregationTable) FROM customFieldAggregationTable customFieldAggregationTable";
	private static final String _SQL_COUNT_CUSTOMFIELDAGGREGATIONTABLE_WHERE = "SELECT COUNT(customFieldAggregationTable) FROM customFieldAggregationTable customFieldAggregationTable WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "customFieldAggregationTable.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No customFieldAggregationTable exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No customFieldAggregationTable exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(customFieldAggregationTablePersistenceImpl.class);
}