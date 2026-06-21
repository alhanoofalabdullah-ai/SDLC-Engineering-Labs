package com.alhanoof.sdlc.userstory.controller;

import com.alhanoof.sdlc.userstory.entity.UserStory;
import com.alhanoof.sdlc.userstory.service.UserStoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-stories")
public class UserStoryController {

    private final UserStoryService service;

    public UserStoryController(UserStoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserStory> getAllStories() {
        return service.getAllStories();
    }

    @GetMapping("/{id}")
    public UserStory getStory(
            @PathVariable Long id) {

        return service.getStory(id);
    }

    @PostMapping
    public UserStory createStory(
            @RequestBody UserStory story) {

        return service.createStory(story);
    }

    @PutMapping("/{id}")
    public UserStory updateStory(
            @PathVariable Long id,
            @RequestBody UserStory story) {

        return service.updateStory(id, story);
    }

    @DeleteMapping("/{id}")
    public String deleteStory(
            @PathVariable Long id) {

        service.deleteStory(id);

        return "User Story Deleted Successfully";
    }
}
