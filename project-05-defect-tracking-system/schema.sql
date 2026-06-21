CREATE DATABASE IF NOT EXISTS defect_tracking_db;

USE defect_tracking_db;

CREATE TABLE defects
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    defect_code VARCHAR(100),
    title VARCHAR(255),
    description TEXT,
    severity VARCHAR(50),
    priority VARCHAR(50),
    status VARCHAR(50),
    assigned_developer VARCHAR(150),
    reported_by VARCHAR(150),
    reported_date DATE,
    resolved_date DATE
);
