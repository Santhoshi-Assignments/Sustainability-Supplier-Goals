package com.project.sustainability.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Validation {

    private String validationQuestionId;
    private String type;
    private List<String> relatedIds;

}
