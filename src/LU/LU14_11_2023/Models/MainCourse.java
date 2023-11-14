package LU.LU14_11_2023.Models;

import java.util.ArrayList;

public class MainCourse extends Recipe{
    public MainCourse(String name, String description, ArrayList<Ingredient> ingredients, ArrayList<String> instructions, double rating, ArrayList<String> reviews) {
        super(name, description, ingredients, instructions, rating, reviews);
    }
}
