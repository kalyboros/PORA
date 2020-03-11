package com.example.vaja1lib;

import java.util.ArrayList;

public class SideDeck {
    protected int count;
    ArrayList<SuperCard>sideDeck_list;

    public SideDeck(int count){//vprasaj zakaj konstruktor nena sam da vsehj not
        this.count=count;
        sideDeck_list = new ArrayList<>();
    }

    public void add(SuperCard a){
        sideDeck_list.add(a);
        count++;
    }

    @Override
    public String toString() {
        return "SideDeck{" +
                "count=" + count +
                ", sideDeck_list=" + sideDeck_list +
                '}';
    }
}
