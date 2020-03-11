package com.example.vaja1lib;

import java.util.Comparator;

public class Card implements Comparable<Card>{
    protected String name;
    protected int attack;
    protected int defense;
    protected double lifecost;

    public Card(String name, int attack, int defense, double lifecost) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.lifecost = lifecost;
    }

    public int compareTo(Card a){//vrne razliko med napadalnimi tockami
        return this.attack-a.attack;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", lifecost=" + lifecost +
                '}';
    }

    static class CompareDefense implements Comparator<Card> {
        @Override
        public int compare(Card t0, Card t1){
            return t0.defense-t1.defense;
        }
    }


}
