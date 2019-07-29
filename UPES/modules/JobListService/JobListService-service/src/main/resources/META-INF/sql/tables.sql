create table FOO_JobId (
	JobId LONG not null primary key,
	Company VARCHAR(75) null,
	Post VARCHAR(75) null,
	Pay INTEGER,
	CGPA INTEGER,
	Description VARCHAR(75) null,
	MoreInfo VARCHAR(75) null,
	LastDateToApply DATE null,
	CIT BOOLEAN,
	nonCIT BOOLEAN
);

create table KMB_JobId (
	JobId LONG not null primary key,
	Company VARCHAR(75) null,
	Post VARCHAR(75) null,
	Pay INTEGER,
	CGPA INTEGER,
	Description VARCHAR(75) null,
	MoreInfo VARCHAR(75) null,
	LastDateToApply DATE null,
	CIT BOOLEAN,
	nonCIT BOOLEAN
);