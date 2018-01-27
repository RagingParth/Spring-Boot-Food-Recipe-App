package com.springframework.recipeapp.repositories;

import com.springframework.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
