package com;

import java.lang.reflect.Field;

public class FairyTail {
    Schrank schrank;
    Lamp lamp;
    Ghost ghost;
    Tailor tailor;
    Human Frenken;
    Integer howScarable;
    public FairyTail(Schrank schrank, Lamp lamp, Ghost ghost, Tailor tailor, Human Frenken, Integer howScarable){
        this.schrank = schrank;
        this.lamp = lamp;
        this.ghost = ghost;
        this.tailor = tailor;
        this.Frenken = Frenken;
        this.howScarable = howScarable;
    }
    public FairyTail(Integer howScarable){
        this.schrank = new Schrank(Material.WOOD, 100.0, 100.0, Color.BLUE, "Шкаф_1");
        this.lamp = new Lamp(Material.GLASS, 50.0, 60.0, Color.WHITE, "Люстра_1");
        Dress dress = new Dress(Material.CLOTH, Color.MAGENTA);
        this.ghost = new Ghost(dress, "Страшило", Color.WHITE, Place.VAZOSTAN, 80.0, 80.0);
        this.tailor = new Tailor("Малыш", Place.DJURGARTEN);
        this.Frenken = new Human("Френкен Бок", Place.KUNDIHOLMEN, 1);
        this.howScarable = howScarable;
    }
    public FairyTail(){ this.howScarable = 1; }
    protected void go(){
        Class c = this.getClass();
        Field[] fields = c.getDeclaredFields();
        for (int i = 0; i < fields.length; i++){
            try{
                if(!fields[i].isAccessible()){
                    fields[i].setAccessible(true);
                }
                Object value = fields[i].get(this);
                if (value == null) {
                    throw new creatingException("The field is null");
                }
            }
            catch (IllegalAccessException ex){
                System.out.println("Не удается получить доступ к полю: " + fields[i].getName());
                System.exit(-1);
            }
            catch (creatingException ex){
                System.out.println("Отсутствует заполненное поле: " + fields[i].getName());
                System.exit(-1);
            }
        }

        this.ghost.openDors(this.schrank);
        this.ghost.setInto(this.schrank);
        this.ghost.closeDors(this.schrank);

        this.ghost.Fly(); // выводит то, что приведение не может взлететь

        this.ghost.openDors(this.schrank);
        this.ghost = this.schrank.setOut();
        this.ghost.closeDors(this.schrank);

        this.ghost.Fly();

        this.ghost.Circle(this.lamp);
        this.ghost.makeNoise();
        this.lamp.turnOn();
        this.ghost.Scare(tailor);

        for (int i = 0; i < this.howScarable; i++){
            this.ghost.Circle(this.lamp);
            this.ghost.makeNoise();
        }


        this.ghost.Scare(this.Frenken);
        this.Frenken.makeNoise();
        this.tailor.makeNoise();

        this.lamp.turnOff();


    }
    protected void addHero(Creature hero){
        if ((hero instanceof Tailor) == true){
            this.tailor = (Tailor)hero;
        }
        else if ((hero instanceof Human) == true){
            this.Frenken = (Human)hero;
        }
        else if ((hero instanceof Ghost) == true){
            this.ghost = (Ghost)hero;
        }
    }
    protected void addFurniture(Furniture furn){
        if ((furn instanceof Schrank) == true){
            this.schrank = (Schrank) furn;
        }
        if ((furn instanceof Lamp) == true){
            this.lamp = (Lamp) furn;
        }
    }
    public class creatingException extends Exception{
        public creatingException(String message){
            super(message);
        }
    }
    protected void setScared(Integer howScarable){
        this.howScarable = howScarable;
    }


}
