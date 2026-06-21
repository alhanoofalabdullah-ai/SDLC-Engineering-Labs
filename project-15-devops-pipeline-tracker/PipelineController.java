package com.alhanoof.sdlc.devops.controller;

import com.alhanoof.sdlc.devops.entity.Pipeline;
import com.alhanoof.sdlc.devops.service.PipelineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pipelines")
public class PipelineController {

    private final PipelineService service;

    public PipelineController(PipelineService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pipeline> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Pipeline getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Pipeline create(@RequestBody Pipeline pipeline) {
        return service.create(pipeline);
    }

    @PutMapping("/{id}/deploy")
    public Pipeline deploy(@PathVariable Long id) {
        return service.deploy(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Pipeline Deleted Successfully";
    }
}
