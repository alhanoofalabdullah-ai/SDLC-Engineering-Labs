package com.alhanoof.sdlc.uat.repository;

import com.alhanoof.sdlc.uat.entity.UATScenario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UATRepository
        extends JpaRepository<UATScenario, Long> {

    List<UATScenario> findByStatus(String status);

    List<UATScenario> findBySignOffStatus(String signOffStatus);

    List<UATScenario> findByBusinessOwner(String businessOwner);
}
