package com.project.sustainability.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "SupplierModel")
public class SupplierModel
{
    @Id
    private String id;
    private String supplierId;
    private String year;
    private String pillarId;
    private ArrayList<GoalAnswers> goalAnswers;
    private String updatedDt;
    private String updatedUser;

}
