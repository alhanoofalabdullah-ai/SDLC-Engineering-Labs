package com.alhanoof.sdlc.configuration.service;

import com.alhanoof.sdlc.configuration.entity.ConfigurationItem;
import com.alhanoof.sdlc.configuration.repository.ConfigurationItemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ConfigurationItemService {

    private final ConfigurationItemRepository repository;

    public ConfigurationItemService(
            ConfigurationItemRepository repository) {
        this.repository = repository;
    }

    public List<ConfigurationItem> getAll() {
        return repository.findAll();
    }

    public ConfigurationItem create(
            ConfigurationItem item) {

        item.setCreatedDate(LocalDate.now());

        if (item.getStatus() == null) {
            item.setStatus("Active");
        }

        return repository.save(item);
    }
}
