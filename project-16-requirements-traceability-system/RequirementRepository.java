package com.alhanoof.sdlc.traceability.repository;

import com.alhanoof.sdlc.traceability.entity.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequirementRepository
        extends JpaRepository<Requirement, Long> {

    List<Requirement> findByStatus(String status);

    List<Requirement> findByPriority(String priority);

    List<Requirement> findByRequirementType(String requirementType);
}
