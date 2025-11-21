/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author buddh
 */
public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // View products
    public List<Product> viewProducts() {
        return products;
    }

    // Search product by name or ID
    public List<Product> searchProducts(String keyword) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(keyword) || String.valueOf(product.getId()).contains(keyword)) {
                result.add(product);
            }
        }
        return result;
    }

    // Delete product by ID
    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}

