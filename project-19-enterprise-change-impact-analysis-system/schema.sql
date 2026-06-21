CREATE DATABASE IF NOT EXISTS change_impact_db;

USE change_impact_db;

CREATE TABLE change_impacts
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    change_code VARCHAR(100),
    change_title VARCHAR(255),
    description TEXT,
    impacted_module VARCHAR(255),
    impacted_requirement VARCHAR(255),
    impacted_release VARCHAR(255),
    impacted_uat VARCHAR(255),
    risk_level VARCHAR(50),
    impact_level VARCHAR(50),
    owner VARCHAR(150),
    assessment_date DATE
);
