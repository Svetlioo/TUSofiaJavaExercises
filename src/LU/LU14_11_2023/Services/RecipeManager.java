package LU.LU14_11_2023.Services;

import LU.LU14_11_2023.Models.Recipe;

import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<Recipe> recipes;

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void editRecipe(Recipe oldRecipe, Recipe newRecipe) {
        this.recipes.remove(oldRecipe);
        this.recipes.add(newRecipe);
    }

    public void deleteRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }

    public Recipe searchRecipesByName(String name) {
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().equalsIgnoreCase(name)) {
                return recipe;
            }
        }

        return null;
    }

    public void rateRecipe(Recipe recipe, double rating) {
        recipe.setRating(rating);
    }
    public void addReview(Recipe recipe, String review){
        recipe.getReviews().add(review);
    }
}
