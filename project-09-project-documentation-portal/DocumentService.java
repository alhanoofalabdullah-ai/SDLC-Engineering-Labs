package com.alhanoof.sdlc.documentation.service;

import com.alhanoof.sdlc.documentation.entity.Document;
import com.alhanoof.sdlc.documentation.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository repository;

    public DocumentService(DocumentRepository repository) {
        this.repository = repository;
    }

    public List<Document> getAllDocuments() {
        return repository.findAll();
    }

    public Document createDocument(Document document) {

        document.setUploadDate(LocalDate.now());

        if (document.getStatus() == null) {
            document.setStatus("Under Review");
        }

        return repository.save(document);
    }

    public Document getDocument(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Document Not Found"));
    }

    public void deleteDocument(Long id) {
        repository.deleteById(id);
    }
}
