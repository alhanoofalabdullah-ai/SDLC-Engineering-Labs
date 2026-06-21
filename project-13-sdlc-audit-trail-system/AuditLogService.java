package com.alhanoof.sdlc.audit.service;

import com.alhanoof.sdlc.audit.entity.AuditLog;
import com.alhanoof.sdlc.audit.repository.AuditLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuditLogService {

    private final AuditLogRepository repository;

    public AuditLogService(AuditLogRepository repository) {
        this.repository = repository;
    }

    public List<AuditLog> getAllLogs() {
        return repository.findAll();
    }

    public AuditLog getLog(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Audit Log Not Found"));
    }

    public AuditLog createLog(AuditLog log) {

        log.setActionDate(LocalDateTime.now());

        return repository.save(log);
    }

    public void deleteLog(Long id) {
        repository.deleteById(id);
    }
}
