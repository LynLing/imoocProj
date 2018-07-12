package com.imooc.animal.ICATImpl;

import com.imooc.animal.Animal;
import com.imooc.animal.IACT;

public class Parrot extends Animal implements IACT {
    private String type;

    public Parrot(String type) {
        this.setType(type);
    }

    public Parrot(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void skill() {
        System.out.println("技能： 擅长模仿");
    }

    @Override
    public void act() {
        System.out.println("表演者： " + super.getName());
        System.out.println("年龄： " + super.getAge());
        System.out.println("品种： " + this.getType());
        this.skill();
        this.love();

    }

    @Override
    public void love() {
        System.out.println("爱好： 喜欢吃坚果和松子");
    }
}
