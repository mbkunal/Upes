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

package JobApplicationRecordService.model.impl;

import JobApplicationRecordService.model.Job_Application_Records;

import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Job_Application_Records in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Job_Application_Records
 * @generated
 */
@ProviderType
public class Job_Application_RecordsCacheModel implements CacheModel<Job_Application_Records>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Job_Application_RecordsCacheModel)) {
			return false;
		}

		Job_Application_RecordsCacheModel job_Application_RecordsCacheModel = (Job_Application_RecordsCacheModel)obj;

		if (job_Application_RecordsPK.equals(
					job_Application_RecordsCacheModel.job_Application_RecordsPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, job_Application_RecordsPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{SapId=");
		sb.append(SapId);
		sb.append(", JobId=");
		sb.append(JobId);
		sb.append(", ApplicationDate=");
		sb.append(ApplicationDate);
		sb.append(", resume=");
		sb.append(resume);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Job_Application_Records toEntityModel() {
		Job_Application_RecordsImpl job_Application_RecordsImpl = new Job_Application_RecordsImpl();

		job_Application_RecordsImpl.setSapId(SapId);
		job_Application_RecordsImpl.setJobId(JobId);

		if (ApplicationDate == Long.MIN_VALUE) {
			job_Application_RecordsImpl.setApplicationDate(null);
		}
		else {
			job_Application_RecordsImpl.setApplicationDate(new Date(
					ApplicationDate));
		}

		if (resume == null) {
			job_Application_RecordsImpl.setResume(StringPool.BLANK);
		}
		else {
			job_Application_RecordsImpl.setResume(resume);
		}

		job_Application_RecordsImpl.resetOriginalValues();

		return job_Application_RecordsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SapId = objectInput.readLong();

		JobId = objectInput.readLong();
		ApplicationDate = objectInput.readLong();
		resume = objectInput.readUTF();

		job_Application_RecordsPK = new Job_Application_RecordsPK(SapId, JobId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SapId);

		objectOutput.writeLong(JobId);
		objectOutput.writeLong(ApplicationDate);

		if (resume == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(resume);
		}
	}

	public long SapId;
	public long JobId;
	public long ApplicationDate;
	public String resume;
	public transient Job_Application_RecordsPK job_Application_RecordsPK;
}