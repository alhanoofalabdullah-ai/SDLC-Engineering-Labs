package com.alhanoof.sdlc.agile.controller;

import com.alhanoof.sdlc.agile.entity.Sprint;
import com.alhanoof.sdlc.agile.service.SprintService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sprints")
public class SprintController {

    private final SprintService service;

    public SprintController(SprintService service) {
        this.service = service;
    }

    @GetMapping
    public List<Sprint> getAllSprints() {
        return service.getAllSprints();
    }

    @GetMapping("/{id}")
    public Sprint getSprintById(@PathVariable Long id) {
        return service.getSprintById(id);
    }

    @GetMapping("/status/{status}")
    public List<Sprint> getSprintsByStatus(@PathVariable String status) {
        return service.getSprintsByStatus(status);
    }

    @PostMapping
    public Sprint createSprint(@RequestBody Sprint sprint) {
        return service.createSprint(sprint);
    }

    @PutMapping("/{id}")
    public Sprint updateSprint(
            @PathVariable Long id,
            @RequestBody Sprint sprint
    ) {
        return service.updateSprint(id, sprint);
    }

    @DeleteMapping("/{id}")
    public String deleteSprint(@PathVariable Long id) {
        service.deleteSprint(id);
        return "Sprint deleted successfully";
    }
}
