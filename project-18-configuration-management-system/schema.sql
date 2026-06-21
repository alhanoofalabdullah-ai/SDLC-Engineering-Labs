CREATE DATABASE IF NOT EXISTS configuration_management_db;

USE configuration_management_db;

CREATE TABLE configuration_items (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ci_code VARCHAR(100),
    ci_name VARCHAR(255),
    ci_type VARCHAR(100),
    environment VARCHAR(100),
    owner VARCHAR(150),
    status VARCHAR(50),
    release_version VARCHAR(50),
    created_date DATE
);

CREATE TABLE baselines (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    baseline_code VARCHAR(100),
    baseline_name VARCHAR(255),
    release_version VARCHAR(50),
    approved_by VARCHAR(150),
    baseline_date DATE,
    status VARCHAR(50)
);

CREATE TABLE version_history (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    component_name VARCHAR(255),
    old_version VARCHAR(50),
    new_version VARCHAR(50),
    changed_by VARCHAR(150),
    change_date DATETIME,
    change_reason TEXT
);
