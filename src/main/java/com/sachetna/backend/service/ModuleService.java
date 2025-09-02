package com.sachetna.backend.service;

import com.sachetna.backend.entity.AppModule;
import com.sachetna.backend.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public Optional<AppModule> getModuleById(String id) {
        return moduleRepository.findById(id);
    }
    public List<AppModule> getAllModules() {
        return moduleRepository.findAll();
    }

}