


CREATE DATABASE employee_db;
USE employee_db;


CREATE TABLE designations(
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`desig_name` VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY(`id`)
);

CREATE TABLE employee_info(
	`id` INT(11) NOT NULL AUTO_INCREMENT, 
	`emp_id` INT(11) NOT NULL UNIQUE,
	`username` NVARCHAR(255) DEFAULT NULL,
	`emp_name` VARCHAR(255) DEFAULT NULL,
	`password` NVARCHAR(50) DEFAULT NULL,
	`designation_id` INT(11) NOT NULL,
	`experience`INT(11) NOT NULL,
	`salary` INT(11) NOT NULL,
	PRIMARY KEY(`id`),
	FOREIGN KEY(`designation_id`) REFERENCES designations(`id`)
);


INSERT INTO designations(`desig_name`) values('Trainee Software Engineer');
INSERT INTO designations(`desig_name`) values('Software Engineer');
INSERT INTO designations(`desig_name`) values('Technical Lead');
INSERT INTO designations(`desig_name`) values('Project Manager');
INSERT INTO designations(`desig_name`) values('Program Manager');

INSERT INTO employee_info(`emp_id`, `username`, `emp_name`, `password`, `designation_id`, `experience`, `salary`)
		VALUES( 7581, 'sharanya.gottimukkula@valuelabs.com', 'Sharanya G', 'sharanya', 2, 1, 255000);

INSERT INTO employee_info(`emp_id`, `username`, `emp_name`, `password`, `designation_id`, `experience`, `salary`)
		VALUES( 7541, 'prasanna.perumalla@valuelabs.com', 'Prasanna P', 'prasanna', 2, 1, 255000);

SELECT * FROM employee_info WHERE username = "sharanya.gottimukkula@valuelabs.com"
		AND password = "sharanya";
		
desc employee_info;