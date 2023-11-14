//package LU.LU14_11_2023.Services;
//
//import LU.LU14_11_2023.Models.Ingredient;
//import LU.LU14_11_2023.Models.Recipe;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class FileService {
//    public static void saveRecipesToFile(List<Recipe> recipes, String filePath) {
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/LU/LU14_11_2023/Services/recipes.json"))) {
//            for (Recipe recipe : recipes) {
//                bufferedWriter.write(toCSV(recipe));
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//    }
//
//    public static List<Recipe> loadRecipesFromFile(String filePath) {
//        List<Recipe> recipes = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] data = line.split(",");
//                Recipe recipe = new Recipe(data[0], data[1], );
//                recipes.add(recipe);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return recipes;
//    }
//
//    public static String toCSV(Recipe recipe) {
//        StringBuilder csvString = new StringBuilder();
//
//        csvString.append(recipe.getName()).append(",")
//                .append(recipe.getDescription()).append(",")
//                .append(recipe.getRating()).append(",");
//
//        for (Ingredient ingredient : recipe.getIngredients()) {
//            csvString.append(ingredient.toString()).append(";");
//        }
//        csvString.append(",");
//        for (String instruction : recipe.getInstructions()) {
//            csvString.append(instruction).append(";");
//        }
//        csvString.append(",");
//        for (String review : recipe.getReviews()) {
//            csvString.append(review).append(";");
//        }
//        if (!csvString.isEmpty()) {
//            csvString.setLength(csvString.length() - 1);
//        }
//
//        return csvString.toString();
//    }
//
//    public static Recipe fromCSV(String csvData) {
//        String[] data = csvData.split(",");
//        Recipe recipe = new Recipe(data[0], data[1]);
//        recipe.setRating(Double.parseDouble(data[2]));
//
//        ArrayList<Ingredient> ingredients = Arrays.stream(data[3].split(";"))
//                .map(Ingredient::new)
//                .collect(Collectors.toList());
//        recipe.setIngredients(ingredients);
//
//        ArrayList<String> instructions = (ArrayList<String>) Arrays.asList(data[4].split(";"));
//        recipe.setInstructions(instructions);
//
//        ArrayList<String> reviews = (ArrayList<String>) Arrays.asList(data[5].split(";"));
//        recipe.setReviews(reviews);
//
//        return recipe;
//    }
//}

