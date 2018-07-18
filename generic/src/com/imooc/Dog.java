package com.imooc;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void playGame() {
        System.out.println("小狗" + super.getName() + "在做游戏");
    }
}
