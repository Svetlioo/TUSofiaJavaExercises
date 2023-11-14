package LU.LU14_11_2023.Models;

import java.util.ArrayList;

public class Appetizer extends Recipe {
    public Appetizer(String name, String description, ArrayList<Ingredient> ingredients, ArrayList<String> instructions, double rating, ArrayList<String> reviews) {
        super(name, description, ingredients, instructions, rating, reviews);
    }
}
