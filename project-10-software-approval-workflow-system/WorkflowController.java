package com.alhanoof.sdlc.workflow.controller;

import com.alhanoof.sdlc.workflow.entity.WorkflowRequest;
import com.alhanoof.sdlc.workflow.service.WorkflowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workflows")
public class WorkflowController {

    private final WorkflowService service;

    public WorkflowController(
            WorkflowService service) {
        this.service = service;
    }

    @GetMapping
    public List<WorkflowRequest> getAll() {
        return service.getAllRequests();
    }

    @PostMapping
    public WorkflowRequest create(
            @RequestBody WorkflowRequest request) {

        return service.createRequest(request);
    }

    @PutMapping("/{id}/approve")
    public WorkflowRequest approve(
            @PathVariable Long id) {

        return service.approve(id);
    }
}
