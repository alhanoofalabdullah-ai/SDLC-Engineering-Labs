package com.alhanoof.sdlc.devops.service;

import com.alhanoof.sdlc.devops.entity.Pipeline;
import com.alhanoof.sdlc.devops.repository.PipelineRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PipelineService {

    private final PipelineRepository repository;

    public PipelineService(PipelineRepository repository) {
        this.repository = repository;
    }

    public List<Pipeline> getAll() {
        return repository.findAll();
    }

    public Pipeline getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Pipeline Not Found"));
    }

    public Pipeline create(Pipeline pipeline) {

        pipeline.setBuildStartTime(LocalDateTime.now());

        if (pipeline.getStatus() == null) {
            pipeline.setStatus("Running");
        }

        return repository.save(pipeline);
    }

    public Pipeline deploy(Long id) {

        Pipeline pipeline = getById(id);

        pipeline.setStatus("Deployed");
        pipeline.setBuildEndTime(LocalDateTime.now());
        pipeline.setDeploymentTime(LocalDateTime.now());

        return repository.save(pipeline);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
