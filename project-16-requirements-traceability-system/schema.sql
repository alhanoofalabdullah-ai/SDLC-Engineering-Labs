CREATE DATABASE IF NOT EXISTS traceability_db;

USE traceability_db;

CREATE TABLE requirements (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    requirement_code VARCHAR(100),
    title VARCHAR(255),
    description TEXT,
    requirement_type VARCHAR(100),
    priority VARCHAR(50),
    owner VARCHAR(150),
    status VARCHAR(50),
    created_date DATE
);

CREATE TABLE traceability_matrix (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    requirement_code VARCHAR(100),
    user_story_code VARCHAR(100),
    test_case_code VARCHAR(100),
    uat_scenario_code VARCHAR(100),
    release_code VARCHAR(100),
    coverage_status VARCHAR(50)
);
