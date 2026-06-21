CREATE DATABASE IF NOT EXISTS risk_issue_db;

USE risk_issue_db;

CREATE TABLE risks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    risk_code VARCHAR(100),
    risk_title VARCHAR(255),
    description TEXT,
    probability VARCHAR(50),
    impact VARCHAR(50),
    risk_level VARCHAR(50),
    owner VARCHAR(150),
    status VARCHAR(50),
    mitigation_plan TEXT,
    identified_date DATE
);

CREATE TABLE issues (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    issue_code VARCHAR(100),
    issue_title VARCHAR(255),
    description TEXT,
    priority VARCHAR(50),
    assigned_to VARCHAR(150),
    status VARCHAR(50),
    reported_date DATE,
    target_resolution_date DATE
);
