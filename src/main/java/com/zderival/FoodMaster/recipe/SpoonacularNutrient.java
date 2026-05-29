package com.zderival.FoodMaster.recipe;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@lombok.Getter
@lombok.Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpoonacularNutrient {
    private String name;
    private double amount;
}
