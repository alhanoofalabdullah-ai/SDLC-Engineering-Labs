CREATE DATABASE IF NOT EXISTS test_case_db;

USE test_case_db;

CREATE TABLE test_cases
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    test_case_code VARCHAR(100),
    test_scenario VARCHAR(255),
    test_steps TEXT,
    expected_result TEXT,
    actual_result TEXT,
    status VARCHAR(50),
    tester_name VARCHAR(150),
    module_name VARCHAR(150),
    execution_date DATE
);
