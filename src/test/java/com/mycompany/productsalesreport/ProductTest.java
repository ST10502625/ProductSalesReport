package com.mycompany.productsalesreport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
    Product product = new Product(products, sales);

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(153, product.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(17.0, product.GetAverageProductSold(), 0.01);
    }
}
