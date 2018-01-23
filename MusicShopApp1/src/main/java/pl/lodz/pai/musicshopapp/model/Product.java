/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.pai.musicshopapp.model;

/**
 *
 * @author Paweł
 */
public class Product {

    private int productId;    
    private String name;
    private int amount;
    private double price;
    private String description;
    
    public Product() {
        
    }
    
    public Product(int productId, String name, int amount, double price, String description) {
        this.productId = productId;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.description = description;
    }
    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
