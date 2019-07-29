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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the customFieldAggregationTable service. Represents a row in the &quot;kmb_customFieldAggregationTable&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see customFieldAggregationTableModel
 * @see Aggregation.model.impl.customFieldAggregationTableImpl
 * @see Aggregation.model.impl.customFieldAggregationTableModelImpl
 * @generated
 */
@ImplementationClassName("Aggregation.model.impl.customFieldAggregationTableImpl")
@ProviderType
public interface customFieldAggregationTable
	extends customFieldAggregationTableModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link Aggregation.model.impl.customFieldAggregationTableImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<customFieldAggregationTable, Integer> SAP_ID_ACCESSOR =
		new Accessor<customFieldAggregationTable, Integer>() {
			@Override
			public Integer get(
				customFieldAggregationTable customFieldAggregationTable) {
				return customFieldAggregationTable.getSapId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<customFieldAggregationTable> getTypeClass() {
				return customFieldAggregationTable.class;
			}
		};
}