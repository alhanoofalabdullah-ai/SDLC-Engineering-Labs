package com.alhanoof.sdlc.uat.service;

import com.alhanoof.sdlc.uat.entity.UATScenario;
import com.alhanoof.sdlc.uat.repository.UATRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UATService {

    private final UATRepository repository;

    public UATService(UATRepository repository) {
        this.repository = repository;
    }

    public List<UATScenario> getAll() {
        return repository.findAll();
    }

    public UATScenario getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("UAT Scenario Not Found"));
    }

    public UATScenario create(UATScenario scenario) {

        scenario.setExecutionDate(LocalDate.now());

        if (scenario.getStatus() == null) {
            scenario.setStatus("Pending Execution");
        }

        if (scenario.getSignOffStatus() == null) {
            scenario.setSignOffStatus("Pending");
        }

        return repository.save(scenario);
    }

    public UATScenario approve(Long id) {

        UATScenario scenario = getById(id);

        scenario.setStatus("Passed");
        scenario.setSignOffStatus("Approved");
        scenario.setSignOffDate(LocalDate.now());

        return repository.save(scenario);
    }

    public UATScenario reject(Long id) {

        UATScenario scenario = getById(id);

        scenario.setStatus("Failed");
        scenario.setSignOffStatus("Rejected");

        return repository.save(scenario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
