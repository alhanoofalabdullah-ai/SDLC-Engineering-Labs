package com.alhanoof.sdlc.release.service;

import com.alhanoof.sdlc.release.entity.Release;
import com.alhanoof.sdlc.release.repository.ReleaseRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReleaseService {

    private final ReleaseRepository repository;

    public ReleaseService(ReleaseRepository repository) {
        this.repository = repository;
    }

    public List<Release> getAll() {
        return repository.findAll();
    }

    public Release getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Release Not Found"));
    }

    public Release create(Release release) {

        if (release.getStatus() == null) {
            release.setStatus("Planned");
        }

        return repository.save(release);
    }

    public Release update(Long id, Release request) {

        Release release = getById(id);

        release.setReleaseName(request.getReleaseName());
        release.setVersionNumber(request.getVersionNumber());
        release.setEnvironment(request.getEnvironment());
        release.setStatus(request.getStatus());
        release.setReleaseManager(request.getReleaseManager());
        release.setPlannedReleaseDate(
                request.getPlannedReleaseDate()
        );
        release.setActualReleaseDate(
                request.getActualReleaseDate()
        );
        release.setReleaseNotes(
                request.getReleaseNotes()
        );

        return repository.save(release);
    }

    public void deployRelease(Long id) {

        Release release = getById(id);

        release.setStatus("Deployed");
        release.setActualReleaseDate(LocalDate.now());

        repository.save(release);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
