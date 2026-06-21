package com.alhanoof.sdlc.risk.repository;

import com.alhanoof.sdlc.risk.entity.Risk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskRepository
        extends JpaRepository<Risk, Long> {

    List<Risk> findByStatus(String status);

    List<Risk> findByOwner(String owner);
}
