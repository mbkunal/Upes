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

package JobListService.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link JobListService.service.http.JobIdServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see JobListService.service.http.JobIdServiceSoap
 * @generated
 */
@ProviderType
public class JobIdSoap implements Serializable {
	public static JobIdSoap toSoapModel(JobId model) {
		JobIdSoap soapModel = new JobIdSoap();

		soapModel.setJobId(model.getJobId());
		soapModel.setCompany(model.getCompany());
		soapModel.setPost(model.getPost());
		soapModel.setPay(model.getPay());
		soapModel.setCGPA(model.getCGPA());
		soapModel.setDescription(model.getDescription());
		soapModel.setMoreInfo(model.getMoreInfo());
		soapModel.setLastDateToApply(model.getLastDateToApply());
		soapModel.setCIT(model.getCIT());
		soapModel.setNonCIT(model.getNonCIT());

		return soapModel;
	}

	public static JobIdSoap[] toSoapModels(JobId[] models) {
		JobIdSoap[] soapModels = new JobIdSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobIdSoap[][] toSoapModels(JobId[][] models) {
		JobIdSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobIdSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobIdSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobIdSoap[] toSoapModels(List<JobId> models) {
		List<JobIdSoap> soapModels = new ArrayList<JobIdSoap>(models.size());

		for (JobId model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobIdSoap[soapModels.size()]);
	}

	public JobIdSoap() {
	}

	public long getPrimaryKey() {
		return _JobId;
	}

	public void setPrimaryKey(long pk) {
		setJobId(pk);
	}

	public long getJobId() {
		return _JobId;
	}

	public void setJobId(long JobId) {
		_JobId = JobId;
	}

	public String getCompany() {
		return _Company;
	}

	public void setCompany(String Company) {
		_Company = Company;
	}

	public String getPost() {
		return _Post;
	}

	public void setPost(String Post) {
		_Post = Post;
	}

	public int getPay() {
		return _Pay;
	}

	public void setPay(int Pay) {
		_Pay = Pay;
	}

	public int getCGPA() {
		return _CGPA;
	}

	public void setCGPA(int CGPA) {
		_CGPA = CGPA;
	}

	public String getDescription() {
		return _Description;
	}

	public void setDescription(String Description) {
		_Description = Description;
	}

	public String getMoreInfo() {
		return _MoreInfo;
	}

	public void setMoreInfo(String MoreInfo) {
		_MoreInfo = MoreInfo;
	}

	public Date getLastDateToApply() {
		return _LastDateToApply;
	}

	public void setLastDateToApply(Date LastDateToApply) {
		_LastDateToApply = LastDateToApply;
	}

	public boolean getCIT() {
		return _CIT;
	}

	public boolean isCIT() {
		return _CIT;
	}

	public void setCIT(boolean CIT) {
		_CIT = CIT;
	}

	public boolean getNonCIT() {
		return _nonCIT;
	}

	public boolean isNonCIT() {
		return _nonCIT;
	}

	public void setNonCIT(boolean nonCIT) {
		_nonCIT = nonCIT;
	}

	private long _JobId;
	private String _Company;
	private String _Post;
	private int _Pay;
	private int _CGPA;
	private String _Description;
	private String _MoreInfo;
	private Date _LastDateToApply;
	private boolean _CIT;
	private boolean _nonCIT;
}