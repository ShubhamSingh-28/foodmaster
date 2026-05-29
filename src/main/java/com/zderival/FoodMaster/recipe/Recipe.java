package com.zderival.FoodMaster.recipe;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@lombok.Getter
@lombok.Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {
    @JsonProperty("id")
    private int spoonacularId;
    private String title;
    @JsonProperty("extendedIngredients")
    private List<Ingredient> ingredients;
    private String instructions;
    @JsonProperty("cuisines")
    private List<String> cuisines;
    private int readyInMinutes;
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private List<String> dietaryInfo;

    @JsonProperty(value = "nutrition", access = JsonProperty.Access.WRITE_ONLY)
    private SpoonacularNutrition spoonacularNutrition;

    @JsonProperty(value = "nutrition", access = JsonProperty.Access.READ_ONLY)
    private Nutrition nutrition;
}
