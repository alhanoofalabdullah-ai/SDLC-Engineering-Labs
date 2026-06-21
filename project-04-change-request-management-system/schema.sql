CREATE DATABASE IF NOT EXISTS change_request_db;

USE change_request_db;

CREATE TABLE change_requests
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    change_code VARCHAR(100),
    title VARCHAR(255),
    description TEXT,
    requested_by VARCHAR(150),
    priority VARCHAR(50),
    impact_level VARCHAR(50),
    status VARCHAR(50),
    request_date DATE,
    target_release_date DATE
);
