package com.traini8.training_center_registry.controller;

import com.traini8.training_center_registry.model.TrainingCenter;
import com.traini8.training_center_registry.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    @Autowired
    private TrainingCenterService service;

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedTrainingCenter = service.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedTrainingCenter, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> trainingCenters = service.getAllTrainingCenters();
        return new ResponseEntity<>(trainingCenters, HttpStatus.OK);
    }
}