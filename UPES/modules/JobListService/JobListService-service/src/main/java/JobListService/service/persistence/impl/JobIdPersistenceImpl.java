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

package JobListService.service.persistence.impl;

import JobListService.exception.NoSuchJobIdException;

import JobListService.model.JobId;

import JobListService.model.impl.JobIdImpl;
import JobListService.model.impl.JobIdModelImpl;

import JobListService.service.persistence.JobIdPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
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
 * The persistence implementation for the job ID service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JobIdPersistence
 * @see JobListService.service.persistence.JobIdUtil
 * @generated
 */
@ProviderType
public class JobIdPersistenceImpl extends BasePersistenceImpl<JobId>
	implements JobIdPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JobIdUtil} to access the job ID persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JobIdImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdModelImpl.FINDER_CACHE_ENABLED, JobIdImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdModelImpl.FINDER_CACHE_ENABLED, JobIdImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public JobIdPersistenceImpl() {
		setModelClass(JobId.class);
	}

	/**
	 * Caches the job ID in the entity cache if it is enabled.
	 *
	 * @param jobId the job ID
	 */
	@Override
	public void cacheResult(JobId jobId) {
		entityCache.putResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdImpl.class, jobId.getPrimaryKey(), jobId);

		jobId.resetOriginalValues();
	}

	/**
	 * Caches the job IDs in the entity cache if it is enabled.
	 *
	 * @param jobIds the job IDs
	 */
	@Override
	public void cacheResult(List<JobId> jobIds) {
		for (JobId jobId : jobIds) {
			if (entityCache.getResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
						JobIdImpl.class, jobId.getPrimaryKey()) == null) {
				cacheResult(jobId);
			}
			else {
				jobId.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all job IDs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JobIdImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the job ID.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JobId jobId) {
		entityCache.removeResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdImpl.class, jobId.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JobId> jobIds) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JobId jobId : jobIds) {
			entityCache.removeResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
				JobIdImpl.class, jobId.getPrimaryKey());
		}
	}

	/**
	 * Creates a new job ID with the primary key. Does not add the job ID to the database.
	 *
	 * @param JobId the primary key for the new job ID
	 * @return the new job ID
	 */
	@Override
	public JobId create(long JobId) {
		JobId jobId = new JobIdImpl();

		jobId.setNew(true);
		jobId.setPrimaryKey(JobId);

		return jobId;
	}

	/**
	 * Removes the job ID with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param JobId the primary key of the job ID
	 * @return the job ID that was removed
	 * @throws NoSuchJobIdException if a job ID with the primary key could not be found
	 */
	@Override
	public JobId remove(long JobId) throws NoSuchJobIdException {
		return remove((Serializable)JobId);
	}

	/**
	 * Removes the job ID with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the job ID
	 * @return the job ID that was removed
	 * @throws NoSuchJobIdException if a job ID with the primary key could not be found
	 */
	@Override
	public JobId remove(Serializable primaryKey) throws NoSuchJobIdException {
		Session session = null;

		try {
			session = openSession();

			JobId jobId = (JobId)session.get(JobIdImpl.class, primaryKey);

			if (jobId == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJobIdException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jobId);
		}
		catch (NoSuchJobIdException nsee) {
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
	protected JobId removeImpl(JobId jobId) {
		jobId = toUnwrappedModel(jobId);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jobId)) {
				jobId = (JobId)session.get(JobIdImpl.class,
						jobId.getPrimaryKeyObj());
			}

			if (jobId != null) {
				session.delete(jobId);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jobId != null) {
			clearCache(jobId);
		}

		return jobId;
	}

	@Override
	public JobId updateImpl(JobId jobId) {
		jobId = toUnwrappedModel(jobId);

		boolean isNew = jobId.isNew();

		Session session = null;

		try {
			session = openSession();

			if (jobId.isNew()) {
				session.save(jobId);

				jobId.setNew(false);
			}
			else {
				jobId = (JobId)session.merge(jobId);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
			JobIdImpl.class, jobId.getPrimaryKey(), jobId, false);

		jobId.resetOriginalValues();

		return jobId;
	}

	protected JobId toUnwrappedModel(JobId jobId) {
		if (jobId instanceof JobIdImpl) {
			return jobId;
		}

		JobIdImpl jobIdImpl = new JobIdImpl();

		jobIdImpl.setNew(jobId.isNew());
		jobIdImpl.setPrimaryKey(jobId.getPrimaryKey());

		jobIdImpl.setJobId(jobId.getJobId());
		jobIdImpl.setCompany(jobId.getCompany());
		jobIdImpl.setPost(jobId.getPost());
		jobIdImpl.setPay(jobId.getPay());
		jobIdImpl.setCGPA(jobId.getCGPA());
		jobIdImpl.setDescription(jobId.getDescription());
		jobIdImpl.setMoreInfo(jobId.getMoreInfo());
		jobIdImpl.setLastDateToApply(jobId.getLastDateToApply());
		jobIdImpl.setCIT(jobId.isCIT());
		jobIdImpl.setNonCIT(jobId.isNonCIT());

		return jobIdImpl;
	}

	/**
	 * Returns the job ID with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the job ID
	 * @return the job ID
	 * @throws NoSuchJobIdException if a job ID with the primary key could not be found
	 */
	@Override
	public JobId findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJobIdException {
		JobId jobId = fetchByPrimaryKey(primaryKey);

		if (jobId == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJobIdException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jobId;
	}

	/**
	 * Returns the job ID with the primary key or throws a {@link NoSuchJobIdException} if it could not be found.
	 *
	 * @param JobId the primary key of the job ID
	 * @return the job ID
	 * @throws NoSuchJobIdException if a job ID with the primary key could not be found
	 */
	@Override
	public JobId findByPrimaryKey(long JobId) throws NoSuchJobIdException {
		return findByPrimaryKey((Serializable)JobId);
	}

	/**
	 * Returns the job ID with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the job ID
	 * @return the job ID, or <code>null</code> if a job ID with the primary key could not be found
	 */
	@Override
	public JobId fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
				JobIdImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		JobId jobId = (JobId)serializable;

		if (jobId == null) {
			Session session = null;

			try {
				session = openSession();

				jobId = (JobId)session.get(JobIdImpl.class, primaryKey);

				if (jobId != null) {
					cacheResult(jobId);
				}
				else {
					entityCache.putResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
						JobIdImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
					JobIdImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jobId;
	}

	/**
	 * Returns the job ID with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param JobId the primary key of the job ID
	 * @return the job ID, or <code>null</code> if a job ID with the primary key could not be found
	 */
	@Override
	public JobId fetchByPrimaryKey(long JobId) {
		return fetchByPrimaryKey((Serializable)JobId);
	}

	@Override
	public Map<Serializable, JobId> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, JobId> map = new HashMap<Serializable, JobId>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			JobId jobId = fetchByPrimaryKey(primaryKey);

			if (jobId != null) {
				map.put(primaryKey, jobId);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
					JobIdImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (JobId)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_JOBID_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (JobId jobId : (List<JobId>)q.list()) {
				map.put(jobId.getPrimaryKeyObj(), jobId);

				cacheResult(jobId);

				uncachedPrimaryKeys.remove(jobId.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(JobIdModelImpl.ENTITY_CACHE_ENABLED,
					JobIdImpl.class, primaryKey, nullModel);
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
	 * Returns all the job IDs.
	 *
	 * @return the job IDs
	 */
	@Override
	public List<JobId> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<JobId> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<JobId> findAll(int start, int end,
		OrderByComparator<JobId> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<JobId> findAll(int start, int end,
		OrderByComparator<JobId> orderByComparator, boolean retrieveFromCache) {
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

		List<JobId> list = null;

		if (retrieveFromCache) {
			list = (List<JobId>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JOBID);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JOBID;

				if (pagination) {
					sql = sql.concat(JobIdModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JobId>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<JobId>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the job IDs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JobId jobId : findAll()) {
			remove(jobId);
		}
	}

	/**
	 * Returns the number of job IDs.
	 *
	 * @return the number of job IDs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JOBID);

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
		return JobIdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the job ID persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(JobIdImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JOBID = "SELECT jobId FROM JobId jobId";
	private static final String _SQL_SELECT_JOBID_WHERE_PKS_IN = "SELECT jobId FROM JobId jobId WHERE JobId IN (";
	private static final String _SQL_COUNT_JOBID = "SELECT COUNT(jobId) FROM JobId jobId";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jobId.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JobId exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(JobIdPersistenceImpl.class);
}