package com.alhanoof.sdlc.risk.service;

import com.alhanoof.sdlc.risk.entity.Risk;
import com.alhanoof.sdlc.risk.repository.RiskRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class RiskService {

    private final RiskRepository repository;

    public RiskService(RiskRepository repository) {
        this.repository = repository;
    }

    public List<Risk> getAll() {
        return repository.findAll();
    }

    public Risk create(Risk risk) {

        risk.setIdentifiedDate(LocalDate.now());

        if (risk.getStatus() == null) {
            risk.setStatus("Open");
        }

        return repository.save(risk);
    }

    public Risk getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Risk Not Found"));
    }
}
