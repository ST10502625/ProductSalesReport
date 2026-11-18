package com.mycompany.productsalesreport;

public class PrintProduct {

    public void PrintTotalProductSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales(Product product) {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    public void PrintMostPopularProduct(Product product) {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}