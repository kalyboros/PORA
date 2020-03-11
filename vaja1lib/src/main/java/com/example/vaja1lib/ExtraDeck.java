package com.example.vaja1lib;

public class ExtraDeck extends Deck{
    private int extraDeckSize;

    public ExtraDeck(String deck_name, int extraDeckSize) {
        super(deck_name);
        this.extraDeckSize = extraDeckSize;
    }
}
