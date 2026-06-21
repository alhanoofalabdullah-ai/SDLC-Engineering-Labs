package com.alhanoof.sdlc.workflow.repository;

import com.alhanoof.sdlc.workflow.entity.WorkflowRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkflowRepository
        extends JpaRepository<WorkflowRequest, Long> {

    List<WorkflowRequest> findByStatus(String status);

    List<WorkflowRequest> findByWorkflowType(String workflowType);
}
