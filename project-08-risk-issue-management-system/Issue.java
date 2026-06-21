package com.alhanoof.sdlc.risk.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String issueCode;

    private String issueTitle;

    @Column(length = 3000)
    private String description;

    private String priority;

    private String assignedTo;

    private String status;

    private LocalDate reportedDate;

    private LocalDate targetResolutionDate;

    // Getters and Setters
}
