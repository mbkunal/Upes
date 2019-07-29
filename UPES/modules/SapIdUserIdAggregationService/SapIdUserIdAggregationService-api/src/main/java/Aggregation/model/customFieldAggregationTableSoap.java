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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link Aggregation.service.http.customFieldAggregationTableServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see Aggregation.service.http.customFieldAggregationTableServiceSoap
 * @generated
 */
@ProviderType
public class customFieldAggregationTableSoap implements Serializable {
	public static customFieldAggregationTableSoap toSoapModel(
		customFieldAggregationTable model) {
		customFieldAggregationTableSoap soapModel = new customFieldAggregationTableSoap();

		soapModel.setUserId(model.getUserId());
		soapModel.setSapId(model.getSapId());
		soapModel.setCgpa(model.getCgpa());

		return soapModel;
	}

	public static customFieldAggregationTableSoap[] toSoapModels(
		customFieldAggregationTable[] models) {
		customFieldAggregationTableSoap[] soapModels = new customFieldAggregationTableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static customFieldAggregationTableSoap[][] toSoapModels(
		customFieldAggregationTable[][] models) {
		customFieldAggregationTableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new customFieldAggregationTableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new customFieldAggregationTableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static customFieldAggregationTableSoap[] toSoapModels(
		List<customFieldAggregationTable> models) {
		List<customFieldAggregationTableSoap> soapModels = new ArrayList<customFieldAggregationTableSoap>(models.size());

		for (customFieldAggregationTable model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new customFieldAggregationTableSoap[soapModels.size()]);
	}

	public customFieldAggregationTableSoap() {
	}

	public int getPrimaryKey() {
		return _SapId;
	}

	public void setPrimaryKey(int pk) {
		setSapId(pk);
	}

	public int getUserId() {
		return _UserId;
	}

	public void setUserId(int UserId) {
		_UserId = UserId;
	}

	public int getSapId() {
		return _SapId;
	}

	public void setSapId(int SapId) {
		_SapId = SapId;
	}

	public double getCgpa() {
		return _Cgpa;
	}

	public void setCgpa(double Cgpa) {
		_Cgpa = Cgpa;
	}

	private int _UserId;
	private int _SapId;
	private double _Cgpa;
}