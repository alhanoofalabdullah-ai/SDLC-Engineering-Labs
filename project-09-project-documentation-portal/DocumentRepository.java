package com.alhanoof.sdlc.documentation.repository;

import com.alhanoof.sdlc.documentation.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository
        extends JpaRepository<Document, Long> {

    List<Document> findByStatus(String status);

    List<Document> findByDiscipline(String discipline);

    List<Document> findByDocumentType(String documentType);
}
