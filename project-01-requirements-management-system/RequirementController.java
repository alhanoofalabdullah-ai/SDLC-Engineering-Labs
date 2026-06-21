package com.alhanoof.sdlc.requirements.controller;

import com.alhanoof.sdlc.requirements.entity.Requirement;
import com.alhanoof.sdlc.requirements.service.RequirementService;
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
    public List<Requirement> getAllRequirements() {
        return service.getAllRequirements();
    }

    @GetMapping("/{id}")
    public Requirement getRequirementById(@PathVariable Long id) {
        return service.getRequirementById(id);
    }

    @GetMapping("/status/{status}")
    public List<Requirement> getRequirementsByStatus(@PathVariable String status) {
        return service.getRequirementsByStatus(status);
    }

    @PostMapping
    public Requirement createRequirement(@RequestBody Requirement requirement) {
        return service.createRequirement(requirement);
    }

    @PutMapping("/{id}")
    public Requirement updateRequirement(
            @PathVariable Long id,
            @RequestBody Requirement requirement
    ) {
        return service.updateRequirement(id, requirement);
    }

    @DeleteMapping("/{id}")
    public String deleteRequirement(@PathVariable Long id) {
        service.deleteRequirement(id);
        return "Requirement deleted successfully";
    }
}
