package com.alhanoof.sdlc.changeimpact.controller;

import com.alhanoof.sdlc.changeimpact.entity.ChangeImpact;
import com.alhanoof.sdlc.changeimpact.service.ChangeImpactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/change-impact")
public class ChangeImpactController {

    private final ChangeImpactService service;

    public ChangeImpactController(
            ChangeImpactService service) {
        this.service = service;
    }

    @GetMapping
    public List<ChangeImpact> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ChangeImpact getById(
            @PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public ChangeImpact create(
            @RequestBody ChangeImpact impact) {
        return service.create(impact);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Impact Analysis Deleted Successfully";
    }
}
