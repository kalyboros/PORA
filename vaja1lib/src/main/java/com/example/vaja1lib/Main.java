package com.example.vaja1lib;

public class Main {
    public static void main(String[] args) {

            Card Pawn = new Card("Pawn", 1, 1, 0.5);
            Card Bishop = new Card("Bishop", 3, 1, 0.5);
            Card Knight = new Card("Knight", 2, 2, 0.5);
            Card Ogre = new Card("Ogre", 4, 4, 1);
            Card Troll = new Card("Troll", 5, 3, 1);
            Card Dragon = new Card("Dragon", 7, 7, 1.5);
            System.out.println("Izpis ene karte");
            System.out.println(Pawn.toString());

            System.out.println("Primerjanje napada dveh kart z compaarable");
            System.out.println("Bishop z 3 vs Knight z 2 (3-2)= " + Bishop.compareTo(Knight));

            Deck Moj = new Deck("Beginner");
            try {
                Moj.add(Pawn);
                Moj.add(Bishop);
                Moj.add(Knight);
                Moj.add(Ogre);
                Moj.add(Troll);
                Moj.add(Dragon);
                if((Moj.deck_list.size())>8){//tu spremeni cifro za demonstracijo
                    throw new tooBig();
                }
            } catch (tooBig e){
            System.out.println(e.toString());
        }
            //System.out.println("Hello world");
            System.out.println("Izpis celega kupcka");
            System.out.println(Moj.toString());

            SuperCard Queen = new SuperCard("Queen", 10, 8, 2, 'h');//heal
            SuperCard King = new SuperCard("King", 10, 10, 4, 'd');//destroy
            SuperCard Tower = new SuperCard("Tower", 0, 18, 3, 's');//shield

            SideDeck BeginnerSide = new SideDeck(0);
            BeginnerSide.add(Queen);
            BeginnerSide.add(King);
            BeginnerSide.add(Tower);

            System.out.println("Izpis dodatnega kupcka");
            System.out.println(BeginnerSide.toString());

            Player Jaz = new Player("Dalibor", 21);
            Jaz.addp(Moj);
            Jaz.adds(BeginnerSide);
            System.out.println("Izpis igralcevih lastnosti");
            System.out.println(Jaz.toString());

            System.out.println("Sortiranje po attacku");
            Moj.sort();
            System.out.println(Moj.toString());
            Moj.sortDefense();
            System.out.println(Moj.toString());

            System.out.println("Izpis abstraktne metode ki pove size arraya: ");
            System.out.println(Moj.size());

            System.out.println("konstruktor kjer je mlajsi kot 18");
            Player Youngster = new Player("Dalibor", 14);


    }
}
