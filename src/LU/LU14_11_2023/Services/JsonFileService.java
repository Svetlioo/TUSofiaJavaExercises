package LU.LU14_11_2023.Services;

import LU.LU14_11_2023.Models.Recipe;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonFileService implements JsonSerializable<Recipe> {
    @Override
    public Map<Long, Recipe> loadFromJson() {
        File file = new File("src/LU/LU14_11_2023/Services/recipes.json");
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(file)) {
            if (file.exists()) {
                Recipe[] recipes = gson.fromJson(reader, Recipe[].class);
                Map<Long, Recipe> recipeMap = new HashMap<>();
                for (Recipe recipe : recipes) {
                    boolean itemExists = recipeMap.values().stream().anyMatch(existingItem -> existingItem.equals(recipe));
                    if (!itemExists) {
                        long itemId = recipe.getId();
                        recipeMap.put(itemId, recipe);
                    } else {
                        System.out.println("Recipe with the same id already exists, skipping: " + recipe);
                    }
                }
                return recipeMap;
            } else {
                return new HashMap<>();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveToJson(Map<Long, Recipe> map) {
        File file = new File("src/LU/LU14_11_2023/Services/recipes.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(file)) {
            Recipe[] recipes = map.values().toArray(new Recipe[0]);
            gson.toJson(recipes, writer);
            System.out.println("Java objects successfully saved to Json file!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
