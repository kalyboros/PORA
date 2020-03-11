package com.example.vaja1lib;


import java.util.ArrayList;
import java.util.Collections;

public class Deck implements Sizeable{
    private String deckName;
    ArrayList<Card>deck_list;

    public Deck(String deck_name){
        this.deckName =deck_name;
        deck_list = new ArrayList<>();
    }

    public void add(Card a){
        deck_list.add(a);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckName='" + deckName + '\'' +
                ", size=" + deck_list.size() +
                '}';
    }

    //premesa/sortira deck
    public void sort(){
        Collections.sort(deck_list);
    }

    public void shuffle(){
        Collections.shuffle(deck_list);
    }

    //sortira po defensu, funkcije implements tam
    public void sortDefense(){
        Collections.sort(deck_list, new Card.CompareDefense());
    }


    @Override
    public int size() {
        return deck_list.size();
    }
}


