package com.example.vaja1lib;

import java.util.ArrayList;

public class Player implements Lifepoints{
    protected String name;
    protected  int age;
    protected double health;
    ArrayList<Deck> pDeck;
    ArrayList<SideDeck>sDeck;

    public Player(String name, int age) {
        try {
            if (age < 18) {
                throw new Underaged();
            } else {
                this.name = name;
                this.age = age;
                pDeck = new ArrayList<>();
                sDeck = new ArrayList<>();
            }
        } catch (Underaged e){
            //System.out.println("Premladi ste za sodelovanje");
            System.out.println(e.toString());
        }
    }

    public void addp(Deck a){
        pDeck.add(a);
    }

    public void adds(SideDeck a){
        sDeck.add(a);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pDeck=" + pDeck +
                ", sDeck=" + sDeck +
                '}';
    }

    @Override
    public double setHP() {
        this.health = 15;
        return this.health;
    }
/*
    @Override
    public int returnSize() {//vraca dolzino cesa?
        return 0;
    }
*/
}
