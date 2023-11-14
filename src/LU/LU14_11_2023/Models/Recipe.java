package LU.LU14_11_2023.Models;

import java.util.ArrayList;
import java.util.Objects;

public class Recipe {
    protected String name;
    protected String description;
    protected ArrayList<Ingredient> ingredients;
    protected ArrayList<String> instructions;
    protected double rating;
    protected ArrayList<String> reviews;
    protected long id;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void addIngredients(Ingredient ingridient) {
        this.ingredients.add(ingridient);
    }

    public void removeIngredients(Ingredient ingridient) {
        this.ingredients.remove(ingridient);
    }

    public void addInstruction(String instruction) {
        this.instructions.add(instruction);
    }

    public void removeInstruction(String instruction) {
        this.instructions.remove(instruction);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public double getRating() {
        return rating;
    }

    public Recipe(String name, String description, ArrayList<Ingredient> ingredients, ArrayList<String> instructions, double rating, ArrayList<String> reviews) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.rating = rating;
        this.reviews = reviews;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    public void setReviews(ArrayList<String> reviews) {
        this.reviews = reviews;
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    public void removeReview(String review) {
        this.reviews.remove(review);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return id == recipe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
