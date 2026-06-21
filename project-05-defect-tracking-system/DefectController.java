package com.alhanoof.sdlc.defects.controller;

import com.alhanoof.sdlc.defects.entity.Defect;
import com.alhanoof.sdlc.defects.service.DefectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/defects")
public class DefectController {

    private final DefectService service;

    public DefectController(DefectService service) {
        this.service = service;
    }

    @GetMapping
    public List<Defect> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Defect getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Defect create(
            @RequestBody Defect defect) {

        return service.create(defect);
    }

    @PutMapping("/{id}")
    public Defect update(
            @PathVariable Long id,
            @RequestBody Defect defect) {

        return service.update(id, defect);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Defect Deleted Successfully";
    }
}
