package com.mycompany.productsalesreport;

import java.util.Scanner;

public class ProductSalesApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single-dimensional array
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};

        // Two-dimensional array: 3 products x 3 months
        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(products, sales);
        PrintProduct print = new PrintProduct();

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("********************************************");
        System.out.println();
        print.PrintTotalProductSales(product);
        print.PrintAverageProductSales(product);
        print.PrintMostPopularProduct(product);
    }
}