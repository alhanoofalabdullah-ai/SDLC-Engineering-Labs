package com.alhanoof.sdlc.agile.repository;

import com.alhanoof.sdlc.agile.entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SprintRepository extends JpaRepository<Sprint, Long> {

    List<Sprint> findByStatus(String status);

    List<Sprint> findByScrumMaster(String scrumMaster);
}
