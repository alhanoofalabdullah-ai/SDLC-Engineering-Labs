package com.alhanoof.sdlc.governance.controller;

import com.alhanoof.sdlc.governance.dto.ExecutiveDashboardDTO;
import com.alhanoof.sdlc.governance.service.GovernanceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final GovernanceService service;

    public DashboardController(
            GovernanceService service) {
        this.service = service;
    }

    @GetMapping("/executive")
    public ExecutiveDashboardDTO executiveDashboard() {

        return service.getExecutiveDashboard();
    }
}
