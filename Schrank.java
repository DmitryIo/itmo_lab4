package com;
import java.lang.reflect.*;
public class Schrank extends Furniture{

    protected Status status = Status.OFF;
    protected Ghost sitting_creature = null;
    public Schrank(Material material, Double width, Double height, Color color, String name){
        super(material, width, height, color, name);
    }
    protected void openDors() {
        if (this.status == Status.ON) {
            System.out.println("Двери у шкафа " + this.name + " и так открыты");
        } else {
            this.status = Status.ON;
        }
    }
    protected void closeDors(){
            if (this.status == Status.OFF){
                System.out.println("Двери у шкафа " + this.name + " и так закрыты");
            }
            else{
                this.status = Status.OFF;
            }
        }

    protected void setInto(Ghost creature) {
        if ((this.status == Status.ON) && (creature.height <= this.height) && (creature.width <= this.width)) {
            sitting_creature = creature;
            creature.setIsInFurniture(Boolean.TRUE);
        } else {
            System.out.println("Не могу посадить внутрь существо! Вот мой статус:");
            printStatus();
        }
    }
    protected void printStatus(){
            Class c = this.getClass();
            Field[] fields = c.getDeclaredFields();
            for (int i = 0; i < fields.length; i++){
                System.out.println("Field (" +(i+1)+ ")" + fields[i].toString()); //get the field and convert into string
            }
        }
    protected Ghost setOut(){
        Ghost temp = this.sitting_creature;
        temp.setIsInFurniture(Boolean.FALSE);
        this.sitting_creature = null;
        return temp;
    }
    @Override
    public String toString(){
        return String.format(this.name);
    }
}
