package com;

public class Tailor extends Human{

    public Tailor(String name, Place home){
        super(name, home, 1);
    }
    @Override
    public String toString(){
        return String.format(this.name);
    }
}
