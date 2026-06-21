CREATE DATABASE IF NOT EXISTS devops_pipeline_db;

USE devops_pipeline_db;

CREATE TABLE pipelines
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    pipeline_name VARCHAR(255),
    repository_name VARCHAR(255),
    build_number VARCHAR(100),
    environment VARCHAR(100),
    status VARCHAR(50),
    triggered_by VARCHAR(150),
    build_start_time DATETIME,
    build_end_time DATETIME,
    deployment_time DATETIME
);
