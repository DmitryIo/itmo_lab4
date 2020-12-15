package com;

public class Human implements Creature {

    String name;
    Place home;
    Boolean scared; // true/false
    Integer howLoud;
    public Human(String name, Place place, Integer howLoud){
        this.name = name;
        this.home = place;
        this.howLoud = howLoud;
    }

    @Override
    public void makeNoise() {
        if( this.scared == Boolean.TRUE) {
            String s = new String(new char[this.howLoud]).replace("\0", "ААА! БОЮСЬ!");
            System.out.println(this.name + " кричит: " + s);
        }
        else {
            System.out.println("Я человек!");
        }
    }

    @Override
    public void setIsInFurniture(Boolean s) {}
    protected void setScared(Boolean flag, Integer value){
        this.scared = flag;
        this.howLoud = value;
    }
    @Override
    public String toString(){
        return String.format(this.name);
    }

}
