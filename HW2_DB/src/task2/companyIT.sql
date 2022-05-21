CREATE TABLE location
(
    office_name  VARCHAR(25) PRIMARY KEY,
    company 	 VARCHAR(25) NOT NULL,
    employees    VARCHAR(30) NOT NULL
);


CREATE TABLE project
(
    project_code     INTEGER PRIMARY KEY,
    project_cost     NUMERIC(10,3) NOT NULL,
    project_deadline TIMESTAMP NOT NULL
);


CREATE TABLE employees
(
    employee_code INTEGER PRIMARY KEY,
    first_name    VARCHAR(15) NOT NULL,
    last_name     VARCHAR(15) NOT NULL,
    gender        VARCHAR(1) CONSTRAINT gender_selection
        CHECK(gender = 'm' OR gender = 'f'),
    age           INTEGER CONSTRAINT age_adult CHECK(age > 18),
    salary        INTEGER CONSTRAINT salary_not_null CHECK(salary > 0),

    employee_p    INTEGER REFERENCES project(project_code),
    employee_t    INTEGER REFERENCES team(team_code),
    employee_l    VARCHAR(25) REFERENCES location(office_name)
);


CREATE TABLE team
(
    team_code INTEGER PRIMARY KEY,

    team_ INTEGER REFERENCES project(project_code)
);


CREATE TABLE customer
(
    customer_code INTEGER PRIMARY KEY,
    customer_first_name VARCHAR(15) NOT NULL,
    customer_last_name VARCHAR(15) NOT NULL,

    customer_ INTEGER REFERENCES project(project_code)
);

