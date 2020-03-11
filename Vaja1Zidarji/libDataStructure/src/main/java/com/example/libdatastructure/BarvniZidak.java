package com.example.libdatastructure;

import java.awt.Color;

public class BarvniZidak extends Zidak {
    private Color barva;
    public BarvniZidak(double teza, int tip, Color a) throws IzjemaNegativnaTeza {
        super(teza, tip);
        barva = a;
    }

    @Override
    public String toString() {
        return "BarvniZidak{" +
                "barva=" + barva +
                "teza=" + teza +
                ", tip=" + tip +'}';
    }
}
