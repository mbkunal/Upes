create table KMB_Job_Application_Records (
	SapId LONG not null,
	JobId LONG not null,
	ApplicationDate DATE null,
	resume VARCHAR(75) null,
	primary key (SapId, JobId)
);