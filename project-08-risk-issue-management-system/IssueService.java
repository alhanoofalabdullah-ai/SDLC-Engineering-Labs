package com.alhanoof.sdlc.risk.service;

import com.alhanoof.sdlc.risk.entity.Issue;
import com.alhanoof.sdlc.risk.repository.IssueRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class IssueService {

    private final IssueRepository repository;

    public IssueService(IssueRepository repository) {
        this.repository = repository;
    }

    public List<Issue> getAll() {
        return repository.findAll();
    }

    public Issue create(Issue issue) {

        issue.setReportedDate(LocalDate.now());

        if (issue.getStatus() == null) {
            issue.setStatus("Open");
        }

        return repository.save(issue);
    }

    public Issue getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Issue Not Found"));
    }
}
