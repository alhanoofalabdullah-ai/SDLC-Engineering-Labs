package com.alhanoof.sdlc.changeimpact.service;

import com.alhanoof.sdlc.changeimpact.entity.ChangeImpact;
import com.alhanoof.sdlc.changeimpact.repository.ChangeImpactRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ChangeImpactService {

    private final ChangeImpactRepository repository;

    public ChangeImpactService(
            ChangeImpactRepository repository) {
        this.repository = repository;
    }

    public List<ChangeImpact> getAll() {
        return repository.findAll();
    }

    public ChangeImpact create(
            ChangeImpact impact) {

        impact.setAssessmentDate(LocalDate.now());

        return repository.save(impact);
    }

    public ChangeImpact getById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Impact Analysis Not Found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
