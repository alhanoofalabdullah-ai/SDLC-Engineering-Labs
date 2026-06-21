package com.alhanoof.sdlc.audit.controller;

import com.alhanoof.sdlc.audit.entity.AuditLog;
import com.alhanoof.sdlc.audit.service.AuditLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audit-logs")
public class AuditLogController {

    private final AuditLogService service;

    public AuditLogController(AuditLogService service) {
        this.service = service;
    }

    @GetMapping
    public List<AuditLog> getAllLogs() {
        return service.getAllLogs();
    }

    @GetMapping("/{id}")
    public AuditLog getLog(
            @PathVariable Long id) {

        return service.getLog(id);
    }

    @PostMapping
    public AuditLog createLog(
            @RequestBody AuditLog log) {

        return service.createLog(log);
    }

    @DeleteMapping("/{id}")
    public String deleteLog(
            @PathVariable Long id) {

        service.deleteLog(id);

        return "Audit Log Deleted Successfully";
    }
}
