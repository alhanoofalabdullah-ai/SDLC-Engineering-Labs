package com.alhanoof.sdlc.traceability.repository;

import com.alhanoof.sdlc.traceability.entity.TraceabilityMatrix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraceabilityRepository
        extends JpaRepository<TraceabilityMatrix, Long> {
}
