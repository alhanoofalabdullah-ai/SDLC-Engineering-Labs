CREATE DATABASE IF NOT EXISTS agile_sprint_db;

USE agile_sprint_db;

CREATE TABLE IF NOT EXISTS sprints (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    sprint_code VARCHAR(100),
    sprint_name VARCHAR(255),
    sprint_goal TEXT,
    start_date DATE,
    end_date DATE,
    status VARCHAR(50),
    planned_story_points INT,
    completed_story_points INT,
    scrum_master VARCHAR(150)
);
