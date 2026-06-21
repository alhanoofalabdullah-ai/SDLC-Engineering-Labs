package com.alhanoof.sdlc.workflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "escalation_rules")
public class EscalationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workflowType;

    private Integer slaHours;

    private String escalationOwner;

    // Getters and Setters
}
