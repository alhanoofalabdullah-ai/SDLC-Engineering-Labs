package com.alhanoof.sdlc.testcase.repository;

import com.alhanoof.sdlc.testcase.entity.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestCaseRepository
        extends JpaRepository<TestCase, Long> {

    List<TestCase> findByStatus(String status);

    List<TestCase> findByModuleName(String moduleName);
}
