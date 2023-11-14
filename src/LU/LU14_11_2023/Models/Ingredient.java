package LU.LU14_11_2023.Models;

public class Ingredient {
    private String name;
    private double amount;
    private String unitOfMeasure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void convertQuantity(double amount, String name, String unitOfMeasure) {

    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", unitOfMeasure='" + unitOfMeasure + '\'' +
                '}';
    }

    public Ingredient(String name, double amount, String unitOfMeasure) {
        this.name = name;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
    }
}
