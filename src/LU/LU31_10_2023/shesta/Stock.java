package LU.LU31_10_2023.shesta;

public class Stock {
    private String name;
    private double currentPrice;

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
