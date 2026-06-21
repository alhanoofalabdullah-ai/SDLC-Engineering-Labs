package com.alhanoof.sdlc.configuration.controller;

import com.alhanoof.sdlc.configuration.entity.ConfigurationItem;
import com.alhanoof.sdlc.configuration.service.ConfigurationItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/config-items")
public class ConfigurationItemController {

    private final ConfigurationItemService service;

    public ConfigurationItemController(
            ConfigurationItemService service) {
        this.service = service;
    }

    @GetMapping
    public List<ConfigurationItem> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ConfigurationItem create(
            @RequestBody ConfigurationItem item) {

        return service.create(item);
    }
}
