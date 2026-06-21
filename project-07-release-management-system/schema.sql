CREATE DATABASE IF NOT EXISTS release_management_db;

USE release_management_db;

CREATE TABLE releases
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    release_code VARCHAR(100),
    release_name VARCHAR(255),
    version_number VARCHAR(50),
    environment VARCHAR(100),
    status VARCHAR(50),
    release_manager VARCHAR(150),
    planned_release_date DATE,
    actual_release_date DATE,
    release_notes TEXT
);
