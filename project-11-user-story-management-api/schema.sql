CREATE DATABASE IF NOT EXISTS user_story_db;

USE user_story_db;

CREATE TABLE user_stories
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    story_code VARCHAR(100),
    title VARCHAR(255),
    description TEXT,
    acceptance_criteria TEXT,
    story_points INT,
    priority VARCHAR(50),
    sprint_name VARCHAR(150),
    assigned_developer VARCHAR(150),
    status VARCHAR(50),
    created_date DATE
);
