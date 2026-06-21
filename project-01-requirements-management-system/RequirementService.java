package com.alhanoof.sdlc.requirements.service;

import com.alhanoof.sdlc.requirements.entity.Requirement;
import com.alhanoof.sdlc.requirements.exception.ResourceNotFoundException;
import com.alhanoof.sdlc.requirements.repository.RequirementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RequirementService {

    private final RequirementRepository repository;

    public RequirementService(RequirementRepository repository) {
        this.repository = repository;
    }

    public List<Requirement> getAllRequirements() {
        return repository.findAll();
    }

    public Requirement getRequirementById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Requirement not found with ID: " + id));
    }

    public List<Requirement> getRequirementsByStatus(String status) {
        return repository.findByStatus(status);
    }

    public Requirement createRequirement(Requirement requirement) {
        requirement.setCreatedDate(LocalDate.now());
        requirement.setSdlcPhase("Requirements Analysis");

        if (requirement.getStatus() == null) {
            requirement.setStatus("Draft");
        }

        return repository.save(requirement);
    }

    public Requirement updateRequirement(Long id, Requirement request) {
        Requirement requirement = getRequirementById(id);

        requirement.setRequirementCode(request.getRequirementCode());
        requirement.setTitle(request.getTitle());
        requirement.setDescription(request.getDescription());
        requirement.setBusinessOwner(request.getBusinessOwner());
        requirement.setPriority(request.getPriority());
        requirement.setStatus(request.getStatus());
        requirement.setSdlcPhase(request.getSdlcPhase());

        return repository.save(requirement);
    }

    public void deleteRequirement(Long id) {
        Requirement requirement = getRequirementById(id);
        repository.delete(requirement);
    }
}
