package app;


public class ProductA extends Product implements Sales {

    int qnty;
    double price;
    String placeOfDelivery;

    public ProductA(String name, int qnty, double price, String placeOfDelivery) {
        super(name);
        this.qnty = qnty;
        this.price = price;
        this.placeOfDelivery = placeOfDelivery;
    }

    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Product: " + name +"  ||  Place of delivery: "+placeOfDelivery+"\nSales (USD): " + resultSale;
    }

    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }
}
