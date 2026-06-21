package com.alhanoof.sdlc.testcase.controller;

import com.alhanoof.sdlc.testcase.entity.TestCase;
import com.alhanoof.sdlc.testcase.service.TestCaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test-cases")
public class TestCaseController {

    private final TestCaseService service;

    public TestCaseController(TestCaseService service) {
        this.service = service;
    }

    @GetMapping
    public List<TestCase> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public TestCase getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public TestCase create(
            @RequestBody TestCase testCase) {

        return service.create(testCase);
    }

    @PutMapping("/{id}")
    public TestCase update(
            @PathVariable Long id,
            @RequestBody TestCase testCase) {

        return service.update(id, testCase);
    }

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id) {

        service.delete(id);

        return "Test Case Deleted Successfully";
    }
}
