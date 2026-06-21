package com.alhanoof.sdlc.defects.service;

import com.alhanoof.sdlc.defects.entity.Defect;
import com.alhanoof.sdlc.defects.repository.DefectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DefectService {

    private final DefectRepository repository;

    public DefectService(DefectRepository repository) {
        this.repository = repository;
    }

    public List<Defect> getAll() {
        return repository.findAll();
    }

    public Defect getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Defect Not Found"));
    }

    public Defect create(Defect defect) {

        defect.setReportedDate(LocalDate.now());

        if (defect.getStatus() == null) {
            defect.setStatus("Open");
        }

        return repository.save(defect);
    }

    public Defect update(Long id, Defect request) {

        Defect defect = getById(id);

        defect.setTitle(request.getTitle());
        defect.setDescription(request.getDescription());
        defect.setSeverity(request.getSeverity());
        defect.setPriority(request.getPriority());
        defect.setStatus(request.getStatus());
        defect.setAssignedDeveloper(
                request.getAssignedDeveloper()
        );

        if ("Resolved".equals(request.getStatus())) {
            defect.setResolvedDate(LocalDate.now());
        }

        return repository.save(defect);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
