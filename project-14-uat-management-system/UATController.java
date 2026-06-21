package com.alhanoof.sdlc.uat.controller;

import com.alhanoof.sdlc.uat.entity.UATScenario;
import com.alhanoof.sdlc.uat.service.UATService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uat")
public class UATController {

    private final UATService service;

    public UATController(UATService service) {
        this.service = service;
    }

    @GetMapping
    public List<UATScenario> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UATScenario getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public UATScenario create(@RequestBody UATScenario scenario) {
        return service.create(scenario);
    }

    @PutMapping("/{id}/approve")
    public UATScenario approve(@PathVariable Long id) {
        return service.approve(id);
    }

    @PutMapping("/{id}/reject")
    public UATScenario reject(@PathVariable Long id) {
        return service.reject(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "UAT Scenario Deleted Successfully";
    }
}
