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

package Aggregation.model.impl;

import Aggregation.model.customFieldAggregationTable;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing customFieldAggregationTable in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTable
 * @generated
 */
@ProviderType
public class customFieldAggregationTableCacheModel implements CacheModel<customFieldAggregationTable>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof customFieldAggregationTableCacheModel)) {
			return false;
		}

		customFieldAggregationTableCacheModel customFieldAggregationTableCacheModel =
			(customFieldAggregationTableCacheModel)obj;

		if (SapId == customFieldAggregationTableCacheModel.SapId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SapId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{UserId=");
		sb.append(UserId);
		sb.append(", SapId=");
		sb.append(SapId);
		sb.append(", Cgpa=");
		sb.append(Cgpa);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public customFieldAggregationTable toEntityModel() {
		customFieldAggregationTableImpl customFieldAggregationTableImpl = new customFieldAggregationTableImpl();

		customFieldAggregationTableImpl.setUserId(UserId);
		customFieldAggregationTableImpl.setSapId(SapId);
		customFieldAggregationTableImpl.setCgpa(Cgpa);

		customFieldAggregationTableImpl.resetOriginalValues();

		return customFieldAggregationTableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		UserId = objectInput.readInt();

		SapId = objectInput.readInt();

		Cgpa = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeInt(UserId);

		objectOutput.writeInt(SapId);

		objectOutput.writeDouble(Cgpa);
	}

	public int UserId;
	public int SapId;
	public double Cgpa;
}