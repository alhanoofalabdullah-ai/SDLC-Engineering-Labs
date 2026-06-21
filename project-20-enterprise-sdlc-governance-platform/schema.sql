CREATE DATABASE IF NOT EXISTS enterprise_sdlc_db;

USE enterprise_sdlc_db;

CREATE TABLE requirements (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    requirement_code VARCHAR(100),
    title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE user_stories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    story_code VARCHAR(100),
    title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE test_cases (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    test_case_code VARCHAR(100),
    title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE uat_scenarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    scenario_code VARCHAR(100),
    title VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE risks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    risk_code VARCHAR(100),
    risk_level VARCHAR(50)
);

CREATE TABLE releases (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    release_code VARCHAR(100),
    status VARCHAR(50)
);

CREATE TABLE audit_logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(150),
    action_type VARCHAR(100),
    action_date DATETIME
);
