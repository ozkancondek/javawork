package com.example.github.oo.ex13;

public class Product {

    //define variables
    String name;
    String category;
    double price;
    int stockCount;
    int productNumber;

    //define constructor
    public Product(String name,
                   String category,
                   double price,
                   int stockCount,
                   int productNumber) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockCount = stockCount;
        this.productNumber = productNumber;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }





}
