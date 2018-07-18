package com.imooc;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小猫"+ super.getName() + "在做游戏");
    }
}
