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

package JobListService.model.impl;

import JobListService.model.JobId;

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
 * The cache model class for representing JobId in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see JobId
 * @generated
 */
@ProviderType
public class JobIdCacheModel implements CacheModel<JobId>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JobIdCacheModel)) {
			return false;
		}

		JobIdCacheModel jobIdCacheModel = (JobIdCacheModel)obj;

		if (JobId == jobIdCacheModel.JobId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, JobId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{JobId=");
		sb.append(JobId);
		sb.append(", Company=");
		sb.append(Company);
		sb.append(", Post=");
		sb.append(Post);
		sb.append(", Pay=");
		sb.append(Pay);
		sb.append(", CGPA=");
		sb.append(CGPA);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", MoreInfo=");
		sb.append(MoreInfo);
		sb.append(", LastDateToApply=");
		sb.append(LastDateToApply);
		sb.append(", CIT=");
		sb.append(CIT);
		sb.append(", nonCIT=");
		sb.append(nonCIT);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JobId toEntityModel() {
		JobIdImpl jobIdImpl = new JobIdImpl();

		jobIdImpl.setJobId(JobId);

		if (Company == null) {
			jobIdImpl.setCompany(StringPool.BLANK);
		}
		else {
			jobIdImpl.setCompany(Company);
		}

		if (Post == null) {
			jobIdImpl.setPost(StringPool.BLANK);
		}
		else {
			jobIdImpl.setPost(Post);
		}

		jobIdImpl.setPay(Pay);
		jobIdImpl.setCGPA(CGPA);

		if (Description == null) {
			jobIdImpl.setDescription(StringPool.BLANK);
		}
		else {
			jobIdImpl.setDescription(Description);
		}

		if (MoreInfo == null) {
			jobIdImpl.setMoreInfo(StringPool.BLANK);
		}
		else {
			jobIdImpl.setMoreInfo(MoreInfo);
		}

		if (LastDateToApply == Long.MIN_VALUE) {
			jobIdImpl.setLastDateToApply(null);
		}
		else {
			jobIdImpl.setLastDateToApply(new Date(LastDateToApply));
		}

		jobIdImpl.setCIT(CIT);
		jobIdImpl.setNonCIT(nonCIT);

		jobIdImpl.resetOriginalValues();

		return jobIdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		JobId = objectInput.readLong();
		Company = objectInput.readUTF();
		Post = objectInput.readUTF();

		Pay = objectInput.readInt();

		CGPA = objectInput.readInt();
		Description = objectInput.readUTF();
		MoreInfo = objectInput.readUTF();
		LastDateToApply = objectInput.readLong();

		CIT = objectInput.readBoolean();

		nonCIT = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(JobId);

		if (Company == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Company);
		}

		if (Post == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Post);
		}

		objectOutput.writeInt(Pay);

		objectOutput.writeInt(CGPA);

		if (Description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Description);
		}

		if (MoreInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MoreInfo);
		}

		objectOutput.writeLong(LastDateToApply);

		objectOutput.writeBoolean(CIT);

		objectOutput.writeBoolean(nonCIT);
	}

	public long JobId;
	public String Company;
	public String Post;
	public int Pay;
	public int CGPA;
	public String Description;
	public String MoreInfo;
	public long LastDateToApply;
	public boolean CIT;
	public boolean nonCIT;
}