package com.alhanoof.sdlc.traceability.service;

import com.alhanoof.sdlc.traceability.entity.Requirement;
import com.alhanoof.sdlc.traceability.repository.RequirementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RequirementService {

    private final RequirementRepository repository;

    public RequirementService(RequirementRepository repository) {
        this.repository = repository;
    }

    public List<Requirement> getAll() {
        return repository.findAll();
    }

    public Requirement create(Requirement requirement) {

        requirement.setCreatedDate(LocalDate.now());

        if (requirement.getStatus() == null) {
            requirement.setStatus("Open");
        }

        return repository.save(requirement);
    }

    public Requirement getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Requirement Not Found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
