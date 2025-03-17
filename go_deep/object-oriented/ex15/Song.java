package com.example.github.oo.ex15;

public class Song {
    //define variables
    String name;
    int number;
    String lang;

    //define constructor
    public Song(String name,
                int number,
                String lang) {
        this.name = name;
        this.number = number;
        this.lang = lang;
    }

    //modifiers
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}
