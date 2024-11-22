/*
another expectation
*/

/*
Java Interface: Exercise-10 with Solution
Write a Java program to create an interface Encryptable with methods encrypt
(String data) and decrypt (String encryptedData) that define encryption and decryption operations. 
Create two classes AES and RSA that implement the Encryptable interface and provide their own encryption and decryption algorithms.
*/


// Method Interface
public interface Method {
    void add(String item);  // add methodu
    void remove(String item);  // remove methodu
}

// Example Sınıfı, Method interface'ini implement ediyor
import java.util.ArrayList;
import java.util.List;

public class Example implements Method {
    private List<String> items;  // List, içinde öğeleri saklayacak değişken

    public Example() {
        this.items = new ArrayList<>();
    }

    // add metodu
    @Override
    public void add(String item) {
        items.add(item);  // Listeye öğe ekler
        System.out.println(item + " added.");
    }

    // remove metodu
    @Override
    public void remove(String item) {
        if (items.contains(item)) {
            items.remove(item);  // Öğeyi listeden çıkarır
            System.out.println(item + " removed.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Listeyi yazdırmak için bir metod
    public void printItems() {
        System.out.println("Items in list: " + items);
    }

    // Main metodu, örnek kullanım
    public static void main(String[] args) {
        Example example = new Example();
        example.add("Apple");
        example.add("Banana");
        example.printItems();
        
        example.remove("Apple");
        example.printItems();
        
        example.remove("Orange");
    }
}
