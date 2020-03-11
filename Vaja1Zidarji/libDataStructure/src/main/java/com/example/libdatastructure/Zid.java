package com.example.libdatastructure;

import java.util.ArrayList;
import java.util.Collections;

public class Zid implements Tehtljiv{
    private String ime;
    ArrayList<Zidak> lista;

    public Zid(String ime) {
        this.ime = ime;
        lista = new ArrayList<>();
    }

    public void add(Zidak a) {
        lista.add(a);
    }

    public int size() {
        return lista.size();
    }

    public String getName() {
        return ime;
    }

    @Override
    public String toString() {
        return "Zid{" +
                "ime='" + ime + '\'' +
                ", lista=" + lista +
                '}';
    }

    public void sort() {
        Collections.sort(lista);
    }

    public void sortPoTipu() {
        Collections.sort(lista, new Zidak.CompareTip());
    }

    public void zmesaj() {
        Collections.shuffle(lista);
    }

    @Override
    public double getTeza() {
        double teza=0;
        for (Zidak z:lista) teza+=z.getTeza();
        return teza*1.1;
    }
}
