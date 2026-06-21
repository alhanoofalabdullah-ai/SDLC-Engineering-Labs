package com.alhanoof.sdlc.documentation.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transmittals")
public class Transmittal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transmittalNumber;

    private String sender;

    private String recipient;

    private String status;

    private LocalDate sentDate;

    // Getters and Setters
}
