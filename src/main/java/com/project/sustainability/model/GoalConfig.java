package com.project.sustainability.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "goal_config")
public class GoalConfig {


    @Id
    private String _id;
    private String pillarId; // Use String for the id field
    private String pillarName;
    private String year;
    private List<Question> questions;

}
