# Architecture

Business Users submit software requirements through REST APIs.

Flow:

Business User

↓

Requirement Controller

↓

Requirement Service

↓

Requirement Repository

↓

MySQL Database

This supports requirement traceability across the SDLC lifecycle.
