CREATE DATABASE IF NOT EXISTS uat_management_db;

USE uat_management_db;

CREATE TABLE uat_scenarios
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    scenario_code VARCHAR(100),
    scenario_name VARCHAR(255),
    business_requirement TEXT,
    business_owner VARCHAR(150),
    tester_name VARCHAR(150),
    status VARCHAR(50),
    sign_off_status VARCHAR(50),
    execution_date DATE,
    sign_off_date DATE
);
