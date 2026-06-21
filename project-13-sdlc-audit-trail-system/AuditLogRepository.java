package com.alhanoof.sdlc.audit.repository;

import com.alhanoof.sdlc.audit.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuditLogRepository
        extends JpaRepository<AuditLog, Long> {

    List<AuditLog> findByUsername(String username);

    List<AuditLog> findByModuleName(String moduleName);

    List<AuditLog> findByActionType(String actionType);
}
