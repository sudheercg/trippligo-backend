package com.trippligo.rag.service;

import java.util.List;

import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.SearchRequest;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!mock")
public class RagService {

    private final VectorStore vectorStore;

    public RagService(VectorStore vectorStore) {
        this.vectorStore = vectorStore;
    }

    public List<Document> retrieve(String query) {

        return vectorStore.similaritySearch(
                SearchRequest.builder()
                        .query(query)
                        .topK(6)
                        .similarityThreshold(0.70)
                        .build()
        );
    }
}