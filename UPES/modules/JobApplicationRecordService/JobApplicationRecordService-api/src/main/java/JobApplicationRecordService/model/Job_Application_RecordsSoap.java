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

package JobApplicationRecordService.model;

import JobApplicationRecordService.service.persistence.Job_Application_RecordsPK;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link JobApplicationRecordService.service.http.Job_Application_RecordsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see JobApplicationRecordService.service.http.Job_Application_RecordsServiceSoap
 * @generated
 */
@ProviderType
public class Job_Application_RecordsSoap implements Serializable {
	public static Job_Application_RecordsSoap toSoapModel(
		Job_Application_Records model) {
		Job_Application_RecordsSoap soapModel = new Job_Application_RecordsSoap();

		soapModel.setSapId(model.getSapId());
		soapModel.setJobId(model.getJobId());
		soapModel.setApplicationDate(model.getApplicationDate());
		soapModel.setResume(model.getResume());

		return soapModel;
	}

	public static Job_Application_RecordsSoap[] toSoapModels(
		Job_Application_Records[] models) {
		Job_Application_RecordsSoap[] soapModels = new Job_Application_RecordsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static Job_Application_RecordsSoap[][] toSoapModels(
		Job_Application_Records[][] models) {
		Job_Application_RecordsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new Job_Application_RecordsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new Job_Application_RecordsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static Job_Application_RecordsSoap[] toSoapModels(
		List<Job_Application_Records> models) {
		List<Job_Application_RecordsSoap> soapModels = new ArrayList<Job_Application_RecordsSoap>(models.size());

		for (Job_Application_Records model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new Job_Application_RecordsSoap[soapModels.size()]);
	}

	public Job_Application_RecordsSoap() {
	}

	public Job_Application_RecordsPK getPrimaryKey() {
		return new Job_Application_RecordsPK(_SapId, _JobId);
	}

	public void setPrimaryKey(Job_Application_RecordsPK pk) {
		setSapId(pk.SapId);
		setJobId(pk.JobId);
	}

	public long getSapId() {
		return _SapId;
	}

	public void setSapId(long SapId) {
		_SapId = SapId;
	}

	public long getJobId() {
		return _JobId;
	}

	public void setJobId(long JobId) {
		_JobId = JobId;
	}

	public Date getApplicationDate() {
		return _ApplicationDate;
	}

	public void setApplicationDate(Date ApplicationDate) {
		_ApplicationDate = ApplicationDate;
	}

	public String getResume() {
		return _resume;
	}

	public void setResume(String resume) {
		_resume = resume;
	}

	private long _SapId;
	private long _JobId;
	private Date _ApplicationDate;
	private String _resume;
}