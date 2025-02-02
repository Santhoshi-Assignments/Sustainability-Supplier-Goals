package com.project.sustainability.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class InputField {

    private String inputId;
    private String label;
    private String inputType;
    private boolean isMandatory;
    private String minValue;
    private String maxValue;
    private List<String> options; // For dropdown

}
