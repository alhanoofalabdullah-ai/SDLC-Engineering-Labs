package com.alhanoof.sdlc.requirements.repository;

import com.alhanoof.sdlc.requirements.entity.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {

    List<Requirement> findByStatus(String status);

    List<Requirement> findByPriority(String priority);

    List<Requirement> findByBusinessOwner(String businessOwner);
}
