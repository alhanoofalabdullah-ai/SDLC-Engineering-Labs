package com.alhanoof.sdlc.changerequest.controller;

import com.alhanoof.sdlc.changerequest.entity.ChangeRequest;
import com.alhanoof.sdlc.changerequest.service.ChangeRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/change-requests")
public class ChangeRequestController {

    private final ChangeRequestService service;

    public ChangeRequestController(
            ChangeRequestService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangeRequest> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ChangeRequest getById(
            @PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ChangeRequest create(
            @RequestBody ChangeRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public ChangeRequest update(
            @PathVariable Long id,
            @RequestBody ChangeRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Change Request Deleted";
    }
}
