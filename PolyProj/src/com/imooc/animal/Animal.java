package com.imooc.animal;

public class Animal {
    private String kind;

    public Animal(String kind) {
        this.setKind(kind);
    }

    public Animal(){};

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void cry(){

    }
}
