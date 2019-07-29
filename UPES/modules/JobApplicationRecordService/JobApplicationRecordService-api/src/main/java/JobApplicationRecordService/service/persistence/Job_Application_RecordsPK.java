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

package JobApplicationRecordService.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class Job_Application_RecordsPK implements Comparable<Job_Application_RecordsPK>,
	Serializable {
	public long SapId;
	public long JobId;

	public Job_Application_RecordsPK() {
	}

	public Job_Application_RecordsPK(long SapId, long JobId) {
		this.SapId = SapId;
		this.JobId = JobId;
	}

	public long getSapId() {
		return SapId;
	}

	public void setSapId(long SapId) {
		this.SapId = SapId;
	}

	public long getJobId() {
		return JobId;
	}

	public void setJobId(long JobId) {
		this.JobId = JobId;
	}

	@Override
	public int compareTo(Job_Application_RecordsPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (SapId < pk.SapId) {
			value = -1;
		}
		else if (SapId > pk.SapId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (JobId < pk.JobId) {
			value = -1;
		}
		else if (JobId > pk.JobId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Job_Application_RecordsPK)) {
			return false;
		}

		Job_Application_RecordsPK pk = (Job_Application_RecordsPK)obj;

		if ((SapId == pk.SapId) && (JobId == pk.JobId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, SapId);
		hashCode = HashUtil.hash(hashCode, JobId);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("SapId");
		sb.append(StringPool.EQUAL);
		sb.append(SapId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("JobId");
		sb.append(StringPool.EQUAL);
		sb.append(JobId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}