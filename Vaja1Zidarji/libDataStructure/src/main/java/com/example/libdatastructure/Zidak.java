package com.example.libdatastructure;

import java.util.Comparator;

public class Zidak implements Tehtljiv, Comparable<Zidak> {
    protected double teza;
    protected int tip;

    public void setTeza(double teza) throws IzjemaNegativnaTeza {
        if (teza<0) throw  new IzjemaNegativnaTeza();
        this.teza = teza;
    }

    public Zidak(double teza, int tip) throws IzjemaNegativnaTeza {
       setTeza(teza);
        this.tip = tip;
    }

    @Override
    public double getTeza() {
        return teza;
    }

    static class CompareTip implements Comparator<Zidak> {
        @Override
        public int compare(Zidak t0, Zidak t1) {
            return t0.tip-t1.tip; //lahko s pomočjo treh ifov
        }
    }

    @Override
    public String toString() {
        return "Zidak{" +
                "teza=" + teza +
                ", tip=" + tip +
                '}';
    }

    @Override
    public int compareTo(Zidak zidak) {
        if (teza>zidak.teza) return 1;
        if (teza<zidak.teza) return -1;
        return 0;
    }
}
