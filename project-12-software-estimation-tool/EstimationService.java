package com.alhanoof.sdlc.estimation.service;

import com.alhanoof.sdlc.estimation.entity.Estimation;
import com.alhanoof.sdlc.estimation.repository.EstimationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EstimationService {

    private final EstimationRepository repository;

    public EstimationService(EstimationRepository repository) {
        this.repository = repository;
    }

    public List<Estimation> getAll() {
        return repository.findAll();
    }

    public Estimation create(Estimation estimation) {

        estimation.setEstimationDate(LocalDate.now());

        double estimatedCost =
                estimation.getStoryPoints()
                * 120.0;

        int estimatedDays =
                estimation.getStoryPoints()
                / estimation.getSprintVelocity()
                * 14;

        estimation.setEstimatedCost(
                estimatedCost
        );

        estimation.setEstimatedDays(
                estimatedDays
        );

        return repository.save(estimation);
    }

    public Estimation getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Estimation Not Found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
