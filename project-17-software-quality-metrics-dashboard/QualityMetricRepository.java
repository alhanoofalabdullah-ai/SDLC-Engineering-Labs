package com.alhanoof.sdlc.quality.repository;

import com.alhanoof.sdlc.quality.entity.QualityMetric;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualityMetricRepository
        extends JpaRepository<QualityMetric, Long> {
}
