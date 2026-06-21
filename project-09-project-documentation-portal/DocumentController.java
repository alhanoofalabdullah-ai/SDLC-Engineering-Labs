package com.alhanoof.sdlc.documentation.controller;

import com.alhanoof.sdlc.documentation.entity.Document;
import com.alhanoof.sdlc.documentation.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    private final DocumentService service;

    public DocumentController(DocumentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Document> getAllDocuments() {
        return service.getAllDocuments();
    }

    @PostMapping
    public Document createDocument(
            @RequestBody Document document) {

        return service.createDocument(document);
    }

    @GetMapping("/{id}")
    public Document getDocument(
            @PathVariable Long id) {

        return service.getDocument(id);
    }

    @DeleteMapping("/{id}")
    public String deleteDocument(
            @PathVariable Long id) {

        service.deleteDocument(id);

        return "Document Deleted Successfully";
    }
}
