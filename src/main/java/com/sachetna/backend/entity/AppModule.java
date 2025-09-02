package com.sachetna.backend.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "modules")
public class AppModule {

    @Id
    private String id;
    private String title;
    private List<String> slides;
    private List<QuizQuestion> quiz;


    public AppModule() {}


    public AppModule(String id, String title, List<String> slides, List<QuizQuestion> quiz) {
        this.id = id;
        this.title = title;
        this.slides = slides;
        this.quiz = quiz;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getSlides() {
        return slides;
    }

    public List<QuizQuestion> getQuiz() {
        return quiz;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSlides(List<String> slides) {
        this.slides = slides;
    }

    public void setQuiz(List<QuizQuestion> quiz) {
        this.quiz = quiz;
    }
}