package com.traini8.training_center_registry.repository;

import com.traini8.training_center_registry.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}