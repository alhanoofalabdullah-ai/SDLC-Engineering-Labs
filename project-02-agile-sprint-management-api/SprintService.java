package com.alhanoof.sdlc.agile.service;

import com.alhanoof.sdlc.agile.entity.Sprint;
import com.alhanoof.sdlc.agile.exception.ResourceNotFoundException;
import com.alhanoof.sdlc.agile.repository.SprintRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprintService {

    private final SprintRepository repository;

    public SprintService(SprintRepository repository) {
        this.repository = repository;
    }

    public List<Sprint> getAllSprints() {
        return repository.findAll();
    }

    public Sprint getSprintById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sprint not found with ID: " + id));
    }

    public List<Sprint> getSprintsByStatus(String status) {
        return repository.findByStatus(status);
    }

    public Sprint createSprint(Sprint sprint) {
        if (sprint.getStatus() == null) {
            sprint.setStatus("Planned");
        }

        if (sprint.getCompletedStoryPoints() == null) {
            sprint.setCompletedStoryPoints(0);
        }

        return repository.save(sprint);
    }

    public Sprint updateSprint(Long id, Sprint request) {
        Sprint sprint = getSprintById(id);

        sprint.setSprintCode(request.getSprintCode());
        sprint.setSprintName(request.getSprintName());
        sprint.setSprintGoal(request.getSprintGoal());
        sprint.setStartDate(request.getStartDate());
        sprint.setEndDate(request.getEndDate());
        sprint.setStatus(request.getStatus());
        sprint.setPlannedStoryPoints(request.getPlannedStoryPoints());
        sprint.setCompletedStoryPoints(request.getCompletedStoryPoints());
        sprint.setScrumMaster(request.getScrumMaster());

        return repository.save(sprint);
    }

    public void deleteSprint(Long id) {
        Sprint sprint = getSprintById(id);
        repository.delete(sprint);
    }
}
