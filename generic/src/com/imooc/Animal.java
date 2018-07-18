package com.imooc;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void playGame();
}
