package com.alhanoof.sdlc.devops.repository;

import com.alhanoof.sdlc.devops.entity.Pipeline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PipelineRepository
        extends JpaRepository<Pipeline, Long> {

    List<Pipeline> findByStatus(String status);

    List<Pipeline> findByEnvironment(String environment);

    List<Pipeline> findByRepositoryName(String repositoryName);
}
