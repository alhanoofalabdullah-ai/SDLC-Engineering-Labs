package com.alhanoof.sdlc.changeimpact.repository;

import com.alhanoof.sdlc.changeimpact.entity.ChangeImpact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChangeImpactRepository
        extends JpaRepository<ChangeImpact, Long> {

    List<ChangeImpact> findByRiskLevel(String riskLevel);

    List<ChangeImpact> findByImpactLevel(String impactLevel);

    List<ChangeImpact> findByOwner(String owner);
}
