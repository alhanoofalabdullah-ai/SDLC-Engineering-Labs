package com.alhanoof.sdlc.documentation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workflows")
public class Workflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workflowName;

    private String reviewer;

    private String approver;

    private String workflowStatus;

    private String actionRequired;

    // Getters and Setters
}
