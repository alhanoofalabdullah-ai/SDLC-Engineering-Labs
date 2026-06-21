package com.alhanoof.sdlc.workflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "approval_steps")
public class ApprovalStep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requestNumber;

    private Integer stepNumber;

    private String approver;

    private String decision;

    private String comments;

    // Getters and Setters
}
