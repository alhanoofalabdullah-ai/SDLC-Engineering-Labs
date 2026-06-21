package com.alhanoof.sdlc.risk.controller;

import com.alhanoof.sdlc.risk.entity.Issue;
import com.alhanoof.sdlc.risk.service.IssueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    private final IssueService service;

    public IssueController(IssueService service) {
        this.service = service;
    }

    @GetMapping
    public List<Issue> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Issue create(
            @RequestBody Issue issue) {
        return service.create(issue);
    }
}
