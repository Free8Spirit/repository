// Author: Vert, David  9/11/2018
// sub
//package stocktestapp;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    
    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        double x = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        return x;
    }
}
