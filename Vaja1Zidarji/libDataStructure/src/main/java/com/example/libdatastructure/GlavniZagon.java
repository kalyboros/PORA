package com.example.libdatastructure;

import java.awt.Color;
import java.util.ArrayList;

public class GlavniZagon {
    //psvm+TAB
    public static void main(String[] args) {
        //sout+TAB
        try {

            Zidak a = new Zidak(1.1, 2);
            BarvniZidak b = new BarvniZidak(1.2, 0, new Color(100, 100, 0));
            Zidak c = new Zidak(0.5, 1);
            System.out.println("Dela:" + a);
            Zid berlinski = new Zid("Berlinski");
            berlinski.add(a);
            berlinski.add(b);
            berlinski.add(c);
            System.out.println("Zid " + berlinski.getName() + " vsebuje:" + berlinski.size());
            System.out.println("Vsebina:" + berlinski.toString());
            berlinski.sort();
            System.out.println("Vsebina:" + berlinski.toString());
            berlinski.zmesaj();
            berlinski.sortPoTipu();
            ArrayList<Tehtljiv> vseKarTehta = new ArrayList<>();
            vseKarTehta.add(berlinski);
            vseKarTehta.add(a);
            //..
            System.out.println("Vsebina:" + berlinski.toString());
            c.setTeza(c.getTeza() - 10);
        } catch (IzjemaNegativnaTeza e) {
            System.out.println("Napačna teža! Naj bo pozitivna");
        }
    }
}
