package com.alhanoof.sdlc.testcase.service;

import com.alhanoof.sdlc.testcase.entity.TestCase;
import com.alhanoof.sdlc.testcase.repository.TestCaseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TestCaseService {

    private final TestCaseRepository repository;

    public TestCaseService(TestCaseRepository repository) {
        this.repository = repository;
    }

    public List<TestCase> getAll() {
        return repository.findAll();
    }

    public TestCase getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Test Case Not Found"));
    }

    public TestCase create(TestCase testCase) {

        testCase.setExecutionDate(LocalDate.now());

        if (testCase.getStatus() == null) {
            testCase.setStatus("Not Executed");
        }

        return repository.save(testCase);
    }

    public TestCase update(Long id, TestCase request) {

        TestCase testCase = getById(id);

        testCase.setTestScenario(request.getTestScenario());
        testCase.setTestSteps(request.getTestSteps());
        testCase.setExpectedResult(request.getExpectedResult());
        testCase.setActualResult(request.getActualResult());
        testCase.setStatus(request.getStatus());
        testCase.setTesterName(request.getTesterName());

        return repository.save(testCase);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
