package com.alhanoof.sdlc.workflow.service;

import com.alhanoof.sdlc.workflow.entity.WorkflowRequest;
import com.alhanoof.sdlc.workflow.repository.WorkflowRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkflowService {

    private final WorkflowRepository repository;

    public WorkflowService(WorkflowRepository repository) {
        this.repository = repository;
    }

    public List<WorkflowRequest> getAllRequests() {
        return repository.findAll();
    }

    public WorkflowRequest createRequest(
            WorkflowRequest request) {

        request.setSubmittedDate(LocalDateTime.now());
        request.setCurrentStage("Reviewer");
        request.setStatus("Submitted");

        return repository.save(request);
    }

    public WorkflowRequest approve(Long id) {

        WorkflowRequest request =
                repository.findById(id)
                .orElseThrow();

        if ("Reviewer".equals(request.getCurrentStage())) {

            request.setCurrentStage("Approver");

        } else {

            request.setCurrentStage("Completed");
            request.setStatus("Approved");
            request.setCompletedDate(LocalDateTime.now());
        }

        return repository.save(request);
    }
}
