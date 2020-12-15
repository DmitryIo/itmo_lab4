package com;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Field;

public class Ghost implements Creature{
    Dress wear;
    String name;
    Color color;
    Place home;
    Double width;
    Double height;
    Status status = Status.OFF; // в полете или нет
    Boolean isInFurniture = Boolean.FALSE;
    Integer strength;
    @Override
    public void makeNoise() {
        this.Moan();
        System.out.println("Бу!!!");
    }
    public Ghost(Dress wear,String name, Color color, Place home, Double width, Double height){
        this.wear = wear;
        this.name = name;
        this.color = color;
        this.home = home;
        this.width = width;
        this.height = height;
        this.strength = 0;
    }
    protected void Fly(){
        if (isInFurniture == Boolean.FALSE){
            this.status = Status.ON;
            System.out.println(this.name + " находится в полете");
        }
        else{
            System.out.println(this.name + " не может взлететь, так как в чем-то сидит!");
            printStatus();
        }
    }
    protected void Moan(){
        if (this.isInFurniture == Boolean.TRUE){
        System.out.println("Мммм-ы-ычание");
        }
    }
    protected void Circle(Lamp lamp){
        if (this.status == Status.ON){
            //this.status = Status.OFF;
            this.strength += 1;
            if (lamp.status == Status.ON){
                System.out.println(this.name + " кружится вокруг включенной лампы " + lamp.name);
            }
            else{
                System.out.println(this.name + " кружится вокруг выключенной лампы " + lamp.name);
            }
        }
    }
    protected void Scare(Human human){
        human.setScared(Boolean.TRUE, this.strength);
    }
    @Override
    public void setIsInFurniture(Boolean s){
        this.isInFurniture = s;
    }
    protected void printStatus(){
        Class c = this.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            System.out.println("Field (" +(i+1)+ ")" + fields[i].toString()); //get the field and convert into string
        }
    }

    @Override
    public boolean equals(Object o){
        if( o == this){return true;}
        if (o == null || o.getClass() != this.getClass()){return false;}
        Ghost ghost = (Ghost) o;
        if (ghost.name == this.name){return true;}
        else {return false;}
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.name == null)? 0: this.name.hashCode());
        result = (int) (prime * result
                + this.width + this.height);
        return result;
    }
    @Override
    public String toString(){
        return String.format(this.name+ " " + this.home.toString());
    }

    protected void openDors(Schrank schrank){
        System.out.println("Приведение "+ this.name + " открыло дверцы шкафа");
        schrank.openDors();
    }
    protected void closeDors(Schrank schrank){
        System.out.println("Приведение "+ this.name + " закрыло дверцы шкафа");
        schrank.closeDors();
    }
    protected void setInto(Schrank schrank){
        schrank.setInto(this);
    }
//    protected void setOut(Schrank schrank){
//        schrank.setOut();
//    }
}
