package com.springframework.recipeapp.services;

import com.springframework.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
