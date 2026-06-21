package com.alhanoof.sdlc.workflow.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "workflow_requests")
public class WorkflowRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requestNumber;

    private String requestTitle;

    private String submittedBy;

    private String workflowType;

    private String currentStage;

    private String status;

    private LocalDateTime submittedDate;

    private LocalDateTime completedDate;

    // Getters and Setters
}
