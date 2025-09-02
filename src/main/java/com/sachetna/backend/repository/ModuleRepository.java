package com.sachetna.backend.repository;

import com.sachetna.backend.entity.AppModule;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ModuleRepository extends MongoRepository<AppModule, String> {
}