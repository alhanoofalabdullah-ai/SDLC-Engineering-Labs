CREATE DATABASE IF NOT EXISTS sdlc_audit_db;

USE sdlc_audit_db;

CREATE TABLE audit_logs
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(150),
    module_name VARCHAR(150),
    action_type VARCHAR(100),
    action_details TEXT,
    old_value TEXT,
    new_value TEXT,
    action_date DATETIME,
    ip_address VARCHAR(100)
);
