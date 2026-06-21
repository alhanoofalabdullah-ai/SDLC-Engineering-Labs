package com.alhanoof.sdlc.estimation.controller;

import com.alhanoof.sdlc.estimation.entity.Estimation;
import com.alhanoof.sdlc.estimation.service.EstimationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estimations")
public class EstimationController {

    private final EstimationService service;

    public EstimationController(
            EstimationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estimation> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Estimation getById(
            @PathVariable Long id) {

        return service.getById(id);
    }

    @PostMapping
    public Estimation create(
            @RequestBody Estimation estimation) {

        return service.create(estimation);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Estimation Deleted Successfully";
    }
}
