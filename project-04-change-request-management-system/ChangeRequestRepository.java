package com.alhanoof.sdlc.changerequest.repository;

import com.alhanoof.sdlc.changerequest.entity.ChangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChangeRequestRepository
        extends JpaRepository<ChangeRequest, Long> {

    List<ChangeRequest> findByStatus(String status);

    List<ChangeRequest> findByPriority(String priority);
}
