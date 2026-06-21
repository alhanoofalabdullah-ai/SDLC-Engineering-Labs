package com.alhanoof.sdlc.risk.controller;

import com.alhanoof.sdlc.risk.entity.Risk;
import com.alhanoof.sdlc.risk.service.RiskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risks")
public class RiskController {

    private final RiskService service;

    public RiskController(RiskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Risk> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Risk create(
            @RequestBody Risk risk) {
        return service.create(risk);
    }
}
