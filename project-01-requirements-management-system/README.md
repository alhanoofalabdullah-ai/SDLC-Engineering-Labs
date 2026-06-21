# Project 01 – Requirements Management System

Enterprise Requirements Management System built using Spring Boot, REST APIs, JPA, MySQL, and SDLC best practices.

---

## Overview

This project manages software requirements across the SDLC lifecycle.

The system supports:

- Create Requirements
- Update Requirements
- Delete Requirements
- Track Requirement Status
- Manage Priority
- Track Business Owner
- Maintain Requirement Traceability

---

## SDLC Stage

This project focuses on:

- Requirement Gathering
- Requirement Analysis
- Requirement Approval
- Requirement Traceability

---

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/requirements` | Get all requirements |
| GET | `/api/requirements/{id}` | Get requirement by ID |
| GET | `/api/requirements/status/{status}` | Filter by status |
| POST | `/api/requirements` | Create requirement |
| PUT | `/api/requirements/{id}` | Update requirement |
| DELETE | `/api/requirements/{id}` | Delete requirement |

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Docker
- Maven

---

## Author

Alhanoof Alabdullah
