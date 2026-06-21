CREATE DATABASE IF NOT EXISTS documentation_portal_db;

USE documentation_portal_db;

CREATE TABLE documents (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    document_number VARCHAR(150),
    title VARCHAR(255),
    discipline VARCHAR(100),
    revision VARCHAR(20),
    status VARCHAR(50),
    uploaded_by VARCHAR(150),
    upload_date DATE,
    document_type VARCHAR(100)
);

CREATE TABLE workflows (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    workflow_name VARCHAR(150),
    reviewer VARCHAR(150),
    approver VARCHAR(150),
    workflow_status VARCHAR(50),
    action_required VARCHAR(255)
);

CREATE TABLE transmittals (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    transmittal_number VARCHAR(150),
    sender VARCHAR(150),
    recipient VARCHAR(150),
    status VARCHAR(50),
    sent_date DATE
);
