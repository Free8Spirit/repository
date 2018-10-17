// Author: Vert, David  9/11/2018
//package stocktestapp;

public class StockTestApp {

    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.name = "Oracle Corporation";
        stock.symbol = "ORCL";
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        
        String message = ("The percentage change is: " + stock.getChangePercent(stock.previousClosingPrice, stock.currentPrice) + "%.");
        
        System.out.println(message);
    }
    
}
