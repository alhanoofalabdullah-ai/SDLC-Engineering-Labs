package com.alhanoof.sdlc.release.controller;

import com.alhanoof.sdlc.release.entity.Release;
import com.alhanoof.sdlc.release.service.ReleaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/releases")
public class ReleaseController {

    private final ReleaseService service;

    public ReleaseController(ReleaseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Release> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Release getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Release create(
            @RequestBody Release release) {

        return service.create(release);
    }

    @PutMapping("/{id}")
    public Release update(
            @PathVariable Long id,
            @RequestBody Release release) {

        return service.update(id, release);
    }

    @PutMapping("/{id}/deploy")
    public String deployRelease(
            @PathVariable Long id) {

        service.deployRelease(id);

        return "Release Deployed Successfully";
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Release Deleted Successfully";
    }
}
