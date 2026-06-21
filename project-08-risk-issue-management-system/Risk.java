package com.alhanoof.sdlc.risk.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "risks")
public class Risk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riskCode;

    private String riskTitle;

    @Column(length = 3000)
    private String description;

    private String probability;

    private String impact;

    private String riskLevel;

    private String owner;

    private String status;

    private String mitigationPlan;

    private LocalDate identifiedDate;

    // Getters and Setters
}
