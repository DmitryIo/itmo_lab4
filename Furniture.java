package com;


public abstract class Furniture {

    private Material material;
    protected Double width;
    protected Double height;
    private Color color;
    protected String name;

    public Furniture(Material material, Double width, Double height, Color color, String name){
        this.color = color;
        this.material = material;
        this.height = height;
        this.width = width;
        this.name = name;
    }

}
