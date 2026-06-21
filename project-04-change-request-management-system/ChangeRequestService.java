package com.alhanoof.sdlc.changerequest.service;

import com.alhanoof.sdlc.changerequest.entity.ChangeRequest;
import com.alhanoof.sdlc.changerequest.repository.ChangeRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ChangeRequestService {

    private final ChangeRequestRepository repository;

    public ChangeRequestService(
            ChangeRequestRepository repository) {
        this.repository = repository;
    }

    public List<ChangeRequest> getAll() {
        return repository.findAll();
    }

    public ChangeRequest getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Change Request Not Found"));
    }

    public ChangeRequest create(
            ChangeRequest request) {

        request.setRequestDate(LocalDate.now());

        if (request.getStatus() == null) {
            request.setStatus("Submitted");
        }

        return repository.save(request);
    }

    public ChangeRequest update(
            Long id,
            ChangeRequest request) {

        ChangeRequest existing = getById(id);

        existing.setTitle(request.getTitle());
        existing.setDescription(request.getDescription());
        existing.setPriority(request.getPriority());
        existing.setImpactLevel(request.getImpactLevel());
        existing.setStatus(request.getStatus());

        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
