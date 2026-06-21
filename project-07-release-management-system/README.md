# Project 07 – Release Management System

Enterprise Release Management System built using Spring Boot, REST APIs, JPA, MySQL, and Release Governance best practices.

---

# Overview

This project manages software releases across environments.

The system supports:

- Release Planning
- Release Scheduling
- Environment Tracking
- Deployment Monitoring
- Go-Live Governance
- Release Approval Workflow
- Release KPI Tracking

---

# Business Scenario

Organizations release software through multiple environments:

- Development
- SIT
- UAT
- Production

Release Managers need visibility into release schedules, approvals, deployment status, and production go-live readiness.

---

# SDLC Stage

This project focuses on:

- Release Planning
- Deployment Management
- Go-Live Governance
- Production Release Control

---

# API Endpoints

GET /api/releases

GET /api/releases/{id}

GET /api/releases/status/{status}

GET /api/releases/environment/{environment}

POST /api/releases

PUT /api/releases/{id}

DELETE /api/releases/{id}

---

# Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Docker
- Maven

---

# Skills Demonstrated

- Release Management
- Deployment Governance
- REST APIs
- Enterprise SDLC
- Environment Management
- Database Design

---

# Author

Alhanoof Alabdullah
