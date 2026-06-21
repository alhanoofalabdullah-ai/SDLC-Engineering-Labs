CREATE DATABASE IF NOT EXISTS quality_dashboard_db;

USE quality_dashboard_db;

CREATE TABLE quality_metrics
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    total_test_cases INT,
    passed_tests INT,
    failed_tests INT,
    open_defects INT,
    closed_defects INT,
    critical_defects INT,
    open_risks INT,
    mitigated_risks INT,
    successful_releases INT,
    failed_releases INT,
    uat_passed INT,
    uat_failed INT
);
