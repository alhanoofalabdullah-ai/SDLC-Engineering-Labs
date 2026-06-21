package com.alhanoof.sdlc.userstory.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_stories")
public class UserStory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storyCode;

    private String title;

    @Column(length = 3000)
    private String description;

    @Column(length = 2000)
    private String acceptanceCriteria;

    private Integer storyPoints;

    private String priority;

    private String sprintName;

    private String assignedDeveloper;

    private String status;

    private LocalDate createdDate;

    // Getters and Setters
}
