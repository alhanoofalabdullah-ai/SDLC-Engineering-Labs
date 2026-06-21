CREATE DATABASE IF NOT EXISTS requirements_db;

USE requirements_db;

CREATE TABLE IF NOT EXISTS requirements (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    requirement_code VARCHAR(100),
    title VARCHAR(255),
    description TEXT,
    business_owner VARCHAR(150),
    priority VARCHAR(50),
    status VARCHAR(50),
    sdlc_phase VARCHAR(100),
    created_date DATE
);
