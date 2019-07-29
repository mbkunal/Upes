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

package Aggregation.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link customFieldAggregationTable}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTable
 * @generated
 */
@ProviderType
public class customFieldAggregationTableWrapper
	implements customFieldAggregationTable,
		ModelWrapper<customFieldAggregationTable> {
	public customFieldAggregationTableWrapper(
		customFieldAggregationTable customFieldAggregationTable) {
		_customFieldAggregationTable = customFieldAggregationTable;
	}

	@Override
	public Class<?> getModelClass() {
		return customFieldAggregationTable.class;
	}

	@Override
	public String getModelClassName() {
		return customFieldAggregationTable.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("UserId", getUserId());
		attributes.put("SapId", getSapId());
		attributes.put("Cgpa", getCgpa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer UserId = (Integer)attributes.get("UserId");

		if (UserId != null) {
			setUserId(UserId);
		}

		Integer SapId = (Integer)attributes.get("SapId");

		if (SapId != null) {
			setSapId(SapId);
		}

		Double Cgpa = (Double)attributes.get("Cgpa");

		if (Cgpa != null) {
			setCgpa(Cgpa);
		}
	}

	@Override
	public Aggregation.model.customFieldAggregationTable toEscapedModel() {
		return new customFieldAggregationTableWrapper(_customFieldAggregationTable.toEscapedModel());
	}

	@Override
	public Aggregation.model.customFieldAggregationTable toUnescapedModel() {
		return new customFieldAggregationTableWrapper(_customFieldAggregationTable.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _customFieldAggregationTable.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _customFieldAggregationTable.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _customFieldAggregationTable.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _customFieldAggregationTable.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Aggregation.model.customFieldAggregationTable> toCacheModel() {
		return _customFieldAggregationTable.toCacheModel();
	}

	/**
	* Returns the cgpa of this custom field aggregation table.
	*
	* @return the cgpa of this custom field aggregation table
	*/
	@Override
	public double getCgpa() {
		return _customFieldAggregationTable.getCgpa();
	}

	@Override
	public int compareTo(
		Aggregation.model.customFieldAggregationTable customFieldAggregationTable) {
		return _customFieldAggregationTable.compareTo(customFieldAggregationTable);
	}

	/**
	* Returns the primary key of this custom field aggregation table.
	*
	* @return the primary key of this custom field aggregation table
	*/
	@Override
	public int getPrimaryKey() {
		return _customFieldAggregationTable.getPrimaryKey();
	}

	/**
	* Returns the sap ID of this custom field aggregation table.
	*
	* @return the sap ID of this custom field aggregation table
	*/
	@Override
	public int getSapId() {
		return _customFieldAggregationTable.getSapId();
	}

	/**
	* Returns the user ID of this custom field aggregation table.
	*
	* @return the user ID of this custom field aggregation table
	*/
	@Override
	public int getUserId() {
		return _customFieldAggregationTable.getUserId();
	}

	@Override
	public int hashCode() {
		return _customFieldAggregationTable.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customFieldAggregationTable.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new customFieldAggregationTableWrapper((customFieldAggregationTable)_customFieldAggregationTable.clone());
	}

	@Override
	public java.lang.String toString() {
		return _customFieldAggregationTable.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customFieldAggregationTable.toXmlString();
	}

	@Override
	public void persist() {
		_customFieldAggregationTable.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customFieldAggregationTable.setCachedModel(cachedModel);
	}

	/**
	* Sets the cgpa of this custom field aggregation table.
	*
	* @param Cgpa the cgpa of this custom field aggregation table
	*/
	@Override
	public void setCgpa(double Cgpa) {
		_customFieldAggregationTable.setCgpa(Cgpa);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_customFieldAggregationTable.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_customFieldAggregationTable.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_customFieldAggregationTable.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_customFieldAggregationTable.setNew(n);
	}

	/**
	* Sets the primary key of this custom field aggregation table.
	*
	* @param primaryKey the primary key of this custom field aggregation table
	*/
	@Override
	public void setPrimaryKey(int primaryKey) {
		_customFieldAggregationTable.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_customFieldAggregationTable.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sap ID of this custom field aggregation table.
	*
	* @param SapId the sap ID of this custom field aggregation table
	*/
	@Override
	public void setSapId(int SapId) {
		_customFieldAggregationTable.setSapId(SapId);
	}

	/**
	* Sets the user ID of this custom field aggregation table.
	*
	* @param UserId the user ID of this custom field aggregation table
	*/
	@Override
	public void setUserId(int UserId) {
		_customFieldAggregationTable.setUserId(UserId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customFieldAggregationTableWrapper)) {
			return false;
		}

		customFieldAggregationTableWrapper customFieldAggregationTableWrapper = (customFieldAggregationTableWrapper)obj;

		if (Objects.equals(_customFieldAggregationTable,
					customFieldAggregationTableWrapper._customFieldAggregationTable)) {
			return true;
		}

		return false;
	}

	@Override
	public customFieldAggregationTable getWrappedModel() {
		return _customFieldAggregationTable;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _customFieldAggregationTable.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _customFieldAggregationTable.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_customFieldAggregationTable.resetOriginalValues();
	}

	private final customFieldAggregationTable _customFieldAggregationTable;
}