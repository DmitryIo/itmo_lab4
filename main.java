package com;

public class main {
    public static void main(String[] args){
//        FairyTail fairy = new FairyTail(3);
//        fairy.go();

        Schrank schrank = new Schrank(Material.WOOD, 100.0, 100.0, Color.BLUE, "Шкаф_1");
        Lamp lamp = new Lamp(Material.GLASS, 50.0, 60.0, Color.WHITE, "Люстра_1");
        Dress dress = new Dress(Material.CLOTH, Color.MAGENTA);
        Ghost ghost = new Ghost(dress, "Страшило", Color.WHITE, Place.VAZOSTAN, 80.0, 80.0);
        Tailor tailor = new Tailor("Малыш", Place.DJURGARTEN);
        Human Frenken = new Human("Френкен Бок", Place.KUNDIHOLMEN, 1);

        FairyTail fairy = new FairyTail();

        fairy.addHero(ghost);
        fairy.addHero(tailor);
        fairy.addHero(Frenken);
        fairy.addFurniture(lamp);
        fairy.addFurniture(schrank);
            fairy.setScared(2);

        fairy.go();
























//        Schrank schrank = new Schrank(Material.WOOD, 100.0, 100.0, Color.BLUE, "Шкаф_1");
//        Lamp lamp = new Lamp(Material.GLASS, 50.0, 60.0, Color.WHITE, "Люстра_1");
//        Dress dress = new Dress(Material.CLOTH, Color.MAGENTA);
//        Ghost ghost = new Ghost(dress, "Страшило", Color.WHITE, Place.VAZOSTAN, 80.0, 80.0);
//        Tailor tailor = new Tailor("Малыш", Place.DJURGARTEN);
//        Human Frenken = new Human("Френкен Бок", Place.KUNDIHOLMEN, 1);
//
//        ghost.openDors(schrank);
//        ghost.setInto(schrank);
//        ghost.closeDors(schrank);
//
//
//        schrank.openDors();
//        schrank.setInto(ghost);
//        schrank.closeDors();
//
//        ghost.Fly(); // выводит то, что приведение не может взлететь
//
//        ghost.openDors(schrank);
//        ghost = schrank.setOut();
//        ghost.closeDors(schrank);
//        schrank.openDors();
//        ghost = schrank.setOut();
//        schrank.closeDors();

//        ghost.Fly(); // приведение теперь может взлететь
//
//        ghost.Circle(lamp); // попробуем покрутиться вокруг невключенной лампы


//        lamp.turnOn();
//        ghost.Circle(lamp);
//        ghost.Circle(lamp);
//        ghost.Circle(lamp);

//        tailor.makeNoise();
//        ghost.makeNoise();
//        ghost.Scare(tailor);
//        ghost.Scare(Frenken);

//        Frenken.makeNoise();

//        lamp.turnOff();

    }
}
