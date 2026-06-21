package com.alhanoof.sdlc.release.repository;

import com.alhanoof.sdlc.release.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReleaseRepository
        extends JpaRepository<Release, Long> {

    List<Release> findByStatus(String status);

    List<Release> findByEnvironment(String environment);

    List<Release> findByReleaseManager(String releaseManager);
}
