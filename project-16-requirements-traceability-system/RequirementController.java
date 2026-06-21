package com.alhanoof.sdlc.traceability.controller;

import com.alhanoof.sdlc.traceability.entity.Requirement;
import com.alhanoof.sdlc.traceability.service.RequirementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requirements")
public class RequirementController {

    private final RequirementService service;

    public RequirementController(RequirementService service) {
        this.service = service;
    }

    @GetMapping
    public List<Requirement> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Requirement getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Requirement create(
            @RequestBody Requirement requirement) {
        return service.create(requirement);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Requirement Deleted Successfully";
    }
}
