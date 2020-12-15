package com;

public class Dress implements Wearing {
    Material material;
    Color color;

    public Dress(Material material, Color color){
        this.material = material;
        this.color = color;
    }

    @Override
    public void WearOn() {
        System.out.println("Платье было надето");
    }

    @Override
    public void WearOff() {
        System.out.println("Платье было снято");
    }
}
