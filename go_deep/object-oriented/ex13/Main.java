package com.example.github.oo.ex13;

public class Main {
    public static void main(String[]args){
        //create a Product
        Product shoe = new Product("Snickers","Shoe",25.99,5,3507);
        Product shirt = new Product("Shirt","Textile",12.99,3,1234);
        //add them do inventory
        Inventory myStore = new Inventory();
        myStore.modifyToCollection(shoe,"add");
        myStore.modifyToCollection(shirt,"add");
        //get all product infos from the store
        myStore.getCollectionInfo();

        //modify Product
        shoe.setProductNumber(77777);

        myStore.getCollectionInfo();
    }
}
