package com.sachetna.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("modules")
public class Module {
    @Id
    private String id;
    private String title;
    private List<String> slides;
    private List<QuizQuestion> quiz;
}