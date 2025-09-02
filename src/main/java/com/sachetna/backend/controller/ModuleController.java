package com.sachetna.backend.controller;

import com.sachetna.backend.entity.AppModule;

import com.sachetna.backend.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500")

@RestController
@RequestMapping("/api/modules")   // plural is usually REST best practice
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/{id}")
    public ResponseEntity<AppModule> getModule(@PathVariable String id) {
        return moduleService.getModuleById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/test")
    public AppModule testModule() {
        AppModule module = new AppModule();
        module.setId("test");
        module.setTitle("Test Module");
        module.setSlides(List.of("Slide 1", "Slide 2"));
        return module;
    }

    @GetMapping
    public List<AppModule> getAllModules() {
        return moduleService.getAllModules();
    }
}
