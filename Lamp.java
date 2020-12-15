package com;

public class Lamp extends Furniture {

    protected Status status = Status.OFF;
    public Lamp(Material material, Double width, Double height, Color color, String name){
        super(material, width, height, color, name);
    }
    protected void turnOn(){
        if (this.status == Status.ON) {
            System.out.println("Лампа " + this.name + " уже горит");
        } else {
            this.status = Status.ON;
        }
    }
    protected void turnOff(){
        if (this.status == Status.OFF) {
            System.out.println("Лампа " + this.name + " уже горит");
        } else {
            this.status = Status.OFF;
        }
    }
    @Override
    public String toString(){
        return String.format(this.name);
    }

}
