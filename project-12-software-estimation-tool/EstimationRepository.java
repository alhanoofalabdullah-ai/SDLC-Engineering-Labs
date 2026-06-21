package com.alhanoof.sdlc.estimation.repository;

import com.alhanoof.sdlc.estimation.entity.Estimation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstimationRepository
        extends JpaRepository<Estimation, Long> {
}
