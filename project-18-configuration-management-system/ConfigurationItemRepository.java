package com.alhanoof.sdlc.configuration.repository;

import com.alhanoof.sdlc.configuration.entity.ConfigurationItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfigurationItemRepository
        extends JpaRepository<ConfigurationItem, Long> {

    List<ConfigurationItem> findByEnvironment(String environment);

    List<ConfigurationItem> findByStatus(String status);

    List<ConfigurationItem> findByCiType(String ciType);
}
