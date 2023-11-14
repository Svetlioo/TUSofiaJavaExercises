package LU.LU14_11_2023;

import LU.LU14_11_2023.Models.Dessert;
import LU.LU14_11_2023.Models.Ingredient;
import LU.LU14_11_2023.Models.Recipe;
import LU.LU14_11_2023.Services.JsonFileService;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ingredient ingredient = new Ingredient("cacao", 250, "grama");
        String instruction = "slagaite vsichko";
        String review = "dobro e";
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient);
        ArrayList<String> reviews = new ArrayList<>();
        reviews.add(review);
        ArrayList<String> instructions = new ArrayList<>();
        instructions.add(instruction);
        Recipe recipe = new Dessert("Shokolad", "nqkvo opisanie", ingredients, instructions, 10, reviews);
        JsonFileService IO = new JsonFileService();
        Map<Long, Recipe> recipes = IO.loadFromJson();
        recipes.put(recipe.getId(), recipe);
        recipe.addInstruction("nova instrukciq");
//        recipe.removeInstruction("nova instrukciq");
        recipe.addIngredients(new Ingredient("smetana", 5, "kg"));
        recipe.addReview("dobro e men me kefi");
//        recipe.addReview("ne stava");
        recipe.removeReview("ne stava");
        IO.saveToJson(recipes);


    }
}
