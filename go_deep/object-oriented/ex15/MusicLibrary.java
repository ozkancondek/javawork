package com.example.github.oo.ex15;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
    //define variables
        ArrayList<Song> myCollection;
    //constructor
    public MusicLibrary(){
        this.myCollection = new ArrayList<Song>();
    }

    //getter and setter
    public ArrayList<Song> getMyCollection() {
        return myCollection;
    }

    public void setMyCollection(Song song) {
          myCollection.add(song);
    }

    public Song getRandomSong(){
        Random rand = new Random();
        int size = myCollection.size();
        int index = rand.nextInt(size);
        return myCollection.get(index);
    }

    public void getInfo(){
        if (!myCollection.isEmpty()){
            for (Song song : myCollection){
                System.out.println(song.getName());
            }
        }else {
            System.out.println("Collection is empty");
        }

    }
}
