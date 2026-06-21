package com.alhanoof.sdlc.risk.repository;

import com.alhanoof.sdlc.risk.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssueRepository
        extends JpaRepository<Issue, Long> {

    List<Issue> findByStatus(String status);

    List<Issue> findByAssignedTo(String assignedTo);
}
