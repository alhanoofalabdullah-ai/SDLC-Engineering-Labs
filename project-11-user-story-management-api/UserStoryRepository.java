package com.alhanoof.sdlc.userstory.repository;

import com.alhanoof.sdlc.userstory.entity.UserStory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserStoryRepository
        extends JpaRepository<UserStory, Long> {

    List<UserStory> findByStatus(String status);

    List<UserStory> findBySprintName(String sprintName);

    List<UserStory> findByPriority(String priority);
}
