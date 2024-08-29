package com.project.sustainability.repository;

import com.project.sustainability.model.GoalConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalConfigRepo extends MongoRepository<GoalConfig, String> {
}
