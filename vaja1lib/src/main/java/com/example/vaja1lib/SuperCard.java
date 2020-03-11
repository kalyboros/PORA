package com.example.vaja1lib;

public class SuperCard {
    protected String name;
    protected int attack;
    protected int defense;
    protected double lifecost;
    protected char effect;

    public SuperCard(String name, int attack, int defense, double lifecost, char effect) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.lifecost = lifecost;
        try {
            if(effect == 'x') {
                throw new WrongEffectException();
            }
            else
                this.effect = effect;

        }catch (WrongEffectException e){}
        System.out.println(name.toString());
    }

    @Override
    public String toString() {
        return "SuperCard{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", lifecost=" + lifecost +
                ", effect=" + effect +
                '}';
    }
}
