CREATE DATABASE IF NOT EXISTS software_estimation_db;

USE software_estimation_db;

CREATE TABLE estimations
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    project_name VARCHAR(255),
    story_points INT,
    team_size INT,
    sprint_velocity INT,
    estimated_days INT,
    estimated_cost DECIMAL(15,2),
    estimation_date DATE
);
