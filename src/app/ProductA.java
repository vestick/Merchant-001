package app;


public class ProductA extends Product implements Sales {

    int qnty;
    double price;
    double weight;

    public ProductA(String name, int qnty, double price, double weight) {
        super(name);
        this.qnty = qnty;
        this.price = price;
        this.weight = weight;
    }

    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        String totalWeight = Rounder.roundValue(calcWeight(qnty, weight));
        return "Product: " + name + "\nSales (USD): " + resultSale+"\nTotal weight (KG): "+ totalWeight;
    }



    @Override
    public double calcSales(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double calcWeight(int quantity, double weight) {
        return quantity * weight;
    }
}
