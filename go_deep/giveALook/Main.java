package com.example.github.oo.giveALook;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // 1. Yeni bir kişi oluştur (içi boş)
        Person p = new Person();

        // 2. Listeye ekle (henüz ismi yok!)
        people.add(p);

        // 3. İsmi daha sonra ata
        p.name = "Özkan";

        // 4. Listeye bak: Değişti mi?
        System.out.println("Listedeki kişinin ismi: " + people.get(0).name);
    }
}


//Çünkü Java’da:
//
//        people.add(p); dediğimizde listeye p nesnesinin kendisi değil, onun adresi (referansı) eklenir.
//
//Sonra p.name = "Özkan" yaptığımızda bu adresin gösterdiği nesne değiştiği için, liste içindeki kişi de güncellenmiş olur.