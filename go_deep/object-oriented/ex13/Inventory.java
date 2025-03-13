package com.example.github.oo.ex13;

import java.util.ArrayList;
import java.util.Objects;

public class Inventory {
    //define variables
    ArrayList<Product> collection;

    //constructor and initialization
    public Inventory() {
        collection = new ArrayList<>();
    }

    public void modifyToCollection(Product product, String method){
        if(Objects.equals(method, "add")){
            collection.add(product);
        }else if (Objects.equals(method, "remove")){
            collection.remove(product);
        }else {
            System.out.println("Give a reasonable command");
        }
    }

    public void getCollectionInfo(){
        if (collection.isEmpty()){
            System.out.println("No product in Inventory");
        }else {
        for (Product product : collection){
            System.out.println("Information for the product "+product.getName());
            System.out.println("Category: "+product.getCategory());
            System.out.println("Price: "+product.getPrice());
            System.out.println("Stock count: "+product.getStockCount());
            System.out.println("Product number: "+product.getProductNumber());
        }
        }
    }
    }
