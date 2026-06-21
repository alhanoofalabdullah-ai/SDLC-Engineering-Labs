package com.alhanoof.sdlc.userstory.service;

import com.alhanoof.sdlc.userstory.entity.UserStory;
import com.alhanoof.sdlc.userstory.repository.UserStoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserStoryService {

    private final UserStoryRepository repository;

    public UserStoryService(UserStoryRepository repository) {
        this.repository = repository;
    }

    public List<UserStory> getAllStories() {
        return repository.findAll();
    }

    public UserStory getStory(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Story Not Found"));
    }

    public UserStory createStory(UserStory story) {

        story.setCreatedDate(LocalDate.now());

        if (story.getStatus() == null) {
            story.setStatus("Backlog");
        }

        return repository.save(story);
    }

    public UserStory updateStory(Long id, UserStory request) {

        UserStory story = getStory(id);

        story.setTitle(request.getTitle());
        story.setDescription(request.getDescription());
        story.setAcceptanceCriteria(
                request.getAcceptanceCriteria()
        );
        story.setStoryPoints(request.getStoryPoints());
        story.setPriority(request.getPriority());
        story.setSprintName(request.getSprintName());
        story.setAssignedDeveloper(
                request.getAssignedDeveloper()
        );
        story.setStatus(request.getStatus());

        return repository.save(story);
    }

    public void deleteStory(Long id) {
        repository.deleteById(id);
    }
}
