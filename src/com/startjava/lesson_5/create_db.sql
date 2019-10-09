-- create database

CREATE TABLTE Jaegers (
	id 			SMALLSERIAL PRIMARY KEY,
	modelName 	TEXT,
	mark 		TEXT,
	height 		REAL,
	weight 		SMALLINT,
	status 		TEXT,
	origin 		TEXT,
	launch 		DATE,
	kaijuKill 	SMALLINT
);