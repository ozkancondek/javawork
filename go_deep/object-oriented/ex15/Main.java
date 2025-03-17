package com.example.github.oo.ex15;

public class Main {

    public static void main(String[]args){
        Song song1 = new Song("abc",12,"EN");
        Song song2 = new Song("abcd",123,"DE");
        Song song3 = new Song("abcde",1234,"FR");
        MusicLibrary myLib = new MusicLibrary();
        myLib.setMyCollection(song1);
        myLib.setMyCollection(song2);
        myLib.setMyCollection(song3);

        System.out.println(myLib.getMyCollection());
        System.out.println(myLib.getRandomSong().getName());
    }
}
