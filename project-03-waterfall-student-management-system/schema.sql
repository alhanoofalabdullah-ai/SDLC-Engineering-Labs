CREATE DATABASE IF NOT EXISTS waterfall_student_db;

USE waterfall_student_db;

CREATE TABLE IF NOT EXISTS students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_code VARCHAR(100),
    full_name VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    department VARCHAR(150),
    academic_year VARCHAR(50),
    enrollment_status VARCHAR(50),
    registration_date DATE
);
