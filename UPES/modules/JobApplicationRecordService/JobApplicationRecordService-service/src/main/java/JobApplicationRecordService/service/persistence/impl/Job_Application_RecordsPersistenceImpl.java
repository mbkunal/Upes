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

package JobApplicationRecordService.service.persistence.impl;

import JobApplicationRecordService.exception.NoSuchJob_Application_RecordsException;

import JobApplicationRecordService.model.Job_Application_Records;

import JobApplicationRecordService.model.impl.Job_Application_RecordsImpl;
import JobApplicationRecordService.model.impl.Job_Application_RecordsModelImpl;

import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;
import JobApplicationRecordService.service.persistence.Job_Application_RecordsPersistence;

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
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the job_ application_ records service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_RecordsPersistence
 * @see JobApplicationRecordService.service.persistence.Job_Application_RecordsUtil
 * @generated
 */
@ProviderType
public class Job_Application_RecordsPersistenceImpl extends BasePersistenceImpl<Job_Application_Records>
	implements Job_Application_RecordsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link Job_Application_RecordsUtil} to access the job_ application_ records persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = Job_Application_RecordsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FETCHBYJOBID =
		new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfetchByJobId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID =
		new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfetchByJobId",
			new String[] { Long.class.getName() },
			Job_Application_RecordsModelImpl.SAPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FETCHBYJOBID = new FinderPath(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfetchByJobId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the job_ application_ recordses where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @return the matching job_ application_ recordses
	 */
	@Override
	public List<Job_Application_Records> findByfetchByJobId(long SapId) {
		return findByfetchByJobId(SapId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
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
	@Override
	public List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end) {
		return findByfetchByJobId(SapId, start, end, null);
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
	@Override
	public List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return findByfetchByJobId(SapId, start, end, orderByComparator, true);
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
	@Override
	public List<Job_Application_Records> findByfetchByJobId(long SapId,
		int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID;
			finderArgs = new Object[] { SapId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FETCHBYJOBID;
			finderArgs = new Object[] { SapId, start, end, orderByComparator };
		}

		List<Job_Application_Records> list = null;

		if (retrieveFromCache) {
			list = (List<Job_Application_Records>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Job_Application_Records job_Application_Records : list) {
					if ((SapId != job_Application_Records.getSapId())) {
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

			query.append(_SQL_SELECT_JOB_APPLICATION_RECORDS_WHERE);

			query.append(_FINDER_COLUMN_FETCHBYJOBID_SAPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(Job_Application_RecordsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(SapId);

				if (!pagination) {
					list = (List<Job_Application_Records>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Job_Application_Records>)QueryUtil.list(q,
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
	 * Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching job_ application_ records
	 * @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	 */
	@Override
	public Job_Application_Records findByfetchByJobId_First(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException {
		Job_Application_Records job_Application_Records = fetchByfetchByJobId_First(SapId,
				orderByComparator);

		if (job_Application_Records != null) {
			return job_Application_Records;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SapId=");
		msg.append(SapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJob_Application_RecordsException(msg.toString());
	}

	/**
	 * Returns the first job_ application_ records in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	 */
	@Override
	public Job_Application_Records fetchByfetchByJobId_First(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		List<Job_Application_Records> list = findByfetchByJobId(SapId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching job_ application_ records
	 * @throws NoSuchJob_Application_RecordsException if a matching job_ application_ records could not be found
	 */
	@Override
	public Job_Application_Records findByfetchByJobId_Last(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException {
		Job_Application_Records job_Application_Records = fetchByfetchByJobId_Last(SapId,
				orderByComparator);

		if (job_Application_Records != null) {
			return job_Application_Records;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SapId=");
		msg.append(SapId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJob_Application_RecordsException(msg.toString());
	}

	/**
	 * Returns the last job_ application_ records in the ordered set where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching job_ application_ records, or <code>null</code> if a matching job_ application_ records could not be found
	 */
	@Override
	public Job_Application_Records fetchByfetchByJobId_Last(long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		int count = countByfetchByJobId(SapId);

		if (count == 0) {
			return null;
		}

		List<Job_Application_Records> list = findByfetchByJobId(SapId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Job_Application_Records[] findByfetchByJobId_PrevAndNext(
		Job_Application_RecordsPK job_Application_RecordsPK, long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator)
		throws NoSuchJob_Application_RecordsException {
		Job_Application_Records job_Application_Records = findByPrimaryKey(job_Application_RecordsPK);

		Session session = null;

		try {
			session = openSession();

			Job_Application_Records[] array = new Job_Application_RecordsImpl[3];

			array[0] = getByfetchByJobId_PrevAndNext(session,
					job_Application_Records, SapId, orderByComparator, true);

			array[1] = job_Application_Records;

			array[2] = getByfetchByJobId_PrevAndNext(session,
					job_Application_Records, SapId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Job_Application_Records getByfetchByJobId_PrevAndNext(
		Session session, Job_Application_Records job_Application_Records,
		long SapId,
		OrderByComparator<Job_Application_Records> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JOB_APPLICATION_RECORDS_WHERE);

		query.append(_FINDER_COLUMN_FETCHBYJOBID_SAPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(Job_Application_RecordsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(SapId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(job_Application_Records);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Job_Application_Records> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the job_ application_ recordses where SapId = &#63; from the database.
	 *
	 * @param SapId the sap ID
	 */
	@Override
	public void removeByfetchByJobId(long SapId) {
		for (Job_Application_Records job_Application_Records : findByfetchByJobId(
				SapId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(job_Application_Records);
		}
	}

	/**
	 * Returns the number of job_ application_ recordses where SapId = &#63;.
	 *
	 * @param SapId the sap ID
	 * @return the number of matching job_ application_ recordses
	 */
	@Override
	public int countByfetchByJobId(long SapId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FETCHBYJOBID;

		Object[] finderArgs = new Object[] { SapId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JOB_APPLICATION_RECORDS_WHERE);

			query.append(_FINDER_COLUMN_FETCHBYJOBID_SAPID_2);

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

	private static final String _FINDER_COLUMN_FETCHBYJOBID_SAPID_2 = "job_Application_Records.id.SapId = ?";

	public Job_Application_RecordsPersistenceImpl() {
		setModelClass(Job_Application_Records.class);
	}

	/**
	 * Caches the job_ application_ records in the entity cache if it is enabled.
	 *
	 * @param job_Application_Records the job_ application_ records
	 */
	@Override
	public void cacheResult(Job_Application_Records job_Application_Records) {
		entityCache.putResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			job_Application_Records.getPrimaryKey(), job_Application_Records);

		job_Application_Records.resetOriginalValues();
	}

	/**
	 * Caches the job_ application_ recordses in the entity cache if it is enabled.
	 *
	 * @param job_Application_Recordses the job_ application_ recordses
	 */
	@Override
	public void cacheResult(
		List<Job_Application_Records> job_Application_Recordses) {
		for (Job_Application_Records job_Application_Records : job_Application_Recordses) {
			if (entityCache.getResult(
						Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
						Job_Application_RecordsImpl.class,
						job_Application_Records.getPrimaryKey()) == null) {
				cacheResult(job_Application_Records);
			}
			else {
				job_Application_Records.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all job_ application_ recordses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(Job_Application_RecordsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job_ application_ records.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Job_Application_Records job_Application_Records) {
		entityCache.removeResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			job_Application_Records.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<Job_Application_Records> job_Application_Recordses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Job_Application_Records job_Application_Records : job_Application_Recordses) {
			entityCache.removeResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
				Job_Application_RecordsImpl.class,
				job_Application_Records.getPrimaryKey());
		}
	}

	/**
	 * Creates a new job_ application_ records with the primary key. Does not add the job_ application_ records to the database.
	 *
	 * @param job_Application_RecordsPK the primary key for the new job_ application_ records
	 * @return the new job_ application_ records
	 */
	@Override
	public Job_Application_Records create(
		Job_Application_RecordsPK job_Application_RecordsPK) {
		Job_Application_Records job_Application_Records = new Job_Application_RecordsImpl();

		job_Application_Records.setNew(true);
		job_Application_Records.setPrimaryKey(job_Application_RecordsPK);

		return job_Application_Records;
	}

	/**
	 * Removes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param job_Application_RecordsPK the primary key of the job_ application_ records
	 * @return the job_ application_ records that was removed
	 * @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records remove(
		Job_Application_RecordsPK job_Application_RecordsPK)
		throws NoSuchJob_Application_RecordsException {
		return remove((Serializable)job_Application_RecordsPK);
	}

	/**
	 * Removes the job_ application_ records with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job_ application_ records
	 * @return the job_ application_ records that was removed
	 * @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records remove(Serializable primaryKey)
		throws NoSuchJob_Application_RecordsException {
		Session session = null;

		try {
			session = openSession();

			Job_Application_Records job_Application_Records = (Job_Application_Records)session.get(Job_Application_RecordsImpl.class,
					primaryKey);

			if (job_Application_Records == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJob_Application_RecordsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(job_Application_Records);
		}
		catch (NoSuchJob_Application_RecordsException nsee) {
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
	protected Job_Application_Records removeImpl(
		Job_Application_Records job_Application_Records) {
		job_Application_Records = toUnwrappedModel(job_Application_Records);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(job_Application_Records)) {
				job_Application_Records = (Job_Application_Records)session.get(Job_Application_RecordsImpl.class,
						job_Application_Records.getPrimaryKeyObj());
			}

			if (job_Application_Records != null) {
				session.delete(job_Application_Records);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (job_Application_Records != null) {
			clearCache(job_Application_Records);
		}

		return job_Application_Records;
	}

	@Override
	public Job_Application_Records updateImpl(
		Job_Application_Records job_Application_Records) {
		job_Application_Records = toUnwrappedModel(job_Application_Records);

		boolean isNew = job_Application_Records.isNew();

		Job_Application_RecordsModelImpl job_Application_RecordsModelImpl = (Job_Application_RecordsModelImpl)job_Application_Records;

		Session session = null;

		try {
			session = openSession();

			if (job_Application_Records.isNew()) {
				session.save(job_Application_Records);

				job_Application_Records.setNew(false);
			}
			else {
				job_Application_Records = (Job_Application_Records)session.merge(job_Application_Records);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!Job_Application_RecordsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					job_Application_RecordsModelImpl.getSapId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FETCHBYJOBID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((job_Application_RecordsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						job_Application_RecordsModelImpl.getOriginalSapId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FETCHBYJOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID,
					args);

				args = new Object[] { job_Application_RecordsModelImpl.getSapId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FETCHBYJOBID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FETCHBYJOBID,
					args);
			}
		}

		entityCache.putResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
			Job_Application_RecordsImpl.class,
			job_Application_Records.getPrimaryKey(), job_Application_Records,
			false);

		job_Application_Records.resetOriginalValues();

		return job_Application_Records;
	}

	protected Job_Application_Records toUnwrappedModel(
		Job_Application_Records job_Application_Records) {
		if (job_Application_Records instanceof Job_Application_RecordsImpl) {
			return job_Application_Records;
		}

		Job_Application_RecordsImpl job_Application_RecordsImpl = new Job_Application_RecordsImpl();

		job_Application_RecordsImpl.setNew(job_Application_Records.isNew());
		job_Application_RecordsImpl.setPrimaryKey(job_Application_Records.getPrimaryKey());

		job_Application_RecordsImpl.setSapId(job_Application_Records.getSapId());
		job_Application_RecordsImpl.setJobId(job_Application_Records.getJobId());
		job_Application_RecordsImpl.setApplicationDate(job_Application_Records.getApplicationDate());
		job_Application_RecordsImpl.setResume(job_Application_Records.getResume());

		return job_Application_RecordsImpl;
	}

	/**
	 * Returns the job_ application_ records with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the job_ application_ records
	 * @return the job_ application_ records
	 * @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJob_Application_RecordsException {
		Job_Application_Records job_Application_Records = fetchByPrimaryKey(primaryKey);

		if (job_Application_Records == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJob_Application_RecordsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return job_Application_Records;
	}

	/**
	 * Returns the job_ application_ records with the primary key or throws a {@link NoSuchJob_Application_RecordsException} if it could not be found.
	 *
	 * @param job_Application_RecordsPK the primary key of the job_ application_ records
	 * @return the job_ application_ records
	 * @throws NoSuchJob_Application_RecordsException if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records findByPrimaryKey(
		Job_Application_RecordsPK job_Application_RecordsPK)
		throws NoSuchJob_Application_RecordsException {
		return findByPrimaryKey((Serializable)job_Application_RecordsPK);
	}

	/**
	 * Returns the job_ application_ records with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job_ application_ records
	 * @return the job_ application_ records, or <code>null</code> if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
				Job_Application_RecordsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Job_Application_Records job_Application_Records = (Job_Application_Records)serializable;

		if (job_Application_Records == null) {
			Session session = null;

			try {
				session = openSession();

				job_Application_Records = (Job_Application_Records)session.get(Job_Application_RecordsImpl.class,
						primaryKey);

				if (job_Application_Records != null) {
					cacheResult(job_Application_Records);
				}
				else {
					entityCache.putResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
						Job_Application_RecordsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(Job_Application_RecordsModelImpl.ENTITY_CACHE_ENABLED,
					Job_Application_RecordsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return job_Application_Records;
	}

	/**
	 * Returns the job_ application_ records with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param job_Application_RecordsPK the primary key of the job_ application_ records
	 * @return the job_ application_ records, or <code>null</code> if a job_ application_ records with the primary key could not be found
	 */
	@Override
	public Job_Application_Records fetchByPrimaryKey(
		Job_Application_RecordsPK job_Application_RecordsPK) {
		return fetchByPrimaryKey((Serializable)job_Application_RecordsPK);
	}

	@Override
	public Map<Serializable, Job_Application_Records> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Job_Application_Records> map = new HashMap<Serializable, Job_Application_Records>();

		for (Serializable primaryKey : primaryKeys) {
			Job_Application_Records job_Application_Records = fetchByPrimaryKey(primaryKey);

			if (job_Application_Records != null) {
				map.put(primaryKey, job_Application_Records);
			}
		}

		return map;
	}

	/**
	 * Returns all the job_ application_ recordses.
	 *
	 * @return the job_ application_ recordses
	 */
	@Override
	public List<Job_Application_Records> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Job_Application_Records> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Job_Application_Records> findAll(int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Job_Application_Records> findAll(int start, int end,
		OrderByComparator<Job_Application_Records> orderByComparator,
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

		List<Job_Application_Records> list = null;

		if (retrieveFromCache) {
			list = (List<Job_Application_Records>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JOB_APPLICATION_RECORDS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOB_APPLICATION_RECORDS;

				if (pagination) {
					sql = sql.concat(Job_Application_RecordsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Job_Application_Records>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Job_Application_Records>)QueryUtil.list(q,
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
	 * Removes all the job_ application_ recordses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Job_Application_Records job_Application_Records : findAll()) {
			remove(job_Application_Records);
		}
	}

	/**
	 * Returns the number of job_ application_ recordses.
	 *
	 * @return the number of job_ application_ recordses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JOB_APPLICATION_RECORDS);

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
		return Job_Application_RecordsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the job_ application_ records persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(Job_Application_RecordsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JOB_APPLICATION_RECORDS = "SELECT job_Application_Records FROM Job_Application_Records job_Application_Records";
	private static final String _SQL_SELECT_JOB_APPLICATION_RECORDS_WHERE = "SELECT job_Application_Records FROM Job_Application_Records job_Application_Records WHERE ";
	private static final String _SQL_COUNT_JOB_APPLICATION_RECORDS = "SELECT COUNT(job_Application_Records) FROM Job_Application_Records job_Application_Records";
	private static final String _SQL_COUNT_JOB_APPLICATION_RECORDS_WHERE = "SELECT COUNT(job_Application_Records) FROM Job_Application_Records job_Application_Records WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "job_Application_Records.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Job_Application_Records exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Job_Application_Records exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(Job_Application_RecordsPersistenceImpl.class);
}