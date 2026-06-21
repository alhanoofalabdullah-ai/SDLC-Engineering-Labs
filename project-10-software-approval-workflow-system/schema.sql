CREATE DATABASE IF NOT EXISTS workflow_db;

USE workflow_db;

CREATE TABLE workflow_requests (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    request_number VARCHAR(100),
    request_title VARCHAR(255),
    submitted_by VARCHAR(150),
    workflow_type VARCHAR(100),
    current_stage VARCHAR(100),
    status VARCHAR(50),
    submitted_date DATETIME,
    completed_date DATETIME
);

CREATE TABLE approval_steps (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    request_number VARCHAR(100),
    step_number INT,
    approver VARCHAR(150),
    decision VARCHAR(50),
    comments TEXT
);

CREATE TABLE escalation_rules (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    workflow_type VARCHAR(100),
    sla_hours INT,
    escalation_owner VARCHAR(150)
);
