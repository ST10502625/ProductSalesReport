package com.mycompany.productsalesreport;

public class Product implements IProduct {

    private String[] products;
    private int[][] sales; // [product][month]

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total; // 153 with sample data
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = sales.length * sales[0].length; // 3 x 3 = 9
        return (double) total / count; // 153 / 9 = 17.0
    }

    @Override
    public String GetMostPopularProduct() {
        // Most popular = highest SINGLE month sale
        // Sample: 25 is highest, belongs to Cozy Nights Monarch
        int max = sales[0][0];
        String popular = products[0];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > max) {
                    max = sales[i][j];
                    popular = products[i];
                }
            }
        }
        return popular + "(" + max + ")"; // Cozy Nights Monarch(25)
    }
}