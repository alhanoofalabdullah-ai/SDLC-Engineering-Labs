package com.alhanoof.sdlc.quality.controller;

import com.alhanoof.sdlc.quality.dto.DashboardDTO;
import com.alhanoof.sdlc.quality.service.DashboardService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService service;

    public DashboardController(
            DashboardService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public DashboardDTO getDashboard(
            @PathVariable Long id) {

        return service.getDashboard(id);
    }
}
